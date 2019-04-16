1. Size is an instance variable, not a function
2. This is something that the GUI runner does.
3. If we implemented the board this way, it would not work polymorphically. This alternate design would not work as well because we wouldn't be able to alter the methods in the child classes.