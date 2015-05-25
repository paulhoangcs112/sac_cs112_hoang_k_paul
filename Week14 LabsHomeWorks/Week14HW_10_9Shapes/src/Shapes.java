//create a abstract superclass
abstract public class Shapes {
	
	public String colorString;
	
	public Shapes(){
		
	}
	
	public void setColor(String c){
		colorString = c;
		
	}
	
	public String getColor(){
		return colorString;
	}
	
	abstract public double getArea();

}
