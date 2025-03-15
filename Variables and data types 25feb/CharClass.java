// Class for Character data type
class CharClass {
    char var1, var2, var3, var4, var5;

    //  initialize variables
    CharClass() {
        var1 = 'A';
        var2 = 'B';
        var3 = 'C';
        var4 = 'D';
        var5 = 'E';
    }

    //  reinitialize variables
    void reInit() {
        var1 = 'F';
        var2 = 'G';
        var3 = 'H';
        var4 = 'I';
        var5 = 'J';
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
        CharClass charObj = new CharClass();  
        charObj.displayValues("\nInitial character values:"); 

        charObj.reInit(); 

        charObj.displayValues("\nRe-initialized character values:"); 
    }
}
