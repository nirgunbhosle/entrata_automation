
 #.
 #.
 #The feature file describes a set of scenarios for validating the functionality and content of the homepage of
 #the Entrata website. It includes steps to open the browser, navigate to the homepage, validate the 
 #page title, navigate to different sections such as products, solutions, and resources, and verify 
 #the text content within these sections. Additionally, it ensures the presence and functionality of the 
 #sign-in button. These scenarios collectively aim to ensure the proper functioning and correctness of the 
 #Entrata homepage
 #.
 #.

#--------------------------------------------------------------------------------------------------------------------------

Feature: HomePage functionality
@HomePage
Scenario: User validating the homepage
Given user open the browser homepage
#When user navigate to the "https://www.entrata.com/"
Then page title should be "Property Management Software | Entrata"
When user navigate to the products
Then user validate the text of products
When user navigate to the solutions
Then user validate the text of solutions
When user navigate to the resources
Then user validate the text of resources
And user validate signin buttton
