package hw1;

//題目6:請寫一隻程式,利用System.out.println()印出以下三個運算式結果:

//     5 + 5
//     5 + ‘5’
//     5 + “5”
//     並請用註解各別說明答案的產生原因

public class Homework6 {
	public static void main(String[] args) {

		System.out.println("5 + 5 =" + (5 + 5));      // 5 + 5   ,為2個整數相加 故列出10

		System.out.println("5 + '5' = " + (5 + '5')); // 5 + '5' ,為一個整數加上一個字元 故列出58

 		System.out.println("5 + \"5\" =" + (5 + "5"));// 5 + "5" ,為一個整數加上一個字串 故列出55
	}

}
