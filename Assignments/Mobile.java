package week1.day1.Assignments;

public class Mobile {
	public void makeCall() 
	{
         String mobileModel="oneplus";
         float mobileWeight=138.6f;
         System.out.println("The Mobile Model is "+mobileModel);
         System.out.println("The Mobile Weight is "+mobileWeight);
	}
	public void sendSms() 
	{
        boolean fullyCharged=true;
        int mobileCost=30000;
        System.out.println("Is Fully Charged "+fullyCharged);
        System.out.println("The Mobile Cost is "+mobileCost);
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		System.out.println("This is my Mobile");
		obj.makeCall();
		obj.sendSms();
		
		
				
	}
}
