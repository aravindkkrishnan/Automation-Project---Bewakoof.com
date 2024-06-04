package pagepackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Bewakoofpage 
{
	WebDriver driver;
	
	@FindBy(id = "wzrk-cancel")
	WebElement pop;
	
	@FindBy(xpath = "//*[@id=\"loginLink\"]")
	WebElement loginlink;
	
	@FindBy(xpath = "//*[@id=\"web_email_login\"]")
	WebElement continuewithemail;
	
	@FindBy(xpath = "//*[@id=\"email_input\"]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"mob_password\"]")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"mob_login_password_submit\"]")
	WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id=\\\"testMenuSelect-shop-men\\\"]/span/span")
	WebElement men;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[1]/header/div[2]/div/div[2]/div/span[1]/div/div/div/div[1]/div[1]/a[8]/span")
	WebElement polotshirt;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[1]/header/div[2]/div/div[1]/a")
	WebElement sitelogo;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/div/a")
	WebElement carttohomepage;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div")
	WebElement tshirtsizeselection;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div/div[1]/div[2]/div/ul/li[2]/div/span/a")
	WebElement tshirtsize;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div")
	WebElement brandselection;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div/div[2]/div[2]/div/ul/li[1]/div/span/a")
	WebElement bewakoofbrand;
	
	@FindBy(xpath = "//*[@id=\"testProductcard_1\"]/a/div/div[2]/div[1]/div[2]/img")
	WebElement addtowishlist;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/header/div[2]/div/div[3]/div[1]/div/span[2]/div/div")
	WebElement wishlist;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div")
	WebElement fromwishlisttocart;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div/span/div/div/div/div/div[2]/div[1]/div[2]/div/span")
	WebElement sizefromwishlist;
	
	@FindBy(xpath = "//*[@id=\"notifyMe\"]/div/div/div/div/div[2]/div[2]/div")
	WebElement wishlistsizedonebutton;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[2]/div[2]/a/div/div[1]/div[1]/img")
	WebElement producttoadd1;
	
	@FindBy(xpath = "//*[@id=\"testSizes_XL\"]")
	WebElement productpagesize;
	
	@FindBy(xpath = "//*[@id=\"addButtons\"]/div/div[2]/span")
	WebElement addtocart;
	
	@FindBy(xpath = "//*[@id=\"testHeaderCart\"]/a/i")
	WebElement cart;
	
	@FindBy(xpath = "//*[@id=\"testMenuSelect-shop-women\"]/span/span")
	WebElement womensection;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div/div[2]/div/div")
	WebElement womensizeselection;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[2]/div/div[2]/div[2]/div/ul/li[2]/div/span/a")
	WebElement womendresssize1;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[2]/div[2]/a/div/div[1]/div[1]/img")
	WebElement producttoadd2;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/div[7]/div/div[1]/div[2]/div/div[2]/div/span")
	WebElement womendresssizefinal;
	
	@FindBy(xpath = "//*[@id=\"os_payNow_btn\"]")
	WebElement continuetopayment;
	
	@FindBy(xpath = "//*[@id=\"pay_cardNumber_input\"]")
	WebElement cardnumber;
	
	@FindBy(xpath = "//*[@id=\"pay_expiryDetail_input\"]")
	WebElement cardexpirydate;
	
	@FindBy(xpath = "//*[@id=\"pay_cvv_input\"]")
	WebElement cardcvv;
	
	@FindBy(xpath = "//*[@id=\"pay_cardName_input\"]")
	WebElement cardname;
	
	@FindBy(xpath = "//*[@id=\"addr_cancel_button\"]")
	WebElement cancel;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[3]/div/div[2]/div[1]/div/div/div/img")
	WebElement paymenttoaddress;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div/div/div[4]/div/div/div[3]/div/div[1]/p")
	WebElement addresschange;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div/div/div[4]/div/div/div[3]/div/button")
	WebElement addressconfirm;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/div/a")
	WebElement paymenttohome;
	
	@FindBy(xpath = "//*[@id=\"testRemoveCart\"]")
	WebElement remove1;
	
	@FindBy(xpath = "//*[@id=\"testRemoveCart\"]")
	WebElement remove2;
	
	@FindBy(xpath = "//*[@id=\"web_logout\"]")
	WebElement signout;
	
	public Bewakoofpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Action Methods
	
	//To avoid popup
	public void popup()
	{
		pop.click();
	}
	
	//Click on login
	public void loginclick()
	{
		loginlink.click();
	}
	
	//Click on continue with email
	public void continuewithmail()
	{
		continuewithemail.click();
	}
		
	//Login with credentials
	public void loginwithdetails(String emailid, String passwordf)
	{
		email.sendKeys(emailid);
		password.sendKeys(passwordf);
		loginbutton.click();
	}
	
	//Clear Email and Password field
	public void clearfield()
	{
		email.clear();
		password.clear();
	}
	
	//Check for logo
	public void logocheck() 
	{
		boolean logo = sitelogo.isDisplayed();
		
		if(logo)
		{
			System.out.println("");
			System.out.println("The logo is displayed");
			System.out.println("");
		}
		else
		{
			System.out.println("");
			System.out.println("The logo is not displayed");
			System.out.println("");
		}
	}
		
	//Hover to Mens section and select Polo T-Shirt
	public void menpolotshirt() throws InterruptedException
		{
			WebElement men = driver.findElement(By.xpath("//*[@id=\"testMenuSelect-shop-men\"]/span/span"));
			Actions actionobject = new Actions(driver);
			actionobject.moveToElement(men).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/header/div[2]/div/div[2]/div/span[1]/div/div/div/div[1]/div[1]/a[8]/span")).click();
			
		}
	
		//Filter mens dress
		public void mendressselection() throws Exception
		{
			tshirtsizeselection.click();
			Thread.sleep(2000);
			tshirtsize.click();
			Thread.sleep(2000);
			brandselection.click();
			Thread.sleep(2000);
			bewakoofbrand.click();
			Thread.sleep(2000);
		}
		
		//Add men dress to cart
		public void addproducttocart1() throws Exception
		{
			addtowishlist.click();
			Thread.sleep(2000);
			wishlist.click();
			Thread.sleep(2000);
			fromwishlisttocart.click();
			Thread.sleep(2000);
			sizefromwishlist.click();
			Thread.sleep(2000);
			wishlistsizedonebutton.click();
			Thread.sleep(2000);
			cart.click();
		}
	
	//Move from cart to home
	public void carttohome() throws Exception
	{
		carttohomepage.click();
		Thread.sleep(2000);
	}
	
	//Click on women products tab
	public void womenproducts() throws Exception
	{
		womensection.click();
		Thread.sleep(2000);
	}
	
	//Filter and add women dress to cart
	public void addproducttocart2() throws Exception
	{
		womensizeselection.click();
		Thread.sleep(2000);
		womendresssize1.click();
		Thread.sleep(2000);
		producttoadd2.click();
		Thread.sleep(3000);
		womendresssizefinal.click();
		Thread.sleep(2000);
		addtocart.click();
		Thread.sleep(2000);
		cart.click();
	}
	
	//Continue to payment from cart. Move to address selection
	public void addressdetails() throws Exception 
	{
		continuetopayment.click();
		Thread.sleep(2000);
		paymenttoaddress.click();
		Thread.sleep(2000);
		addresschange.click();
		Thread.sleep(2000);
		addressconfirm.click();
		Thread.sleep(2000);
	}
	
	//Input details on Payment section
	public void paymentdetails(String cno, String cexpirydate , String ccvv, String cname) throws Exception
	{
		cardnumber.sendKeys(cno);
		Thread.sleep(2000);
		cardexpirydate.sendKeys(cexpirydate);
		cardcvv.sendKeys(ccvv);
		cardname.sendKeys(cname);
	}
	
	//Move from payment page to homepage
	public void paymentpagetohome()
	{
		paymenttohome.click();
	}
	
	//Remove items from cart
	public void removefromcart() throws Exception
	{
		cart.click();
		Thread.sleep(4000);
		remove1.click();
		Thread.sleep(4000);
		remove2.click();
	}
	
	//Logout of page
	public void logout() throws Exception
	{
		WebElement profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/header/div[2]/div/div[3]/div[1]/div/a"));
		Actions actionobject = new Actions(driver);
		actionobject.moveToElement(profile).perform();
		Thread.sleep(2000);
		signout.click();
	}
	
}


