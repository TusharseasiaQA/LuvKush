package dropdown;

/*to check the options in drop down are sorted order or not

Step1: Create a List tempList variable
Step2: While iterating the option in the dropdown, add values to tempList (along with originalList)
Step3: Now sort the tempList, sorting of tempList will not affect the originalList because we have created two different objects
Step4: Compare the two Lists*/


import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOptions1 {

 public static void main(String[] args) {

	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91877\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
  WebDriver driver = new ChromeDriver();

  driver.get("https://testautomationpractice.blogspot.com/");

  driver.manage().window().maximize();

  WebElement element = driver.findElement(By.id("animals"));

  Select se = new Select(element);

  ArrayList originalList = new ArrayList();
  ArrayList tempList = new ArrayList();

  for (WebElement e : se.getOptions()) {
   originalList.add(e.getText());
   tempList.add(e.getText());
  }

  System.out.println("this is originalList before Sorting" + originalList);
  System.out.println("this is tempList before Sorting" + tempList);

  Collections.sort(tempList);

  System.out.println("this is originalList after Sorting" + originalList);
  System.out.println("this is tempList after Sorting" + tempList);

  if (originalList == tempList) {
   System.out.println("Dropdown sorted");
  } else {
   System.out.println("Dropdown Not sorted");

  }
  driver.close();
 }

}
