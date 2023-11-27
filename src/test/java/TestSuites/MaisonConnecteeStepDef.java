package TestSuites;

import java.io.IOException;

import org.junit.Assert;


import Helper.Config;
import Helper.Utils;
import Pages.MaisonConnectee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnecteeStepDef {
	@Given("Admin est dans la page {string}")
	public void admin_est_dans_la_page(String PageTitle) throws IOException {
		
		Config.ConfChrome();
		Config.navigate(Utils.getProperty("MaisonConnectee_Link"));
		 
		   Config.MaximiseWindow();
	
	  
	}

	@When("Admin fait le tri des produits avec {string}")
	public void admin_fait_le_tri_des_produits_avec(String TriSort) throws InterruptedException {
		MaisonConnectee page= new MaisonConnectee();
		page.triProduit(TriSort);
			
			
		}
	  
	

	@When("Admin clique sur un produit {string}")
	public void admin_clique_sur_un_produit(String ProductName) throws InterruptedException {
		
		MaisonConnectee produit= new MaisonConnectee();
		
		produit.ClickOnProduct(ProductName);
		
		
	  
	}

	@Then("Admin est sur la page {string}")
	public void admin_est_sur_la_page(String ExceptedMessage) throws InterruptedException {
		
		MaisonConnectee home= new MaisonConnectee();
		String actualMessage= home.VerifMc();
		Assert.assertEquals(ExceptedMessage, actualMessage);
		Thread.sleep(3000);
		Config.driver.quit();
		
		
	   
	}


}
