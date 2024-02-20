@indonesia @provisionsP1TCs
Feature: Indonesia App

  Background:
    Given the user logs in as 'Indonesia' in the login page
        # And the DetailedView tab is opened
  Then click on DetailledView and provisions
        # And the Summary tab is opened

  Scenario:1.Verify the Global Filters of provisions in Detailed view screen
    Then Verify all the filters are present on provisions
      | Business Group  |
      | Plant           |
      | Category        |
      | Expiry date     |
      | Loss Tree       |

  Scenario:2.Verify the Business group filter values in Provisions

    Then <"Business Group"> should have following drop-down values
      | Select all           |
      | Beauty & Wellbeing   |
      | Home Care            |
      | Ice Cream            |
      | Nutrition            |
      | Personal Care        |

   #passed##

  Scenario: 3.Verify the plant filter values in Provisions

    Then <"Plant"> should have following drop-down values
      | Select all     |
      | 9000           |
      | 9001           |
      | 9002           |
      | 9003           |
      | 9006           |
     #passed#

  Scenario:4.Verify the Category filter values in Provisions

    Then <"Category filter"> should have following drop-down values
      |Select all           |
      |Beverages            |
      |Deodorants & Fragrances|
      |Fabric Cleaning      |
      |Fabric Enhancers     |
      |Hair Care            |
#      |Home & Hygine        |
#      |Non Corporate Personal Care Category|
#      |Oral Care|
#      |Professional Cleaning Category|
#      |Scratch Cooking Aids|
#      |Skin care|
#      |Skin Cleansing|

    #passed#

  Scenario:5.Verify the Expiry date (Categorical- <6mos, 6mos-12mos, >12 mos) filter values in Provisions
    Then <"Expiry date"> should have following drop-down values
      |Select all|
      |<6 Months |
      |>12 Months|
      |6-12 Months|

  Scenario:6.Verify the Loss Tree filter values in Business view
    Then <"Loss Tree"> should have following drop-down values
      |Select all      |
      |Exclude         |
      |Liquidate - Export|
      |Liquidate - ULI  |

  Scenario Outline:7.Verify the Download button functionality by filtering business group values in Provisions
    And Select the column <column> '<value>' value
    When click on button 'Download' on provision
    Then User should be able to download the results in .xlsx format in an excel sheet
  #Then Downloaded data in the excel sheet must be same as showing in the Home page.
    Examples:
      | column         | value     |
      | Business Group | Home Care |

 Scenario:8.Verify the Download button functionality without filtering the values
   When click on button 'Download' on provision
   Then User should be able to download the results in .xlsx format in an excel sheet
  Then Downloaded data in the excel sheet must be same as showing in the Home page.

  Scenario:9.Verify the DataBase button functionality by without filtering business group values in Provisions
    When click on button 'DataBase' on provision
    Then User should be able to download the dataBase results in .xlsx format in an excel sheet

  Scenario Outline:10.Verify the DataBase button functionality by filtering business group values in Provisions
    And Select the column <column> '<value>' value
    When click on button 'DataBase' on provision
    Then User should be able to download the dataBase results in .xlsx format in an excel sheet
#   Then Downloaded data in the excel sheet must be same as showing in the Home page.
    Examples:
      | column         | value     |
      | Business Group | Home Care |

    Scenario:11.Verify the Page Navigation.
    And scrollToElement1
    And Verify the Page Navigation and Pagenumber selection

#================================================================================
  Scenario Outline:1.Verify the Business group filter:Ice Cream
    And Select the column <column> '<value>' value
    Then <"Plant"> should have following drop-down values
      |9002|
      |9016|
    Then <"Category filter"> should have following drop-down values
      |Ice Cream Category|
    Then <"Expiry date"> should have following drop-down values
      | Select all|
      | <6 Months|
      | >12 Months|
      |6-12 Months|
    When click on button 'Maximum'
    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column | value  |
      | Business Group | Ice Cream|

  Scenario Outline:2.Verify the Plant filter:Ex: 9000
    And Select the column <column> '<value>' value
    Then <"Business Group"> should have following drop-down values
      |Home Care|
    Then <"Category filter"> should have following drop-down values
      |Fabric Cleaning|
    Then <"Expiry Date"> should have following drop-down values
      | >12 Months|
    When click on button 'Maximum'
    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column | value  |
      | Plant | 9000|

  Scenario Outline:3.Verify the Category filter:Beverages
    And Select the column <column> '<value>' value
    Then <"Expiry Date"> should have following drop-down values
      |Select all|
      |<6 Months|
      |>12 Months|
      |6-12 Months|
    Then <"Plant"> should have following drop-down values
      |Select all|
      |9001      |
      |9150      |
      |9153      |
      |9154      |
    Then <"Business Group"> should have following drop-down values
      |Nutrition|
    When click on button 'Maximum'
    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column          | value  |
      | Category filter | Beverages|

  Scenario Outline: 4.Verify the Expiry Date filter:Ex: <6 months
    And Select the column <column> '<value>' value
    Then <"Plant"> should have following drop-down values
      |Select all|
      |9000      |
      |9001      |
      |9003      |
      |9006      |
      |9110      |
      |9150       |
      |9153       |

    Then <"Category filter"> should have following drop-down values
      |Select all|
      |Beverages |
      |Skin Cleansing|

    Then <"Business Group"> should have following drop-down values
      |Select all|
      |Home Care|
      |Ice Cream|
      |Nutrition|
      |Personal Care|
#    When click on button 'Maximum'
#    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column | value  |
      | Expiry date| <6 Months|

   ####### ///////////////////############################

  Scenario Outline:5.Verify the Business group filter:Home Care
    And Select the column <column> '<value>' value

    Then <"Plant"> should have following drop-down values
      |9000|
      |9110|
      |9150|
      |9153|
      |9154|
    Then <"Expiry date"> should have following drop-down values
      |Select all|
      | <6 Months|
      | >12 Months|
      |6-12 Months|
    Then <"Category filter"> should have following drop-down values
      |Select all|
      |Fabric Cleaning|
      |Fabric Enhancers |
      |Home & Hygiene   |
      |Professional Cleaning Category|
    When click on button 'Maximum'
    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column | value  |
      | Business Group | Home Care|

  Scenario Outline:6.Verify the Category filter:Hair care
    And Select the column <column> '<value>' value
    Then <"Expiry Date"> should have following drop-down values
      |Select all|
      |<6 Months|
      |>12 Months|
      |6-12 Months|
    Then <"Plant"> should have following drop-down values
      |Select all|
      |9003      |
      |9150      |
      |9153      |
      |9154      |
    Then <"Business Group"> should have following drop-down values
      |Beauty & Wellbeing|
    When click on button 'Maximum'
    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column          | value  |
      | Category filter | Hair care|

  Scenario Outline: 7.Verify the Expiry Date filter1:Ex: >12 months
    And Select the column <column> '<value>' value
    Then <"Plant"> should have following drop-down values
      |Select all|
      |9000      |
      |9001      |
      |9003      |
      |9006      |
      |9016     |
      |9110      |

    Then <"Category filter"> should have following drop-down values
      |Select all|
      |Beverages |
      |Skin Cleansing|

    Then <"Business Group"> should have following drop-down values
      |Select all|
      |Beauty & Wellbeing|
      |Home Care|
      |Ice Cream|
      |Nutrition|
      |Personal Care|
#    When click on button 'Maximum'
#    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column | value  |
      | Expiry date| >12 Months|
#    ===================================================================================


