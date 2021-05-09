# todos-TestCases
#### 	Project Name:	Different ToDos 
#### Test Designed by:	Achini Herath	
#### Version : V01
#### Test Executed by: 						
#### Test Execution date:

#### Pre-condition: Use application by `http://todomvc.com/examples/react/#/`
#### Dependencies:	
#### Test Priority :

### Created Test cases for Todos app

|   Test Case ID  | Test Case |	Test Steps |	Test Data |	Expected Result |	Pre-condition|	Actual Result|	Status|	Notes|
| :--------   | :----------- |:--------------|:--------------|:------------|:------------|:----------|:-----------|:---------|
| 001| Open a browser and go to `http://todomvc.com/examples/react/#/` There should be a place to enter text |||Text area should be only there with header "todos"  |There should not be any created recods in the list |
|002| Text field placeholder should be "What needs to be done?  |||   Text area should be there with  "What needs to be done " placeholder | 
|003|click on the text field and press enter button |||There should not be a change, New recode should not create. |
|004|User should be able to enter text on the text field||List Item 01|Entered text should be display |
|005|try to erase the text by using "Backspace" button click||List Item 01|Text Should remove from the text editor|
|006| enter the given  text on the  field and press enter button ||List Item 01|Entered text should be create as a new recode below the text field.|
|007|Check the Bottom bar , 1 Item left text should be display below the created record |||1 Item left text should be display below the created record
|008| Check the Bottom bar , All Button should be display  ||| All Button should be display|
|009| Check the Bottom bar ,Active Button Should be display |||Active Button Should be display|
|010|See the Bottom bar, Completed Button should be display |||Completed Button should be display|
|011|By default, All button should be selected |||Red color boarder should be enble to the All Butoon |
|012|Active button should be next to the All Button |||
|013|  Completed Button should be display next to the Active |||
|014| All Button should be clickable.|||
|015|There should be a checkbox for each created record|||Check box should be with Round boarder  
|016|Click on the checkbox to mark as complete||  |checkbox should be checked and Item text should be strikethrough and clear completed option should be enable, 0 items left text should display. |
|017|Click on Active button|||URL Should re direct to the active page, There should not any record in the list. |
|018| Click on completed Button|||URL Should re direct to the Completed page, There should be a record in the list. |
|019|Click on the down arrow in the "What needs to be done ?" text area|||List Item1 recod should be marked as Active, Completed list should be empty," 1 Item left" text should be display, All , Active lists should contain "List Item 1 " record.| List Item 01 should marked as Completed|
|020|Double click on the created recode " List Item 01" |||Record should be move to editable mode. |
|021| Add a text " -Edited " in to the text and press enter||Edited|New record should be as "List Item 01 - Edited |
|022|make Edited record as completed by click on the checkbox |||checkbox should be checked and Item text should be strikethrough and clear completed option should be enable, 0 items left text should display. ~~List Item 01-Edited.~~|
|023|Create a new record ||List item 02|All tab should contain 2 records and" List Item 01 - edited" should be marked as completed ,1 Item left text should be display, Active lists should contain "List Item 2 " record.Completed list should contain one record. |
|024|In the All List , mouse over the created records, and check whether red color cross display in the right corner of the text or not|||Disable red color cross symbol should be there in the each record, Once mouse move to the cross, that should be enable with bright red color. |
|025|Click on the red color cross for "List Item 02" record|||Record should be remove from the list. Without having any confirmation.|
|026|Click on the red color cross for "List Item 01 - edited " record|||Record should be remove from the list. Without having any confirmation. Text area with "What needs to be done " placeholder should only be there. |
|027|Create  new records as "List Item 03" and "List Item 04" |||Two records should be there in the list. |
|028|Mark  "List Item 03" as completed and click on clear completed button|||List Item 03 should remove from the list without having any confirmation, "List Item 04"should be there in the active , All lists. |
|029|try to create one character item ||1|It should create a new record |
|030|Try to create a record with lengthy text with 500 characters. |||It should create a new record |
|031|Create 5 new records and check the order |||Records should list according to the created order id's ascending order|
|032| Enter 50 Records and check how list works |||There should not be a scroll bar for the created list, |
|033| Create different sessions and check the visibility of the list|||Records should be unique for the particular session |
|034| Check Browser compatibility with the same functions |||
				
									
	

		
									
									
									
									
									
									
									
									

