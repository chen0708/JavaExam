/*
 * 输出选项选择要输出的三角形
 * 若输入的不是1至4则提示输入错误并结束
 * 输入行数和列数
 * 
 * 输入1则执行type == 1分支，创建对象，输入参数，并打印相应的三角形；
 * 若输入的列数为奇数或者行数大于列数 则提示错误
 * 若输入的 (列数-1)/(行数-1)为奇数则不能构成等腰三角形
 * 同理可执行其他的分支
 * 
 * 
 */
package com.cqb.san;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		System.out.println("请选择想要显示的三角形类型:   " + "1、实心正等腰三角形  2、实心倒置等腰三角形 3、空心正等腰三角形 4、空心倒置等腰三角形");
		int type = inScanner.nextInt();
		if (type != 1 && type != 2 && type != 3 && type != 4) {
			System.out.println("输入错误！");
			return;
		}
		System.out.print("注意列数为奇数，行数不能大于列数：");

		System.out.print("请您输入行数：");
		int line = inScanner.nextInt();
		if (line <= 1) {
			System.out.println("请您输入大于1的行数！");
			return;
		}
		System.out.print("请您输入列数：");
		int list = inScanner.nextInt();
		if (list <= 1) {
			System.out.println("请您输入大于1的列数！");
			return;
		}
		if (list % 2 == 0) {
			System.out.println("请您输入为奇数的列数");
			return;
		}
		if (line >= list) {
			System.out.println("您输入的行数大于列数");
			return;
		}
		if ((((list - 1) / (line - 1) % 2) != 0)) {
			System.out.println("您输入的 (列数-1)/(行数-1)为奇数，不能构成等腰三角形，请重新输入");
			return;
		}
		if (type == 1) {
			Zssan zssan = new Zssan();
			zssan.setLine(line);
			zssan.setList(list);
			zssan.zssan();
			// 创建对象 传输line和list 调用Zssan()
		}
		if (type == 2) {
			Dssan dssan = new Dssan();
			dssan.setLine(line);
			dssan.setList(list);
			dssan.dssan();
			// 创建对象 传输line和list 调用Dssan()

		}
		if (type == 3) {

			Zksan zksan = new Zksan();
			zksan.setLine(line);
			zksan.setList(list);
			zksan.zksan();
			// 创建对象 传输line和list 调用Zksan()

		}
		if (type == 4) {

			Dksan dksan = new Dksan();
			dksan.setLine(line);
			dksan.setList(list);
			dksan.dksan();
		} // 创建对象 传输line和list 调用Dksan()

	}

}
