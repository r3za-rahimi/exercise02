public class Calculator {


    public static int getFactorial(int n) {


        if (n == 1) {

            return 1;
        } else {

            return n * getFactorial(n - 1);


        }
    }

    public static int getSum(int n){

        if(n == 1){

            return 1;
        }else {

            return n+getSum(n-1);

        }

    }

}
