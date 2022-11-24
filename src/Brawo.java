import java.util.Scanner;

public class Brawo {
    public static void main(String[] args) {
        System.out.println("Aplikacja Brawo");
        System.out.println("Please enter your first name below:");
        Scanner scanner=new Scanner(System.in);
        String firstName=scanner.nextLine();

        for (int i=0; i<5; i++){
            System.out.println("BRAWO "+firstName+" !!!");
        }
    }
}
