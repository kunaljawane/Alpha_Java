package Oracle;
//spiral matrix
public class twodarray {


    public static void print(int[][] arr)
    {
        int startRow=0;
        int endRow=arr.length-1;
        int startCol=0;
        int endCol=arr[0].length-1;

        while(startRow<=endRow && startCol<=endCol)
        {
            for(int j=startCol;j<=endCol;j++)
            {
                System.out.println(arr[startRow][j]);
            }

            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.println(arr[i][endCol]);
            }

            for(int j=endCol-1;j>=startCol;j--)
            {
                System.out.println(arr[endRow][j]);
            }

            for(int i=endRow-1;i>=startRow+1;i--)
            {
                System.out.println(arr[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }

    }
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 9},
            {4, 5, 7, 5},
            {6, 2, 7, 8},
            {7, 9, 2, 6}
        };

        print(arr);
    }

        
    }
    

