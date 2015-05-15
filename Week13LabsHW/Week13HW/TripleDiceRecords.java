
public class TripleDiceRecords extends TripleDice implements Cloneable {
	
	int [] myArr;
	int numberThrows;
	public TripleDiceRecords (int bounces){
		
		super (bounces);
		myArr = new int [10];
		for (int i = 0; i < 0; i++)
			myArr[i] = 0;
		    numberThrows = 0; 
	}
	
	@Override
	public int Throw(){
		int value = super.Throw();
		myArr[numberThrows] = value;
		numberThrows++;
		return value;
	}
	
	@Override
	public String toString(){
		String history = new String();
		for (int i = 0; i < numberThrows; i++){
			history += "Throw " + (i + 1) + ": " + myArr [i] + "\n";
		}
		
		return super.toString() + "\n" + history;
	}
	
	@Override
	
	public boolean equals (Object obj){
		if (obj instanceof TripleDiceRecords)
			return (value == ((TripleDiceRecords) obj). Value());
		else
			return false;
	}
	
	@Override
	
	public Object clone () throws CloneNotSupportedException {
		return (TripleDiceRecords) super.clone();
	}

}
