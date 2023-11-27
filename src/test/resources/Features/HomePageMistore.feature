#Author: Manel


Feature: Sélectionner un produit

  
  Scenario: Survoler sur les menus de la page d accueil et cliquer sur un submenu
    Given Admin is on Home Page
   
    When Admin mousehover on menu "Smart Home" and click on submenu "Maison connectée"
   
    Then admin is directed to product page "Maison Connectée"
    

 