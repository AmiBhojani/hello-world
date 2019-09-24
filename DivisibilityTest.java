class DivisibilityTest{
	/**
	* Invalid Number of Arguments
	* i.e. java DivisibilityTest <numberDivisibleBy> <n1> <n2> <valueToBeTested>
	* <numberDivisibleBy> - This represents a number you want to divide with
	* <n1> and <n2> is the range in which you want test<br>
	* e.g. java DivisibilityTest 3 10 20
	**/
	public static void main(String args[]){
		if(args.length!=3)
		{
			System.out.println("Invalid Number of Arguments\n");
			System.out.println("i.e. java DivisibilityTest <numberDivisibleBy> <n1> <n2> <valueToBetested>");
			System.out.println("<numberDivisibleBy> - This represents a number you want to divide with");
			System.out.println("<n1> and <n2> is the range in which you want test\n");
			System.out.println("e.g. java DivisibilityTest 3 10 20");
			System.exit(0);
		}
			
		int numberDivisibleBy = Integer.parseInt(args[0]);
		int n1 = Integer.parseInt(args[1]);
		int n2 = Integer.parseInt(args[2]);
		
		for(int i = n1;i <= n2;i++)
		{
			if(n1%numberDivisibleBy==0)
			{
				System.out.println(n1 + "\n");
				n1++;
			}
			else
			{
				n1++;
			}
		}
	}
}