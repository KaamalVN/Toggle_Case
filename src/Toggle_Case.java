import java.util.Scanner;

public class Toggle_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result="";
        for(int i=0;i<input.length();i++){
            result+=(char)((int)input.charAt(i)^(1<<5));
        }
        System.out.println(result);
    }
}
