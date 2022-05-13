# Strategy and Template Method Implementation in Java
In this repository, I include the code for my Software Engineering Design coursework, in which we were tasked with implementing both a Template method design pattern as well as a Strategy method design pattern. In this example, I refactor the same code into each of the two methods.

The task was to factor out code from a FibonacciSequence and TriangleNumberSequence, by using Test Driven Development (TDD), minimizing the duplication of the code and ensuring that the correct behavior is still implemented. Because there are a lot of commonalities between the code, we could either use the template or strategy design pattern.

The template pattern primarily uses inheritance, essentially using a base class and having the subclasses inherit from the base class. On the other hand, the strategy method delegates this separation of concerns into a collaborator (rather than a subclass), which can then be chosen at compile time depending on which one we want to use. The template pattern in general keeps tight coupling (due to inheritance), while the strategy method relies on an interface which gives us much more flexibility when we create these objects, and has looser coupling. 
