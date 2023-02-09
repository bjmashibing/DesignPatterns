##Description
The state pattern is one of the behavioral design patterns. A state design pattern is used when an Object changes its behavior based on its internal state. If we have to change the behavior of an object based on its state, we can have a state variable in the Object and use the if-else condition block to perform different actions based on the state. The state pattern is used to provide a systematic and lose-coupled way to achieve this through Context and State implementations.

![UML Diagram of State Design Pattern](assets/State-Design-Pattern-Diagram.png)

* **Context**: Defines an interface for clients to interact. It maintains references to concrete state objects which may be used to define the current state of objects.
* **State**: Defines interface for declaring what each concrete state should do.
* **ConcreteState**: Provides the implementation for methods defined in State.

**Example of State Design Pattern** In the below example, we have implemented a mobile state scenario. With respect to alerts, a mobile can be in different states. For example, vibration and silence. Based on this alert state, the behavior of the mobile changes when an alert is to be done.

###<center>Advantages of State Design Pattern</center>

* With State pattern, the benefits of implementing polymorphic behavior are evident, and it is also easier to add states to support additional behavior.
* In the State design pattern, an object’s behavior is the result of the function of its state, and the behavior gets changed at runtime depending on the state. This removes the dependency on the if/else or switch/case conditional logic. For example, in the TV remote scenario, we could have also implemented the behavior by simply writing one class and method that will ask for a parameter and perform an action (switch the TV on/off) with an if/else block.
* The State design pattern also improves Cohesion since state-specific behaviors are aggregated into the ConcreteState classes, which are placed in one location in the code.
* It can make your code easier to read. Your code may be simpler to comprehend if the behavior is divided into several states, with each state having a distinct name that is both obvious and descriptive.
* You may find it helpful to follow the Single Responsibility Principle (SRP). According to the SRP, a class should only have one cause to modify. You may guarantee that each state has a clear and distinct duty by encapsulating the behavior in multiple states, which can make your code easier to maintain and alter.

###<center>Disadvantages of State Design Pattern</center>

* The State design pattern can be used when we need to change the state of the object at runtime by inputting into it different subclasses of some State base class. This circumstance is an advantage and disadvantage at the same time because we have a clear separate State class with some logic and on the other hand the number of classes grows up.