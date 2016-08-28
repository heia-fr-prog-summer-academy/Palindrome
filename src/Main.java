import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static boolean isPalindrome (String x) {
        // x.length() donne la longueur de x
        // 
        if (x.length() <= 1) {
            return true;
        } else if (x.charAt(0) == x.charAt(x.length()-1)) {
            return isPalindrome(x.substring(1, x.length()-1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (isPalindrome(line)) {
                    System.out.println(line);
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
