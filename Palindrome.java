public class Palindrome {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x)); //true 
    }
    public static boolean isPalindrome(int x){
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        } else{
            String s = x+"";
            for (int i = 0; i < s.length()/2; i++) {
                if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                    return false;
                }
            }
            return true;
        }
    }
}
