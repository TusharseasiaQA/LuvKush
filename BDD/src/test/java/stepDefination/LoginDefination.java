package stepDefination;

import Pageobject.LoginPage;
import hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class LoginDefination {
    LoginPage loginPage;

    @Given("^User is on login page$")
    public void userIsOnLoginPage() {
        BaseClass.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        BaseClass.getDriver().manage().window().maximize();
        BaseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage();
//        PageFactory.initElements(getDriver(),loginPage); //pagefactory
    }

    @When("^User fill valid credentials and click on login button$")
    public void userFillValidCredentialsAndClickOnLoginButton() {
        loginPage.enterUsernameInTextField("Admin");
        loginPage.enterPasswordInTextField("admin123");
        loginPage.clickOnLoginBtn();
    }

    @Then("^Verify user is logged in$")
    public void verifyUserIsLoggedIn() {
        String expectedWelcomeText = "Welcome";
        Assert.assertTrue(loginPage.getWelcomeText().contains(expectedWelcomeText));
    }


    @When("^User fill username as \"([^\"]*)\" and password as \"([^\"]*)\" and click on login button$")
    public void userFillUsernameAsAndPasswordAsAndClickOnLoginButton(String username , String password) {
        loginPage.enterUsernameInTextField(username);
        loginPage.enterPasswordInTextField(password);
        loginPage.clickOnLoginBtn();
    }

    @Then("^Verify the error message \"([^\"]*)\"$")
    public void verifyTheErrorMessage(String expectedErrorMessage) {
        Assert.assertEquals(loginPage.getErrorMessage(),expectedErrorMessage , "Test Failed");
    }
}
