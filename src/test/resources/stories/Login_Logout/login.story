Meta:
Narrative:
Customer login to their BGE account.

Scenario: Customer login into his account with valid credentials
Meta:
@login
Given Bob, a customer
When Bob, logs into his BGE account with <validEmail> and <validPassword> 
Then Bob, should see his BGE account Dashboard
Examples:
|validEmail||validPassword|
|BGE123_0.rulez@gmx.net||password|

Scenario: Customer should not login to their account with incorrect credentials
Meta:
@login 
Given Bob, is a BGE customer
When Bob, logs into his BGE account with <invalidEmail> and <invalidPassword>
Then Bob should see the error message as Incorrect username/password
When Bob, logs into his BGE account with <validEmail> and  <invalidPassword>
Then Bob should see the error message as Incorrect username/password.
When Bob, logs into his BGE account with <invalidEmail> and  <validPassword>
Then Bob should see the error message as Incorrect username/password.
When Bob, logs into his BGE account without providing valid credentials(empty) and click sign in
Then Bob, should see the error message as Please enter your email and Please enter your password
Examples:
|invalidEmail||invalidPassword||validEmail||validPassword|
|mayank@bordgais.ie||mayank||BGE123_0.rulez@gmx.net||password|
