class CurrencyConvertor{
	/**
	* Invalid number of arguments
	* i.e. java CurrencyConvertor <currencyType> <currencyValue>
	* <currencyType><br>1-US$ to INR<br>2-INR to US$<br>
	* e.g java CurrencyConvertor 1 20
	**/
	public static void main(String args[]){
		if(args.length!=2)
		{
			System.out.println("Invalid number of arguments");
			System.out.println("i.e. java CurrencyConvertor <currencyType> <currencyValue>");
			System.out.println("<currencyType>\n1-US$ to INR\n2-INR to US$\n");
			System.out.println("e.g java CurrencyConvertor 1 20");
			System.exit(0);
			
		}
		int currencyType = Integer.parseInt(args[0]);
		double currencyValue = Double.parseDouble(args[1]);
		int rate = 70;
		if(currencyType==1)
		{
			System.out.println("$ "+ currencyValue+ "="  + (currencyValue*rate)+ "INR");
		}
		else
		{
			System.out.println(currencyValue+"INR = "+"$ "+ (currencyValue/rate));
		}
	} 
}
		
		
