package PW.Loops_Assignment;
public class q4_Palindrome {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("racecar");
       boolean flag = CheckPalindrome(str);
       if (flag) System.out.println("Palindrome");
       else System.out.println("Not Palindrome");
    }
    public static boolean CheckPalindrome (StringBuilder s){
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            reverse.append(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (reverse.charAt(i) != s.charAt(i)) return false;
        }
        return true;
    }
}
