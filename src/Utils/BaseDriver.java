package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseDriver {

    protected WebDriverWait wait;
    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser"})
    public void setup(String browser) {

        if (browser.equals("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tgbso\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

            driver.get("https://campus.techno.study/");


        } else if (browser.equals("firefox")) {

            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tgbso\\OneDrive\\Documents\\geckodriver.exe");
            driver = new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();


            driver.get("https://campus.techno.study/");

        }
    }
            @AfterMethod(alwaysRun = true)
                    public void tearDown(){
                driver.quit();
            }

        }

