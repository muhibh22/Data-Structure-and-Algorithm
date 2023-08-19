public class Palindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        
        String input1 = "A man, a plan, a canal: Panama";
        System.out.println(solution.isPalindrome(input1)); // Output: true
        
        String input2 = "race a car";
        System.out.println(solution.isPalindrome(input2)); // Output: false
    }
}
