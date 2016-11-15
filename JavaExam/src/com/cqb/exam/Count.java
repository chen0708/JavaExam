package com.cqb.exam;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count {
//public static void main(String[] args) {
	

	public static void test() throws Exception {
		File file = new File("D:\\Test\\test.txt");

		if (!file.exists()) {
			File parentsPath = file.getParentFile();
			parentsPath.mkdirs();
			boolean b = file.createNewFile();
			System.out.println("文件创建完成 : " + b);
		}

		FileWriter fw = new FileWriter(file);
		fw.write("计算XX以内所有能被XX整除的数的和以及平均数。\r\n");
		fw.write("要求：\r\n");
		fw.write("A.xx的值从控制台用Scanner读取；创建文本文件，将当前题目及要求写入文档;\r\n");
		fw.write("B.代码编写要具有灵活性，不要我随便改个参数导致你的代码，大面积修改！！\r\n");
		fw.write("C.在文档中打出解题思路，同时输出从控制台读取的值，符合条件的数有几个？ 对符合\r\n条件的数，排序输出！和是多少，平均数是多少，最大值是多少，最小值是多少？\r\n");
		fw.write("\r\n");

		// fw.flush();

		List<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数值范围");
		Integer count = input.nextInt();
		System.out.println("请输入除数");
		Integer count2 = input.nextInt();
		fw.write("您输入的数值为；" + count + "  除数为： " + count2);
		
		if (count < count2) {
			System.out.println("输入有误，请输入一个大于"+count2+"的数值");
			return;
		}
		Integer sum = 0;
		double avg = 0;
		for (int i = 1; i <= count; i++) {
			if (i % count2 == 0) {
				list.add(i);
				sum += i;
			}
		}

		System.out.println("   能被"+count2+" 整除的数有： " + list.size() + "个；" + "   它们分别是： ");
		fw.write("能被"+count2+"  整除的数有： " + list.size() + "个；" + "它们分别是： \r\n");

		int i = 0;
		for (Integer integer : list) {
			System.out.print(integer + "\t");
			fw.write(integer + "\t");
			i++;
			if (i % 10 == 0) {
				System.out.println();
				fw.write("\r\n");
			}
		}

		System.out.println();
		fw.write("\r\n");
		System.out.println("能被"+count2+"整除的数的和为： " + sum + "    平均数为：" + (double) sum / list.size() + "  最大值为： "
				+ list.get(list.size() - 1) + "  最小值为： " + list.get(0));
		fw.write("能被"+count2+"整除的数的和为： " + sum + "    平均数为：" + (double) sum / list.size() + "  最大值为： "
				+ list.get(list.size() - 1) + "  最小值为： " + list.get(0));
		fw.close();
	}

}
