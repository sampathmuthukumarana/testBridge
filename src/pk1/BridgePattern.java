package pk1;

public class BridgePattern {
	public static void main(String[] args) 
    { 
		System.out.println("Testing git");
        Vehicle vehicle1 = new Car(new Produce(), new Assemble()); 
        vehicle1.manufacture(); 
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble()); 
        vehicle2.manufacture(); 
    } 
}
