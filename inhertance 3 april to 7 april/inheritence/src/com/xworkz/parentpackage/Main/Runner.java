package mainpackage;

import helperpackage.HelperClass1;
import subclasspackage.SubClass1;

public class Runner {
    public static void main(String[] args) {
        HelperClass1 helper1 = new HelperClass1();
        helper1.useParent(new SubClass1());


    }
}
