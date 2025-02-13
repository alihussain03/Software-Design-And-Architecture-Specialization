# Software Design and Architecture Specialization

## 📌 Object-Oriented Design course

### This course focuses on applying object-oriented design principles to create flexible and scalable software systems.

---

### Module 1: Object-Oriented Analysis and Design

- **Object-oriented modeling** involves representing real-world concepts as objects in software, encapsulating their
  attributes and behaviors.
    - By using objects to represent things in your code, the code stays organized, flexible, and reusable.
    - A good exercise to help you start object-oriented thinking is to look at the room around you and identify what
      might be objects.

- **Software Development Process**  
  Software development follows an iterative process that transforms requirements into design and implementation,
  ensuring a well-structured and tested solution.

    - **Requirement Elicitation:**
        - Requirements define what a product must achieve based on client needs.
        - Effective elicitation involves probing beyond the initial vision to clarify scope, uncover hidden needs, and
          identify trade-offs.
    - **User Stories:**
        - A **user story** describes a software feature from the perspective of the end user.
        - The standard format is:  
          **"As a [type of user], I want [some goal] so that [some reason]."**
        - Example:  
          **"As a customer, I want to reset my password so that I can regain access to my account if I forget it."**
        - User stories help break down complex requirements into small, actionable tasks for development.

    - **Design Phase:**  
      Once the initial set of requirements is established, the next step is to produce:
        - **Conceptual Design** – High-level mock-ups. identify components, connections, and responsibilities.
        - **Technical Design** – Detailed architecture diagrams. There are many design techniques that may be used to
          get the most
          out of the design process. The rest of this specialization will examine
          those techniques.

    - **Balancing Trade-offs in Design:**
        - Compromise is essential to balance client needs with technical constraints.
        - Constant communication and feedback help refine conceptual designs before coding begins, preventing costly
          rework.
        - Larger systems require more design time, breaking down components into manageable parts.

- **Design for Quality Attributes**
    - **Trade-offs**
    - **Context**
    - **Satisfying Qualities**

- Categories of Objects in Design
    - Entity Objects: Represent core business data or concepts, often corresponding to real-world entities (e.g., a
      Customer or Product object).
    - Boundary Objects: Manage interactions between the system and external actors, such as user interfaces or APIs (
      e.g., a LoginForm or REST API Controller).
    - Control Objects: Handle business logic and coordinate interactions between entity and boundary objects (e.g., an
      OrderProcessor or PaymentManager).

- **Class-Responsibility-Collaborator (CRC) Model**  
  During conceptual design, it is useful to identify components, responsibilities, and connections through CRC cards.

---

### Module 2: Object-Oriented Modeling

This module will also explore how to express design structure in Java code and UML class diagrams using the principles
of abstraction, encapsulation, generalization and decomposition.

- **Four Design Principles**
    - **Abstraction**
        - Abstraction simplifies a concept by focusing on essential details while ignoring unimportant ones, within a
          specific context. It should follow the rule of least astonishment, meaning it should capture essential
          attributes and behaviors without surprises or unnecessary definitions.
            - Context is crucial in forming an abstraction because it influences what characteristics are considered
              essential. For example, defining the essential traits of a 'person' can be challenging without context
            - The essential characteristics of an abstraction can be understood in two ways: through fundamental
              attributes and core behaviors or responsibilities.
    - **Encapsulation**
        - This principle involves encapsulating data within a structure, allowing some parts to be accessed externally
          while keeping others hidden
        - There are three ideas behind encapsulation.
            - The ability to bundle attributes (data) and behaviors (functions that manipulate the data) into a
              self-contained object.
            - The ability to expose certain data and functions, making them accessible to other objects, typically
              through an interface.
            - The ability to restrict access to specific data and functions, allowing them to be used only within the
              object.
    - **Generalization**
        - In object-oriented modeling, generalization is a key design principle. Beyond creating methods that can be
          applied to different data, object-oriented modeling achieves generalization through inheritance. It involves
          identifying common, repeated, or shared characteristics among two or more classes and extracting them into a
          separate class.
            - In Java, generalization is primarily implemented using
                - Inheritance: A subclass inherits properties and behaviors from a superclass, promoting code
                  reusability.
                    - A hollow triangle is used to represent inheritance (generalization). ClassA ▲── ClassB ClassA is
                      the parent (superclass), and ClassB is the child (subclass). ClassB inherits from ClassA and can
                      override or extend its behavior.
                - Interfaces: Define a contract that multiple classes can implement, allowing for flexible and scalable
                  design.
                    - A hollow triangle with a dashed line is used to represent an interface implementation.
                    - InterfaceA △- - - - ClassB The dashed line represents an implementation relationship, meaning
                      ClassB
                      must provide implementations for the methods defined in InterfaceA.
    - **Decomposition**
        - It involves breaking down a whole into smaller, manageable parts. Alternatively, decomposition can also refer
          to combining separate parts with different functionalities to form a complete system. It helps in simplifying
          complex problems, making them easier to understand and solve. it can be achieved using 3 ways.
            - Aggregation: Dividing the whole into parts that can exist independently, yet still work together (e.g., a
              university having multiple departments).
                - Hollow diamond used to present aggregation. ClassA ◇── ClassB ClassA is a whole(Aggregator) and ClassB
                  is part. ClassB can exist independently of ClassA.
            - Composition: Breaking down a system into parts that are tightly coupled, where the whole and parts cannot
              exist without each other (e.g., a car with an engine, where the car depends on the engine).
                - Filled diamond used to present composition. ClassA ◆── ClassB. ClassA is a whole (Composer) and ClassB
                  is a part. ClassB cannot exist independently of ClassA.
            - Association: Establishing loose relationships between objects, where parts can function independently but
              are linked to work together (e.g., a driver driving a car).
            - A simple line is used to present association. ClassA ── ClassB ClassA and ClassB are related, but neither
              owns the other.
              Both can exist independently.

