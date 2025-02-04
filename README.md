# Low-Level Design

## 📌 Specialization Overview

This repository is dedicated to following the **Software Design and Architecture** specialization offered on Coursera.

The specialization can be accessed at the following link:  
[Software Design and Architecture Specialization](https://www.coursera.org/specializations/software-design-architecture).

The specialization consists of four courses, each further divided into modules.

---

## 📚 Courses in the Specialization

### 1. Object-Oriented Design

This course focuses on applying object-oriented design principles to create flexible and scalable software systems.

#### Module 1: Object-Oriented Analysis and Design

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

#### Module 2: Object-Oriented Modeling

This module will also explore how to express design structure in Java code and UML class diagrams using the principles
of abstraction, encapsulation, and decomposition.

- **Four Design Principles**
    - Abstraction
        - Abstraction breaks a concept down into a simplified description that ignores unimportant details and
          emphasizes the essentials needed for the concept, within some context. An abstraction should follow the rule
          of
          least astonishment. This rule suggests that essential attributes and behaviours should be
          captured with no surprises and no definitions that fall beyond its scope.
            - Context or a specific perspective is critical when forming an abstraction. This is because context might
              change the essential characteristics of a concept. For example, consider the essential characteristics of
              the
              concept of a person. This can be hard to understand without context.
            - The essential characteristics of an abstraction can be understood in
              two ways: through basic attributes and through basic behaviours
              or responsibilities.
    - Encapsulation
        - This principle involves a concept that allows something to be contained in a capsule, some of which you can
          access from the outside and some of which you cannot.
        - There are three ideas behind encapsulation.
            - The ability to “bundle” attribute values (or data) and
              behaviours (or functions) that manipulate those values, into
              a self-contained object.
            - The ability to “expose” certain data and functions of that
              object, which can be accessed from other objects, usually
              through an interface.
            - The ability to “restrict” access to certain data and functions to
              only within the object.
    - Generalization
        - In object-oriented modelling, generalization is a main design principle, but beyond creating a method that can
          be applied to different data, object-oriented modelling achieves generalization by classes through
          inheritance. In generalization, we take repeated, common, or shared characteristics between two or more
          classes and factor them out into another class.
    - Decomposition
        - It consists of taking a whole thing, and dividing it into different parts. Alternately, decomposition can also
          indicate taking separate parts with different functionalities and combining them to create a whole.
          Decomposition allows problems to broken into smaller pieces that are easier to understand and
          solve.

---

### 2️⃣ Design Patterns

Understand and implement design patterns to solve common software design problems efficiently.

### 3️⃣ Software Architecture

Explore architectural styles, patterns, and best practices for designing large-scale systems.

### 4️⃣ Service-Oriented Architecture (SOA)

Learn about service-oriented architectures, microservices, and their impact on modern software development.

Each course consists of multiple modules that cover fundamental concepts, best practices, and hands-on exercises to
enhance software design skills.

📂 Repository Structure

📄 Notes and summaries from each course.

💻 Code examples and exercises.

🏗 Implementation of design patterns and architectural concepts.

🔗 Additional resources for reference.

🤝 Contribution

Feel free to contribute by adding notes, code snippets, or improvements to the repository.

📜 License

This repository is for educational purposes only. Please refer to Coursera’s terms of use for course content usage
guidelines.

