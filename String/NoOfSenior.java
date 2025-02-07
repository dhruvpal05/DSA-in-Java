// package String;

public class NoOfSenior {
    // bad code 
    public int countSeniors1(String[] details) {
        int ans = 0;
        for(int i = 0; i < details.length; i++){
            int tensPlace = Character.getNumericValue(details[i].charAt(11));
            int onesPlace = Character.getNumericValue(details[i].charAt(12));
            if (tensPlace > 6 || (tensPlace == 6 && onesPlace > 0)) {
                ans++;
            }
        }
        return ans;
    }

    // better code 
    public int countSeniors(String[] details) {
        int ans = 0;
        for (String string : details) {
            if (Character.getNumericValue(string.charAt(11)) > 6) {
                ans++;
            }else if (Character.getNumericValue(string.charAt(12)) > 0 && Character.getNumericValue(string.charAt(11)) == 6) {
                ans++;
            }
        }
        return ans;
    }
}
