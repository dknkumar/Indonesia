@indonesia @provisionsP1TCs
Feature: Indonesia App

  Background:
    Given the user logs in as 'Indonesia' in the login page
#     And the DetailedView tab is opened
  Then click on DetailledView and provisions
# And the Summary tab is opened

  Scenario: Verify the Global Filters of provisions in Detailed view screen
    Then Verify all the filters are present on provisions
      | Business Group  |
      | Plant           |
      | Category        |
      | Expiry date     |
      | Loss Tree       |

  Scenario: Verify the Business group filter values in Provisions

    Then <"Business Group"> should have following drop-down values

      | Select all           |
      | Beauty & Wellbeing   |
      | Home Care            |
      | Ice Cream            |
      | Nutrition            |
      | Personal Care        |

   #passed#

  Scenario:  Verify the plant filter values in Provisions

    Then <"Plant"> should have following drop-down values
      | Select all     |
      | 9000           |
      | 9001           |
      | 9002           |
      | 9003           |
      | 9006           |
     #passed#

  Scenario: Verify the Category filter values in Provisions

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

  Scenario: Verify the Expiry date (Categorical- <6mos, 6mos-12mos, >12 mos) filter values in Provisions
    Then <"Expiry date"> should have following drop-down values
      |Select all|
      |<6 Months |
      |>12 Months|
      |6-12 Months|



