Feature: As a User, I want to open Car Page, so that I can see the details of the car

  Scenario: As User, I successfully open the car page and select tab without driver
    Given I open Traveloka home page
    When I click on the Car
    Then I should see the Car Page
    When I click on the tab without driver
    Then I should see the Your Rental Location input
    And I should see the Rental Start Date input
    And I should see the Start Time input
    And I should see the Rental End Date input
    And I should see the End Time input
    And I should see the Search button
    When I select Pickup Location 'Jakarta'
    And I select Rental Start Date 'today' add '2' days
    And I select Start Time at '10' with '30' minutes
    And I select Rental End Date 'today' add '5' days
    And I select End Time at '11' with '00' minutes
    And I click on the Search button
    Then I should see the list of cars
    When I select Car as 'Mini MPV'
    And I select Car Provider as 'Smart Rent Car Driverless Jakarta'
    And I select first car
    Then I should see the product detail

    When I click on continue on the product detail
    Then I should see pop-up error with message Please check your booking
    When I select Pick-up Location in Rental Office
    And I select Drop-off Location in Other Location with Location is 'Jakarta'
    And I input Pick-up or Drop-off notes is optional with notes 'Please call me when you arrive'
    And I click button Book Now
    And I fill Contact Details with name is 'John Doe' and email is 'john@gmail.com' and phone number is '08123456789'
    And I fill Driver Details with title is 'Mr' and full name is 'John Doe' and phone number is '081233'
    And I click Continue
    And I add a special request is optional with notes 'Please provide a baby seat'
    And I check all rental requirements
    And I click Continue To Payment
    And I select payment method and proceed payment
    Then I should see Car Rental Summary Page




