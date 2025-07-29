
public class Cash implements Payment{

	@Override
	public void pay(int amt) {
		System.out.println("Payment of "+amt+" done through cash");
		
	}

}
