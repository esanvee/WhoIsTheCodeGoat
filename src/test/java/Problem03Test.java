import org.junit.Assert;
import org.junit.Test;

public class Problem03Test {

    Problem03 problem03;

    @Test
    public void findSubstrings() {

        String test = "abcc";
        int K = 2;

        int expected = 2;
        int actual = Problem03.findCombinations(test, K);

        Assert.assertEquals(expected, actual);
        
    }

    @Test
    public void findSubstrings2() {

        String test = "aabab";
        int K = 3;

        int expected = 0;
        int actual = Problem03.findCombinations(test, K);

        Assert.assertEquals(expected, actual);
        
    }

    @Test
    public void  removePermuatations() {
        
    }


    @Test
    public void removeDuplicates() {
        
    }
}
