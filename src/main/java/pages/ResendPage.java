package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Random;

@Getter
public class ResendPage extends BasePage {

    public ResendPage(WebDriver webDriver) {
        super(webDriver);
    }

    ArrayList<WebElement> interestAnswers = new ArrayList<WebElement>();
    ArrayList<WebElement>  amountMembersAnswers = new ArrayList<WebElement>();
    ArrayList<WebElement>  followAnswers = new ArrayList<WebElement>();
    //#1
    @FindBy(xpath = "//button[contains(text(),'Very interested')]")
    protected WebElement buttonVeryInterested;

    @FindBy(xpath = "//button[contains(text(),'Just looking')]")
    protected WebElement buttonJustLooking;

    @FindBy(xpath = "//button[contains(text(),'1–5')]")
    protected WebElement buttonFrom1To5;

    @FindBy(xpath = "//button[contains(text(),'6–15')]")
    protected WebElement buttonFrom6To15;

    @FindBy(xpath = "//button[contains(text(),'16–25')]")
    protected WebElement buttonFrom16To25;

    @FindBy(xpath = "//button[contains(text(),'26–50')]")
    protected WebElement buttonFrom26To50;

    @FindBy(xpath = "//button[contains(text(),'50+')]")
    protected WebElement buttonFrom50;

    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    protected WebElement buttonYes;

    @FindBy(xpath = "//button[contains(text(),'No')]")
    protected WebElement buttonNo;

    @FindBy(xpath = "//button[contains(text(),'Other')]")
    protected WebElement buttonOther;



    public int getRandomNumber(int max){
        Random random = new Random();
        return random.nextInt(max);
    }

    public ArrayList<WebElement>  getRandomAnswersList(){
    ArrayList<WebElement> webElements = new ArrayList<WebElement>();
        fillAnswersListInterest();
        fillAnswersListMembers();
        fillAnswersListFollow();

    webElements.add(interestAnswers.get(getRandomNumber(interestAnswers.size())));
    webElements.add(amountMembersAnswers.get(getRandomNumber(amountMembersAnswers.size())));
    webElements.add(followAnswers.get(getRandomNumber(followAnswers.size())));
    return webElements;
    }

    public void fillAnswersListInterest(){
        interestAnswers.add(buttonVeryInterested);
        interestAnswers.add(buttonJustLooking);
    }

    public void fillAnswersListMembers(){
        amountMembersAnswers.add(buttonFrom1To5);
        amountMembersAnswers.add(buttonFrom6To15);
        amountMembersAnswers.add(buttonFrom16To25);
        amountMembersAnswers.add(buttonFrom26To50);
        amountMembersAnswers.add(buttonFrom50);
    }

    public void fillAnswersListFollow(){
        followAnswers.add(buttonYes);
        followAnswers.add(buttonNo);
        followAnswers.add(buttonOther);
    }

    //#2










}
