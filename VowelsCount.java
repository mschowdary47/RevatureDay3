import java.util.Scanner;
public class VowelsCount{
    public static void main(String[] args) {
        int i,count=0;
        System.out.println("enter a string");
        Scanner s=new Scanner(System.in);
        String str= s.nextLine();
        
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}