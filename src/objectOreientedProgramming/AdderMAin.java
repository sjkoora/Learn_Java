package objectOreientedProgramming;

public class AdderMAin {

	public static void main(String[] args) {
		Adder ad = new Adder();
		ad.sum();// 1
		ad.sum(100, 200);// 2
		ad.sum(2, 23.3);// 3
		ad.sum(10, 33, 45);// 5
//ad.sum(22.3,455.4,334.5);//invalid as we didnt specify
	}

}
