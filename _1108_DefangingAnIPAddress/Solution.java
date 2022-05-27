class Solution {
    public String defangIPaddr(String address) {
        String[] partsOfAddress = address.split("\\.");
        String result = "";
        for (int i = 0; i < partsOfAddress.length; i++) {
            if (i == partsOfAddress.length - 1) {
                result += partsOfAddress[i];
            }
            else {
                result += partsOfAddress[i] + "[.]";
            }
        }
        return result; 
    }
}