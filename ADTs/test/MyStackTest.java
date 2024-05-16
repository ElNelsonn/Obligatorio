import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import uy.edu.um.prog2.adt.List.MyListImpl;
import uy.edu.um.prog2.adt.Stack.MyStackImpl;
import uy.edu.um.prog2.adt.exceptions.EmptyListException;
import uy.edu.um.prog2.adt.exceptions.EmptyStackException;
import uy.edu.um.prog2.adt.exceptions.OutOfRangeException;

public class MyStackTest {
        private MyStackImpl<String> stackTest;
        private String elementTest1;
        private String elementTest2;
        private String elementTest3;

    @Before
    public void setUp() {
        stackTest = new MyStackImpl<>();
        elementTest1 = "First Element";
        elementTest2 = "Second Element";
        elementTest3 = "third Element";
    }

    @Test
    public void testPushFunction() {
        stackTest.push(elementTest3);
        stackTest.push(elementTest2);
        stackTest.push(elementTest1);
        Assert.assertEquals(elementTest1, stackTest.getFirst());
    }

    @Test
    public void testPeekFunction() {
        stackTest.push(elementTest1);
        Assert.assertEquals(elementTest1, stackTest.getFirst().getValue());
        stackTest.push(elementTest2);
        Assert.assertEquals(elementTest2, stackTest.getFirst().getValue());
        stackTest.push(elementTest3);
        Assert.assertEquals(elementTest3, stackTest.getFirst().getValue());
    }

    @Test
    public void testPeekEmptyStackException() {
        try {
            Assert.assertEquals(elementTest1, stackTest.peek());
            Assert.assertThrows(EmptyStackException.class, () -> {
                stackTest.peek();
            });
        } catch (EmptyStackException ignored) {
            System.out.println("EmptyStackException");
        }
        try{
            stackTest.push(elementTest1);
            Assert.assertEquals(elementTest1, stackTest.peek());
            stackTest.push(elementTest2);
            Assert.assertEquals(elementTest2, stackTest.peek());
        } catch (EmptyStackException ignored){
            System.out.println("EmptyStackException");
        }
    }


    public void testPopEmptyStackException(){
        try {
            Assert.assertEquals(elementTest1, stackTest.peek());
            Assert.assertThrows(EmptyStackException.class, () -> {
                stackTest.peek();
            });
        } catch (EmptyStackException ignored)
    }
    @Test
    public void testPop(){

    }







}
