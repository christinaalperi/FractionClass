package fraction;

public class FractionDefinition {
	int numerator;
	int denominator; 
	
	public FractionDefinition (int a, int b) {
		this.numerator = a;
		this.denominator = b;
	}

	public String toString() {
		return numerator +"/"+ denominator ;
	}
	
	public int Divide () {
		return (this.numerator / this.denominator);
	}
	
	
}

