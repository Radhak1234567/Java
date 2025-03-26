package vom.xworkz.acessSpecifier.internal;

public class DressRunner { public static void main(String[] args) {
    DressTailor dressTailor = new DressTailor();
    DressCustomer dressCustomer = new DressCustomer();

    dressTailor.stitch();
    dressCustomer.wear();
}
}
