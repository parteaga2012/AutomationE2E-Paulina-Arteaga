Feature: add product to cart with different accounts


  @foo
  Scenario Outline: Adding one product to the cart
    Given Sergey wants to buy a new product
    And he enters the username "<username>" and password "<password>"
    And he adds the product with name "<product 1>" to the cart
    And he adds the product with name "<product 2>" to the cart
    And he navigates to the cart
    And he checks the following products are in the cart "Sauce Labs Backpack,Sauce Labs Bike Light"
    And he navigates to the checkout page
    When he fills the checkout page
    Then he should see the text "Thank you for your order!"
    Examples:
      | username      | password     | product 1           | product 2             |
      | standard_user | secret_sauce | Sauce Labs Backpack | Sauce Labs Bike Light |



