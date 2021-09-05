package chap08;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public abstract class Pet {
	private boolean wing;
	private int legCount;
	
	public String isWing() {
		String str;
		if(this.wing) {
			str = "날 수 있다.";
		}else {
			str = "날 수 없다.";
		}
		
		return str;
		
	}
	
	public abstract void run(String name);
	
	
}
