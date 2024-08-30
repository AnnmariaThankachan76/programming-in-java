class Welcome{
	void run() {
	System.out.println("helloo there!");
	}
}
class Name  extends Welcome{
	void run() {
		System.out.println("its me ,Annmaria");
	}
}
public class MethodOveridding{
	public static void main(String[] args){
		Name ob=new Name();
		ob.run();
	}
}

