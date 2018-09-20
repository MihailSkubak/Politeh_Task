package com.company;
import java.util.Scanner;


/////////////////////////////////
//Task 1

public class Main{
    public static void main(String[] args) {
        short n;
        int x = 1;
        System.out.print("Введите степень: ");
        Scanner in = new Scanner(System.in);
        n = in.nextShort();
        if(n==0){
            System.out.print("Error");
        }else {
            for (int i = 0; i < n; i++) {
                x *= 2;
            }
            System.out.print(x);
        }
    }
}

//////////////////////////////////////////
//Task 2

	/*public class Main {
	public static int fact(int num) {
		return (num == 0) ? 1 : num * fact(num - 1);
	}

	public static void main(String[] args) {
		System.out.print(fact(3));
	}}*/



/////////////////////////////////////////////
//Task 3

	/*public class Main {
	public static void main(String[] args) {
		Number n=new Number();
		n.num(3,8);
		System.out.println("Сумма: "+n.count());
		System.out.println("Разность: "+n.count2());
		System.out.println("Произведение: "+n.count3());
	}
}
class Number {
	private int a;
	private int b;
	private int s;
	private int z;
	private int d;
	public  void num(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int count(){
		s=a+b;
		return s;
	}
	public int count2(){
		if(a>b) {
			z = a - b;
		}
		if(a<b) {
			z = b - a;
		}
		if(a==b){
			z=0;
		}
		return z;
	}
	public int count3(){
		d=a*b;
		return d;
	}
}*/


/////////////////////////////////////
//Task 4

	/*public class Main {
		public static void main(String[] args) {
			float h;
			float g=9.8f;
			double r;
			System.out.print("Введите высоту h: ");
			Scanner in = new Scanner(System.in);
			h = in.nextFloat();
			r= Math.sqrt((2*h/g));
			System.out.print(r);
		}
		}*/


////////////////////////////////////
//Task 5

/*public class Main {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		boolean z=true;
		System.out.print("Введите длину известного катета а: ");
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		System.out.print("Введите длину гипотенузы с: ");
			c = in.nextDouble();
			while(z) {
				if (c > a) {
					b = c - a;
					System.out.print(b);
					z=false;
				} else {
					System.out.print("Длина гипотенузы больше длины катета, ввелите другую длину с: ");
					c = in.nextDouble();
				}
			}
	}
	}*/
