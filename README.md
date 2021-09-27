# Parcel Application 

#### PREREQUISITES:
  * Intellij IDE
  * MySQL Workbench
  * Postman
    
##  How to start ?

   ### IMPORTING NECESSARY FILES
   
  * Download the project,it will be downloaded as zip file
  * unzip the file,right click the folder 
       * -> open with IntelliJ (I prefer using this)
  * Wait for the dependencies to get loaded, by that time open MySql Workbench
  * search for **Server** in the navigation pane of Workbench 
       * -> Data Import 
       * -> click the radio button(Import from the self contained file)
       *  -> browse the location of the sql file
  * After choosing the correct location
      *  -> create a new schema(better)
      *   -> start Importing 
  * At the left pane you will see your your sql file got imported
      *  -> Right Click on the imported table
      *   ->**click Select Rows -Limit 1000** 
      *   -> The table will be displayed
  * ok lets go to Postman now and import the urls
  * There is a file in the form of json ,we need to import the file by clicking the import option under the myWorkspace header
  * Go back to IntelliJ 
    * click project part on the left pane
    * click src -> main -> resources
    * under resources 
    * -> application properties
    *  -> change the schema name ,username and password (according to your MySQL workbench details)
  ![image](https://user-images.githubusercontent.com/83566090/134857439-153e7104-9e64-477a-8a92-4cf2a3bb093b.png)
    * All ready to start our application

  ## Lets run the program
  * okay we are all ready to start our original program from IntelliJ
  * After successfull running of program 
   ![image](https://user-images.githubusercontent.com/83566090/134856961-ed23371c-2c62-4768-b353-329152f24f73.png)
  
  ## REST APIs : https://www.tutorialspoint.com/restful/index.htm
  ### Postman
   * firstly we need to **POST** , we need to post the details of the parcel so that it gets saved in the sql table
   * next if we want to find any parcel, with the help of **GET** will find the particular parcel with the help of parcel_id
   * Suppose you have mistakenly typed wrong details  regarding your parcel , you can update the same using **PUT** by finding that particular parcel_id
   * If you want to drop the particular parcel_id, use **DELETE**
   
  
