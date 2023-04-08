package MainPackage.exceptionhandling;

public class FinallyWithoutException {
    //Program does not throw any exception and the finally block is executed after the try block.
    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            System.out.println(a[0]);//Program does not throw any exception

        }catch (IndexOutOfBoundsException e){
            System.out.println("It is out of boundary");
        }finally {
            System.out.println("We have to follow the Try Catch block");
        }
        System.out.println("Program to be continue");
    }









}
