package com.xworkz.parentpackage.subclasspackage;

import com.xworkz.parentpackage.ParentClass;

public class SubClass1  extends ParentClass {

    public class SubClass1 extends ParentClass {
        @Override
        public void method1() {
            System.out.println("SubClass1: method1");
        }

        @Override
        public void method2() {
            System.out.println("SubClass1: method2");
        }

        @Override
        public void method3() {
            System.out.println("SubClass1: method3");
        }

        @Override
        public void method4() {
            System.out.println("SubClass1: method4");
        }

        @Override
        public void method5() {
            System.out.println("SubClass1: method5");
        }

        public void newMethodSubClass1() {
            System.out.println("SubClass1: new method");
        }
    }}