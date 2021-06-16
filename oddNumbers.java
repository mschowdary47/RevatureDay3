import java.util.Scanner;
public class oddNumbers{
    public static void main(String args[]){
        int i,num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter limit :");
        num=s.nextInt();
        i=1;
        while(i<=num){
            System.out.println("oddNumbers are :"+i);
            i=i+2;
        }
    }
}