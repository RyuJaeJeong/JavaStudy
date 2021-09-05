package chap08;

public class Sample02 {
	public static void main(String[] args) {
		Pet cat = new Cat(false, 4);
		cat.run("고양이");
		Pet parrot = new Parrot(true, 2);
		parrot.run("앵무새");
		Parrot pr = (Parrot)parrot; //다운 캐스팅 
		pr.fly("앵무새");
	}
}
