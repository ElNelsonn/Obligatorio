import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import uy.edu.um.prog2.adt.List.MyList;
import uy.edu.um.prog2.adt.List.MyListImpl;
import uy.edu.um.prog2.adt.exceptions.EmptyListException;
import uy.edu.um.prog2.adt.exceptions.OutOfRangeException;

public class MyListTest {
    private MyListImpl<String> listTest;
    private String elementTest1;
    private String elementTest2;
    private String elementTest3;

    @Before
    public void setUp() {
        listTest = new MyListImpl<>();
        elementTest1 = "First Element";
        elementTest2 = "Second Element";
        elementTest3 = "Third Element";
    }

    @Test
    public void testAddFunction() {
        listTest.add(elementTest1);
        listTest.add(elementTest2);
        listTest.add(elementTest1);
        listTest.add(elementTest3);
        Assert.assertEquals(elementTest1, listTest.getFirstNode().getValue());
        Assert.assertEquals(elementTest2, listTest.getFirstNode().getNextNode().getValue());
        Assert.assertEquals(elementTest1, listTest.getFirstNode().getNextNode().getNextNode().getValue());
        Assert.assertEquals(elementTest3, listTest.getFirstNode().getNextNode().getNextNode().getNextNode().getValue());
    }

    @Test
    public void testGetFunction() {
        try {
            listTest.add(elementTest1);
            listTest.add(elementTest2);
            listTest.add(elementTest3);
            listTest.add(elementTest1);
            listTest.add(elementTest1);
            listTest.add(elementTest3);
            Assert.assertEquals(elementTest1, listTest.get(0));
            Assert.assertEquals(elementTest2, listTest.get(1));
            Assert.assertEquals(elementTest3, listTest.get(2));
            Assert.assertEquals(elementTest1, listTest.get(3));
            Assert.assertEquals(elementTest1, listTest.get(4));
            Assert.assertEquals(elementTest3, listTest.get(5));
            Assert.assertEquals(elementTest1, listTest.get(0));
        } catch (EmptyListException | OutOfRangeException ignored) {
        }
    }

    @Test
    public void testGetFunctionOutOfRange() {
        try {
            listTest.add(elementTest1);
            Assert.assertEquals(elementTest1, listTest.get(0));
            Assert.assertThrows(OutOfRangeException.class, () -> {
                listTest.get(1);
            });
        } catch (OutOfRangeException ignored) {
        } catch (EmptyListException e) {
            Assert.fail("Se esperaba que lanzara OutOfRangeException");
        }
    }

    @Test
    public void testGetFunctionEmptyListException() {
        Assert.assertThrows(EmptyListException.class, () -> {
            listTest.get(1);
        });
    }

    @Test
    public void testContainsFunction() {
        Assert.assertFalse(listTest.contains(elementTest1));
        listTest.add(elementTest1);
        Assert.assertTrue(listTest.contains(elementTest1));
        listTest.add(elementTest2);
        listTest.add(elementTest3);
        Assert.assertTrue(listTest.contains(elementTest2));
        Assert.assertTrue(listTest.contains(elementTest3));
        String elementTestAux = "Aux";
        Assert.assertFalse(listTest.contains(elementTestAux));
        listTest.add(elementTestAux);
        Assert.assertTrue(listTest.contains(elementTestAux));
    }




    @Test
    public void testSize() {
        Assert.assertEquals(0, listTest.size());
        listTest.add(elementTest1);
        Assert.assertEquals(1, listTest.size());


    }












}




