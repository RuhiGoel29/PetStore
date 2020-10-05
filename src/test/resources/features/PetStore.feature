@Regression 
Feature: petstore feature file

Background: User sets the base url 
	Given I set the base url for pet store 

@TC_01 
Scenario: Implementing the API automated checks for DEMO PET STORE
	When I GET all the available pets 
	Then I validate the status code of API is 200 
	When I POST a new available pets in the store 
	Then I validate the status code of API is 200 
	When I PUT the pet status to sold 
	Then I validate the status code of API is 200 
