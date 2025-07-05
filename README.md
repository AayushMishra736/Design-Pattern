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
