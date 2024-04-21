package hw2;

//題目5:阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//     輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

public class Homework05 {
	public static void main(String[] args) {
		int count = 0;
		for (int num = 1; num <= 49; num++) {
			if (num / 10 != 4 && num % 10 != 4) {
				System.out.print(num + " ");
				count++;
			}
		}
		System.out.println("\n總共有 " + count + "個符合條件的數字");
	}

}
