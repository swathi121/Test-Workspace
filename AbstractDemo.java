/*Demonstration of abstract classes*/
package abstractDemo;
abstract class Area{
	double d;
	abstract void area(int p,int q);
	void show(){
		System.out.println("This is abstrsct class");
	}
}
class Triangle extends Area{
	int b,h;
	double x;
	void area(int p,int q){
		b=p;
		h=q;
		x=0.5*b*h;
	}
	void showArea(){
		System.out.println("Area="+x);
	
	}

}
class AbstractDemo{
	public static void main(String args[]){
		Triangle tg=new Triangle();
		tg.area(6,5);
		tg.show();
		tg.showArea();
	}
}