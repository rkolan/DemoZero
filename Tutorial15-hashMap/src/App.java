import java.util.HashMap;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
hashmap.put(1,"one");
hashmap.put(2,"two");
hashmap.put(3,"three");

hashmap.put(1,"duplicate");
String text=hashmap.get(1);
System.out.println(text);
	}

}
