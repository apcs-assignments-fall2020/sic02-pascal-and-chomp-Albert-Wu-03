/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        int[][] arr = new int[n][n];
        arr[0][0]=1;
        for(int i = 1; i < n; i++){
            arr[i][0]=1;
            arr[i][i]=1;
        }
        for(int i = 2; i < n; i++){
            for(int j = 1; j < i; j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        return arr;
    }
}
