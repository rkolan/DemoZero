
public class App {
	String a;
	String getString()
	{
		return a;
	}
	
	void setString(String str){
		this.a=str;
	}
	
	public static void main(String[] args) {
		App a1=new App();
		a1.setString("Hello");
		System.out.println(a1);
		System.out.println(a1.getString());

	}

}
