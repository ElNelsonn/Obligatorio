import org.junit.Assert;
import org.junit.Test;
import uy.edu.um.prog2.adt.List.MyListImpl;
import uy.edu.um.prog2.adt.exceptions.EmptyListException;
import uy.edu.um.prog2.adt.exceptions.OutOfRangeException;

public class MyListTest {

    @Test
    public void testAddFunction() {
        MyListImpl<String> listTest = new MyListImpl<>();
        String elementTest1 = "First Element";
        String elementTest2 = "Second Element";
        String elementTest3 = "Third Element";
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
            MyListImpl<String> listTest = new MyListImpl<>();
            String elementTest1 = "First Element";
            String elementTest2 = "Second Element";
            String elementTest3 = "Third Element";
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
            MyListImpl<String> listTest = new MyListImpl<>();
            String elementTest1 = "First Element";
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
    public void testContainsFunction() {




    }




}




