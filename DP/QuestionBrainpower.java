public class QuestionBrainpower {
    public static long mostPoints(int[][] questions) {
        int n = questions.length;
        long ans =0;
        solve(0,ans,questions);
        return ans;
    }
}
