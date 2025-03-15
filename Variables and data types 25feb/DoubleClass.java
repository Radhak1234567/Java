class DoubleClass {
    double var1, var2, var3, var4, var5;

    //  initialize variables
    DoubleClass() {
        var1 = 1.1;
        var2 = 2.2;
        var3 = 3.3;
        var4 = 4.4;
        var5 = 5.5;
    }

    // reinitialize variables
    void reInit() {
        var1 = 6.6;
        var2 = 7.7;
        var3 = 8.8;
        var4 = 9.9;
        var5 = 10.1;
    }


    void displayValues(String message) {
        System.out.println(message);
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
    }

    // Main method
    public static void main(String[] args) {
        DoubleClass doubleObj = new DoubleClass(); 
        doubleObj.displayValues("\nInitial double values:"); 

        doubleObj.reInit(); 

        doubleObj.displayValues("\nRe-initialized double values:"); 
    }
}
