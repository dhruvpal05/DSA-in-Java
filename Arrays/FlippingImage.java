package Arrays;

public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length/2; j++) {
                ans[i][j] = image[i][image.length - 1 - j];
                ans[image[i].length - i - 1][image[i].length - 1 - j] =  image[image[i].length - i - 1][j];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if(ans[i][j] == 0){
                    ans[i][j] = 1;
                }else{
                    ans[i][j] = 0;
                }
            }
        }
        return ans;
    }
}
