package hw1;

//題目5:某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//     金加利息共有多少錢

public class Homework5 {
	public static void main(String[] args) {

		double principal = 1500000;

		double interestRate = 0.02;

		int years = 10;

		for (int i = 0; i < years; i++) {

			double interest = principal * interestRate;

			principal += interest;

		}
		System.out.println("10年後本金加利息共有:" + principal + "元");

	}
}