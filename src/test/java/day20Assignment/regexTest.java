package day20Assignment;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Junit testing for Regex program of Day 20 Assignment
 */

public class regexTest {
    /*
    Test for frist name
     */
    @Test
    public void firstname() {
        regex test = new regex();
        boolean result = test.firstName("Dhananjay");
        assertTrue(result);
    }

    /*
    Test for last name
     */

    @Test
    public void lastname() {
        regex test = new regex();
        boolean result = test.lastName("Gadhave");
        assertTrue(result);
    }

    /*
    Test for Email
     */

    @Test
    public void mail() {
        regex test = new regex();
        boolean result = test.Email("dhananjay123@gmail.com");
        assertTrue(result);
    }

    /*
    Test for Mobile Number
     */

    @Test
    public void mobilenumber() {
        regex test = new regex();
        boolean result = test.MobileNumber("91 9175696288");
        assertTrue(result);
    }

    /*
    Test for Password 1
     */

    @Test
    public void pass1() {
        regex test = new regex();
        boolean result = test.pass1("dhananjay");
        assertTrue(result);
    }

    /*
    Test for Password 2
     */

    @Test
    public void pass2() {
        regex test = new regex();
        boolean result = test.pass2("Dhananjay");
        assertTrue(result);
    }

    /*
    Test for Password 3
     */

    @Test
    public void pass3() {
        regex test = new regex();
        boolean result = test.pass3("Dhananjay30");
        assertTrue(result);
    }

    /*
    Test for Password 4
     */

    @Test
    public void pass4() {
        regex test = new regex();
        boolean result = test.pass4("Dhananjay@30");
        assertTrue(result);
    }
}
