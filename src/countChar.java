import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input string : ");
        String inputStr = scn.nextLine();
        System.out.print("Input char : ");
        char x = scn.next().charAt(0);
        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            if(inputStr.charAt(i)==x){
             count++;
            }
        }
        System.out.println("the quantity char \'"+x+"\' in \""+inputStr+"\" : "+count );
    }
}
