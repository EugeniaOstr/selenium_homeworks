package HW10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


/**
 * Created by eugeniafedorova on 3/26/17.
 */
public class FirstTest extends BaseTest {

        @TestCase(testCaseId = "1")
        @Test
        public void test() throws InterruptedException {
            System.out.println("test");
            driver.get("http://www.mail.ru");
            Thread.sleep(5000);
            WebElement login = driver.findElement(By.name("Login"));
            login.sendKeys("eis.selenium.test");
            WebElement password = driver.findElement(By.id("mailbox__password"));
            password.sendKeys("Balalayka#5");
            WebElement loginButton = driver.findElement(By.id("mailbox__auth__button"));
            loginButton.click();
            Thread.sleep(10000);
        }
}
