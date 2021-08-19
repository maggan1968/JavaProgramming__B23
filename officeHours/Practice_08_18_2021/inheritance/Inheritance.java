package Practice_08_18_2021.inheritance;

public class Inheritance {
    /*

        Inheritance IS-A RelationShip

        SuperClass -- Parent -- Base  : the class whose features are inherited
        SubClass   -- Child  -- Derived  : the class that inherits the other class

        What is inherited ?
            - All public and  protected variables and methods
            - All default variables and methods (if parent and child are in same package)
            - Private variables can not be inherited (access with getter and setter)
            - Constructors are not inherited


        Constructors
            - In the inheritance , the parent class constr always executes before child constructor

        How can we call Parent Class Constr ?
            - use super keyword
            - if child does not call parent class constr, Java will call parent class default constr
            - if parent class has parameterized constr , child class MUST call it explicitly

            super : refers to parent class object
            super() :refers Parent class constr
                    - must be in first statement in child class constr
                    - we can not use this() and super() in the same constr

        Overriding

             Why we need ?

                -Sometimes a subclass inherits a method from its superclass,
                 but the method is inadequate for the subclass’s purpose.

            - There MUST be IS A realtion ship.Do it inside Child class
            - Parameters , returnType, methodName MUST be same
            - Access Modifier needs to be same or MORE VISIBLE
                - public         public
                - protected      protected OR public
                - default        default OR protected OR public
                - private        CAN NOT BE INHERITED
            - Private , final , static methods can not be OVERRIDDEN

		Advantages:

			less memory
			less codes
			easy to maintain
			improves the reusability





     */
}
