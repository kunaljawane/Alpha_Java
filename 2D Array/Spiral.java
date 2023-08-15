public class Spiral {

    public static void print(int matrix[][])
    {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix.length-1;

        while(startRow<=endRow && startCol<=endCol)
        {
            //top-row is fixed as startRow
            for(int j=startCol;j<endCol-1;j++)
            {
                System.out.print(matrix[startRow][j]+" ");
            }

            //right-column is fixed as endColumn
            for(int i=startRow+1;i<endCol-1;i++)
            {
                System.out.println(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1;j>=startRow+1;j--)
            {
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1;i>startRow+1;i--)
            {
                System.out.print(matrix[i][startCol]);
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        print(matrix);
    }
    
}
