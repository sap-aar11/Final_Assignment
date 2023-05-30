import java.util.Scanner;
public class UserInputMain {
	boolean flag;
	public void check(int no) throws Negative_NoException
	{
		if(no<0)
		{
			Negative_NoException negtiveNo = new Negative_NoException("Negative No Entered");
			throw negtiveNo;
		}
		else {
			flag = true;
			return;
		}
	}

	public static void main(String[] args) {
		System.out.println("Give any +ve No. of your choice:>>>");
		Scanner scan=new Scanner(System.in);
		int inputNo = scan.nextInt();
		
		UserInputMain noCheck = new UserInputMain();
		try {
			noCheck.check(inputNo);
		} catch (Negative_NoException e) {
			e.printStackTrace();
			
		}
		if (noCheck.flag)
			System.out.println(" Entered no is positive \n");
		else 
			System.out.println("Don't Enter -ve  no \n");
	}

}
