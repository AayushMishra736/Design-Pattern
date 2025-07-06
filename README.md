🎯 What are Design Patterns?
A design pattern is a reusable solution for common problems in software design.
It is not a full design ready for coding but rather a guideline or template for solving issues in various situations.
Design patterns help create flexible, efficient, and maintainable systems.

🧱 Types of Software Design Patterns in Java
Design patterns in Java are categorized into three main types:

Creational Design Patterns

Structural Design Patterns

Behavioral Design Patterns

🔨 1. Creational Design Patterns in Java
Creational patterns focus on the creation of objects in a manner that enhances flexibility and reuse.

🏭 Factory Method Pattern
Separates object creation from implementation.

Clients use a common interface to create different object types.

🧰 Abstract Factory Pattern
A super-factory that creates other factories.

Adds another layer of abstraction over the Factory Pattern.

👤 Singleton Pattern
Ensures only one instance of a class.

Provides global access to that instance.

🧬 Prototype Pattern
Creates new objects by cloning an existing object.

Avoids costly object creation from scratch.

🧱 Builder Pattern
Separates construction from representation.

Useful for building complex objects step-by-step.

🏗️ 2. Structural Design Patterns in Java
Structural patterns focus on how classes/objects are composed to form larger structures.

🔌 Adapter Pattern
Converts one class interface to another expected by the client.

Allows incompatible classes to work together.

🌉 Bridge Pattern
Separates abstraction from implementation.

Both can be developed independently.

🌲 Composite Pattern
Composes objects into tree structures.

Treats individual and group of objects uniformly.

🎨 Decorator Pattern
Adds new functionality to an object dynamically.

Achieves behavior modification without altering original class.

🏠 Facade Pattern
Provides a unified, simplified interface to a set of subsystems.

🪶 Flyweight Pattern
Reduces memory usage by sharing as much data as possible.

Ideal for large numbers of similar objects.

🕵️ Proxy Pattern
Acts as a surrogate or placeholder for another object.

Common uses: access control, lazy initialization, logging, etc.

🧠 3. Behavioral Design Patterns in Java
Behavioral patterns deal with object interaction and responsibility delegation.

🔗 Chain of Responsibility Pattern
Sends requests through a chain of handlers.

Each handler decides to process or pass the request further.

💡 Command Pattern
Encapsulates a request as an object.

Allows request queuing, logging, and undo operations.

🧾 Interpreter Pattern
Defines grammar for a language and provides an interpreter.

Useful in parsing and evaluation of expressions.

🧭 Mediator Pattern
Simplifies communication between objects by introducing a mediator object.

Promotes loose coupling.

🕰️ Memento Pattern
Saves and restores previous state of an object.

Useful for undo operations.

👀 Observer Pattern
Establishes a one-to-many dependency.

All observers are notified when the subject changes.

🔁 State Pattern
Allows an object to change behavior based on internal state.

🧠 Strategy Pattern
Defines a family of algorithms, encapsulates each, and makes them interchangeable.

Behavior can be selected at runtime.

🧬 Template Method Pattern
Defines the skeleton of an algorithm in the base class.

Allows subclasses to redefine certain steps.

🧳 Visitor Pattern
Separates algorithm from object structure.

Useful when you need to perform operations on a set of objects without changing their classes.

📌 Conclusion
Design Patterns are powerful tools that enhance your ability to:

Solve problems elegantly.

Write scalable, maintainable, and testable code.

Communicate software design with clarity.

------------------------------------------------------------------------------------------------------
Design patterns in Java are reusable solutions to common problems encountered during software design and development.
They represent established best practices and provide a standardized approach to building robust, maintainable, and scalable applications. 
Design patterns are typically categorized into three main types:

Creational Patterns:
These patterns deal with object creation mechanisms, aiming to create objects in a manner suitable for the situation.
Singleton: Ensures a class has only one instance and provides a global point of access to it.

Factory Method: Defines an interface for creating objects, but lets subclasses decide which class to instantiate. 

Abstract Factory: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

Builder: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

Prototype: Creates new objects by copying an existing object, avoiding the need for explicit instantiation.


Structural Patterns:
These patterns focus on how classes and objects are composed to form larger structures, emphasizing flexibility and efficiency.
Adapter: Allows objects with incompatible interfaces to collaborate.
Bridge: Decouples an abstraction from its implementation so that the two can vary independently.
Composite: Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions uniformly.
Decorator: Attaches new responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.
Facade: Provides a simplified interface to a complex subsystem.
Flyweight: Reduces the number of objects created to improve performance and memory usage, especially when dealing with a large number of fine-grained objects.
Proxy: Provides a surrogate or placeholder for another object to control access to it. 


Behavioral Patterns:
These patterns deal with the algorithms and assignment of responsibilities between objects, focusing on communication and interaction.
Chain of Responsibility: Avoids coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request.
Command: Encapsulates a request as an object, thereby allowing parameterization of clients with different requests, queuing or logging of requests, and support for undoable operations.
Interpreter: Given a language, defines a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
Iterator: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
Mediator: Defines an object that encapsulates how a set of objects interact, promoting loose coupling by keeping objects from referring to each other explicitly.
Memento: Captures and externalizes an object's internal state so that the object can be restored to this state later.
Observer: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
State: Allows an object to alter its behavior when its internal state changes, making it appear as if the object changed its class.
Strategy: Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to vary independently from the clients that use it.
Template Method: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
Visitor: Represents an operation to be performed on the elements of an object structure, allowing new operations to be defined without changing the classes of the elements on which it operates.
