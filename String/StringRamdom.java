import java.text.DecimalFormat;
import java.util.Random;

public class StringRamdom {
    public static void main(String[] args) {
        // Random random = new Random();
        // System.out.println((char)(97+(26*random.nextFloat())));
        // System.out.println(randomString(35));

        DecimalFormat df = new DecimalFormat("0.00");
        float f = 879.78234f;
        System.out.println(df.format(f));

    }

    public static String randomString(int n){
        Random random = new Random();
        // System.out.println((char)(97+(26*random.nextFloat())));
        StringBuilder sb = new StringBuilder();
        while (n-->0) {
            sb.append((char)(97+(26*random.nextFloat())));
        }
        return sb.toString();
    }
}
