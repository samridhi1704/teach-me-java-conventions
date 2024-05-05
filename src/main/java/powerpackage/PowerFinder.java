package powerpackage;

// 1. class name as per convention
public class PowerFinder {

    // 2. Updated the method name and parameters
    public static int powerCalculator(int base, int exponent)  {

        int result = 1;
        for (int i = 0; i<exponent; i++)
            result *= base;
        return result;
    }


    // declare the main method

    public static void main(String[] args) {

        System.out.println(powerCalculator(2,4));


    }


}
