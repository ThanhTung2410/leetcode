class Solution {
    public int numberOfMatches(int numberOfTeams) {
        int countMatches = 0;
        while(numberOfTeams != 1) {
            if (numberOfTeams % 2 == 0) {
                countMatches += numberOfTeams / 2;
                numberOfTeams /= 2;
            }
            else {
                countMatches += (numberOfTeams - 1) / 2;
                numberOfTeams = (numberOfTeams - 1) / 2 + 1;
            }
        }
        return countMatches;
    }
}