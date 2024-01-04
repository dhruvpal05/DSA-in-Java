public class StringRec {
    public static void main(String[] args) {
        String str = "appedhdhapp";
        String ans = skinAppNotApple(str);
        System.out.println(ans);

    }

    static String stringwithoutA(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char ch = str.charAt(0);
        // String s=String.valueOf(ch);
        if (ch == 'a') {
            return stringwithoutA(str.substring(1));
        } else {
            return ch + stringwithoutA(str.substring(1));
        }
    }

    static String skinApple(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);

        if (str.startsWith("apple")) {
            return skinApple(str.substring(5));
        } else {
            return ch + skinApple(str.substring(1));
        }
    }

    static String skinAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app")){
            if (!str.startsWith("apple")) {
                return str.substring(3);
            }else{
                return str.charAt(0) + str.substring(1);
            }
        }else{
            return str.charAt(0) + str.substring(1);
        }
    }
}
