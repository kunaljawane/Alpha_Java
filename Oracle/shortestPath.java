package Oracle;

public class shortestPath {
    public static void pathLength(String s)
    {
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='N')
            {
                y++;
            }
            if(s.charAt(i)=='S')
            {
                y--;
            }
            if(s.charAt(i)=='E')
            {
                x++;
            }
            if(s.charAt(i)=='W')
            {
                x--;
            }
            
        }

        double dist=0;
        dist=Math.sqrt(((x*x)+(y*y)));
        System.out.println("The shortest path is:"+dist);
    }

    public static void main(String[] args) {
        String s="WNEENESENNN";
        pathLength(s);
    }
    
}
