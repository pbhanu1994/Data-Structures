import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a[]= new int[5],x;
        System.out.println("Enter the 5 elements into the array:");

        for (int i = 0; i < 5; i ++){
             a[i] = in.nextInt();
        }

        System.out.println("Enter the number to find:");
        x = in.nextInt();

        for(int i=0;i<5;i++){
            if (x == a[i]){
                int aplus = i+1;
                System.out.println(x+"is in "+aplus+" position");
            }
        }
    }
}
