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
Lets one or more object be notified of state changes in other objects within the system
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



