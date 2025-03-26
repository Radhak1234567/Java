package vom.xworkz.acessSpecifier.internal;

public class DressTailor {   Dress dress = new Dress();

    public void stitch(){
        System.out.println(dress.material);
        System.out.println(dress.quantity);
        dress.customizeDress();
        dress.purchase();
    }
}
