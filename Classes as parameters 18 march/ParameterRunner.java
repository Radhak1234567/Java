public class ParameterRunner {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Display display = new Display();
        shop.ads(display); 
        
	shop.ads(null); 
	
	  Theater theater = new Theater();
        Poster poster = new Poster();
        theater.show(poster); 
        
        theater.show(null);
		
		
		
		
		RCB rcb = new RCB();
        Player player = new Player();
        rcb.startMatch(player);
        
        rcb.startMatch(null);
		
		Rocket rocket = new Rocket();
        Engine engine = new Engine();
        rocket.launch(engine); 
        
        rocket.launch(null);
		
		Dolo650 dolo = new Dolo650();
        Medicine medicine = new Medicine();
        dolo.take(medicine); 
        
        dolo.take(null);
		
		 Barber barber = new Barber();
        Customer customer = new Customer();
        barber.serve(customer); 
        
        barber.serve(null);
		
		 Camera camera = new Camera();
        Lens lens = new Lens();
        camera.attach(lens); 
        
        camera.attach(null);
		
		 Mango mango = new Mango();
        Fruit fruit = new Fruit();
        mango.checkFruit(fruit); 
        
        mango.checkFruit(null);
	
	Pillow pillow = new Pillow();
        Fabric fabric = new Fabric();
        pillow.cover(fabric); 
        pillow.cover(null);
	}
}