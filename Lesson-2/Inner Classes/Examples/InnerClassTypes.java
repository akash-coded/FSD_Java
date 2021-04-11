/**
 * In Java, it is possible to define a class within another class, 
 * such classes are known as nested classes. 
 * They enable you to logically group classes that are only used in one place, 
 * thus this increases the use of encapsulation, 
 * and creates more readable and maintainable code.
 */

/**
 * Syntax of Inner Class
 */
class OuterClass {
    // ...
    class InnerClass {
        // ...
    }
}

/**
 * Types of Nested Classes in Java: -
 * 
 * (A) Non-static nested class (Inner class)
 * 
 * ---- 1. Member Inner Class
 * 
 * ---- 2. Local Inner Class
 * 
 * ---- 3. Anonymous Inner Class
 * 
 * (B) Static nested class
 */

// EXAMPLES OF NON-STATIC NESTED CLASS (INNER CLASS)

/**
 * 1. Member Inner Class Example
 */
class TestMemberOuter {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String args[]) {
        TestMemberOuter obj = new TestMemberOuter();
        TestMemberOuter.Inner in = obj.new Inner();
        in.msg();
    }
}

/**
 * 2. Local Inner Class
 */
public class TestLocalInner {
    private int data = 30;// instance variable

    void display() {
        class Local {
            void msg() {
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String args[]) {
        TestLocalInner obj = new TestLocalInner();
        obj.display();
    }
}

/**
 * 3. Anonymous Inner Class
 */
interface Person {
    void eat();
}

class TestAnonymousInner {
    public static void main(String args[]) {
        Person p = new Person() {
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}

// EXAMPLES OF STATIC NESTED CLASS

/**
 * Java program to demonstrate accessing a static nested class
 */
// outer class
class OuterClass {
    // static member
    static int outer_x = 10;

    // instance(non-static) member
    int outer_y = 20;

    // private member
    private static int outer_private = 30;

    // static nested class
    static class StaticNestedClass {
        void display() {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);

            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);

            // The following statement will give compilation error
            // as static nested class cannot directly access non-static members
            // System.out.println("outer_y = " + outer_y);

        }
    }
}

// Driver class
public class StaticNestedClassDemo {
    public static void main(String[] args) {
        // accessing a static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

        nestedObject.display();

    }
}