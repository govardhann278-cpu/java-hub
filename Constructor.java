
package hbadckeferf;

public class Constructor {

    
    Constructor() {
        System.out.println("Default Constructor");
    }

    Constructor(int a) {
        System.out.println("Constructor with one parameter: " + a);
    }

    Constructor(int a, int b) {
        System.out.println("Constructor with two parameters: " + (a + b));
    }

    // Method Overloading
    void display() {
        System.out.println("Display method without parameters");
    }

    void display(int a) {
        System.out.println("Display method with one parameter: " + a);
    }

    void display(int a, int b) {
        System.out.println("Display method with two parameters: " + (a + b));
    }

    public static void main(String[] args) {

        
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(10);
        Constructor c3 = new Constructor(10, 20);

        System.out.println();

        
        c1.display();
        c1.display(10);
        c1.display(10, 20);
    }

}

