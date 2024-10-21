package Lab04;

public class Factorial {

    public static void main(String[] args) {
        int num = 4;
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is " + result );

        num = 5000;
        result = factorial(num);
        System.out.println("The factorial of " + num + " is " + result );


    }

    public static int factorial(int n) {
        if (n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }


}
