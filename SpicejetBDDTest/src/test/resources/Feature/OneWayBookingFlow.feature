Feature: To test flight booking flow till payment page

  Scenario Outline: Flight availability
    Given Customer is on the Book flight page
    And Customer selects oneway
    And Customer selects origin as <Origin>
    And Customer selects destination as <Destination>
    And Customer selects Departure date as <DepDate>
    And Customer selects Number of passngers as <NbrAdults>
    And Customer selects currency as <Currency>
    And Customer clicks on Search
    Then various available flights are shown to the Customer
    And Customer selects flight
    And Customer clicks on Continue for details page
    Then Customer details page is displayed
    And Customer enters first Name <Fname>
    And Customer enters last Name <Lname>
    And Customer enters mobile number <Mnumber>
    And Customer enters email <email>
    And Customer selects city <city>
    And Customer selects I am flying check box
    And Customer clicks on Continue for ancillary page
    Then ancillary purchase page is displayed
    And Customer clicks on excess bag
    And Customer selects excess bag
    And Customer clicks on Continue for seat selection
    Then seat selection page is displayed
    And Customer skips the seat selection
    Then payment page is displayed

    Examples: 
      | Origin | Destination | DepDate | NbrAdults | Currency | Fname  | Lname | Mnumber    | email         | city   |
      | Mumbai | Bengaluru   |      30 |         1 | INR      | Hitesh | Patel | 9870881705 | hak@gmail.com | Mumbai |
