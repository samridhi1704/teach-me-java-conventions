package powerpackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals; //added

public class PowerTest {

   /* public void one_raised_to_one_is_onew() {
        assert powerfinder.OF(1,1) == 1;
    } */

    // test method
   @Test
   //method name as per convention
    public void oneRaisedToPowerOneIsOne() {

        assertEquals(1, PowerFinder.powerCalculator(1, 1));
    }


   /* public void twoRaised_to_one_is_2() {
        assert powerfinder.OF(2,1) == 2;
    } */
    @Test
    // //method name as per convention
    public void twoRaisedToPowerOneIsTwo() {

        assertEquals(2, PowerFinder.powerCalculator(2, 1));
    }


   /* public void two_power_2_is_4() {
        assert powerfinder.OF(2, 2) == 4;
    } */

    @Test

    //method name as per convention
    public void twoRaisedToPowerTwoIsFour() {

        assertEquals(4, PowerFinder.powerCalculator(2, 2));
    }


   /* public void power_of_2_and_3_Is_SIX() {
        assert powerfinder.OF(3, 2) == 3*3;
    }*/
   @Test

   //method name as per convention
    public void threeRaisedToPowerTwoIsNine() {

        assertEquals(9, PowerFinder.powerCalculator(3, 2));
    }

}
