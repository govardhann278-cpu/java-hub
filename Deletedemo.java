package abcdndrjfdeg;

public class Deletedemo {
	public static void main(String[]args) {
		StringBuilder sb1 = new StringBuilder("Java Programming");
		sb1.delete(4,10);
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Python Programming");
		sb2.deleteCharAt(4);
		System.out.println(sb2);
		
		
	}

}
