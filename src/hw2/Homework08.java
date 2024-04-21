package hw2;

//題目8:請建立一個java程式,可輸出九九乘法表
//     使用for迴圈  +    while迴圈

public class Homework08 {
//  1:使用for迴圈  +    while迴圈
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(j + "x" + i + "=" + (i * j) + "\t");
				j++;
			}
			System.out.println();
		}
	}

}
