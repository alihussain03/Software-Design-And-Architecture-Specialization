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
- 