/*
 * 输入建立的数组长度
 * 输入数组的元素
 * 遍历数组输出
 * 定义一个最大值和最小值并将arr[0]赋给最大值与最小值
 * 用for循环遍历数组将每个元素与最大值和最小值进行比较，如大于最大值，则将元素赋给最大值，若小于最小值，将元素赋给最小值
 * 定义double型avg求出最大值与最小值的平均值；
 * 
 */

package com.cqb.arry;

import java.util.Scanner;

public class Arrary {

	public static void main(String[] args) {
		System.out.println("请输入您要建立的数组长度");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double [] arr = new double[a];
		for (int i = 0; i < a; i++) {
			System.out.println("请您输入数组的第 " + (i + 1) + "个数");
			arr[i] = input.nextInt();
		}

		System.out.println("您输入的数组为： ");
		for (double i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();

		double max = arr[0];
		double min = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("数组的最大值为： max=" + max + "\t" +"\t" + "最小值为 min= " + min);

		//double avg = (double)((max + min) / 2);
		System.out.println("数组的最大值和最小值的平均值为avg= " +(max + min) / 2);
	}

}
