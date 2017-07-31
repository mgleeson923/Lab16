import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelgleeson on 7/27/17.
 */
public class MathTest {

    Math lp = new Math();
    @Test
    public void locate1stPrime() throws Exception {


        int expected = 2;
        int actual = lp.findPrime(1);
        assertEquals("You must construct additional Pylons", expected, actual);
    }

    @Test
    public void locate2ndPrime() throws Exception {
        int expected = 3;
        int actual = lp.findPrime(2);
        assertEquals("Hey, you tried", expected, actual);
    }

    @Test
    public void locateNthPrime() throws Exception {
        int expected = 97;
        int actual = lp.findPrime(25);
        assertEquals("Additional Supply Depots Required", expected, actual);
    }


}