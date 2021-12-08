package Pageobject;

import hooks.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(BaseClass.getDriver(),this);
    }

    @FindBy(id = "txtUsername")
    WebElement usernameTextField;

    public void enterUsernameInTextField(String username){
        usernameTextField.sendKeys(username);
    }

    @FindBy(id = "txtPassword")
    WebElement passwordTextField;

    public void enterPasswordInTextField(String password){
        passwordTextField.sendKeys(password);
    }

    @FindBy(id = "btnLogin")
    WebElement loginBtn;

    public void clickOnLoginBtn(){
        loginBtn.click();
    }

    @FindBy(id = "welcome")
    WebElement welcomeText;

    public String getWelcomeText(){
        return welcomeText.getText();
    }

    @FindBy(id = "spanMessage")
    WebElement errorMessages;

    public String getErrorMessage(){
        return errorMessages.getText();
    }
}
