import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//
//
//        System.out.println(Calculator.getFactorial(n));
//        System.out.println(Calculator.getSum(n));
//

        int number = .......;

        if (number % 5 == 0 && number %3 !=0){

            System.out.println("fizz");
        }else if (number % 3 == 0 && number%5 != 0 ){

            System.out.println("buzz");
        }else if(number % 3 == 0 && number % 5 == 0 ){

            System.out.println("fizzbuzz");
        }else {

            System.out.println(number);
        }


        int input = new Scanner(System.in).nextInt();
        String s = (input % 3 == 0 ? "Fizz" : "") + (input % 5 == 0 ? "Buzz" : "");
        System.out.println(s.equals("") ? input : s);

        //todo

//        calculator class made with generic


    }
}