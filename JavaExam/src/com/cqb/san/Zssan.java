
/*
 * 接收传入的list和line
 * 通过i控制行；
 * 求出每一行的星号数，
 * 通过j控制输出空格，控制条件为总行数减星号数除以2为要打印的空格数
 * 通过n控制输出星号，控制条件为星号数。
 */
package com.cqb.san;

public class Zssan {
	public int line, list;
	public void setLine(int line) {
		this.line = line;
	}
	public void setList(int list) {
		this.list = list;
	}
	public void zssan() {
		
		for (int i = 0; i < line; i++) {
			int tep = i * (list - 1) / (line - 1) + 1;
			for (int j = 0; j <= ((list - tep) / 2); j++) {
				System.out.print(" ");
			}
			for(int n=1;n<=tep;n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
