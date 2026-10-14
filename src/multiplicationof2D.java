import java.util.Scanner;
public class multiplicationof2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and col");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] array10 = new int[r][c];
        int[][] array11 = new int[r][c];
        int[][] array12 = new int[r][c];
        System.out.println("Enter the first matrix:");
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                array10[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.println(array10[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the second matrix:");
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                array11[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                System.out.print(array11[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Multiplication of 1 & 2  matrix:");

        for (int i=0;i<c;i++)
        {
            for (int j=0;j<r;j++)
            {
                for (int k=0;k<c;k++)
                {
                    array12[i][j]+=array10[i][k]*array11[k][j];

                }
            }
        }

        for (int i=0;i<c;i++)
        {
            for (int j=0;j<r;j++)
            {
                System.out.print(array12[i][j] + " ");
            }
            System.out.println();
        }
    }
}


