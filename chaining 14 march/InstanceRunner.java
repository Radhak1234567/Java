public class InstanceRunner {
    public static void main(String[] args) {
       
        
          Baloon baloon1 = new Baloon();
        Baloon baloon2 = new Baloon("Red");
        Baloon baloon3 = new Baloon("Blue", 12);
        Baloon baloon4 = new Baloon("Green", 15, "Rubber");
        Baloon baloon5 = new Baloon("Yellow", 10, "Plastic", false);
        Baloon baloon6 = new Baloon("Pink", 20, "Rubber", true, 5.0);
        Baloon baloon7 = new Baloon("Orange", 18, "Latex", false, 4.0, 2.5f);

        baloon1.display();
        baloon2.display();
        baloon3.display();
        baloon4.display();
        baloon5.display();
        baloon6.display();
        baloon7.display();
  
    Holi holi1 = new Holi();
        Holi holi2 = new Holi("Festival of Colors");
        Holi holi3 = new Holi("Festival of Love", 2025);
        Holi holi4 = new Holi("Festival of Joy", 2025, true);
        Holi holi5 = new Holi("Holi", 2025, false, "North India");
        Holi holi6 = new Holi("Dol Jatra", 2025, true, "West Bengal", 50000.0);
        Holi holi7 = new Holi("Phagwah", 2025, true, "Assam", 75000.0, 1000);

        holi1.display();
        holi2.display();
        holi3.display();
        holi4.display();
        holi5.display();
        holi6.display();
        holi7.display();
        
        Pichkari pichkari1 = new Pichkari();
        Pichkari pichkari2 = new Pichkari("FunBlast");
        Pichkari pichkari3 = new Pichkari("FunBlast", 30);
        Pichkari pichkari4 = new Pichkari("ToyJoy", 25, "Red");
        Pichkari pichkari5 = new Pichkari("Splashy", 35, "Blue", 150.50);
        Pichkari pichkari6 = new Pichkari("WaterKing", 40, "Green", 200.75, true);
        Pichkari pichkari7 = new Pichkari("AquaBlaster", 45, "Yellow", 250.99, false, 500);

        pichkari1.display();
        pichkari2.display();
        pichkari3.display();
        pichkari4.display();
        pichkari5.display();
        pichkari6.display();
        pichkari7.display();

		 Color color1 = new Color();
        Color color2 = new Color("Red");
        Color color3 = new Color("Blue", true);
        Color color4 = new Color("Green", false, 250.50);
        Color color5 = new Color("Yellow", true, 300.75, "Asian Paints");
        Color color6 = new Color("Pink", false, 150.25, "Dulux", 5);
        Color color7 = new Color("Orange", true, 450.99, "Berger", 10, "Acrylic");

        color1.display();
        color2.display();
        color3.display();
        color4.display();
        color5.display();
        color6.display();
        color7.display();



 Egg egg1 = new Egg(); 
        Egg egg2 = new Egg("Chicken"); 
        Egg egg3 = new Egg("Duck", 65.5); 
        Egg egg4 = new Egg("Quail", 9.8, "White"); 
        Egg egg5 = new Egg("Goose", 200.0, "Brown", true); 
        Egg egg6 = new Egg("Turkey", 85.0, "Speckled", false, 3); 
        Egg egg7 = new Egg("Emu", 680.0, "Green", false, 5, 150.75f); 

        egg1.display();
        egg2.display();
        egg3.display();
        egg4.display();
        egg5.display();
        egg6.display();
        egg7.display();

       
         Bucket bucket1 = new Bucket();
        Bucket bucket2 = new Bucket("Plastic");
        Bucket bucket3 = new Bucket("Metal", 10);
        Bucket bucket4 = new Bucket("Steel", 15, "Silver");
        Bucket bucket5 = new Bucket("Aluminum", 12, "Grey", 499.99);
        Bucket bucket6 = new Bucket("Wood", 8, "Brown", 599.99, true);
        Bucket bucket7 = new Bucket("Plastic", 20, "Blue", 299.99, false, 1.5f);

        bucket1.display();
        bucket2.display();
        bucket3.display();
        bucket4.display();
        bucket5.display();
        bucket6.display();
        bucket7.display();

     
        Tomato tomato1 = new Tomato();
        Tomato tomato2 = new Tomato("Cherry");
        Tomato tomato3 = new Tomato("Roma", 0.15);
        Tomato tomato4 = new Tomato("Beefsteak", 0.3, "Red");
        Tomato tomato5 = new Tomato("Grape", 0.1, "Green", true);
        Tomato tomato6 = new Tomato("Heirloom", 0.25, "Yellow", false, 1.99f);
        Tomato tomato7 = new Tomato("Plum", 0.2, "Orange", true, 2.49f, 5);

        tomato1.display();
        tomato2.display();
        tomato3.display();
        tomato4.display();
        tomato5.display();
        tomato6.display();
        tomato7.display();
        
           WaterBall ball1 = new WaterBall();
        WaterBall ball2 = new WaterBall("Blue");
        WaterBall ball3 = new WaterBall("Red", 15.5);
        WaterBall ball4 = new WaterBall("Green", 12.0, true);
        WaterBall ball5 = new WaterBall("Yellow", 18.0, false, 0.45f);
        WaterBall ball6 = new WaterBall("Orange", 20.5, true, 0.5f, 500);
        WaterBall ball7 = new WaterBall("Purple", 25.0, true, 0.7f, 600, "Rubber");

        ball1.display();
        ball2.display();
        ball3.display();
        ball4.display();
        ball5.display();
        ball6.display();
        ball7.display();

        
       Gun gun1 = new Gun();
        Gun gun2 = new Gun("Glock 17");
        Gun gun3 = new Gun("AK-47", "Assault Rifle");
        Gun gun4 = new Gun("M1911", "Pistol", 1.1);
        Gun gun5 = new Gun("Desert Eagle", "Pistol", 2.0, 7);
        Gun gun6 = new Gun("MP5", "Submachine Gun", 3.5, 30, "Steel");
        Gun gun7 = new Gun("Remington 700", "Sniper Rifle", 4.0, 5, "Aluminum", true);

        gun1.display();
        gun2.display();
        gun3.display();
        gun4.display();
        gun5.display();
        gun6.display();
        gun7.display();
		
		 NailPolish polish1 = new NailPolish();
        NailPolish polish2 = new NailPolish("Lakme");
        NailPolish polish3 = new NailPolish("Maybelline", "Red");
        NailPolish polish4 = new NailPolish("Revlon", "Pink", 299.99);
        NailPolish polish5 = new NailPolish("Sally Hansen", "Nude", 399.99, 15);
        NailPolish polish6 = new NailPolish("O.P.I", "Blue", 499.99, 10, true);
        NailPolish polish7 = new NailPolish("Essie", "Purple", 349.99, 12, false, "Matte");

        polish1.display();
        polish2.display();
        polish3.display();
        polish4.display();
        polish5.display();
        polish6.display();
        polish7.display();

 Water water1 = new Water();
        Water water2 = new Water("Spring");
        Water water3 = new Water("Well", 7.5);
        Water water4 = new Water("Tap", 6.8, true);
        Water water5 = new Water("Spring", 7.2, false, "Clear");
        Water water6 = new Water("Purified", 7.0, true, "Clear", 1.5);
        Water water7 = new Water("Mineral", 7.4, true, "Clear", 2.0, true);

        // Display the object details
        water1.display();
        water2.display();
        water3.display();
        water4.display();
        water5.display();
        water6.display();
        water7.display();
    }
}
