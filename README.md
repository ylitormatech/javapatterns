# javapatterns


Demo of Java design patterns including testing patterns

**Behavioral patterns**:

* [x] **Observer**
* [x] **Iterator**
* [x] **Mediator**
* [x] **Visitor**
* [x] **State**
* [ ] Chain of Responsibility _-waiting priority-_
* [ ] Command _-waiting priority-_
* [ ] Interpreter _-waiting priority-_
* [ ] Memento _-waiting priority-_
* [ ] Strategy _-waiting priority-_
* [ ] Template Method _-waiting priority-_

**Creational patterns**:

* [x] **Builder**
* [ ] Abstract Factory _-waiting priority-_
* [ ] Factory Method _-waiting priority-_
* [ ] Prototype _-waiting priority-_
* [ ] Singleton _-waiting priority-_

**Structural patterns**:

* [x] **Composite**
* [ ] Adapter _-waiting priority-_
* [ ] Bridge _-waiting priority-_
* [ ] Decorator _-waiting priority-_
* [ ] Facade _-waiting priority-_
* [ ] Flyweight _-waiting priority-_
* [ ] Proxy _-waiting priority-_




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
#### Example
This pattern can be found in almost every GUI environment. When buttons, text, and other fields are place in applications the application typically registers as listener for those controls.
When a user triggers an event, such as clicking a button, the control iterates through its registered observers and sends notification to each.

Classes:

* BlueCar
  * implements Observable inferface
  * This class will notify subscibers (observers) when it status inStock is changing
* User
  * implements Observer inferface
  * This class is notified when BlueCar state is changing

## Iterator Design Pattern

#### Purpose
Iterator design pattern implements the logic for sequential access of a collection of data outside of the collection (aka an aggregate) itself. This decouples the iteration logic from the collection implementation.
Defining an abstract inferface for an iterator makes it possible to have multiple ways of iterating the same collection. Lets say we have a collection representing a binary tree. We can then have multiple concrete implementations of the same iterator abstraction accessing the elements in the tree using different traversal logic like in-order, pre-order and post-order. The binary tree collection remains the same but using iterator pattern we access it in multiple ways without altering and/or directly accessing the binary tree implementation itself.
Scenarios in which Iterator Pattern can be used:

1. Collections's internal implementation is to be hidden
2. Multiple ways of traversing the collection are possible
3. Iteration logic is decoupled from the collection's internal structure

#### Usage

#### Example

## Mediator Design Pattern

#### Purpose
Mediator pattern is used to reduce communication complexity between multiple objects or classes.
This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling.
#### Usage

#### Example
We are demonstrating mediator pattern by example of a chat room where multiple users can send message to chat room and it is the responsibility of chat room to show the messages to all users. We have created two classes ChatRoom and User. User objects will use ChatRoom method to share their messages.

MediatorPatternDemo, our demo class, will use User objects to show communication between them.

## State Design Pattern

#### Purpose
Ties object circumstances to its behavior, allowing the object to behave in different ways based upon its internal state.

#### Usage

* The behavior of an object should be influenced by its state.
* Complex conditions tie object behavior to its state.
* Transitions between states need to be explicit.

#### Example

## Composite Design Pattern

#### Purpose
Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.

This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of same objects.

#### Usage

#### Example

## Visitor Design Pattern

#### Purpose
In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class. By this way, execution algorithm of element can vary as and when visitor varies. This pattern comes under behavior pattern category. As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object.

#### Usage

#### Example

## Builder Design Pattern

#### Purpose
Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

A Builder class builds the final object step by step. This builder is independent of other objects.

#### Usage

#### Example


