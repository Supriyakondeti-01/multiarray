import java.util.Scanner;
public class multiplication {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows and columns: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] array7=new int[r][c];
        int[][] array8=new int[r][c];
        int[][] array9=new int[r][c];
        System.out.println("Enter the matrix1: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array7[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(array7[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the matrix2: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array8[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(array8[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("multiplication of the matrix1 & matrix2: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array9[0][0]=array7[0][0]*array8[0][0]+array7[0][1]*array8[1][0];
                array9[0][1]=array7[0][0]*array8[0][1]+array7[0][1]*array8[1][1];
                array9[1][0]=array7[1][0]*array8[0][0]+array7[1][1]*array8[1][0];
                array9[1][1]=array7[1][0]*array8[0][1]+array7[1][1]*array8[1][1];

            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(array9[i][j]+" ");
            }
            System.out.println();
        }
    }

}
