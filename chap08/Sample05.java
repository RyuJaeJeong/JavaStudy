package chap08;

public class Sample05 {
	
	public static void main(String[] args) {
		ICompute a = new Apartment();
		float area = a.compute(24);
		System.out.printf("아파트의 면적은 %f 제곱미터 입니다.", area);
	}
	
	
	
}


class Apartment implements ICompute {

	@Override
	public float compute(int area) {
		//pyung++;  The final field ICompute.pyung cannot be assigned
		
		return area*pyung;
	}
	
}



interface ICompute {
	float pyung = 3.3f;
	float compute(int area);  //제곱미터 받아서 평수로 반환한다.
}
