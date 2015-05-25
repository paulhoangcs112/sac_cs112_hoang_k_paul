
public class PayableInterfaceTest {
	
	public static void main (String args[] ) {
		
		Payable payableObjects[] = new Payable [4];
		payableObjects [0] = new Invoice ("01234", "seat", 2, 375.00);
		payableObjects [1] = new Invoice ("56789", "tire", 4, 79.95);
		payableObjects [2] = new SalariedEmployee ("John", "Smith","111-11-1111",  800.00);
		payableObjects [2] = new SalariedEmployee ("Linda", "Bozo","777-77-7777",  1200.00);
		
		System.out.println ("Invoices and Employee processed polymorphically: \n");
		
		for ( Payable currentPayable: payableObjects){
			
			//System.out.printf( "%s \n",currentPayable.toString() );
			{
		}
			System.out.printf("%s: $%, .2f\n\n",
					"payment due", currentPayable.getPaymentAmount() );
		}
		
	}

}
