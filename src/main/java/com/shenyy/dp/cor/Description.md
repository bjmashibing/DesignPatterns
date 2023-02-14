##Description
Chain of responsibility pattern is used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them. Later, the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.


###Where and When Chain of Responsibility pattern is applicable : 
* When you want to decouple a request’s sender and receiver
* Multiple objects, determined at runtime, are candidates to handle a request
* When you don’t want to specify handlers explicitly in your code
* When you want to issue a request to one of several objects without specifying the receiver explicitly.

This pattern is recommended when multiple objects can handle a request and the handler doesn’t have to be a specific object. Also, the handler is determined at runtime. Please note that a request not handled at all by any handler is a valid use case.

![UML diagram](assets/desigmpatternuml1.png)

* **Handler**: This can be an interface which will primarily receive the request and dispatches the request to a chain of handlers. It has reference to the only first handler in the chain and does not know anything about the rest of the handlers.
* **Concrete handlers**: These are actual handlers of the request chained in some sequential order.
* **Client**: Originator of request and this will access the handler to handle it.

###How to send a request in the application using the Chain of Responsibility
The Client in need of a request to be handled sends it to the chain of handlers which are classes that extend the Handler class.
Each of the handlers in the chain takes its turn trying to handle the request it receives from the client.
If ConcreteHandler1 can handle it, then the request is handled, if not it is sent to the handler ConcreteHandler2, the next one in the chain.

###Advantages of Chain of Responsibility Design Pattern
* To reduce the coupling degree. Decoupling it will request the sender and receiver.
* Simplified object. The object does not need to know the chain structure.
* Enhance flexibility of object assigned duties. By changing the members within the chain or change their order, allow dynamic adding or deleting responsibility.
* Increase the request processing new class of very convenient.

###DisAdvantages of Chain of Responsibility Design Pattern
* The request must be received not guarantee.
* The performance of the system will be affected, but also in the code debugging is not easy may cause cycle call.
* It may not be easy to observe the characteristics of operation, due to debug.