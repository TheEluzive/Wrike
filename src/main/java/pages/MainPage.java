package pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter@Setter
public class MainPage extends BasePage {

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//div[@class='r']//button[contains(text(),'Get started')]")
    protected WebElement buttonGetStartedForFree;

    @FindBy(xpath = "//*[@id=\"modal-pro\"]/form/label[1]/input")
    ///html/body/div[2]/div/form/label[1]/input
    // //label[@class='modal-form-trial__label']//input[@placeholder='Enter your business email']
    protected WebElement textFieldInputEmail;

    @FindBy(xpath = "//button[contains(text(),'Create my Wrike account')]")
    protected WebElement buttonCreateWrikeAccount;





}
