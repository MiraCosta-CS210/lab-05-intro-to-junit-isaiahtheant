import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/*
 * LAB 05: Intro to JUnit (PART 2)
 *
 * Create JUnit tests which validates the sumIsEven() method for the following scenarios:
 *
 *   TEST SCENARIO 1
 *   INPUTS: 1, 1
 *   EXPECTED OUTPUT: 1 (which represents "true" - meaning the sum of the two numbers is even)
 *
 *   TEST SCENARIO 2
 *   INPUTS: 1, 2
 *   EXPECTED OUTPUT: 0 (which represents "false" - meaning the sum of the two numbers is odd)
 *
 * You will find that your tests aren't passing as expected!  Fix the bug in the sumIsEven method so that
 * it is working the way it should, so that your JUnit tests all pass!
 */

public class SumNumbersTest {
    @Test
    public void sumIsEven() {
        SumNumbers sum = new SumNumbers();
        assertEquals(0, sum.sumIsEven(1,2));
        assertEquals(1, sum.sumIsEven(1,1));


    }
}
