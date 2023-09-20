public class Arrays
{
    public static void main(String args[])
    {
        int[][] scores = new int[3][];
        scores[0] = new int[3];
        scores[1] = new int[4];
        scores[2] = new int[3];
        
        for(int i = 0; i < scores.length; i++)
        {
            for(int j = 0; j < scores.length; j++)
            {
                scores[i][j] = i + j;
                System.out.print(scores[i][j] + " ");
            }
        }
    }
}