/*使用Scanner接收输入的参数
 * 创建Fangcheng这个类的对象
 * 使用set方法将用户输入的参数传之fangcheng对象
 * 
 * 调用fangcheng这一对象的fangcheng()方法 输出结果
 */

package com.cqb.eryuan;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入a，b，c的值");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		Fangcheng fangcheng = new Fangcheng();
		fangcheng.setA(a);
		fangcheng.setB(b);
		fangcheng.setC(c);
		fangcheng.fangcheng();
	}

}
