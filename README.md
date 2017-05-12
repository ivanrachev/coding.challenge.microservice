## The challenge
---
* Create a new repo, name it by using a GUID generator
* REMOVE ALL the content in this readme, don't put any wording like "prive" or "challenge" so that other candidates cannot search your repo and copy your code.
* Do NOT fork, as other candidates would be able to see your solution easily.
* Create an application that displays information about an account.
* The code will be run on Ubuntu 14.04 for final review if needed.
* If you are using windows, find a way to code and test before submission.


## Goal
---
Create a client-server account display application with the following requirements:
* Server portion of the application runs as a microservice and exposes an end point in RESTful manner with JSON format
* The microservice end point implements an HTTP GET method that takes as a parameter an account ID
* The microservice end point retrieves one Account object in JSON format (see Account.java for description of account fields)
* The microservice implements JSON Web Token authentication/authorization (use Spring and JJWT libraries)
* Client portion of the application runs from command line with following parameters:
  > java clientAccountDisplay -ip 192.168.1.123 -port 80 -accountID 12345
  where ip/port is the ip/port of microservice, accountID is the external account ID
* client portion of the application calls the microservice end point, and prints the account information to the standard output.

NOTE: Server may have hard-coded list of accounts. 
NOTE: Server is not required to store and read account information from a database.
NOTE: Code must be in JAVA

## Things that will get our attention:
---
1. How quickly you learn JSON Webtoken Authentication, RESTful, microservices and get the challenge done
2. How easy it is for someone else to understand the code you wrote and easily extend the functionality
3. Does your code compile, does it do the job as expected, is it bug-free, how does it handle exceptional situations?
