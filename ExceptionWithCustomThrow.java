package MainPackage.exceptionhandling;

public class ExceptionWithCustomThrow {
    public static void AgeVerification(int a){
        if (a>35){
            throw new ArithmeticException("candidate's age is out of bar");//Customised Exceptions
        }
        else {
            System.out.println("Candidate is applicable");
        }
    }
    public static void main(String[] args) {
        AgeVerification(36);
        System.out.println("To be Continue");
    }

   /** public static void m1(MainPackage.String S) throws Exception {
        if (!S.equalsIgnoreCase("Sumit")){
            throw new Exception("Incorrect name");
        }else
            System.out.println("ok");
    }
    public static void main(MainPackage.String[] args) throws Exception {
        ExceptionWithCustomThrow.m1("Amit");
    }**/
}
