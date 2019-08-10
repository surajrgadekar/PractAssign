package Static;

public class StaticDemo {

	/*public void m1() {
		System.out.println("This is Non Static method");
		int a=10;
	}
	
	static void m2() {
		System.out.println("This is Static method");
	}*/
	public static void main(String[] args) {
		//StaticDemo s=new StaticDemo();
		StaticDemo s1=new StaticDemo(10);
		
	}
	public StaticDemo() {
		System.out.println("This is constructor");
		}
	public StaticDemo(int a) {
		System.out.println("This is constructor1");
		}
	static {
		System.out.println("This is static block");
	}
	{
		System.out.println("This is non static block");
	}
	{
		System.out.println("This is non static block1");
	}
	
}
 