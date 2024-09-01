public class ValidIP {
    public String validIPAddress(String queryIP) {
        String[] v4arr = queryIP.split(".", 4);
        if (v4arr.length == 4) {
            for (String v : v4arr) {
                try {
                    if (v.length() == 0 || (v.startsWith("0") && v.length() > 1)) {
                        return "Neither";
                    }
                    int num = Integer.parseInt(v);
                    if (num < 0 || num > 255) {
                        return "Neither";
                    }
                } catch (NumberFormatException e) {
                    return "Neither";
                }
            }
        }
        String[] v6arr = queryIP.split(".", 8);

        return "Neither";
    }
}
