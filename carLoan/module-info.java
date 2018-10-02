/**
 * 
 */
/**
 * @author Qi
 *
 */
public class carLoan{
	
	public int totalPrice;
	public int downPayment;
	public int months;
	public int interesRate;
	
	public int monthlyCarPayment() {
		
		//compute the monthly payment
		
		int monthlyCarPayment = (totalPrice - downPayment)/ months;
	
		return monthlyCarPayment;
	}
	
	
	public int totalInterest(){
		
		//compute the total spent on interest
		
		int totalInterest = monthlyCarPayment() * months - totalPrice;
				
		return totalInterest;
		
	}

}