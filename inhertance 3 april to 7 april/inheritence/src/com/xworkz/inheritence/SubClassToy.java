package com.xworkz.inheritence;

public class SubClassToy {

    public class SubClass1 extends Toy {
        public void tea() {
            System.out.println("running");

            super.play();
            super.broke();
            super.dance();
            super.eat();
            super.sing();

        }


    }

}
