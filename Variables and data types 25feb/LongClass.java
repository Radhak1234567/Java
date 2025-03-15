class LongClass {
    long var1, var2, var3, var4, var5;

    //  initialize variables
    LongClass() {
        var1 = 100000L;
        var2 = 200000L;
        var3 = 300000L;
        var4 = 400000L;
        var5 = 500000L;
    }

    //  reinitialize variables
    void reInit() {
        var1 = 600000L;
        var2 = 700000L;
        var3 = 800000L;
        var4 = 900000L;
        var5 = 1000000L;
    }

    // Main method 
    public static void main(String[] args) {
        LongClass obj = new LongClass(); 
        System.out.println("Initial values:");
        System.out.println("var1: " + obj.var1);
        System.out.println("var2: " + obj.var2);
        System.out.println("var3: " + obj.var3);
        System.out.println("var4: " + obj.var4);
        System.out.println("var5: " + obj.var5);

        obj.reInit(); 

        System.out.println("\nRe-initialized values:");
        System.out.println("var1: " + obj.var1);
        System.out.println("var2: " + obj.var2);
        System.out.println("var3: " + obj.var3);
        System.out.println("var4: " + obj.var4);
        System.out.println("var5: " + obj.var5);
    }
}
