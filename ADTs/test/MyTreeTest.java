import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import uy.edu.um.prog2.adt.Tree.MyTree;
import uy.edu.um.prog2.adt.Tree.MyTreeImpl;

public class MyTreeTest {
    private MyTreeImpl<Integer, Integer> treeTest;
    private Integer elementTest1;
    private Integer elementTest2;
    private Integer elementTest3;
    private Integer elementTest4;
    private Integer elementTest5;
    private Integer elementTest6;
    private Integer elementTest7;

    @Before
    public void setUp() {
        treeTest = new MyTreeImpl<Integer, Integer>();
        elementTest1 = 1;
        elementTest2 = 2;
        elementTest3 = 3;
        elementTest4 = 4;
        elementTest5 = 5;
        elementTest6 = 6;
        elementTest7 = 7;
        ;
    }

    //    4
    //   / \
    //  2   6
    // / \ / \
    //1  3 5  7
    @Test
    public void testInsertFunction() {
        treeTest.insert(elementTest4,elementTest4);
        treeTest.insert(elementTest2,elementTest2);
        treeTest.insert(elementTest6,elementTest6);

        Assert.assertEquals(elementTest4, treeTest.getRoot().getValue());
        Assert.assertEquals(elementTest2, treeTest.getRoot().getLeft().getValue());
        Assert.assertEquals(elementTest6, treeTest.getRoot().getRight().getValue());

        treeTest.insert(elementTest7,elementTest7);
        Assert.assertEquals(elementTest7, treeTest.getRoot().getRight().getRight().getValue());
        treeTest.insert(elementTest1,elementTest1);
        Assert.assertEquals(elementTest1, treeTest.getRoot().getLeft().getLeft().getValue());
        treeTest.insert(elementTest3,elementTest3);
        treeTest.insert(elementTest5,elementTest5);
        Assert.assertEquals(elementTest3, treeTest.getRoot().getLeft().getRight().getValue());
        Assert.assertEquals(elementTest5, treeTest.getRoot().getRight().getLeft().getValue());

    }

    @Test
    public void testFindSort(){
        treeTest.insert(elementTest4,elementTest4);
        treeTest.insert(elementTest2,elementTest2);
        treeTest.insert(elementTest6,elementTest6);

        Assert.assertEquals(elementTest4, treeTest.findSort(elementTest4));
        Assert.assertEquals(null, treeTest.findSort(9));
        Assert.assertEquals(null, treeTest.findSort(5));
        Assert.assertEquals(elementTest2, treeTest.findSort(elementTest2));

        Assert.assertEquals(elementTest2, treeTest.findSort(elementTest2));

        treeTest.insert(elementTest7,elementTest7);
        treeTest.insert(elementTest1,elementTest1);
        treeTest.insert(elementTest5,elementTest5);
        Assert.assertEquals(elementTest5, treeTest.findSort(elementTest5));
        Assert.assertEquals(elementTest7, treeTest.findSort(elementTest7));
        Assert.assertEquals(null, treeTest.findSort(10));
        Assert.assertEquals(elementTest1, treeTest.findSort(elementTest1));
        Assert.assertEquals(null, treeTest.findSort(0));



    }




}
