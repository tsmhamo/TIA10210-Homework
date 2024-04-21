package hw2;

//題目8:請建立一個java程式,可輸出九九乘法表
//     使用while迴圈+ do while迴圈
public class Homework10 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		}
	}
}
