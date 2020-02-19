package cognizant.com;

public interface StaticDemo {
public static void main(String...args) {
	Test t=new Test();
	Test t1=new Test();
	Test t2=new Test();
	System.out.println(t.x);
	System.out.println(t.y);
	t2.x=30;
	t1.y=40;
	System.out.println(t.x);
	System.out.println(t2.y);
}  class Test{
	int x=10;
	
	static int y=20;
}

}
