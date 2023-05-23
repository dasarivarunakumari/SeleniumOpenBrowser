import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpeningBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Interface
      WebDriver driver = new EdgeDriver();
      
      //open the browser using navigate().to() method for fetching the url
      //driver.navigate().to("https://www.flipkart.com/");
      //maximize the browser window
      //driver.manage().window().maximize();
      //wait for 1sec
      //Thread.sleep(2000);
      //NAVIGATION COMMANDS
      //navigate back from the current page
      //driver.navigate().back();
      //Thread.sleep(2000);
      //navigate forward from the page
      //driver.navigate().forward();
      //Thread.sleep(2000);
      //refresh the page
      //driver.navigate().refresh();
      //Thread.sleep(2000);
      //close it
      //driver.close();
      
      //DRIVER COMMANDS
      //open the browser using get
      //driver.get("https://www.amazon.com//");
      //It stores the Title of the page fetched by the method getTitle() to variable title(+Title)
      //String Title = driver.getTitle();
      //System.out.println("Check if this get printed after calling getTitle"+Title);
      //Getting the URL of current page
      //String FetchingURL = driver.getCurrentUrl();
      //System.out.println("Going to print URL"+FetchingURL);
      //Getting the source code of the page
      //String PgSource = driver.getPageSource();
      //System.out.println("Source code of the page"+PgSource);
      //show the browser for 2sec
      //Thread.sleep(2000);
      //quit the browser
      //driver.quit();
      
      //LOCATORS
      
      //id locator login to page
      //driver.get("https://www.saucedemo.com/");
      //Click on user name space
      //driver.findElement(By.id("user-name")).click();
      //give the user name 
      //driver.findElement(By.id("user-name")).sendKeys("standard_user");
      //Click on password
      //driver.findElement(By.id("password")).click();
      //give the password
      //driver.findElement(By.id("password")).sendKeys("secret_sauce");
      //Click on login
      //driver.findElement(By.id("login-button")).click();
      
      //name
      //driver.get("https://www.saucedemo.com/");
      //Click on user name space
      //driver.findElement(By.name("user-name")).click();
      //give the user name 
      //driver.findElement(By.name("user-name")).sendKeys("standard_user");
      //Click on password
      //driver.findElement(By.name("password")).click();
      //give the password
      //driver.findElement(By.name("password")).sendKeys("secret_sauce");
      //Click on login
      //driver.findElement(By.name("login-button")).click();
      
      //className
      //driver.get("https://www.saucedemo.com/");
      //Click on user name space, it won't work because of space in btwn=compound values
      //driver.findElement(By.className("input_error form_input")).click();
      //Compound values can be used by adding . in the first and at space
      //driver.findElement(By.cssSelector(".input_error.form_input")).click();
      //comp0und values can also be used by verifying the word which is unique on page Inspect
     // driver.findElement(By.name("user-name")).click();
      //give the user name 
      //driver.findElement(By.className("input_error form_input")).sendKeys("standard_user");
      //driver.findElement(By.cssSelector(".input_error.form_input")).sendKeys("standard_user");
      //driver.findElement(By.name("user-name")).sendKeys("standard_user");
      //Click on password
      //driver.findElement(By.className("input_error form_input")).click();
      //driver.findElement(By.cssSelector(".input_error.form_input")).click();
      //driver.findElement(By.name("password")).click();
      //give the password
      //driver.findElement(By.className("input_error form_input")).sendKeys("secret_sauce");
      //driver.findElement(By.cssSelector(".input_error.form_input")).sendKeys("secret_sauce");
      //driver.findElement(By.name("password")).sendKeys("secret_sauce");
      //Click on login
      //driver.findElement(By.className("submit-button btn_action")).click();
      //driver.findElement(By.className("submit-button")).click();
      //driver.findElement(By.cssSelector(".submit-button.btn_action")).click();
      //Thread.sleep(4000);
      //driver.close();
      
      //className
      driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
      driver.manage().window().maximize();
      driver.findElement(By.id("email")).click();
      //give the user name 
      driver.findElement(By.id("email")).sendKeys("roni_cost@example.com");
      //Click on password
      driver.findElement(By.id("pass")).click();
      //give the password
      driver.findElement(By.id("pass")).sendKeys("roni_cost3@example.com");
      Thread.sleep(3000);
      //Click on login using unique class name
      //driver.findElement(By.className("primary")).click();
      //Click on login using cssSelector
      //driver.findElement(By.cssSelector("button[class='action login primary']")).click();
      //Click on login using xpath
      //driver.findElement(By.xpath("//button[@class='action login primary']")).click();
      //Click on login adding # infront if ID-which acts as cssSelector
      //driver.findElement(By.cssSelector("#send2")).click();
      //Click on login adding . infront if class name-which acts as cssSelector
      //Click on Forgot your Password hyperlink
      //driver.findElement(By.cssSelector(".action.login.primary")).click();
      //driver.findElement(By.linkText("Forgot Your Password?")).click();
      //driver.findElement(By.partialLinkText("Forgot")).click();
      
      Thread.sleep(2000);
      driver.close();
      
      //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      //driver.manage().window().maximize();
      //driver.findElement(By.name("username")).click();
      //Thread.sleep(1000);
      //driver.close();
     // driver.findElement(By.cssSelector("input[placeholder='username']")).click();
      
      
       
	}
}
