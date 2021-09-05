package chap08;

public class Sample06 {
	
	public static void main(String[] args) {
		ICompute a = new Apartment();
		float area = a.compute(24);
		System.out.printf("아파트의 면적은 %f 제곱미터 입니다.", area);
	}
	
	
	
}


class Villa implements IExcute {

	@Override
	public float compute(int area) {
		//pyung++;  The final field ICompute.pyung cannot be assigned
		
		return area*pyung;
	}
	
}



interface IExcute {
	float pyung = 3.3f;
	float compute(int area);  //제곱미터 받아서 평수로 반환한다.
	default float toPyung(float area) {		//디폴트 메서드. 인터페이스를 받아서 구현된 다른 클래스에 오류가 나지 않고 메서드를 추가 할 수 있다. 
		return area / pyung;
	}
}
