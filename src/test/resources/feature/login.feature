Feature: booking hotel

    Scenario Outline: verifying adactin by all selected fields
    
    Given verify user in adactinpage
     When enter " <username>" and "<password>"and  click login
     And enter search detalis"<location>","<hotels>", "<room_type>","<number of rooms>","<datepick_in>","<datepick_out>","<adult_room>","<child_room>"
     Then  navigate to booking conformation
    
Examples:
| username  |password |location|hotels      |room_type|number of rooms|datepick_in|datepick_out|adult_room|adult_room|child_room|
|albertraj0305 |1234567890    |london  |hotel hervey|Double   |2-Two          |25/07/2021 |27/07/2021  |2-two     |2         |      0   | 