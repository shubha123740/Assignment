# Assignment
Gmail utility:

 A utility which will help to read an email and extract its content.
 
Inputs: To set the email ,password and mail subject from the system in system variables.

Approach:

1.OpenBrowser class for launching browser using docker container as well as through selenium.

2.LoginGmail class to login in the mail,search the mail using subject  and extract content from the selected mail.

3.WriteContent class for extracting the content in spreadsheet.

4.Utilities class for using the reusable functions such as Enter value,click,get content ,take screenshot.

5.To get the screenshot and the spreadsheet name includes the time in hh:mm:ss format.

6.Maintain object repository file to maintain locators.

7.URL launch for windows is docker-machine ip:port and for others localhost:port.
 
 Output:
 
 1.Screenshot for the the events triggered.
 
 2.Spreadsheet with the content.
 
 3.Execution is done with docker (windows) as well as selenium webdriver.
 
