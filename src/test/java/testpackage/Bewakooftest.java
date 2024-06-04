package testpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import basepackage.Baseclass;
import pagepackage.Bewakoofpage;
import utilities.Excelutilities;

public class Bewakooftest extends Baseclass
{
	
	@Test(priority = 1)
	public void popupclose() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Bewakoofpage ob = new Bewakoofpage(driver);
		//Thread.sleep(3000);
		//ob.popup();		
		ob.loginclick();	
		Thread.sleep(2000);
		ob.continuewithmail();
        String Excel = "F:\\Luminar\\Automation Project\\AutomationProjectExcel.xlsx";
        String Sheet = "Sheet1";
        int rowcount = Excelutilities.getRowCount(Excel, Sheet);
        for (int i=1;i<=rowcount;i++)
        {
                    String Username=Excelutilities.getCellValue(Excel, Sheet, i, 0);
                    System.out.println("username---"+Username);
                    String Password=Excelutilities.getCellValue(Excel, Sheet, i, 1);
                    System.out.println("password---"+Password);
                    ob.clearfield();
                    ob.loginwithdetails(Username, Password);	                    
        }
	}
	
	@Test (priority = 2)
	public void homepagelogo() throws Exception
	{
		Bewakoofpage ob = new Bewakoofpage(driver);
		Thread.sleep(5000);
		//ob.popup();
		ob.logocheck();	
	}
	
	@Test (priority = 3)
	public void mensection() throws Exception 
	{
		Bewakoofpage ob = new Bewakoofpage(driver);
		ob.menpolotshirt();
		Thread.sleep(2000);
		//ob.count();
	}
	
	@Test(priority = 4)
	public void tshirtfilter() throws Exception
	{
		Bewakoofpage ob = new Bewakoofpage(driver);
		ob.mendressselection();
	}
	
	@Test(priority = 5)
	public void firstproducttocart() throws Exception
	{
		Bewakoofpage ob = new Bewakoofpage(driver);
		ob.addproducttocart1();	
	}
		
			
	@Test (priority = 6)
	public void gotowomensection() throws Exception
	{
		Bewakoofpage ob = new Bewakoofpage(driver);
		Thread.sleep(3000);
		ob.carttohome();
		ob.womenproducts();
	}
	
	@Test(priority = 7)
	public void secondproducttocart() throws Exception
	{
		Bewakoofpage ob = new Bewakoofpage(driver);
		ob.addproducttocart2();	
		Thread.sleep(2000);
	}
	
	@Test(priority = 8)
	public void addressdetailsselection() throws Exception
	{
		Bewakoofpage ob = new Bewakoofpage(driver);
		ob.addressdetails();
		Thread.sleep(2000);
	}
	
	@Test(priority = 9)
	public void paymentdetailsfilling() throws Exception
	{
		Bewakoofpage ob = new Bewakoofpage(driver);
		ob.paymentdetails("4585312482135686", "05/30","586","DemoUser");
		Thread.sleep(2000);
	}
	
	@Test(priority = 10)
	public void gobacktohomepage() throws Exception
	{
		Bewakoofpage ob = new Bewakoofpage(driver);
		ob.paymentpagetohome();
		Thread.sleep(2000);
	}
	
	@Test(priority = 11)
	public void removeallfromcart() throws Exception
	{
		Bewakoofpage ob = new Bewakoofpage(driver);
		ob.removefromcart();
		Thread.sleep(2000);
		ob.carttohome();
		Thread.sleep(2000);
	}
	
	@Test(priority =12)
	public void screenshotofpage() throws IOException
	{
		File pagescreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(pagescreenshot, new File ("E:\\Bewakoof.png"));
	}
	
	@Test(priority = 13)
	public void logoutofaccount() throws Exception
	{
		Bewakoofpage ob = new Bewakoofpage(driver);
		ob.logout();
	}
}
