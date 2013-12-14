ebankdo_r3_struts-1
========================
Banking R0. Java, Struts 1, Hibernate 3, Oracle, mysql

Description:
-------------------
- eBankDo is an example of a non-existent Bank, Building in Java Web Application.

Functionalities: 
-------------------
- Customer card registration.

Technologies used:
-------------------
- Server Side Technology: Apache Struts 1.3.10, Hibernate 3.
- Client Side Technology: HTML, CSS, JavaScript, Twitter Bootstrap 3, JQuery.
- IDE: Netbeans

System requirements
-------------------

- OS: Windows, Linux, Mac
- Java 7(Java SDK 1.7.0_40-b32) or better
- Apache Tomcat 7.0.47. 


Start Tomcat
-------------------------

export TOMCAT_HOME=/Users/tomasjimenez/Documents/Software/apache-tomcat-7.0.47/

1. Open a command line and navigate to the root of the JBoss server directory.
2. The following shows the command line to start the server with the web profile:

        For Linux:   TOMCAT_HOME/bin/standalone.sh
        For Windows: TOMCAT_HOME\bin\standalone.bat

 
Build and Deploy
-------------------------

 - Generate WAR file
 - Upload by Tomcat manager http://localhost:8080/manager/
 
Installation Process: 
==============


- Step 0: Create table into the DataBase: 
   for Oracle: /Setup/DB/ebankdo_r1_db_mysql.sql
   for Oracle: /Setup/DB/ebankdo_r1_db_oracle.sql


- Step 2: Config DataBase connection: /src/java/hibernate.cfg.xml

- Step 3: view app http://localhost:8080/ebankdo-r3-Struts-1/
 
  

Important Folders:
- Screenshots: System Image.
- HTML: Clear HTML template of the System.
- src/* : Java file, configuration file, xml, html, css, javascript
- Setup: /src/java/hibernate.cfg.xml


Significant Note:
- Do not use this project to production without making the following changes.
  1) Make a good DB structure and tables like sequence, Auto Increment,constrains, index, view and normalization.
  2) Modified the Hibernate Properties "create-drop", if you used that, the production table be erase.
  3) Move the validation message to file.properties, so you can have the capacity of a multi language application.
  4) encrypt the user's password


Deploy and Testing in
---------------------
- Apache Tomcat 7.0.47. 
 
 
view the application 
---------------------

        http://localhost:8080/ebankdo-r3-Struts-1/
        user: admin
        password:admin

