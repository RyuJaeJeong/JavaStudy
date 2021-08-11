package chap07.Sample03;

public class Compute {
	//field
	int result;
	
	//cons
	public Compute() {
		// TODO Auto-generated constructor stub
	}
	
	//method
	void setValue(int val) {
		result += val;
	}
	
	void setValue(int val1, int val2) {
		result += val1 + val2;
	}
	
	int getValue() {
		return result;
	}
}
