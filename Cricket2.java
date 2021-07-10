package Assignment;

public class Cricket2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 int min=0;
	 int max=6;
	 int count=0;
	 int count1=0;
	 int total;
	 float avg=0;
	 float strikeRate;
	 	
	 int t[] = new int[7] ;
	
 	 for(int j=1 ; j<=2 ; j++) {
 		 
 		System.out.println("\n"+".......Calculating Details for Match no. " + j +"......."+"\n" );
 		 
		
		for(int i=1;i<=30;i++) {
			int random_int=(int)Math.floor(Math.random()*(max-min+1)+min);
			count += random_int;
			System.out.println("Run(s) on ball " +i+ "->" + random_int );
			
			if(random_int == 0 ) 
				t[0]++;
			
			else if(random_int == 1 ) 
				t[1]++;
			
			else if(random_int == 2 ) 
				t[2]++;
			
			else if(random_int == 3 ) 
				t[3]++;
			
			else if(random_int == 4 ) 
				t[4]++;
			
			else if(random_int == 5 ) 
				t[5]++;
			
			else 
				t[6]++;
				
		}	count1+=count;
		
 	 }		
 	 
 	 		avg=count1/2;
			System.out.println("\n" + "***********************************");
			System.out.println();
			System.out.println("Total Runs scored by the Batsman :"+count1);
			System.out.println("Strike Rate of the batsman :" + ((count1*100)/60));
			System.out.println("Average of the Batsman : " + avg + "\n");
			for(int i=0;i<7;i++) {
				System.out.println("Number of " + i+"s ="+t[i]);
			}
		
		
	
	}
}
