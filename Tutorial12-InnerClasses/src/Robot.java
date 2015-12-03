
public class Robot {
	int id;
	
 class work{
		public void abc(){
			System.out.println("Robot with" + id + "has started working");
		}
	}
	
public Robot(int id){
this.id=id;
work w=new work();
w.abc();
}

/*public void start(){
	System.out.println("Robot is starting");
} */


}
