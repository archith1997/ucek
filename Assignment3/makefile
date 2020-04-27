all:	classes

classes:	
				javac Controller/FrontController.java
				javac Controller/FrontControllerImpl.java
				javac Controller/View.java
				javac Model/Model.java
				javac View/ModelImpl.java
				javac View/Server.java

clean:
		$(RM) */*.class

server:		View/Server.java	
				java -Djava.security.policy=policy View/Server in-csci-rrpc01 1089

client:		Controller/FrontControllerImpl.java
				java -Djava.security.policy=policy Controller/FrontControllerImpl in-csci-rrpc02 1089