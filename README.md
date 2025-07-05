**What are Design Patterns?**
A design pattern is a reusable solution for common problems in software design used in engineering. It is not a full design ready for coding but rather a guideline or model for solving issues. Design patterns can be adapted to different situations and contexts, providing flexibility in problem-solving.

**Types of Software Design Patterns in Java**
There are three types of Design Patterns:

**1. Creational Design Patterns in Java**
Creational design patterns are a category of design patterns in software development that focus on the process of creating objects. They aim to enhance flexibility and efficiency in object creation, allowing systems to remain independent of how their objects are constructed, composed, and represented. This approach helps streamline the instantiation process and can lead to more maintainable and adaptable code

Types of Creational Design Patterns in Java:
CreationalDesignPattern
Factory Method Design Pattern
This pattern is typically helpful when it's necessary to separate the construction of an object from its implementation.
With the use of this design pattern, objects can be produced without having to define the exact class of object to be created.
Abstract Factory Method Design Pattern
Abstract Factory pattern is almost similar to Factory Pattern and is considered as another layer of abstraction over factory pattern.
Abstract Factory patterns work around a super-factory which creates other factories.
Singleton Method Design Pattern
Of all, the Singleton Design pattern is the most straightforward to understand.
It guarantees that a class has just one instance and offers a way to access it globally.
Prototype Method Design Pattern
Prototype allows us to hide the complexity of making new instances from the client.
The concept is to copy an existing object rather than creating a new instance from scratch, something that may include costly operations.
Builder Method Design Pattern
To “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” Builder pattern is used
It helps in constructing a complex object step by step and the final step will return the object.

**2. Structural Design Patterns in Java**
Structural design patterns focus on how classes and objects are arranged to create larger, more complex structures in software development. They help organize relationships between objects, making systems more flexible, reusable, and maintainable. By using these patterns, developers can create easier-to-understand and modify systems.

Types of Structural Design Patterns in Java:
StructuralDesignPattern
Adapter Method Design Pattern
The adapter pattern convert the interface of a class into another interface clients expect.
Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
Bridge Method Design Pattern
The bridge pattern allows the Abstraction and the Implementation to be developed independently.
The client code can access only the Abstraction part without being concerned about the Implementation part.
Composite Method Design Pattern
As a partitioning design pattern, the composite pattern characterizes a collection of items that are handled the same way as a single instance of the same type of object.
The intent of a composite is to “compose” objects into tree structures to represent part-whole hierarchies.
Decorator Method Design Pattern
It allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects within the same class. 
We use inheritance to extend the behavior of the class. This takes place at compile-time, and all the instances of that class get the extended behavior.
Facade Method Design Pattern
Facade Method Design Pattern provides a unified interface to a set of interfaces in a subsystem.
Facade defines a high-level interface that makes the subsystem easier to use.
Flyweight Method Design Pattern
This pattern provides ways to decrease object count thus improving application required objects structure.
Flyweight pattern is used when we need to create a large number of similar objects.
Proxy Method Design Pattern
Proxy means ‘in place of’, representing’ or ‘in place of’ or ‘on behalf of’ are literal meanings of proxy and that directly explains Proxy Design Pattern.
Proxies are also called surrogates, handles, and wrappers. They are closely related in structure, but not purpose, to Adapters and Decorators.

**3. Behavioral Design Patterns in Java**
Behavioral design patterns are a group of design patterns that focus on how objects and classes interact and communicate in software development. They emphasize the collaboration between objects to effectively accomplish tasks and responsibilities, making the system more manageable and adaptable

Types of Behavioral Design Pattern in Java:
Behavioral-Design-Pattern
Chain Of Responsibility Method Design Pattern
Chain of responsibility pattern is used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them. 
Later, the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.
Command Method Design Pattern
A behavioral design pattern called the Command Pattern transforms a request into an independent object with all of the information's request
This object can be passed around, stored, and executed at a later time.
Interpreter Method Design Pattern
Interpreter pattern is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar.
Mediator Method Design Pattern
It enables decoupling of objects by introducing a layer in between so that the interaction between objects happen via the layer.
Memento Method Design Patterns
It is used to return an object's state to its initial state.
You might wish to create checkpoints in your application and return to them at a later time when it develops.
Observer Method Design Pattern
It establishes a one-to-many dependency between objects, meaning that all of the dependents (observers) of the subject are immediately updated and notified when the subject changes.
State Method Design Pattern
When an object modifies its behavior according to its internal state, the state design pattern is applied.
If we have to change the behavior of an object based on its state, we can have a state variable in the Object and use the if-else condition block to perform different actions based on the state.
Strategy Method Design Pattern
It is possible to select an object's behavior at runtime by utilizing the Strategy Design Pattern.
Encapsulating a family of algorithms into distinct classes that each implement a common interface is the foundation of the Strategy pattern.
Template Method Design Pattern
The template method design pattern defines an algorithm as a collection of skeleton operations, with the child classes handling the implementation of the specifics.
The parent class maintains the overall structure and flow of the algorithm.
Visitor Method Design Pattern
It is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class.
