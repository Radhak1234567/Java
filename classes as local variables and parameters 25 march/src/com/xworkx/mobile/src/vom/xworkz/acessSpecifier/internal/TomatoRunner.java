package vom.xworkz.acessSpecifier.internal;

public class TomatoRunner {public static void main(String[] args) {
    TomatoSeller tomatoSeller = new TomatoSeller();
    Kitchen kitchen = new Kitchen();

    tomatoSeller.sell();
    kitchen.useTomato();
}
}
