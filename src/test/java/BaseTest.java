import lombok.Getter;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


@Getter
public class BaseTest {

    protected String randomEmail;
    protected WebDriver driver;
    public static Logger LOGGER;
    protected static Properties property = loadProperties();
    protected static String mainURL = property.getProperty("mainURL");

    public String setRandomEmail(String string) {
        return System.currentTimeMillis() + string;
    }


    private static Properties loadProperties() {
        FileInputStream fis;
        property = new Properties();

        try {
            fis = new FileInputStream("src/resources/config.properties");
            property.load(fis);
            mainURL = property.getProperty("mainURL");


        } catch (IOException e) {
            System.out.println("Properties files wasn`t found");
        }
        return property;
    }


    @Before
    public void onStart() {
        //beforeSuite
        String log4jConfPath = "src/resources/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        LOGGER = Logger.getLogger(BaseTest.class);
        //

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(mainURL);
        LOGGER.info("maximize");
        driver.manage().window().maximize();
    }

    @After
    public void onFinish() {
        driver.close();
    }


}