---

### Module 3: Design Principles

- **General PrinciplesCoupling and cohesion**
    - **Coupling**
        - Coupling measures the complexity of a module's dependency on others. It ranges from tight coupling (bad
          design, high dependency) to loose coupling (good design, independent interaction via well-defined interfaces).
        - To evaluate coupling, consider three metrics:
            - Degree – The number of connections; fewer connections mean looser coupling.
            - Ease – How simple and clear the connections are without needing deep knowledge of other modules.
            - Flexibility – How easily modules can be replaced or upgraded without major changes.
        - A well-designed system aims for loose coupling to improve modularity and maintainability.
- **Cohesion**
    - Cohesion measures how clearly a module defines its responsibilities. High cohesion means a module has a single,
      well-defined purpose, while low cohesion indicates multiple responsibilities or unclear encapsulation. Good design
      aims for high cohesion. However, achieving high cohesion can increase module dependencies (coupling), while
      reducing coupling may lower cohesion
      by increasing module complexity. A balanced approach is essential for effective system design.
- **Separate of concerns**
    - Separation of concerns (SoC) is a design principle that involves organizing a system in such a way that different
      concerns or aspects of the system are addressed separately, rather than being mixed together. A "concern" refers
      to any part of the software that is important for solving a problem, such as data handling, business logic, or
      user interface.
- **Information Hiding**
    - Information hiding, closely tied to encapsulation, involves bundling attributes and behaviors within a class while
      restricting access to certain functions. Encapsulation hides the implementation of behaviors behind an interface,
      allowing other classes to interact only through defined methods. This enables changes to the implementation
      without affecting the expected outcomes.
    - Additionally, information hiding can prevent direct modification of critical attributes, ensuring that sensitive
      data remains protected. Access modifiers are used to control which classes can access attributes and methods, and
      what is shared between a superclass and its subclasses.
- **Conceptual integrity**
    - Conceptual integrity refers to the consistency and coherence of the design and overall vision of a software
      system. It ensures that all components of the system work together in a unified way, aligned with a clear,
      well-defined purpose or architecture. When a system exhibits conceptual integrity, the design decisions are
      consistent across the entire system, avoiding conflicting approaches or fragmented logic.

- **Generalization Principles**
    - **Inheritance issues**

- **Modeling Behaviour**
    - **Sequence Diagram**
        - UML sequence diagrams are a useful tool in software design, typically created before development begins. They
          show how objects in a program interact to complete tasks, much like a map of conversations between
          individuals, with messages exchanged between them. Sequence diagrams help visualize the classes to be created,
          identify required functions, and uncover potential problems in the system that were previously unknown.
    - **State Diagram**
        - A state diagram is a technique used to describe how a system behaves and responds to events.
        - It depicts how a single object behaves in response to events in a system.
        - A state is the way an object exists at a particular point in time. The state of an object is determined by the
          values of its attributes.
        - Elements of State diagram
            - A filled circle indicates the starting state of the object. Every state diagram begins with a filled
              circle.
            - Rounded rectangles indicate other states. These rectangles have three sections: a state name, state
              variables, and activities.
            - Activities are actions performed while in a certain state. There are three types of activities:
                - Entry activity: Actions that occur when the state is first entered from another state.
                - Do activity: Actions that occur while the object remains in a certain state.
                - Exit activity: Actions that occur when the state is exited, transitioning to another state.
            - Arrows indicate transitions from one state to another. Transitions are typically triggered by an event,
              which is usually described above the arrow.
    - Uses of State diagrams
        - State diagrams help identify events that might occur during an object’s lifetime, such as different user
          inputs, and define how the object should behave in response, including checking conditions and performing
          actions.
        - They provide a visual representation of state changes, which can be easier to understand than reading source
          code.
        - State diagrams can help identify potential issues in a software system, such as unplanned conditions.
        - They assist in test creation—understanding the different states of a system ensures that test cases are
          complete and correct.
- Model Checking
    - In addition to design techniques, it's crucial to know how to verify a software system. Techniques like unit
      testing, beta testing, and simulations are common, with model checking being another important method. Model
      checking involves systematically examining a system’s state model across all possible states to identify errors.
      It simulates various events that change states and variables, revealing flaws or rule violations. Model checking
      software can automate this process and is often used during testing. For example, it could detect a potential
      deadlock scenario, where two tasks are waiting for the same resource, by simulating all possible states.

---
