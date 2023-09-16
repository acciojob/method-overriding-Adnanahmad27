package com.driver;

public class Main {
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }

    }
    public static class B extends A{
        @Override
        public String meth(){
            return "Method this overridden method from obj of class B";
        }
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.meth();
        B obj1 = new B();
        obj1.meth();
    }
  
}

