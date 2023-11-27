#Author: Manel

Feature: Tri d un produit

  
  Scenario: Acceder a la page Maison connecte, faire le tri des produits et cliquer sur un produit 
    Given Admin est dans la page "Maison Connectée"
   
    When Admin fait le tri des produits avec "Tri par popularité"
    And Admin clique sur un produit "Mi Camera 2K Magnetic Mount"
 
    Then Admin est sur la page "Mi Camera 2K Magnetic Mount"
  
