class Solution {

    private int count_vowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }

    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, (s.length()) / 2);
        String b = s.substring(s.length() / 2);

        int number_vowels_of_a = count_vowels(a);
        int number_vowels_of_b = count_vowels(b);

        if (number_vowels_of_a == number_vowels_of_b) {
            return true;
        }
        return false;
    }
}