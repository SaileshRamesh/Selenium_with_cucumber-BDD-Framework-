package StepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MultiDealsSteps {
	
WebDriver driver;
	
    @Before
    public void initializeBrowser(){
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
    }
    
    @After
    public void closeBrowser(){
    	driver.quit();
    }

	@Given("^User is on Application Home Page$")
	public void user_is_on_Application_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
		
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
		//List<List<String>> testData = credentials.raw();
		for(Map<String, String> dataMap : credentials.asMaps(String.class, String.class)){
		//Map<String, String> dataMap = credentials.asMap(String.class, String.class);
	    driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
	    driver.findElement(By.name("email")).sendKeys(dataMap.get("username"));
	    driver.findElement(By.name("password")).sendKeys(dataMap.get("password"));
		}
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
		for(Map<String, String> dataMap : data.asMaps(String.class, String.class)){
		//List<List<String>> formData = data.raw();
		driver.findElement(By.name("title")).sendKeys(dataMap.get("Title"));
		driver.findElement(By.name("amount")).sendKeys(dataMap.get("Amount"));
		driver.findElement(By.name("probability")).sendKeys(dataMap.get("probability"));
        driver.findElement(By.name("commission")).sendKeys(dataMap.get("Commission"));	    
        driver.findElement(By.name("description")).sendKeys(dataMap.get("Description"));
        driver.findElement(By.xpath("//*[@id='main-content']/div/div[2]/form/div[8]/div[2]/div/textarea")).sendKeys(dataMap.get("Next Step"));
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id='dashboard-toolbar']/div[2]/div/button[2]")).click();
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		Actions actions = new Actions(driver);
        WebElement contact = driver.findElement(By.xpath("//*[@id='main-nav']/div[5]/a/i"));
        actions.moveToElement(contact).perform();
   	   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//*[@id='main-nav']/div[5]/button/i")).click();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
