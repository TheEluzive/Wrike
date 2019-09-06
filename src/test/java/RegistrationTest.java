import com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import steps.RegistrationSteps;

import java.util.Random;


public class RegistrationTest extends BaseTest {
    /*Test case scenario:

Open url: wrike.com;
Click "Get started for free" button near "Login" button;
Fill in the email field with random generated value of email with mask “<random_text>+wpt@wriketask.qaa” (e.g. “abcdef+wpt@wriketask.qaa”);
Click on "Create my Wrike account" button + check with assertion that you are moved to the next page;
Fill in the Q&A section at the left part of page (like random generated answers) + check with assertion that your answers are submitted;
Check that section "Follow us" at the site footer contains the "Twitter" button that leads to the correct url and has the correct icon;
Create results report using allure plugin (by maven).  */
    @Test
    public void test() throws InterruptedException {
        RegistrationSteps registrationSteps = new RegistrationSteps(driver);
        registrationSteps.registrationStart(driver, "+wpt@wriketask.qaa");
        registrationSteps.askInQuestions(driver);
    }



}