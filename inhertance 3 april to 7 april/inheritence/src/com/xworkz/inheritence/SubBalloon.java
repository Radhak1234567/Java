package com.xworkz.inheritence;

public class SubBalloon  extends  Ballon{ public SubBalloon() {
    super();
    System.out.println("No-arg constructor of SubBalloon");
}

    @Override
    public void getEmployee() {
        System.out.println("Running getEmployee in SubBalloon");
    }

    @Override
    public void setEquipments() {
        System.out.println("Running setEquipments in SubBalloon");
    }

    @Override
    public void manufacture() {
        System.out.println("Running manufacture in SubBalloon");
    }

    @Override
    public void selectItem() {
        System.out.println("Running selectItem in SubBalloon");
    }

    @Override
    public void produceProduct() {
        System.out.println("Running produceProduct in SubBalloon");
    }

    // Child specific method
    public void inflate() {
        System.out.println("Running inflate in SubBalloon");
    }

    public void colorBalloon() {
        System.out.println("Running colorBalloon in SubBalloon");
    }
}
