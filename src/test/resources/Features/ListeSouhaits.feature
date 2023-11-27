#Author: Manel

Feature: Liste de souhaits


  Scenario: Ajouter un produit à la liste de souhaits
    Given Admin est sur la page du produit 
   
    When Admin clique sur le bouton 
    
    Then Le produit est ajoutée à la liste de souhaits
    
 