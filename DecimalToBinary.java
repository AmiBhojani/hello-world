class DecimalToBinary{
	/**
	* Invalid number of arguments
	* i.e. java DecimalToBinary  <operationType> <binary number> <decimal>
	* <operationType>\n1-Binary to decimal\n2-Decimal to binary
	* For <operationType>=1 <decimal>=0<br>1<operationType>=2 <binary>=0<br>
	**/
		public static void main(String args[]){
		
		if(args.length!=3)
		 {
			 System.out.println("Invalid number of arguments");
			 System.out.println("i.e. java DecimalToBinary  <operationType> <binary number> <decimal>");
			 System.out.println("<operationType>\n1-Binary to decimal\n2-Decimal to binary");
			 System.out.println("For <operationType>=1 <decimal>=0\n1<operationType>=2 <binary>=0\n");
			 System.exit(0);
		 }
		

		int operationType = Integer.parseInt(args[0]);
		int binary = Integer.parseInt(args[1]);
		int decimal = Integer.parseInt(args[2]);
		int n = 0;
		
		if(operationType==1)
		{
			
			while(binary!=0)
			{
					int temp = binary%10;
					//System.out.println("temp = " + temp);
					decimal += temp*(Math.pow(2,n));
					//System.out.println("decimal = " + decimal);
					binary = binary/10;
					//System.out.println("binary = " + binary);
					n++;
					//System.out.println("n = " + n);
			
			}
			System.out.println(decimal);
		}
		else
		{
			System.out.println(Integer.toBinaryString(decimal));  
		}
	}
		
}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		