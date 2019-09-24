class  PrimeNumber { 
	/**
	* Invalid number of arguments.
	* i.e. java PrimeNumber <range><br>
	* <range> - upto how many numbers<br>
	* e.g. java PrimeNumber 3
	**/

public static void main(String[] args) { 
  		if(args.length != 1)
		{
			System.out.println("Invalid number of arguments");
			System.out.println("i.e java PrimeNumber  <range>\n");
			System.out.println("<range> - upto how many numbers\n"); 
			System.out.println("e.g. java PrimeNumber 3\n");
			System.exit(0);
		}
		
else 
  		{ 
   			int range = Integer.parseInt(args[0]); 
   			int c = 0,count = 0; 
   			for(int  i = 2;c < range;i++) 
   			{
 count=0; 
    				for(int j = 2;j < i ;j++) 
    				{ 
if(i%j==0) 
     					count++; 
    				} 
    				if(count==0) 
    				{
 c++; 
     					System.out.println(i); 
    				}	 
   			} 
  		}    
} 
}
