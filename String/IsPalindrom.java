public class IsPalindrom {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] array = s.toCharArray();
        StringBuilder original = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (Character.isLetterOrDigit(array[i])) {
                original.append(array[i]);
            }
        }
        StringBuilder rev = new StringBuilder(original).reverse();
        return original.toString().equals(rev.toString());
    }
}
