package MainPackage.exceptionhandling;

public class javatrycatchblock {
    public static void main(String[] args) {
 // ========================== java try catch block  ==============================================================
try {
    String ab ="Sumit";
    System.out.println(ab);
    int[] a= new int[1];
    System.out.println(a[1]);
}
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Exception occurs in Array index");
    System.out.println("To be continue");
}
}

    }



