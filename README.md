# ActiveMQ
Artemis ActiveMQ SpringBoot 

========= Steps to send the Message in Queue and Receive Message from Queue =====
1) Download Artemis ActiveMQ
2) Run Artemis ActiveMQ
3) Open URL : http://localhost:8161/console
4) Create Microservice Application (SendMessage) for sending messsages to Queue
5) Use Postman to send the Messages
	GET : http://localhost:7071/queue/sendMessage
	Key: myMessage			Value: My name is Maddy!
Create Microservice Application (ReceiveMessage) for receiving messsages from Queue

