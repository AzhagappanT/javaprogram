import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 integer");
        int sum = 0;
        for(int i = 1;i<=5;i++) {
        	int j = input.nextInt();
        	sum =sum + j;
        }
        
        System.out.println("sum of user input is" + sum);
        
        
	}

}
