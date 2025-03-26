package vom.xworkz.acessSpecifier.external;

public class TrainCustomer { Train train = new Train();

    public void book(){
        System.out.println(train.name);
        train.bookSeat();
    }
}
