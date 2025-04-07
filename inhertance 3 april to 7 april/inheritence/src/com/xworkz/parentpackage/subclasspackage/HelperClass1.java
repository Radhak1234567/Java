package com.xworkz.parentpackage.subclasspackage;
import parentpackage.ParentClass;
import subclasspackage.SubClass1;

public class HelperClass1 {   public void useParent(ParentClass parent) {
    parent.method1();
    parent.method2();
    parent.method3();
    parent.method4();
    parent.method5();

    if (parent instanceof SubClass1) {
        SubClass1 sub = (SubClass1) parent;
        sub.newMethodSubClass1();
    }
}
}
