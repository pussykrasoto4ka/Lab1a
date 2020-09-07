package  com.company;

import java.lang.*;
class example {
    public static void main(String[] args)
    {
        practica1.Dog d1 = new practica1.Dog("Mike", 2);
        practica1.Dog d2 = new practica1.Dog("Helen", 7);
        practica1.Dog d3 = new practica1.Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}