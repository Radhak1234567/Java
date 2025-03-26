package vom.xworkz.acessSpecifier.internal;
import vom.xworkz.AccessSpecifier.external.BottleCustomer;
public class BottleRunner { public static void main(String[] args) {
    BottleManufacturer bottleManufacturer = new BottleManufacturer();
    BottleCustomer bottleCustomer = new BottleCustomer();

    bottleManufacturer.manufactureBottle();
    bottleCustomer.purchase();
}
}
