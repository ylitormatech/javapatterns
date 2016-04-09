# javapatterns


Demo of Java design patterns including testing patterns

**Behavioral patterns**:

* [x] **Observer**
* [x] **Iterator**
* [x] **Mediator**
* [x] **Visitor**
* [x] **State**
* [x] **Chain of Responsibility**
* [x] **Command**
* [x] **Interpreter**
* [x] **Memento**
* [x] **Strategy**
* [x] **Template Method**

**Creational patterns**:

* [x] **Builder**
* [x] **Singleton**
* [x] **Abstract Factory**
* [x] **Factory Method**
* [x] **Prototype**


**Structural patterns**:

* [x] **Composite**
* [x] **Adapter**
* [x] **Bridge**
* [ ] Decorator _-waiting priority-_
* [ ] Facade _-waiting priority-_
* [ ] Flyweight _-waiting priority-_
* [ ] Proxy _-waiting priority-_


# Behavioral Patterns

## Observable Design Pattern

#### Purpose
The observer pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
The object which is being watched is called _subject_. The ojects which are watching the state changes are called _observers_ or _listeners_.
The observer pattern allows for the _Open Closed_ principle. This principle states that a class should be open for extensions without the need to change the class.
Using the observer pattern a subject can register an unlimited number of observers. If a listener wants to register with the subject, no code change in the subject is necessary.
Using listener pattern decouples the subject form its observers. Only the observers have direct knowledge about the subject.
#### Usage
State changes in one or more objects should trigger behaviour in other objects
Broadcasting capabilities are required
An understanding exists that objects will be blind to the expense of notification

## Iterator Design Pattern

#### Purpose
Allows for access to the elements of an aggregate object  without allowing access to its underlying representation.

#### Usage

* Access to elements is needed without access to the entire   representation.
* Multiple or concurrent traversals of the elements are needed.
* A uniform interface for traversal is needed.
* Subtle differences exist between the implementation details   of various iterators.

## Mediator Design Pattern

#### Purpose
Mediator pattern is used to reduce communication complexity between multiple objects or classes.
This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling.
#### Usage


## Visitor Design Pattern

#### Purpose
Allows for one or more operations to be applied to a set of objects at runtime, decoupling the operations from the object structure.
#### Usage

* An object structure must have many unrelated operations   performed upon it.
* The object structure can’t change but operations performed   on it can.
* Operations must be performed on the concrete classes of an   object structure.
* Exposing internal state or operations of the object structure   is acceptable.
* Operations should be able to operate on multiple object   structures that implement the same interface sets.

## State Design Pattern

#### Purpose
Ties object circumstances to its behavior, allowing the object to behave in different ways based upon its internal state.

#### Usage

* The behavior of an object should be influenced by its state.
* Complex conditions tie object behavior to its state.
* Transitions between states need to be explicit.

## Chain of Responsibility Design Pattern

#### Purpose
Gives more than one object an opportunity to handle a request by linking receiving objects together.
#### Usage

* Multiple objects may handle a request and the handler doesn’t have to be a specific object.
* A set of objects should be able to handle a request with the handler determined at runtime.
* A request not being handled is an acceptable potential outcome.


## Command Design Pattern

#### Purpose
Encapsulates a request allowing it to be treated as an object. This allows the request to be handled in traditionally object based relationships such as queuing and callbacks.

#### Usage

* You need callback functionality.
* Requests need to be handled at variant times or in variant orders.
* A history of requests is needed.
* The invoker should be decoupled from the object handling the invocation.

## Interpreter Design Pattern

#### Purpose
Defines a representation for a grammar as well as a mechanism to understand and act upon the grammar.

#### Usage

* There is grammar to interpret that can be represented as large syntax trees.
* The grammar is simple.
* Efficiency is not important.
* Decoupling grammar from underlying expressions is desired.

## Memento Design Pattern

#### Purpose
Allows for capturing and externalizing an object’s internal state so that it can be restored later, all without violating encapsulation.

#### Usage

* The internal state of an object must be saved and restored at a later time.
* Internal state cannot be exposed by interfaces without exposing implementation.
* Encapsulation boundaries must be preserved.

## Strategy Design Pattern

#### Purpose
Defines a set of encapsulated algorithms that can be swapped to carry out a specific behavior.

#### Usage

* The only difference between many related classes is their behavior.
* Multiple versions or variations of an algorithm are required.
* Algorithms access or utilize data that calling code shouldn’t be exposed to.
* The behavior of a class should be defined at runtime.
* Conditional statements are complex and hard to maintain.

## Template Method Design Pattern

#### Purpose
Identifies the framework of an algorithm, allowing implementing classes to define the actual behavior.

#### Usage

* A single abstract implementation of an algorithm is needed.
* Common behavior among subclasses should be localized to a common class.
* Parent classes should be able to uniformly invoke behavior in their subclasses.
* Most or all subclasses need to implement the behavior.

## Composite Design Pattern

#### Purpose
Facilitates the creation of object hierarchies where each object can be treated independently or as a set of nested objects through the same interface.

#### Usage

* Hierarchical representations of objects are needed.
* Objects and compositions of objects should be treated uniformly.

# Creational Patterns

## Builder Design Pattern

#### Purpose
Allows for the dynamic creation of objects based upon easily interchangeable algorithms.

#### Usage

* Object creation algorithms should be decoupled from the system.
* Multiple representations of creation algorithms are required.
* The addition of new creation functionality without changing the core code is necessary.
* Runtime control over the creation process is required.

## Singleton Design Pattern

#### Purpose
Ensures that only one instance of a class is allowed within a system.
#### Usage
* Exactly one instance of a class is required.
* Controlled access to a single object is necessary.

## Abstract Factory Design Pattern

#### Purpose
Provide an interface that delegates creation calls to one or more concrete classes in order to deliver specific objects.
#### Usage

* The creation of objects should be independent of the system utilizing them.
* Systems should be capable of using multiple families of objects.
* Families of objects must be used together.
* Libraries must be published without exposing implementation details.
* Concrete classes should be decoupled from clients.

## Factory Design Pattern

#### Purpose
Exposes a method for creating objects, allowing subclasses to control the actual creation process.
#### Usage

* A class will not know what classes it will be required to create.
* Subclasses may specify what objects should be created.
* Parent classes wish to defer creation to their subclasses.

## Prototype Design Pattern

#### Purpose
Create objects based upon a template of an existing objects through cloning.
#### Usage

* Composition, creation, and representation of objects should be decoupled from a system.
* Classes to be created are specified at runtime.
* A limited number of state combinations exist in an object.
* Objects or object structures are required that are identical or closely resemble other existing objects or object structures.
* The initial creation of each object is an expensive operation.

# Structural Patterns

## Adapter Design Pattern

#### Purpose
Permits classes with disparate interfaces to work together by creating a common object by which they may communicate and interact.

Adapter pattern works as a bridge between two incompatible interfaces.
#### Usage

* A class to be used doesn’t meet interface requirements.
* Complex conditions tie object behavior to its state.
* Transitions between states need to be explicit.

## Bridge Design Pattern

#### Purpose
Defines an abstract object structure independently of the implementation object structure in order to limit coupling.
#### Usage

* Abstractions and implementations should not be bound at compile time.
* Abstractions and implementations should be independently extensible.
* Changes in the implementation of an abstraction should have no impact on clients.
* Implementation details should be hidden from the client.

## Decorator Design Pattern

#### Purpose

#### Usage

## Facade Design Pattern

#### Purpose

#### Usage

## Flyweight Design Pattern

#### Purpose

#### Usage

## Proxy Design Pattern

#### Purpose

#### Usage
