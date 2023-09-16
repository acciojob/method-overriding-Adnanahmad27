package com.driver;

public class Main {
    public static void main(String[] args) {
        ClassB obj = new ClassB();
        System.out.println(obj.meth());
    }
  
}
class ClassA{
    public String meth(){
        return "Invoking method from class A";
    }

}
class ClassB extends ClassA{
    @Override
    public String meth(){
        return "Method this overridden method from obj of class B";
    }
}