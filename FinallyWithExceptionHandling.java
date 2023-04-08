package MainPackage.exceptionhandling;

public class FinallyWithExceptionHandling {
    //Finally executed after Exception handling
    public static void main(String[] args) {
    try {
        int[] a= new int[3];
        a[1]=5/0;
        System.out.println(a[1]);

    }catch (ArithmeticException e){
        System.out.println("Try Catch block runs");
    }finally {
        System.out.println("Try Catch block handle Exception " +
                "then also Finally block is executed");
    }//After executing Finally block program will terminate
        System.out.println("Program to be continue");
}}


