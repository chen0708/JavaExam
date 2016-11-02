
/*
 * 接收传入的list和line
 * 通过i控制行；
 * 求出每一行的星号数，
 * 通过j控制输出空格，控制条件为总行数减星号数除以2为要打印的空格数
 * 打印出一个星号
 * 利用m=tep和m>2控制输出空心的空格
 * 打印出一个星号
 * 通过n控制最后一行输出星号，控制条件为列数。
 */
package com.cqb.san;

public class Zksan {
	public int line, list;

	public void setLine(int line) {
		this.line = line;
	}

	public void setList(int list) {
		this.list = list;
	}

	public void zksan() {
	
		for (int i = 0; i < line - 1; i++) {
			int tep = i * (list - 1) / (line - 1) + 1;
	
			for (int j = 0; j < ((list - tep) / 2); j++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
	
			for (int m = tep; m > 2; m--) {
				System.out.print(" ");
			}
			if (i != 0)
				System.out.print("*");
	
			System.out.println();
		}
	
		for (int n =1; n <= list; n = n + 2) {
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println();
	}
}
