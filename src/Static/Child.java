package Static;

public class Child {
	
	 void sum(int a,long b){System.out.println("a method invoked");}    
	  void sum(long a,int b){System.out.println("b method invoked");}    
	    
	  public static void main(String args[]){    
		  Child obj=new  Child();    
	  //obj.sum(20,20);//now ambiguity    
	  }    
}
	