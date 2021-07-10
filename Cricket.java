package Assignment;

public class Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min=0;
		int max=6;
		int count=0;
		float strikeRate;
		int t[] = new int[7] ;
	
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
			
			else if(random_int == 6 ) 
				t[6]++;
				
		}	
			System.out.println("\n" + "***********************************");
			System.out.println();
			System.out.println("Total Runs scored by the Batsman :"+count);
			System.out.println("Strike Rate of the batsman :" + ((count*10)/3)+ "\n");
			
			for(int i=0;i<7;i++) {
				System.out.println("Number of " + i+"s ="+t[i]);
			}
		}
		
	}


