## SimUDuck APP

Given the need for ducks to acquire the behavior of flying,
Joe (Programmer) adds a fly () method that allows ducks to fly but not all must
acquire this behavior, so a design problem is identified.

Which of the following are disadvantages of using inheritance to provide Duck behavior?
- [ ] A. Code is duplicated across subclases.
- [ ] B. Runtime behavior changes are difficult.
- [ ] C. We can't make ducks dance.
- [ ] D. Hard to again knowledge of all duck behaviors.
- [ ] E. Ducks can't fly and quack at the same time.
- [X] F. Changes can unintentionally affect other ducks.

### Solution #1
I could take the fly() out of the Duck superclass, and make a Flyable() interface with a fly()
method. That way, only the ducks that are supposed to fl y will implement that interface and have a fly() method..., 
and I might as well make a Quackable, too, since not all ducks can quack.

#### What do you think about this design?
I think it could be the solution to add behaviors or functionalities without needing to know the model,
that is, the types of ducks that may exist, although we must write more code, but we have more freedom and ease of
creating new functionalities, but what happens if we have a huge amount of types of ducks and, we want to add another behavior by reason, 
we would have to go to all classes and add the new interface with the new behavior.

> #### Design Principle
> Identify the aspects of your application that vary and separate then from what stays the same.