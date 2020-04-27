Assignment 3 - Jithesh & Archith
Main class are as follows:
Server-Server.java/
Client- FrontControllerImpl.java/

Other Java Files are:
Controller - FrontController.java/ , 
Model - Model.java/ , ModelImpl.java ,
View - View.java 

Makefile will compile all the class files.

Below are the steps to execute the application:
1. Login to in-csci-rrpc01.cs.iupui.edu as my server and database is on this machine
	a. Open putty
	b. enter host name: in-csci-rrpc01.cs.iupui.edu
	c. port: 22
	d. Click open
	e. Enter valid credentials
	f. cd <Assignment2 folder>

2. Run the registry on port 1089
	a. Open the console as mentioned in 1 and execute the below command
    b. "make clean"
    c. "make all" 
	b. "rmiregistry 1089&"

3. Run Server
    a. Run the command "make server"  (or) "java -Djava.security.policy=policy View/Server in-csci-rrpc01 1089"  

4. Open Another Terminal using the same step 1.

5. Run client 
    a. Run the command "make client" (or) "java -Djava.security.policy=policy Controller/FrontControllerImpl in-csci-rrpc02 1089"
	b. Login : Username : Archith or Jitesh
               Password : arch or jith