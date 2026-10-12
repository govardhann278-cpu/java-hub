package abcdndrjfd;

public class Hello {
	void m1(int... a) {
		System.out.println("Hello");
	}
	public static void main(String[]args)
	{
		Hello bb = new Hello();
		bb.m1();
		bb.m1(3);
		bb.m1(3,1);
		bb.m1(1,2,3);
		bb.m1(1,2,3,4,5,6,7);
	}

}
