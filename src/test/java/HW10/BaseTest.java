package HW10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
/**
 * Created by eugeniafedorova on 3/26/17.
 */
public class BaseTest {

        protected WebDriver driver;

        @BeforeTest
        public void setUp(){
            System.out.println("before test");
            System.setProperty("webdriver.chrome.driver",
                    "src/test/resources/drivers/chromedriver");
            driver = new ChromeDriver();
        }

        @AfterTest
        public void afterTest(){
            System.out.println("after test");
            driver.quit();
        }

}
