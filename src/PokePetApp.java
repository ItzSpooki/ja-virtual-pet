import java.util.Scanner;

public class PokePetApp {

    public static void main(String[] arg) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\nEnter your Pet Name ");
        String name = input.nextLine();
        MyPokePetNeeds pet = new MyPokePetNeeds(name);
            if(name.length() > 7) {
                System.out.println("Rejected, your name is too long.");
            } 
            else if(name.length() < 3) {
                System.out.println("Rejected, your name is too short");
            } else {
                System.out.println("\n"+pet);
        }
    }
}
