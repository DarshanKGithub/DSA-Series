public class isPalindrome {

    public static boolean isPalindromeHave(String str){
        // Two Pointer approach
        int left = 0;
        int right = str.length() - 1;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // String str = "MAM";
        System.out.println(isPalindromeHave("honey"));
    }
}
