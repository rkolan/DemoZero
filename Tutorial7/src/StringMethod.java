class Hello{

	public  void a(){
		System.out.println("Bye");
	}
	public String toString(){
		return "Hello";
	}
	
	
}
public class StringMethod {

	public static void main(String[] args) {
		Hello h1=new Hello();
		System.out.println(h1);
		System.out.println(h1.a());
	}

}
