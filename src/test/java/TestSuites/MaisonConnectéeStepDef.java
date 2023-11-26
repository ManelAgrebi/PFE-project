package TestSuites;

import java.io.IOException;

import org.junit.Assert;


import Helper.Config;
import Helper.Utils;
import Pages.MaisonConnectée;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnectéeStepDef {
	@Given("Admin est dans la page {string}")
	public void admin_est_dans_la_page(String PageTitle) throws IOException {
		Config.ConfChrome();
		Config.navigate(Utils.getProperty("MaisonConnectée_Link"));
		 
		   Config.MaximiseWindow();
	
	  
	}

	@When("Admin fait le tri des produits avec {string}")
	public void admin_fait_le_tri_des_produits_avec(String TriSort) {
		MaisonConnectée page= new MaisonConnectée();
		page.triProduit(TriSort);
			
			
		}
	  
	

	@When("Admin clique sur un produit {string}")
	public void admin_clique_sur_un_produit(String ProductName) {
		MaisonConnectée produit= new MaisonConnectée();
		produit.ClickOnProduct(ProductName);
		
	  
	}

	@Then("Admin est sur la page {string}")
	public void admin_est_sur_la_page(String ExceptedMessage) {
		MaisonConnectée home= new MaisonConnectée();
		String actualMessage= home.VerifTitle();
		Assert.assertEquals(ExceptedMessage, actualMessage);
		
	   
	}


}
