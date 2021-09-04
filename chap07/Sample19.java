package chap07;

public class Sample19 {
	public static void main(String[] args) {
		Wallet wallet = new Wallet(10000);
		//wallet.myMoney -= 2200;
		wallet.checkMyMoney();
	}
}

class Wallet {
	private int myMoney;
	
	public Wallet(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void pay(int payMoney) {
		this.myMoney -= (int)(payMoney*1.1);
	}
	
	public void checkMyMoney() {
		System.out.println("남은돈 : " + this.myMoney);
	}
}
