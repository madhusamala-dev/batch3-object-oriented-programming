package com.java.oop.functional;

public class Main {
    public static void main(String[] args) {
       /* Greeting greeting = new Greeting() {
            @Override
            public String greet() {
                return "Hello, How are you !";
            }

            @Override
            public String greet(String name) {
                return name + " , How are you !";
            }
        };

        System.out.println(greeting.greet());
        System.out.println(greeting.greet("John"));

        */
        Greeting greeting = (name) -> name + "Hello, How are you !";
        /*Greeting greeting1 = new Greeting(){
            @Override
            public String greet() {
                return "Hello, How are you !";
            }
        };*/
        System.out.println(greeting.greet("John"));

       Calculate calculate = (price,discountPercentage) -> price - ((price * discountPercentage) / 100);

        System.out.println(calculate.finalPrice(10000,10));

    }
}
