package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import pages.MainPage;
import pages.ResendPage;

import java.util.ArrayList;

public class RegistrationSteps {
    MainPage mainPage;
    ResendPage resendPage;

    public RegistrationSteps(WebDriver driver) {
        System.out.println("RegistrationSteps Counstructor called");
        mainPage = new MainPage(driver);
        resendPage = new ResendPage(driver);

    }


    public void registrationStart(WebDriver driver, String email) throws InterruptedException {
        System.out.println("method registrationStart called");
        BasePage.waitWebElement(driver, mainPage.getButtonGetStartedForFree()).click();
        BasePage.waitWebElement(driver, mainPage.getTextFieldInputEmail()).click();
        mainPage.getTextFieldInputEmail().sendKeys(email);
        BasePage.pressButton(mainPage.getButtonCreateWrikeAccount());
Thread.sleep(5000);

    }

    public void askInQuestions(WebDriver driver) throws InterruptedException {
        ArrayList<WebElement> arrayList = resendPage.getRandomAnswersList();
        WebElement one = arrayList.get(0);
        one.click();
        WebElement two = arrayList.get(1);
        two.click();
        WebElement three = arrayList.get(2);
        three.click();
        Thread.sleep(15000);
    }
}
