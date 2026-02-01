package array.problems;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(checkValidPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean checkValidPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while(left <= right) {
            char leftCharacter = str.charAt(left);
            char rightCharacter = str.charAt(right);

            if(!Character.isLetterOrDigit(leftCharacter)) {
                left++;
            } else if(!Character.isLetterOrDigit(rightCharacter)) {
                right--;
            } else {
                if(Character.toLowerCase(leftCharacter) != Character.toLowerCase(rightCharacter)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
