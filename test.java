import java.util.*

class test{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		try{
			if(n<0){
				throw new Exception("Negative number not allowed");
			}
			if(n<18 || n>=0){
				System.out.println("ABC");
			}
			else if(n==18){
				System.out.println("correct");
			}
			else (n>18){
				System.out.println("DEF");
			}
		}
		catch(Exception e){
			System.out.println{"Error"+e.getMessage()}
		}
	}
}