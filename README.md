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
* [ ] Strategy _-waiting priority-_
* [ ] Template Method _-waiting priority-_

**Creational patterns**:

* [x] **Builder**
* [x] **Singleton**
* [ ] Abstract Factory _-waiting priority-_
* [ ] Factory Method _-waiting priority-_
* [ ] Prototype _-waiting priority-_


**Structural patterns**:

* [x] **Composite**
* [ ] Adapter _-waiting priority-_
* [ ] Bridge _-waiting priority-_
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


# Structural Patterns

