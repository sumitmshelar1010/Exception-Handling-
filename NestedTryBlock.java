package MainPackage.exceptionhandling;

public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            String[] s = new String[2];
            System.out.println(s[3]); //ArrayIndexOutOfBounds Exception
            try {
                int[] a = new int[2];
                a[2] = 100 / 0;
                System.out.println(a);
            } catch (ArithmeticException e1) {
                System.out.println("inner try block");
            }
        }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Outer try block");
            } catch (Exception e) {
                System.out.println("Parent Exception");
            }
            {
                System.out.println("To be continue");
            }
        }

    }

