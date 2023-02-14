##Description

Abstract Factory design pattern is one of the Creational pattern. Abstract Factory pattern is almost similar to Factory Pattern and is considered as another layer of abstraction over factory pattern. Abstract Factory patterns work around a super-factory which creates other factories.
Abstract factory pattern implementation provides us with a framework that allows us to create objects that follow a general pattern. So at runtime, the abstract factory is coupled with any desired concrete factory which can create objects of the desired type.

![UML class diagram example](assets/AbstractFactoryPattern-2.png)

* **AbstractFactory**: Declares an interface for operations that create abstract product objects.
* **ConcreteFactory**: Implements the operations declared in the AbstractFactory to create concrete product objects.
* **Product**: Defines a product object to be created by the corresponding concrete factory and implements the AbstractProduct interface.
* **Client**: Uses only interfaces declared by AbstractFactory and AbstractProduct classes.