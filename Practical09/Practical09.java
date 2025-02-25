
public class Practical09{
	
	static double factorial1(long number){
		long fact=1;
		double totalTime=0;
		for(long i=number;i>0;i--){
			double beforeTime = System.nanoTime();
			fact*=i;
			double afterTime = System.nanoTime();
			totalTime += afterTime-beforeTime;
		}
		return totalTime;
	}
	
	static long factorial2(long number){
		if(number==0){
		  return 1;
		} 
		return number*factorial2(number-1);
}

	static String concatIt(String s){
	  return s+(System.nanoTime()%10);
	}
	
	
	static StringBuffer stringBuffer(StringBuffer sb){
	  return sb.append(System.nanoTime()%10);
	}
	
	static StringBuilder stringBuilder(StringBuilder sB){
	  return sB.append(System.nanoTime()%10);
	}
	  
	public static void main(String[] args){
	 long finalTime1=0;
	 long finalTime2=0;
	 long finalTime3=0;
	 long finalTime4=0;
	 long finalTime5=0;
	
	  int size = Integer.parseInt(args[0]);
	  for(int times=0;times<100;times++){
	  double netTimeIs1=0;
	  double netTimeIs2=0;
	  long[] arr = new long[size];
	  for(int i=0;i<size;i++){
  	  arr[i]=System.nanoTime()%10;
  	}
  	for(int i=0;i<size;i++){
	    netTimeIs1+=factorial1(arr[i]);
  	 }
	  long fact;
	  for(int i=0;i<size;i++){
      double now=System.nanoTime();
      fact=factorial2(arr[i]);
      double then=System.nanoTime();
	    netTimeIs2+=(then-now);
	  }
	 finalTime1+=netTimeIs1/size;
	 finalTime2+=netTimeIs2/size;
	  
	  String s="";
	  double totalTime=0;
    for(int i=0;i<size;i++){
	    double beforeTime = System.nanoTime();
	    s+=(System.nanoTime()%10);
	    double afterTime = System.nanoTime();
	    totalTime = totalTime + afterTime - beforeTime;
	    }
	  finalTime3+=totalTime/size;
	  
	  totalTime=0;
	  StringBuffer sb = new StringBuffer("");
	  for(int i=0;i<size;i++){
	    double beforeTime = System.nanoTime();
	    sb=stringBuffer(sb);
	    double afterTime = System.nanoTime();
	    totalTime += afterTime - beforeTime;
	  }
	  finalTime4+=totalTime/size;
	  
	  totalTime=0;
	  StringBuilder sB = new StringBuilder("");
	  for(int i=0;i<size;i++){
	    double beforeTime = System.nanoTime();
	    sB=stringBuilder(sB);
	    double afterTime = System.nanoTime();
	    totalTime += afterTime - beforeTime;
	  }
	  finalTime5+=totalTime/size;
	  }
	  
	  System.out.println("In looping "+finalTime1/10);
	  System.out.println("In recursion "+finalTime2/10);
	  System.out.println("Net time taken in addition is "+finalTime3/10);
	  System.out.println("Net time taken in append for String Buffer is "+finalTime4/10);
	  System.out.println("Net time taken in append for String Builder is "+finalTime5/10);
	}
}
