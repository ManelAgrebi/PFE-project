package TestSuites;

import java.io.IOException;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import Pages.ListeSouhaits;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListeSouhaitsStepDef {


@Given("Admin est sur la page du produit")
public void admin_est_sur_la_page_du_produit() throws IOException {
	
	   Config.ConfChrome();
	    Config.navigate(Utils.getProperty("ListeSouhaits_Link"));
	    Config.MaximiseWindow();
   
}

@When("Admin clique sur le bouton")
public void admin_clique_sur_le_bouton() throws InterruptedException {
	ListeSouhaits page= new ListeSouhaits();
	page.AddListWish();

}

@Then("Le produit est ajoutée à la liste de souhaits")
public void le_produit_est_ajoutée_à_la_liste_de_souhaits() throws InterruptedException {
	ListeSouhaits page= new ListeSouhaits();
	Thread.sleep(3000);
	page.ListDeSouhaits();
	
	String VerifNomProduit= page.VerifProduct();
	Assert.assertEquals("Mi Camera 2K Magnetic Mount", VerifNomProduit);
	Config.driver.quit();
	}
	
  
}






