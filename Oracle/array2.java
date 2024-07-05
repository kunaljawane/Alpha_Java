package Oracle;

public class array2 {

    public static void res(int[] marks)
    {
        int n=marks.length;

        for(int i=0;i<n;i++)
        {
            if(marks[i]>=35)
            {
                System.out.println("Roll No: "+(i+1)+" Pass");
            }
            else{
                System.out.println("Roll No: "+(i+1)+" Fail");
             }
        }

    }

    public static void main(String[] args) {
        int marks[]={97,13,56,86,14,05,19,45};

        res(marks);
    }
    
}
