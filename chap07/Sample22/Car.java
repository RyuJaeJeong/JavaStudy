package chap07.Sample22;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Car {
	@NonNull
	private String color;	//차량색상
	private int doors;		//문 수
	private String manufacturer; //제조사
	

	
	
}


