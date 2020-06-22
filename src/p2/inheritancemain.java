package p2;
import p1.*;
public class inheritancemain {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.eat();
		a1.sleep();
		Bird b1=new Bird();
		b1.eat();
		b1.sleep();
		b1.fly();
	}

}
