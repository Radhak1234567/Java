package vom.xworkz.acessSpecifier.external;

public class BottleCustomer {  Bottle bottle = new Bottle();

    public void purchase(){
        System.out.println(bottle.company);
        bottle.checkItemAvailability();
    }
}
