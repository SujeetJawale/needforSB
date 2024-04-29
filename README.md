# Spring Core

In these projects, we have explored the critical role of the Spring Framework in managing object creation—a task traditionally handled by developers. 

### Dependency Injection in Spring can be implemented through three primary methods:
##### XML: 
The foundational method where configurations are explicitly declared in XML files.
##### XML and Annotations: 
A hybrid approach that combines declarative XML configurations with annotations.
##### Spring Boot and Annotations: 
Leveraging Spring Boot for convention-over-configuration, reducing the need for explicit XML and enabling more annotation-based DI.

-------------------------------------------------------------

### About Projects:
In our initial project, the Amazon Launch App, we observed how objects had to be manually instantiated by developers, revealing the challenges and limitations of such approaches. This exploration served as a perfect introduction to the concepts of Inversion of Control (IoC) and Dependency Injection (DI), which are fundamental in transitioning from tight coupling to loose coupling, enhancing modularity and flexibility in our applications.

In the second project, Maven Amazon, we started with the XML-based DI approach, setting the stage for more advanced integration techniques in subsequent projects. These principles not only streamline the development process but also pave the way for building robust, maintainable applications by effectively managing dependencies and promoting a clean separation of concerns. And in the rest we explored various different ways dependency injection such as Constructor DI and setter DI and why setter DI is prefered by the developers.

We also explored the layered architectural approach, a key design principle in building scalable, maintainable, and well-organized applications. This method structures an application into distinct layers, each with specific responsibilities, allowing for independent development and testing of each layer. The primary layers include:

##### Web Layer: 
Also known as the presentation layer, this is where the application handles HTTP requests, delivers content to the web, and interprets user commands. In Spring, controllers are typically components in this layer, annotated with @Controller or @RestController. These annotations indicate that a class handles requests by returning views or data directly.
##### Service Layer: 
This layer contains business logic and service classes that handle application operations, business rules, and functions. Annotated with @Service, it acts as a transaction boundary and ensures business rules are met before data is passed to the repository layer or back to the web layer.
##### Repository Layer: 
Often referred to as the data access layer, it is responsible for interacting with the storage mechanism directly. In Spring, this layer typically includes repositories annotated with @Repository, which indicates that the class provides mechanisms for storage, retrieval, search, and update operations via ORM (Object-Relational Mapping) frameworks like Hibernate.

-------------------------------------------------------------

### Spring Annotations and Their Roles:
##### @Controller and @RestController: 
These annotations are used in the web layer to create Spring MVC controllers and RESTful controllers, respectively.
##### @Service: 
Applied at the service layer to denote a class as a service provider, which holds business logic.
##### @Repository: 
Used at the repository layer to indicate that the annotated class is a repository, which helps to abstract and encapsulate storage, retrieval, and search behavior.
##### @Component: 
A generic stereotype for any Spring-managed component; @Repository, @Service, and @Controller are specializations of @Component for more specific cases.
##### @Autowired: 
Used for automatic dependency injection. It marks a constructor, field, setter method, or config method to be autowired by Spring's dependency injection facilities.

-------------------------------------------------------------

### Advantages of Using Spring Framework:
##### Comprehensive Modularity: 
Spring’s modular architecture allows developers to use only what they need without being forced to bring in everything. This modularity helps in keeping applications lightweight and agile.
##### Facilitated Development: 
Spring provides a wide array of helpful services, such as transaction management, security, and data access, which can be easily integrated to enhance application functionality and performance.
##### Enhanced Testability: 
With dependency injection and being able to inject mock implementations into components for unit testing, Spring applications are easier to test compared to traditional Java applications.
##### Robust Abstract Layer: 
Spring handles infrastructure support so developers can focus on building application logic. Its abstraction layers simplify database transactions, JMS, and JPA, reducing the boilerplate code developers need to write.
