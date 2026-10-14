import java.util.Scanner;
public class largest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and col: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] array4=new int[r][c];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array4[i][j]=sc.nextInt();
            }
        }
        System.out.println(" the Matrix 4 is ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(array4[i][j]+" ");
            }
            System.out.println();
        }
        int max=array4[0][0];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(array4[i][j]>max)
                {
                    max=array4[i][j];
                }
            }
        }
        System.out.println("The largest number of the array is: "+max);



    }
}
