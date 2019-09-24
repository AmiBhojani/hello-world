class Calculator{
	/**
	* Invalid number of arguments
	* i.e. java Calculator <operationType> <value1> <value2>
	* <br><operationtype><br>1-Add<br>2-Sub<br>3-Multiply<br>4-Divide<br>5-exit
	* e.g. java Calculator 1 20 10
	**/
	public static void main(String args[]){
		if(args.length != 3)
		{
				System.out.println("Invalid number of arguments");
				System.out.println("i.e. java Calculator <operationType> <value1> <value2>");
				System.out.println("\n<operationtype>\n1-Add\n2-Sub\n3-Multiply\n4-Divide\n5-exit");
				System.out.println("e.g. java Calculator 1 20 10");
				System.exit(0);
		}
		int operationType = Integer.parseInt(args[0]);
		double value1 = Double.parseDouble(args[1]);
		double value2 = Double.parseDouble(args[2]);
		switch(operationType)
		{
			case 1 : System.out.println("Ans = "+ (value1 + value2));
					 break;
			case 2 : System.out.println("Ans = "+ (value1 - value2));
					 break;
			case 3 : System.out.println("Ans = "+ (value1 * value2));
					 break;
			case 4 : System.out.println("Ans = "+ (value1 / value2));
					 break;
			default : System.out.println("Oops!Invalid choice");
					  break;
		}
	}
}
