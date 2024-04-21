package hw2;
//題目7:請設計一隻Java程式,輸出結果為以下:

//     A
//     BB
//     CCC
//     DDDD
//     EEEEE
//     FFFFFF

public class Homework07 {
	public static void main(String[] args) {
		for (char ch = 'A'; ch <= 'F'; ch++) {
			for (int i = 0; i <= (int) (ch - 'A'); i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
