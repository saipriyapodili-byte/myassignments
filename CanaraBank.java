package week4.day1;

public abstract class CanaraBank implements Payments {
	
	@Override
	public void upiPyments() {
		System.out.println("max limit for cash on deliveryis 60,000");
	}
	
	@Override
    public void cashOnDelivery() {
    	System.out.println("max limit for cash delivery is 20,000");
	}
    	
    @Override
    public void carPayments() {
    	System.out.println("max limit for card payment is 70,000");
    	
    	
    }
    
    public void internetBanking() {
    	System.out.println(" max limit for internetbanking is 1,00,000");
    	
    }
    public void recordPymentdetails() {
         System.out.println(" payment details");
    }
         
     public static void main(String[]arg)    {
     
       
    }
}
