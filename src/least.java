import java.util.Scanner;
public class least {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and col: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] array5=new int[r][c];
        System.out.println("Enter the elements matrix 4: ");

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array5[i][j]=sc.nextInt();
            }
        }
        System.out.println(" the Matrix 5 is ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(array5[i][j]+" ");
            }
            System.out.println();
        }
        int min=array5[0][0];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(array5[i][j]<min)
                {
                    min=array5[i][j];
                }
            }
        }
        System.out.println("The minimum number of the array is: "+min);



    }
}

