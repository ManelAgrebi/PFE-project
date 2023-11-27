package TestSuites;

import java.io.IOException;

import org.junit.Assert;


import Helper.Config;
import Helper.Utils;
import Pages.HomePageMistore;
import Pages.MaisonConnectee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	
	@Given("Admin is on Home Page")
	public void admin_is_on_home_page() throws IOException {
		
		Config.ConfChrome();
		
		
		Config.navigate(Utils.getProperty("Homepage_Link"));
		Config.MaximiseWindow();
		
		 
		
		   
	    
	}

	@When("Admin mousehover on menu {string} and click on submenu {string}")
	public void admin_mousehover_on_menu_and_click_on_submenu(String MenuTitle, String SubMenuTitle) throws InterruptedException {
		HomePageMistore page= new HomePageMistore();
		Thread.sleep(2000);
		page.MouseHoverOnMenuByName(MenuTitle);
		Thread.sleep(2000);
		page.ClickProduct(SubMenuTitle);
	    
	}

	@Then("admin is directed to product page {string}")
	
	public void admin_is_directed_to_product_page(String ExpectedMessage) throws InterruptedException {
		
		MaisonConnectee home= new MaisonConnectee();
		
		String actualMessage= home.VerifMessage();
	
		
		Assert.assertEquals(ExpectedMessage, actualMessage);
		Config.driver.quit();
		
		
	   
	}

	

}
