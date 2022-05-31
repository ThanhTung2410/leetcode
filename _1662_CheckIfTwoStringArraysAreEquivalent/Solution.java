class Solution {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String word : word1) {
            sb1.append(word);
        }

        StringBuilder sb2 = new StringBuilder();
        for (String word : word2) {
            sb2.append(word);
        }

        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }
        return false;
    }
}