@indonesia @businessviewP1TCs
Feature: Indonesia App

  Background:
    Given the user logs in as 'Indonesia' in the login page
    Then click on ProvisionTab in the DetailledView Page

  @indonesia
  Scenario: Verify the Subtabs Business View/Provision (With toggle switch)

    And the BusinessView tab is opened on DetailedView page
#    And the Provisions tab is opened on DetailedView page
     #passed#

  Scenario: Verify the Global Filters of Business view in Detailed view screen
    Then Verify all the filters are present
      | Business Group  |
      | Plant |
      | Category         |
      | Expiry date     |
      | Provision Quantity |
     #passed


  Scenario: 5.Verify the Business group filter values in Business view

    Then <"Business Group"> should have following drop-down values

      | Select all           |
      | Beauty & Wellbeing   |
      | Home Care            |
      | Ice Cream            |
      | Nutrition            |
      | Personal Care        |

   #passed#
  Scenario: 6.Verify the plant filter values in Business view

    Then <"Plant"> should have following drop-down values
      | Select all     |
      | 9000           |
      | 9001           |
      | 9002           |
      | 9003           |
      | 9006           |
     #passed#

  Scenario: 7.Verify the Category filter values in Business view

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

  Scenario: 8.Verify the Expiry date (Categorical- <6mos, 6mos-12mos, >12 mos) filter values in Business view
    Then <"Expiry date"> should have following drop-down values
      |Select all|
      |<6 Months |
      |>12 Months|
      |6-12 Months|



  Scenario: 9.Verify the Provision Quantity filter values in Business view
    Then <"Provision Quantity"> should have following drop-down PR values
      |All                |
      |Provision Quantity |

  Scenario: 10.Verify the Loss Tree filter values in Business view
    Then <"Loss Tree"> should have following drop-down values
      |Select all      |
      |Exclude         |
      |Liquidate - Export|
      |Liquidate - ULI  |
  Scenario: 26.Verify the columns in Business view table
    Then <"Columns"> should have following drop-down values
#      |Select All   |
#      | SKU         |
#      | Description |
#      | Plant       |
#      | Location    |
#      | Batch / Lot |
#      | SLOC |
#      | Status SLED|
      | Active SKU Mapped|
      | SLED/BB|
      | Category|
      | Loss Tree General|
      | Actual Qty|
      | Actual Value|
      | Qty Prov left for Sale |
      | Qty Prov|
      | Value Prov|
      | Status|
      | Action From BW |
      | Product Cost/CS|
      | Offer Price/CS |
      | Retail/CS|
      |Disc From Retail|
      | BG |
      | Status |

  Scenario Outline:Verify the Search functionality of all the columns displayed in business view table
    When click columnsDropDownPath button
#    And enter the '<data>' to search
#    And enter '<Columns Value>'
    And the '<columns>' is entered into the columns filter in BusinessView page
    Then verify the '<columns>' must be present on the list
#    Then verify the '<columns>' must be present on the table


    Examples:
      |columns|
#      |Select All   |
#      | SKU         |
#      | Description |
#        |Plant|
      |Location|
#      | Batch / Lot |
#      | SLOC        |
#       | Status SLED |

  Scenario Outline: Verify the column filter
#    And check the users count
    And Select the columns <column> '<filtername>' value for ColumnsFilter
    Then verify the '<filtername>' must be present on the table
#    When click columnsDropDownPath button
#  And Select name in columns1 filter
    Examples:
      | column      | filtername  |
      | Columns     | Plant   |
#      | Select All  |
#      | SKU         |
#      | Description |
#      | Plant       |
#      | Location    |
#      | Batch / Lot |
#      | SLOC        |
#      | Status SLED |

    #inprogress#P2Testcases#

  Scenario:Verify the Bidding List Creation button in disabled on Business view screen.
    And verify the CBP button is disabled in the businessview page

   #passed#
  Scenario:33.Verify the Bidding List Creation button without selecting the sku's
#  And check the users count
  #And Get message count
    And the CBP button is clicked in the businessview page
#    And the clickandhold the pop
#    And Verify toast message "Please select sku's to create a list"
   #passed#
  Scenario Outline:Verify the Bidding List Creation functionality in Business view screen
    And the '<Qty Prov>' is entered into the QtyProv filter in BusinessView page
    Then Verify toast message "Successfully Submitted"
    Then click on cancel
    Then click on arrow on the Detailed view screen's right side
#    Then verify the created biddinglist name

#    And select the displayed row on the table
    Examples:
      | Qty Prov    |
      | 10   |


  Scenario:   Verify the Bidding List Creation functionality in Business view screen screen's right side.

    Then click on arrow on the Detailed view screen's right side


  Scenario Outline:Verify the search functionality of SKU column of business view table
    And the '<SKU>' is entered into the SKU filter in BusinessView page
    Then verify the '<SKU>' must be present in column1
#    Then Results should be displayed according to the Filter '<value>' selected

    Examples:
      | SKU     |
      | 21133328   |

     #passed#

  Scenario Outline:Verify the search functionality of Description column of business view table
    And the '<Description>' is entered into the Description filter in BusinessView page
    Then verify the '<Description>' must be present in column2
#    Then Results should be displayed according to the Filter '<value>' selected

    Examples:
      | Description     |
      | DOVE GNTLE   |

     #passed#
  Scenario Outline:Verify the search functionality of Plant column of business view table
    And the '<Plant>' is entered into the Plant filter in BusinessView page
    Then verify the '<Plant>' must be present in column3
#    Then Results should be displayed according to the Filter '<value>' selected

    Examples:
      | Plant     |
      | 9154   |

   #passed#

  Scenario Outline:Verify the search functionality of BatchLot column of business view table
    And the '<BatchLot>' is entered into the BatchLot filter in BusinessView page
    Then verify the '<BatchLot>' must be present in column4
#    Then Results should be displayed according to the Filter '<value>' selected

    Examples:
      | BatchLot |
      | 235122   |

     #passed#

  Scenario Outline:Verify the search functionality of category column of business view table
    And the '<category>' is entered into the Category filter in BusinessView page
    Then verify the '<category>' must be present in column5
#    Then Results should be displayed according to the Filter '<value>' selected

    Examples:
      | category |
      | Skin Cleansing |

    #passed#
  Scenario Outline:Verify the search functionality of Location column of business view table
    And the '<Location>' is entered into the Location filter in BusinessView page
    Then verify the '<Location>' must be present in column6
#    Then Results should be displayed according to the Filter '<value>' selected

    Examples:
      | Location |
      | CIBITUNG |

     #passed#



  Scenario Outline: Verify the Business group filter:Ice Cream
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

  Scenario Outline: Verify the Plant filter:Ex: 9000
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

  Scenario Outline: Verify the Category filter:Beverages
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

  Scenario Outline:  Verify the Expiry Date filter:Ex: <6 months
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

  Scenario Outline: Verify the Business group filter:Home Care
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

  Scenario Outline: Verify the Plant filter:Ex: 9001
    And Select the column <column> '<value>' value
    Then <"Business Group"> should have following drop-down values
      |Nutrition|
    Then <"Category filter"> should have following drop-down values
      |Beverages|
    Then <"Expiry Date"> should have following drop-down values
      | >12 Months|
    When click on button 'Maximum'
    Then Results should be displayed according to the Filter '<value>' selected
    Examples:
      | column | value  |
      | Plant | 9001|

  Scenario Outline: Verify the Category filter:Hair care
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

  Scenario Outline:  Verify the Expiry Date filter1:Ex: >12 months
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
