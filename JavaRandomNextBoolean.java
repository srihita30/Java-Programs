import java.util.Random;

public class JavaRandomNextBoolean {

  //This code will draw a random boolean value 100 times and print the max number of times each of it was prtinted in sequence. 

	public static void main(String[] args) { 

       JavaRandomNextBoolean randomBoolean = new JavaRandomNextBoolean();

       //int maxBooleanCounter = randomBoolean.maxBooleanCounter();
       randomBoolean.maxBooleanCounter();

		}

	public void maxBooleanCounter() {

	Random random = new Random();  

		int i = 0; 

    // The lastBooleanVal will return the last boolean before the sequence broke off. 

		boolean lastBooleanVal = true;

    //The maxTrueCounter and the maxFalseCounter will be the varibales which will hold the max number of times each true or false was printed. 

        int maxTrueCounter = 0; 

        int maxFalseCounter = 0; 

        // These current counter variables will hold the current number of sequence for the boolean values drawn. 

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

    // Now we will finally print the max number of times each booolean value was drawn in sequence. 

    System.out.println("Random booleanvalue : "+ maxTrueCounter);

    System.out.println("Random booleanvalue : "+ maxFalseCounter);

     

		
	}

}

