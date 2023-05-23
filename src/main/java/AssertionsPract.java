import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;
public class AssertionsPract {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		SoftAssert soft = new SoftAssert();	
		driver.get("https://www.amazon.com//");
		driver.manage().window().maximize();
		String TitleVerify="Amazon.com. Spend less. Smile more";
		String Title= driver.getTitle();
		//Assert.assertEquals(Actual,Expected);
		//Assert.assertEquals(Title,TitleVerify);
		soft.assertEquals(Title,TitleVerify);
		System.out.println("Title of the Page..."+Title);
		Thread.sleep(2000);
		String FetchURL = driver.getCurrentUrl();
		System.out.println("Page Url..."+FetchURL);
		Thread.sleep(2000);
		soft.assertAll();
		driver.close();

	}

}
