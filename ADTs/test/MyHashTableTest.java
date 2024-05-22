import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import uy.edu.um.prog2.adt.HashTable.MyHashTableImpl;
import uy.edu.um.prog2.adt.Tree.MyTreeImpl;

public class MyHashTableTest<K,V> {
    private MyHashTableImpl<Integer,Integer> hashTest;
    private Integer elementTest1;
    private Integer elementTest2;
    private Integer elementTest3;
    @Before
    public void setUp() {
        hashTest = new MyHashTableImpl<>(1000);
        elementTest1 = 780;
        elementTest2 = 890;
        elementTest3 = 467;
    }

    @Test
    public void putTest(){
        hashTest.put(elementTest1, elementTest1);
        Assert.assertEquals(-1,hashTest.contains(elementTest2));
        Assert.assertEquals(-1,hashTest.contains(elementTest3));
        int value = hashTest.contains(elementTest1);
        Assert.assertEquals(value,hashTest.contains(elementTest1));


    }


}
