class BooleanClass {
    boolean var1, var2, var3, var4, var5;

    // initialize boolean variables
    BooleanClass() {
        var1 = true;
        var2 = false;
        var3 = true;
        var4 = false;
        var5 = true;
    }

    // reinitialize variables
    void reInit() {
        var1 = false;
        var2 = true;
        var3 = false;
        var4 = true;
        var5 = false;
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
        BooleanClass boolObj = new BooleanClass(); 
        boolObj.displayValues("\nInitial boolean values:");

        boolObj.reInit(); 

        boolObj.displayValues("\nRe-initialized boolean values:"); 
    }
}
