package MainPackage.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionWithThrows {
    public static void method1() throws FileNotFoundException {
        FileReader s= new FileReader("C:\\Users\\ADMIN\\Desktop\\Daily HW\\17-11-22");
        System.out.println(s);
        //throw new FileNotFoundException();
    }
    public static void main(String[] args) {
        try {
            method1();
        }catch (FileNotFoundException e){
            System.out.println("File is missing");
        }
        System.out.println("To be continue");

    }
}
