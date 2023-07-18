public class ShotestPath {

    public static float print(String path)
    {
        int x=0;
        int y=0;

        int n=path.length();

        for(int i=0;i<n;i++)
        {
            char dir=path.charAt(i);

            if(dir=='E')
            {
                x++;
            }
            else if(dir=='W')
            {
                x--;
            }
            else if(dir=='N')
            {
                y++;
            }
            else if(dir=='S')
            {
                y--;
            }
        }

        return (float)Math.sqrt(x*x+y*y);

    }

    public static void main(String args[])
    {
        String path="WNEENESENNN";
        System.out.println(print(path));
    }
    
}
