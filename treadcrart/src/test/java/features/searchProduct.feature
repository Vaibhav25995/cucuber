Feature: Search and Place the order for product
@ProdutctPage
Scenario Outline: Search Experience for product search in both home and offers page
Given User is on GreenCart Landing Page
When User searched with shortName <Name> and extracted actual name of product 
Then User serached for shortName <Name> in offers page to check if product exist with same name
And validate product name in offers page matches with landing page

Examples:
|Name|
|TOM |
|Beet| 