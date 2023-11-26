#Author: Manel

Feature: Liste de souhaits


  Scenario: Ajouter un produit à la liste de souhaits
    Given Admin est sur la page du produit "Mi Camera 2K Magnetic Mount"
   
    When Admin clique sur le bouton "Ajouter à la liste de souhaits"
    
    Then Le produit "Mi Camera 2K Magnetic Mount" est ajoutée à la liste de souhaits
    
 