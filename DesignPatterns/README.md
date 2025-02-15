# Software Design and Architecture Specialization

## 📌 Design patterns course

### This course focuses on applying object-oriented design principles to create flexible and scalable software systems.

---

### Module 1: Introduction to Design Patterns: Creational & Structural Patterns

- Design patterns are practical, proven solutions to recurring software design problems. They provide a structured
  approach to software development, allowing developers to leverage industry-tested solutions rather than building
  everything from scratch.

- **Why Use Design Patterns?**
    - **Proven Solutions:** Expert developers have tested and refined them over time.
    - **Improved Code Structure:** Helps avoid tangled, unstructured "spaghetti code."
    - **Conceptual Guidance:**-- Not just code snippets, but principles that improve software flexibility and
      reusability.
    - **Efficient Communication:** Provides a common vocabulary for discussing design choices, reducing
      misunderstandings.
- **Pattern Languages**
    - The Gang of Four (GoF) design patterns serve different purposes depending on the problem context. A pattern
      language is a collection of related design patterns suited to a specific problem space. For example:
        - Accounting Software – Uses patterns related to double-entry bookkeeping and financial transactions.
        - Gaming Software – Uses patterns suited for game mechanics, rendering, and state management.
- **Categories**
    - **Creational Patterns:** Creational patterns tackle how you handle creating or cloning new objects. Cloning an
      object occurs when you are creating an object that is similar to an existing one, and instead
      of instantiating a new object, you clone existing objects instead of instantiating them.
      Creational patterns depend on the programming language being used.
    - **Structural Patterns:** describe how objects are connected to each other. These patterns relate to the design
      principles of decomposition and generalization. There are many different ways that you can structure objects
      depending on the relationship you’d like between them. Not only do structural patterns describe how different
      objects have relationships, but they also describe how subclasses and Design Patterns classes interact through
      inheritance. Structural patterns use these relationships and describe how they should work to achieve a particular
      design goal. Each structural pattern determines the various suitable relationships among the objects. A good
      metaphor for considering structural patterns is that of pairing different kinds of foods together: flavor
      determines what ingredients can be mixed together to form a suitable relationship.
    - **Behavioural Patterns:** focus on how objects distribute work and describe how each object does a single cohesive
      function. Behavioral patterns also focus on how independent objects work towards a common goal.
- **Singleton** having only one object of a class. Object should be accessible globally. Object not created until it is
  needed to be called as lazy creation. There are trade-offs to the Singleton design principle. If there are multiple
  computing threads running, there could be issues caused by the threads trying to access the shared single object.
- **Factory Pattern**
    - The Factory Method pattern in Java is a creational design pattern used to create objects without specifying the
      exact class that will be instantiated. Instead of calling a constructor directly, we delegate the object creation
      to a factory method.
    - Key concepts
        - Encapsulation of Object Creation – The exact class of the object to be created is hidden from the client.
        - Promotes Loose Coupling – The client depends on an interface or abstract class, not concrete implementations.
        - Enhances Maintainability – Easier to modify object creation logic without affecting the client code.
    - Factory method pattern structure(true for most cases)
        - Product Interface (or Abstract Class) – Defines the common interface for all products.
        - Concrete Product Classes – Implement the product interface.
        - Creator (Factory Class) – Declares a method to return objects of type Product.
        - Concrete Creator(s) – Implement the factory method to create specific products.
- **Facade Pattern**
    - The façade design pattern attempts to provide a single, simplified interface for client classes to interact with a
      subsystem. It is a structural design pattern. A façade is a wrapper class that encapsulates a subsystem in
      order to hide the subsystem’s complexity; it acts as a point of entry into a subsystem without adding more
      functionality in itself. The wrapper class allows a client class to interact with the subsystem through the
      façade. A façade might be compared metaphorically to a waiter or salesperson, who hides all the extra work to be
      done in order to purchase a good or service
- **Adapter Pattern**
- **Composite Pattern**

---

### Module 2: Behavioural Design Patterns

How individual object collaborate to achieve a common goal.

- **Template Method Pattern**
    - it defines an algorithm steps generally, deferring the implementation of some steps to subclasses. it is concerned
      with the assignment of responsibilities.
    - when you classes with a very similar order of operations, template method could be a option.
    - Template method pattern is a practical application of generalization and inheritance.
- **Chain of Responsibility Pattern**
    - a chain of objects that are responsible for handling requests.
    - Chain of handlers. if a handler cannot handle a request, it will transfer request to next handler.
    - set up a chain of email filter, if a request does not meet one criterion, it goes to next filter.
- **State Pattern**
    - it is used when you need to change the behaviour of an object based upon the state that its in at run time.
- **Command Pattern**
    - this pattern encapsulates the request as an object of its own.
    - Invoker
    - Command
    - Concreate Command
    - Receiver
- **Mediator Pattern**
- **Observer Pattern**
    - it is used when you need to notify a group of objects about a change in state of another object.
    - it is a one-to-many relationship.

---

### Module 3: MVC Pattern

it allows us to separate the concerns of the application into three different components. Model, view and controller.

---

- ![img.png](src/resources/img.png)