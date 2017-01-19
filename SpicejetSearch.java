package webdriver;


//Test Comments Added
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetSearch {
	public WebDriver driver;
	public void openURL(){
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.get("http://spicejet.com");
	}
	public void onewaySearch() throws Exception{
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.linkText("Hyderabad (HYD)")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Bengaluru (BLR)")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("22")).click();
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("2 Adults");
new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("1 Child");
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
//driver.quit();

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SpicejetSearch s=new SpicejetSearch();
		s.openURL();
		s.onewaySearch();
	}

}
