import java.util.Random;

public class JavaRandomBooleanGetSet {

	public static void main(String[] args) { 

       JavaRandomBooleanGetSet randomBoolean = new JavaRandomBooleanGetSet();

       //int maxBooleanCounter = randomBoolean.maxBooleanCounter();
       CounterDetails c = randomBoolean.maxBooleanCounter();

       System.out.println("This is the max times true was printed: " + c.getMaxTrueCounter() + " and this was the max number of times false was printed: " + c.getMaxFalseCounter());

		}

	public CounterDetails maxBooleanCounter() {

	Random random = new Random();  

  CounterDetails cd = new CounterDetails();

		int i = 0; 

		boolean lastBooleanVal = true;

        int maxTrueCounter = 0; 

        int maxFalseCounter = 0; 

        int currentTrueCounter = 0;

        int currentFalseCounter = 0;

        while(i<100){

         boolean val = random.nextBoolean(); 

         //System.out.println("in while loop : val=:"+val + " : iteration:" + (i+1) );

     	 if (Boolean.compare(val,lastBooleanVal) !=0 && i !=0 ) {
     	 		//System.out.println("RESET VALUES: COMPARE: "+val+" : "+ lastBooleanVal + " : " + Boolean.compare(val,lastBooleanVal));
        
        		if(lastBooleanVal && (maxTrueCounter < currentTrueCounter) ){
       	 		
       	 			maxTrueCounter = currentTrueCounter; 
       	 			//System.out.println("********in 1st if loop TRUE: val= mtc is:"+maxTrueCounter +" ctc is: "+currentTrueCounter);

       	 		}


       	 		else{
       	 			if(maxFalseCounter < currentFalseCounter){
       	 				maxFalseCounter = currentFalseCounter; 
       	 				//System.out.println("********in 1st if loop FALSE : val=mfc is :"+maxFalseCounter+ " cfc is: " +currentFalseCounter);
       	 			}
       	 		}

       	 		currentFalseCounter = 0;
       	 		currentTrueCounter = 0;

      		}



       	 		if (val){

       	 			currentTrueCounter = currentTrueCounter + 1; 

       	 		}

       	 		else{

       	 			currentFalseCounter = currentFalseCounter + 1; 

       	 		}

      		


  		 	 //System.out.println("Random booleanvalue : MTC"+ maxTrueCounter+" MFC:" + maxFalseCounter +" i: "+i);


      		lastBooleanVal = val; 

      		i++;

    }

      cd.setMaxTrueCounter(maxTrueCounter);
      cd.setMaxFalseCounter(maxFalseCounter);


    //System.out.println("Random booleanvalue : "+ maxTrueCounter);

    //System.out.println("Random booleanvalue : "+ maxFalseCounter);

      return cd; 
		
	}

}

