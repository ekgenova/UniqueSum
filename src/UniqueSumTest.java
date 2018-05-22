import org.junit.Assert;
import org.junit.Test;

public class UniqueSumTest {

    @Test
    public void testUniqueSum(){
        UniqueSum uniqueSum = new UniqueSum();
        Assert.assertEquals(0, uniqueSum.uniqueSum(3,3,3));
        Assert.assertEquals(6, uniqueSum.uniqueSum(1,2,3));
        Assert.assertEquals(3, uniqueSum.uniqueSum(2,3,2));
        Assert.assertEquals(5, uniqueSum.uniqueSum(1,1,5));
        Assert.assertEquals(9, uniqueSum.uniqueSum(9,8,8));
    }
}
