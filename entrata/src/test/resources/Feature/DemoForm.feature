
#.
#.
# The feature file describes the validation process for a demo form, including entering user details 
# and verifying input fields. It utilizes scenarios with various combinations of input data to ensure robust 
# testing of the form's functionality.
#.
#.

#--------------------------------------------------------------------------------------------------------------------

Feature: DemoForm functionality
@DemoForm
Scenario Outline: User validating the demoform
Given user open the browser Demoform
#When user navigate to the "https://www.entrata.com/"
And user click on Watch Demo button
Then page title should be "Property Management Software | Entrata" of Demoform
And user enters the first name "<FirstName>"
Then user validate the first name field "<FirstName>"
And user enters the last name field "<LastName>"
Then user validate the last name field "<LastName>"
And user enters the email field "<Email>"
Then user validate the email field "<Email>"
And user enters the company name field "<CompanyName>"
Then user validate the company name field "<CompanyName>"
And user enters the phonenumber field "<PhoneNumber>"
Then user validate the phonenumber field "<PhoneNumber>"
And user select the unit count
And user enters the job title field "<JobTitle>"
Then user validate the job title field "<JobTitle>"

Examples:
|FirstName | LastName  | Email            |  CompanyName  | PhoneNumber | JobTitle |
|Ram       | Shinde    | ram123@gmail.com |  Apple        | 9876543210  | QA       |
|          |           | ram123@gmail.com |  Apple        | 9876543210  | QA       |
|Ram       | Shinde    | ram123gmail.com  |  Apple        | 9876543210  | QA       |
|Ram       | Shinde    | ram123@gmail.com |  Apple        |             | QA       |
|Ram       | Shinde    | ram123@gmail.com |  12334        | 9876543210  | QA       |
|Ram       | Shinde    | ram123@gmail.com |  Apple        | 9876543210  | 1234     |


