/*package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsSteps {

WebDriver driver;
	
	@Given("^User is on Application Home Page$")
	public void user_is_on_Application_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://freecrm.co.in/");
	    driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
	}

	@When("^Application title is freecrm$")
	public void application_title_is_freecrm()  {
	    // Write code here that turns the phrase above into concrete actions
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Free CRM #1 cloud software for any business large or small";
	    Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
	    // Write code here that turns the phrase above into concrete actions
		List<List<String>> testData = credentials.raw();
	    driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
	    driver.findElement(By.name("email")).sendKeys(testData.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(testData.get(0).get(1));
	}
	
	@Then("^user clicks on Login Button$")
	public void user_clicks_on_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}

	@When("^user navigate to user Profile Page$")
	public void user_navigate_to_user_Profile_Page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    String actual = driver.getTitle();
	    String expected = "Cogmento CRM";
	    Assert.assertEquals(expected, actual);
	}
	
	@Then("^Go to Deal form$")
	public void go_to_contacts() {
	    // Write code here that turns the phrase above into concrete actions
		Actions actions = new Actions(driver);
        WebElement contact = driver.findElement(By.xpath("//*[@id='main-nav']/div[5]/a/i"));
        actions.moveToElement(contact).perform();
        
	}

	@Then("^New Deal Contact Form")
	public void open_Contact_Form() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='main-nav']/div[5]/button/i")).click();
	}
	
	@Then("^User enters deal data$")
	public void user_enters_deal_data(DataTable data) {
		List<List<String>> formData = data.raw();
		driver.findElement(By.name("title")).sendKeys(formData.get(0).get(0));
		driver.findElement(By.name("amount")).sendKeys(formData.get(0).get(1));
		driver.findElement(By.name("probability")).sendKeys(formData.get(0).get(2));
        driver.findElement(By.name("commission")).sendKeys(formData.get(0).get(3));	    
        driver.findElement(By.name("description")).sendKeys(formData.get(0).get(4));
        driver.findElement(By.name("next_step")).sendKeys(formData.get(0).get(5));
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("^save the Deal$")
	public void save_the_Deal() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]"));
	}

	@Then("^close the browser$")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	    
	}

	
}
*/