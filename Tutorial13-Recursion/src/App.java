
public class App {

	public static void main(String[] args) {
	
		System.out.println(	calculate(5));
	}

	private static int calculate(int i) {
		//System.out.println(i);

if(i==0){
	return 1;
}
return calculate(i-1)*i;
		
	}
	
}
 