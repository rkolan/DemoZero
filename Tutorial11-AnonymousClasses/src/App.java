class Machine{
	public void start(){
		System.out.println("machine started");
	}
}

interface Plant{
	public void grow();
}

public class App {

	public static void main(String[] args) {
	
Machine machine1=new Machine(){
	@Override public void start(){
		System.out.println("Camera...");
	}
};
machine1.start();

Plant plant=new Plant(){

	@Override
	public void grow() {
	System.out.println("plant growing");
		
	}
	
};
plant.grow();
	}

}
