/*
 * 接收传入的list和line
 * 通过i控制行；
 * 求出每一行的星号数，
 * 通过j控制输出空格，控制条件为总行数减星号数除以2为要打印的空格数
 * 打印出一个星号
 * 利用m=tep和m>2控制输出空心的空格,空心三角形内部的空格数为星号减2
 * 打印出一个星号
 * i如果不等于行数减1则输出1个星  */

package com.cqb.san;

public class Dksan {
	public int line, list;

	public void setLine(int line) {
		this.line = line;
	}

	public void setList(int list) {
		this.list = list;
	}

	public void dksan() {
	
		for (int i = 0; i <= list - 1; i+=2) {
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println();
		for (int i = 1; i < line; i++) {
			int tep = list - (i * (list - 1) / (line - 1));
			for (int j = 0; j <= ((list - tep) / 2) - 1; j++) {
				System.out.print(" ");
			}

			System.out.print("*");
			for (int a = tep; a > 2; a--) {
				System.out.print(" ");
			}
			if (i != line - 1)
				System.out.print("*");
			    System.out.println();
		}
	}
}
