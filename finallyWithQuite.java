package MainPackage.exceptionhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class finallyWithQuite {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.facebook.com/");

            WebElement we = driver.findElement(By.id("email"));
            we.sendKeys("hi");
            driver.quit();
            System.exit(1); /**If we have System.exit() method then only finally block will not executed**/

        }finally {

            System.out.println("bye");
        }


    }
}
