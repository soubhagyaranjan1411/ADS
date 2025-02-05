import java.util.*;

class Soubhagya {
    void soubhagyamethod() {
        System.out.println("This is Soubhagya Class");
    }
}

class Parent {
    void parentmethod1() {
        System.out.println("This is Parent Class Method 1");
    }
    
    void parentmethod2() {
        System.out.println("This is Parent Class Method 2");
    }
}

class Child extends Parent {
    void childmethod1() {
        System.out.println("This is Child Class");
    }
    
    void childmethod2() {
        System.out.println("This is Class Child Method 2");
    }
}

public class Main {
    public static void main(String[] args) {
        Soubhagya s = new Soubhagya();
        s.soubhagyamethod();
        
        Parent p = new Parent();
        p.parentmethod1();
        p.parentmethod2();
        
        Child c = new Child();
        c.childmethod1();
        c.childmethod2();
    }
}

//Output
//This is Soubhagya Class
//This is Parent Class Method 1
//This is Parent Class Method 2
//This is Class Child Method 1
//This is Class Child Method 2
