# javapatterns


Demo of Java design patterns including testing patterns

**Behavioral patterns**:

* [x] **Observer**
* [ ] **Iterator** _-waiting implementation-_
* [ ] **Mediator** _-waiting implementation-_
* [ ] **Visitor** _-waiting implementation-_
* [ ] Chain of Responsibility _-waiting priority-_
* [ ] Command _-waiting priority-_
* [ ] Interpreter _-waiting priority-_
* [ ] Memento _-waiting priority-_
* [ ] State _-waiting priority-_
* [ ] Strategy _-waiting priority-_
* [ ] Template Method _-waiting priority-_

**Creational patterns**:

* [ ] **Builder** _-waiting implementation-_
* [ ] Abstract Factory _-waiting priority-_
* [ ] Factory Method _-waiting priority-_
* [ ] Prototype _-waiting priority-_
* [ ] Singleton _-waiting priority-_

**Structural patterns**:

* [ ] **Composite** _-waiting implementation-_
* [ ] Adapter _-waiting priority-_
* [ ] Bridge _-waiting priority-_
* [ ] Decorator _-waiting priority-_
* [ ] Facade _-waiting priority-_
* [ ] Flyweight _-waiting priority-_
* [ ] Proxy _-waiting priority-_




## Observable pattern

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

#### Testing observable pattern



