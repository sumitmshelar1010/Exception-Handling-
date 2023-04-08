package MainPackage.exceptionhandling;

public class CatchMultipleExceptions {
    public static void main(String[] args) {
        try {
            System.out.println("Multiple exceptions in catch block");
            String[] s = new String[2];
            System.out.println(s[3]);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch (Exception e){
            System.out.println("Parent exception runs");
        }
        System.out.println("Flow of code is continue");
    }
}
