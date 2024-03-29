@indonesia @provisionsP1TCs
Feature: Indonesia App

  Background:
    Given the user logs in as 'Indonesia' in the login page
        # And the DetailedView tab is opened
  Then click on DetailledView and provisions
        # And the Summary tab is openedd

  #####Week 4(12th Feb-16]th Feb)####
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
      | BEAUTY & WELLBEING   |
      | HOME CARE            |
      | ICE CREAM            |
      | NUTRITION         |
      | PERSONAL CARE       |

   #passed##

  Scenario: 3.Verify the plant filter values in Provisions

    Then <"Plant"> should have following drop-down values
      | Select all     |
      | 9000           |
      | 9002           |
      | 9003           |
      | 9004           |
      | 9006           |
     #passed#

  Scenario:4.Verify the Category filter values in Provisions

    Then <"Category filter"> should have following drop-down values
      |Select all           |
      |BEVERAGES            |
      |Blank                |
      |DEODORANTS & FRAGRANCES|
      |FABRIC CLEANING      |
      |FABRIC ENHANCERS    |
      |HAIR CARE           |
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
      |Bulldozer      |
      |Damage return|
      |Delisted  |

  Scenario Outline:7.Verify the Download button functionality by filtering business group values in Provisions
    And Select the column <column> '<value>' value
    When click on button 'Download' on provision
    Then User should be able to download the results in .xlsx format in an excel sheet
  #Then Downloalded data in the excel sheet must be same as showing in the Home page.
    Examples:
      | column         | value     |
      | Business Group | HOME CARE |

 Scenario:8.Verify the Download button functionality without filtering the values
   When click on button 'Download' on provision
   Then User should be able to download the results in .xlsx format in an excel sheet
#  Then Downloaded data in the excel sheet must be same as showing in the Home page.

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
      | Business Group | HOME CARE |

    Scenario:11.Verify the Page Navigation.
    And scrollToElement1
    And Verify the Page Navigation and Pagenumber selection

#==week5(19th Feb-23rd Feb)==+===============================================================================

  Scenario Outline:12.Verify the Business group filter:Ice Cream
    And Select the column <column> '<value>' value
    Then <"Plant"> should have following drop-down values
      |9002|
    Then <"Category filter"> should have following drop-down values
      |ICE CREAM|
    Then <"Expiry date"> should have following drop-down values
      |Select all|
      | <6 Months|
#    When click on button 'Maximum'
#    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column         | value  |
      | Business Group | ICE CREAM|

  Scenario Outline:13.Verify the Plant filter:Ex: 9110
    And Select the column <column> '<value>' value
    Then <"Business Group"> should have following drop-down values
      |Select all|
      |HOME CARE|
      |NUTRITION|
    Then <"Category filter"> should have following drop-down values
      |Select all|
      |BEVERAGES|
      |FABRIC CLEANING      |
      |FABRIC ENHANCERS    |
#    Then <"Expiry Date"> should have following drop-down values
#      |Select all|
#      |<6 Months|
#      |>12 Months|
#      |6-12 Months|
#    When click on button 'Maximum'
#    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column | value  |
      | Plant | 9110|

  Scenario Outline:14.Verify the Category filter:Beverages
    And Select the column <column> '<value>' value

    Then <"Business Group"> should have following drop-down values
      |NUTRITION|

#    Then <"Expiry Date"> should have following drop-down values
#      |Select all|
#      |<6 Months|
#      |>12 Months|
#      |6-12 Months|
#    Then <"Plant"> should have following drop-down values
#      |Select all|
#      |9015      |
#      |9110      |
#      |9120      |
#      |9150      |
#    When click on button 'Maximum'
#    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column          | value  |
      | Category filter | BEVERAGES|

  Scenario Outline:15.Verify the Expiry Date filter:Ex: <6 months
    And Select the column <column> '<value>' value
    Then <"Plant"> should have following drop-down values
      |Select all|
      |9105       |
      |9110       |
      |9120      |
      |9150      |
      |9200      |
      |9201      |

    Then <"Category filter"> should have following drop-down values
      |Select all|
      |BEVERAGES   |
      |DEODORANTS & FRAGRANCES|

    Then <"Business Group"> should have following drop-down values
      |Select all|
      |BEAUTY & WELLBEING|
      |HOME CARE|
      |ICE CREAM|

#    When click on button 'Maximum'
#    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column | value  |
      | Expiry date| <6 Months|

   ####### ///////////////////############################

  Scenario Outline:16.Verify the Business group filter:Home Care
    And Select the column <column> '<value>' value
#    Then <"Plant"> should have following drop-down values
#      |9000|
#      |9105|
#      |9110|
#      |9120|
#      |9150|
    Then <"Expiry date"> should have following drop-down values
      |Select all|
      | <6 Months|
      | >12 Months|
      |6-12 Months|
    Then <"Category filter"> should have following drop-down values
      |Select all|
      |FABRIC CLEANING|
      |FABRIC ENHANCERS|
      |HOME & HYGIENE |
      |PROFESSIONAL CLEANING CATEGORY|
#    When click on button 'Maximum'
#    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column | value  |
      | Business Group | HOME CARE|

  Scenario Outline:17.Verify the Category filter: Beverages
    And Select the column <column> '<value>' value
    Then <"Plant"> should have following drop-down values
      |Select all|
      |9105     |
      |9110      |
      |9120      |

#    Then <"Expiry Date"> should have following drop-down values
#      |Select all|
#      |<6 Months|
#      |>12 Months|
#      |6-12 Months|

    Then <"Business Group"> should have following drop-down values
      |NUTRITION|

#    When click on button 'Maximum'
#    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column          | value  |
      | Category filter | BEVERAGES|

  Scenario Outline:18.Verify the Expiry Date filter1:Ex: >12 months
    And Select the column <column> '<value>' value
    Then <"Plant"> should have following drop-down values
      |Select all|
      |9000      |
      |9002      |
      |9003      |
      |9004      |
      |9006     |
#      |9110      |

    Then <"Category filter"> should have following drop-down values
      |Select all|
      |BEVERAGES |
#      |Hair care|

    Then <"Business Group"> should have following drop-down values
      |Select all|
      |BEAUTY & WELLBEING|
      |HOME CARE|
      |ICE CREAM|
      |NUTRITION|
      |PERSONAL CARE|
#    When click on button 'Maximum'
#    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column | value  |
      | Expiry date| >12 Months|


  Scenario Outline:19.Verify the Plant filter:Ex: 9120
    And Select the column <column> '<value>' value
    Then <"Business Group"> should have following drop-down values
      |NUTRITION|
    Then <"Category filter"> should have following drop-down values
      |Select all|
      | BEVERAGES|
      | Blank    |
#    Then <"Expiry Date"> should have following drop-down values
#      |Select all|
#      |<6 Months|
#      |>12 Months|
#      |6-12 Months|
#    When click on button 'Maximum'
#    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column | value  |
      | Plant | 9120|

