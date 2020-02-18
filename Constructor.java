package cognizant.com;

public class Constructor {
	Constructor() {
		super();
    System.out.println("1");		
		
	}
	public static void main(String[]args) {
		Constructor cus=new Constructor();
		B b=new B();
		B b1=new B(5);

	}
}


class B extends Constructor{
	B(){
		super();
	
	System.out.println("3");
}
	B(int a){
		this();
		System.out.println("4");
	}
	{
		System.out.println("5");
	
}
}

