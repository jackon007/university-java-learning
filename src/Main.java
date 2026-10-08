import java.util.Scanner;

class Main{
    public static void main(String[] args){
        System.out.println("Hello World");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the boundary ");
        int boundary= scanner.nextInt();
        for (int i=0;i<boundary;i++){
            System.out.println(i+1+" : "+i);
        }
    }
}