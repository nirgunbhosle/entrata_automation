
# .
# . 
# In the positive scenario, the test case checks if a user can successfully register with valid personal 
# information. In contrast, the negative scenario verifies the system's behavior when invalid data is entered, 
# specifically focusing on error messages and validation checks for each field. 
# .
# .

#-------------------------------------------------------------------------------------------------------------------

@BaseCamp
Feature: BaseCamp functionality

@BaseCampPositive
Scenario Outline: User validating the Basecamp with Valid data
#Given user open the browser
When user navigate to the "https://www.entrata.com/"
And user click on Base Camp link
And user click on Register Now button
Then page title should be "Personal Information - Base Camp 2024"
Then user validate the personal information tite text
And user enters the first Name "<FirstName>"
And user enters the last name "<LastName>"
And user enters the company name "<CompanyName>"
And user enters the job title "<JobTitle>"
And user enters the email "<Email>"
And user enters the phone number "<PhoneNumber>"
And user click on check box
Examples:
|FirstName | LastName   |  CompanyName  | JobTitle |Email             |PhoneNumber | 
|Ram       | Shinde     |  Xorient      |   QA     | ram123@gmail.com |8087762212  | 


@BaseCampNegative
Scenario Outline: User validating the Basecamp with Invalid data
#Given user open the browser
When user navigate to the "https://www.entrata.com/"
And user click on Base Camp link
And user click on Register Now button
Then page title should be "Personal Information - Base Camp 2024"
Then user validate the personal information tite text
And user enters the first Name "<FirstName>"
And user enters the last name "<LastName>"
Then user validate the first name
And user enters the company name "<CompanyName>"
Then user validate the last name
And user enters the job title "<JobTitle>"
Then user validate the company name
And user enters the email "<Email>"
Then user validate the job title
And user enters the phone number "<PhoneNumber>"
And user click on check box
Then user validate the email
Then user validate the phonenumber
Examples:
|FirstName | LastName   |  CompanyName  | JobTitle |Email             |PhoneNumber | 
|          |            |               |          | ramgmail.com     |            | 
