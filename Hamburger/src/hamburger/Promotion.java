package hamburger;

import java.util.Calendar;
import java.util.Scanner;

public class Promotion {

	public void agePromotion(){
		MenuPrice m = new MenuPrice();
		Main m1 = new Main();
		Scanner sc = new Scanner(System.in);
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		System.out.println("??΄? ?΄λ₯? ?? ₯??Έ?");
		System.out.println("?°??? ₯ -->");
		int birthYear = sc.nextInt();
			
		if(year - birthYear > 19){
		System.out.println("? ?Έ????΄ ????€");
		System.out.println("μ΅μ’κ²°μ κΈμ‘ : ");		
		}
		if(year - birthYear <= 19){
		double save = m.getSum()*0.7;
		System.out.println("μ΅μ’κ²°μ κΈμ‘ :" + save);
				
		}
	}
	public void couponPropotion(){
		System.out.println("μΏ ν°λ²νΈλ₯? ?? ₯??Έ?");
	}
}
