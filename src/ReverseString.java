import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // store the string length
        int str = inputText.length();
        // Reversing the string
        String reverse = "";
        for (int i = str - 1; i >= 0; i--) {
            //reverse = Qtec
            //i[0]=Q
            //i[1]=t
            //i[2]=e
            //i[3]=c

            //when i=[3],
            //reverse = c
            //when i =[2],
            //reverse = c+e = ce
            //when i = [1],
            //reverse = ce+t=cet
            //when i=[0],
            //reverse=cet+Q=cetQ
            reverse += inputText.charAt(i);

        }

        // Printing the reversed string
        System.out.println("Reversed string: " + reverse);
    }
}
