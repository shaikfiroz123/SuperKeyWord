package SuperKeyWord;

class Sheap{
	int price = 20000;
	String colour = "Black";
	int legs=4;
}
class Dog extends Sheap{
	int price =15000;
	String colour="white";
	int legs = 4;
	
	void display() {
		System.out.println(price);
		System.out.println(colour);
		System.out.println(legs);
		System.out.println(super.price);
		System.out.println(super.colour);
		System.out.println(super.legs);
		
		
	}
}

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.display();

	}

}
