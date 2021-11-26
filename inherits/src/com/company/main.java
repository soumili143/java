package com.company;

class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog{
    void sleep(){System.out.println("sleeping...");}
}
class MultiInheritance{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.sleep();
        d.bark();
        d.eat();
    }
}