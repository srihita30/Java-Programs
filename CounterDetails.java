public class CounterDetails{
	
	private int  maxTrueCounter = 0;

	private int maxFalseCounter = 0;

	public int getMaxTrueCounter(){
		return this.maxTrueCounter;
	}

	public int getMaxFalseCounter(){
		return this.maxFalseCounter;
	}

	public void setMaxTrueCounter(int val){
		this.maxTrueCounter = val;
	}

	public void setMaxFalseCounter(int val){
		this.maxFalseCounter = val; 
	}
}