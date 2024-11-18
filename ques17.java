import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        String numStr = Integer.toString(num);
        int sum = 0;
        
        for (int i = 0; i < numStr.length() - 1; i++) {
            int consecutiveNum = Integer.parseInt(numStr.substring(i, i + 2));
            sum += consecutiveNum;
        }
        
        System.out.println("Output: " + sum);
    }
}
