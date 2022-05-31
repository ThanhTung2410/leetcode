class Solution {
    public String toLowerCase(String s) {
        char[] charsOfS = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charsOfS.length; i++) {
            sb.append(Character.toLowerCase(charsOfS[i]));
        }
        return sb.toString();
    }
}