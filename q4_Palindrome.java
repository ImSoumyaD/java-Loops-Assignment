package PW.Loops_Assignment;
public class q4_Palindrome {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("malayalam");
       boolean flag = CheckPalindrome(str);
       if (flag) System.out.println("Palindrome");
       else System.out.println("Not Palindrome");
    }
    public static boolean CheckPalindrome (StringBuilder s){
        String reverse = "";
        for (int j = s.length()-1; j >=0; j--) {
            reverse += (s.charAt(j));
        }
        for (int i = 0; i < s.length(); i++) {
            if (reverse.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
