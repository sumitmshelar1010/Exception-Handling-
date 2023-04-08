package MainPackage.exceptionhandling;

public class FinallywithoutHandleException { // Finally block executed without Exception Handling
    public static void main(String[] args) {
        //Program throws exception but Try Catch block cannot handle it then also Finally block is executed
        try {
            int[] a= new int[3];
            a[1]=5/0;
            System.out.println(a[1]);



        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Try Catch block runs");
        }finally {
            System.out.println("Program throws exception but Try Catch block cannot handle " +
                    "it then also Finally block is executed");
        }//After executing Finally block program will terminate
        System.out.println("Program to be continue");

}
}
