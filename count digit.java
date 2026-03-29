import java.util.Scanner;

public class Main {
    public static int countdigit(int n) {
         int cnt = 0;//variable that stores the count
         
         while(n > 0){ //it should be done if its greater than 0
             cnt = cnt + 1; //count or add the digit in varibale one by one
             n = n/10; //and remove the last digit
         }
         
         return cnt;
    }
    
    public static void main(String [] args){
        int n = 123456789;
        System.out.println("Number:"+n);
        int digit = countdigit(n);
        System.out.println("Count :"+digit);
    }
    
}
