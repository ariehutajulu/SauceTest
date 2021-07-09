
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class WebLogin {

    public static void main(String[] args)throws InterruptedException  {

            WebDriver driver;
            WebDriverWait wait;

            System.setProperty("webdriver.chrome.driver", "chromedriver2.exe");
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            wait    = new WebDriverWait(driver, 10);
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Thread.sleep(1000);


            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();//add to chart
            driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();//add to chart

            Thread.sleep(1000);

            driver.findElement(By.id("item_4_title_link")).click();// click details
            Thread.sleep(1000);
            driver.findElement(By.id("back-to-products")).click(); //click back
            driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();// click keranjang
            driver.findElement(By.id("checkout")).click();
            Thread.sleep(1000);

            driver.findElement(By.id("first-name")).sendKeys("random mulia");
            driver.findElement(By.id("last-name")).sendKeys("mamen");
            driver.findElement(By.id("postal-code")).sendKeys("212121");
            Thread.sleep(1000);

            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("finish")).click();
            Thread.sleep(1000);

            driver.findElement(By.id("react-burger-menu-btn")).click();
            driver.findElement(By.id("logout_sidebar_link")).click();
            driver.close();


        }


    }

