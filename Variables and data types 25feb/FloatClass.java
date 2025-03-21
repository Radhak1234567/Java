class FloatClass {
    float var1, var2, var3, var4, var5;

    //  initialize variables
    FloatClass() {
        var1 = 1.1f;
        var2 = 2.2f;
        var3 = 3.3f;
        var4 = 4.4f;
        var5 = 5.5f;
    }

    // reinitialize variables
    void reInit() {
        var1 = 6.6f;
        var2 = 7.7f;
        var3 = 8.8f;
        var4 = 9.9f;
        var5 = 10.1f;
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
        FloatClass floatObj = new FloatClass(); 
        floatObj.displayValues("\nInitial float values:"); 

        floatObj.reInit(); 

        floatObj.displayValues("\nRe-initialized float values:"); 
    }
}
