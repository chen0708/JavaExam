/*定义参数a，b，c并私有化；
 * 设置set方法接收Test传输的参数
 * 如果a=0，b=0.c=0时这个方程就有 无数个解
 * 如果a=0，b=0.c!=0时这个方程就无解
 * 如果a=0，这个方程就变为一元一次方程，因此可输出解为+ (-c / b)；
 * 若a!=0，则先判断(b * b - 4 * a * c)的值的大小
 * 若小于0则输出这个方程无解
 * 如等于0则输出这个方程有一个解为(-b / (2 * a))
 * 如大于0则输出这个方程有两个解为：  x1=(-b + tmp) / (2 * a)  x2= (-b - tmp) / (2 * a)
 */
package com.cqb.eryuan;

public class Fangcheng {
	private double a, b, c;

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void fangcheng() {

		if (a == 0) {

			if (b == 0) {
				if (c == 0) {
					System.out.println("您输入的参数全为0，方程有无数个解");
				} else {
					System.out.println("您输入的参数错误，此方程无解");

				}
			} else {
				System.out.println("您输入的a=0，方程为一元一次方程，方程的解为： " + "\n" + "x= " + (-c / b));

			}
		} else {
			double tmp =b * b - 4 * a * c;
			
			if (tmp < 0) {
				System.out.println("此二元一次方程无解");
			} else if (tmp == 0) {
				
				System.out.println("二元一次方程有一个解为： " + "x= " + (-b / (2 * a)));
			} else if (tmp > 0) {
				tmp=Math.sqrt(tmp);
				System.out.println("二元一次方程有两个解：  x1=" + (-b + tmp) / (2 * a) + "\t" + "x2= " + (-b - tmp) / (2 * a));

			}
		}

	}

}
