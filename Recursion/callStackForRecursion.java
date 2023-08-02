package Recursion;

public class callStackForRecursion {
    public static void main(String[] args) {
        System.out.println("Main Function started");
        firstFunction();
         System.out.println("Main Function end");
    }

    public static void firstFunction(){
        System.out.println("FirstFunction started ");
        SecondFunction();
        System.out.println("FirstFunction end");
    }

    public static void SecondFunction(){
        System.out.println("SecondFunction started");
        ThirdFunction();
        System.out.println("SecondFunction Ended");
    }

    public static void ThirdFunction(){
        System.out.println("ThirdFunctionCalled");
    }
}
