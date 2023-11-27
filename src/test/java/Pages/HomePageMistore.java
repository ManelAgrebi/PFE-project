package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageMistore {
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> menus;
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/div/div/div/div/section/div/div/div/div/div/a/div/div[2]/h4")
	List<WebElement> submenus;
	
	
	
	public HomePageMistore () {
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void MouseHoverOnMenuByName (String MenuName) {
		try {
	
		for (WebElement menu:menus) {
			if (menu.getText().contains(MenuName)) {
				Config.actions=new Actions(Config.driver);
				Config.actions.moveToElement(menu).perform();
			}
		}
		
		}catch(Exception e) {
			
		}
	
		}
	
	
	
	public void ClickProduct(String ProductName) {
		try {
		for (WebElement submenu:submenus) {
			
			
			if (submenu.getText().contains(ProductName)) {
				
				submenu.click();
			}
		}
	}catch(Exception e) {
		
	}
	}
	


}
