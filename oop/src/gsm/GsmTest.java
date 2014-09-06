package gsm;

import java.util.TreeSet;


public class GsmTest {

	public static void main(String[] args) {
		
		GSM Asha300 = new GSM("Asha 300","Nokia",200,"Svilen Valkanov");
		Battery Asha300Bat = new Battery(980,10,4);
		Asha300.setBattery(Asha300Bat);
		Asha300.printTelInfo();
		Call Call1 = new Call(123,878829832);
		Call Call2 = new Call(23,876663516);
		Call Call3 = new Call(100,864728812);
		Call Call4 = new Call(56,566666666);
		Asha300.addCall(Call1);
		Asha300.addCall(Call2);
		Asha300.addCall(Call3);
		Asha300.addCall(Call4);
		Asha300.printCallHistory(6);
	}

}
