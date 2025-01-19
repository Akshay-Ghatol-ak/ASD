  Feature: Register the page successfuly 


Scenario: Register the page all Mandatory fileds 
Given Navigate to the Registeration Page
When Enter the all Mandatory fileds 
|First  |  Akshay |
|Last | Yadav |
|Email | akhaGawtq1@gmail.com | 
|Telephone | 9562256734| 
|Password | Kwiq@123 |
|PasswordConform | Aki@2123 |
And User click on privacy policy 
And User click on continue button 
Then User account successfuly Register 


Scenario: User Create the duplicate Account 
Given Navigate to the Registeration Page
When Enter the all Mandatory fileds
|First  |  Akshay |
|Last | Yadav |
|Email | akshayGhat@gmail.com | 
|Telephone | 9562256734| 
|Password | AKKi@123 |
|PasswordConform | Akki@123 |
And User click on privacy policy1
And User click on continue button1 
Then User should display 

