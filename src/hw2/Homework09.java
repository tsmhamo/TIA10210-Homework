package hw2;

//題目9:請建立一個java程式,可輸出九九乘法表
//     使用for迴圈  + do while迴圈

public class Homework09 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
	}

}
