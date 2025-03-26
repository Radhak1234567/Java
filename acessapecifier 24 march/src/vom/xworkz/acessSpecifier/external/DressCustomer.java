package vom.xworkz.acessSpecifier.external;

public class DressCustomer {
    Dress dress = new Dress();

    public void wear(){
        System.out.println(dress.material);
        dress.purchase();
    }
}
