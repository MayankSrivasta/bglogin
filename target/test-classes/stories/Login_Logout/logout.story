Meta:
Narrative:
As a user Customer log out from their account
 
Scenario: Customer logging out of their online account
Meta:
@logout
Given Bob a customer is logged into his BGE online account with <validEmail> and <validPassword>
When Bob, logs out of his BGE online account
Then Bob, is out of his Bord Gais Account
Examples:
|validEmail||validPassword|
|BGE123_0.rulez@gmx.net||password|



Scenario: Customer logging out of their Bord Gais online account
Meta:
@logout
Given Bob, logged into his account with <validEmail> and <validPassword>
When Bob, logs out of his account
Then Bob, should be logged out of his BGE online account
Examples:
|validEmail||validPassword|
|BGE123_0.rulez@gmx.net||password|