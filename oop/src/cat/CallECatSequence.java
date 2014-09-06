package cat;

public class CallECatSequence {
	
	public static void main (String [] args){
		Cat [] cats ;
		cats = new Cat [10];
		
		for (int i = 0;i < 10; i++) {
			cats [i] =new Cat("Cat"+ (Sequence.nextValue() + 1),"");	
			cats [i].sayMiau();
		}		
	}
	
}
