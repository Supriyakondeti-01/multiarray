import java.util.Scanner;
public class reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and col: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] array6=new int[r][c];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array6[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(array6[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("Reverse of the matrix: ");
//        for(int j=0;j<r;j++)
//        {
//            for(int i=0;i<r;i++)
//            {
//                array6[j][i]=sc.nextInt();
//            }
//        }
        for(int i=r-1;i>=0;i--)
        {
            for(int j=c-1;j>=0;j--)
            {
                System.out.print(array6[i][j]+" ");
            }
            System.out.println();
        }
//        for(int i=0;i<r;i++)
//        {
//            for(int j=0;j<c;j++)
//            {
//            }
//        }
//
    }
}
