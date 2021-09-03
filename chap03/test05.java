package chap03;

public class test05 {
	public static void main(String[] args) {
		int x = 5, y = 0, z = 0;
		y = x++; 	//y=x=x+1
		z = --x;	//z=x=x-1
				
				System.out.println(y++);
				System.out.println(z);
				
				System.out.println(y);
				System.out.println(z);
	}
}
