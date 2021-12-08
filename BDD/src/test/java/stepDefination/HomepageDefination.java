package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageDefination {
    WebDriver driver;

    @When("click on Admin button")
    public void click_on_admin_button() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.cssSelector("input[class='button']")).click();

        driver.findElement(By.cssSelector("#menu_admin_viewAdminModule")).click();

    }
    @Then("fill the username and userrole")
    public void fill_the_username_and_userrole() {
        driver.findElement(By.cssSelector("input[name='searchSystemUser[userName]']")).sendKeys("Admin");
        driver.findElement(By.xpath("//select[@name='searchSystemUser[userType]']")).click();
        driver.findElement(By.xpath("//select[@name='searchSystemUser[userType]']/option[2]")).click();

    }
    @Then("fill the employee name and select the status")
    public void fill_the_employee_name_and_select_the_status() {
        driver.findElement(By.cssSelector("input[name='searchSystemUser[employeeName][empName]']")).sendKeys("Miracle_1211V625_Roy");
        driver.findElement(By.xpath("//select[@name='searchSystemUser[status]']/option[2]")).click();

    }
    @Then("click on search button")
    public void click_on_search_button() {
        driver.findElement(By.cssSelector(".searchbutton")).click();

    }
}
