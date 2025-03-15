class IntClass {
    int var1, var2, var3, var4, var5;

    // initialize variables
    IntClass() {
        var1 = 10;
        var2 = 20;
        var3 = 30;
        var4 = 40;
        var5 = 50;
    }

    //  reinitialize variables
    void reInit() {
        var1 = 60;
        var2 = 70;
        var3 = 80;
        var4 = 90;
        var5 = 100;
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
        IntClass intObj = new IntClass(); 
        intObj.displayValues("\nInitial int values:"); 

        intObj.reInit();

        intObj.displayValues("\nRe-initialized int values:"); 
    }
}
