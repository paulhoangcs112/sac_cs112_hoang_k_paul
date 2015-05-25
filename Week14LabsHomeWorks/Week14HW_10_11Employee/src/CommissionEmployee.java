
public abstract class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee (String first, String last, String ssn, double sales, double rate){
		
		super(first, last, ssn);
		setGrossSales (sales);
		setCommissionRate (rate);
		
	}
	
	public void setCommissionRate (double rate){
		commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
	}
	
	public double getCommissionRate(){
		return commissionRate;
	}
	
	public void setGrossSales (double sales){
		grossSales = (sales < 0.0) ? 0.0: sales;
	}
	
	public double getGrossSales(){
		return grossSales;
	}
	
	public double earnings(){
		return getCommissionRate() * getGrossSales();
	}
					
		public String toString(){
			return String.format("%s: %s\n%s: $%, .2f; %s: %.2f",
					"commission employee", super.toString(),
					"gross sales", getGrossSales(),
					"commission rate", getCommissionRate() );
		}
	}


