import java.util.Scanner;
//Sc7SFnwW - password for accenture
import javax.lang.model.element.Name;

public class PokePetApp {

    public static boolean nameCheck(String name){

        int length = name.length();
        if (length >= 3 && length <= 10){
            return false;
        }
        System.out.println("Rejected, your pets name is too long/too short (min 3 characters and max 10)");
        return true;
    }
    public static boolean askBreed(int breed){
        if (breed >= 1 && breed <= 3){
            return false;
        }
        System.out.println("Please enter a valid Pokemon");
        return true;
    }

    public static void main(String[] arg) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter your Pet Name: ");
        String name = input.nextLine();
        while(nameCheck(name)) {
            System.out.print("Enter your Pet Name: ");
            name = input.nextLine();
        }
        MyPokePetNeeds pet = new MyPokePetNeeds(name);
        // do {
        //     System.out.println("\n\nEnter your Pet Name ");
        //     String name = input.nextLine();
        //     MyPokePetNeeds pet = new MyPokePetNeeds(name);
        //         if(name.length() > 10) {
        //             System.out.println("Rejected, your pets name is too long.");
        //             acceptName = false;
        //         } 
        //         else if(name.length() < 3) {
        //             System.out.println("Rejected, your pets name is too short");
        //             acceptName = false;
        //         } else {
        //             System.out.println("\n"+name);
        //             acceptName = true;
        //         }
        //} while(acceptName == false);
        
        System.out.println("Greetings, " + pet.getName() + "! Welcome to pokepet! Here you can raise your very own pet!" 
            + " Choose your pet of the 3 options we give you and you can watch it grow to love you as its owner."
            + " Once enough favorability is reached. The pet will evolve and gain unique ways to play with you." + System.lineSeparator() );

        System.out.println("What type of pokemon would you like to raise?");
        System.out.println("1. Bulbasaur");
        System.out.println("2. Charmander");
        System.out.println("3. Squirtle");
        int breed = input.nextInt();
        while (askBreed(breed)){
            System.out.println("What type of pokemon would you like to raise?");
            System.out.println("1. Bulbasaur");
            System.out.println("2. Charmander");
            System.out.println("3. Squirtle");
            breed = input.nextInt();
        }
        if (breed == 1){
            pet.setBreed("Bulbasaur"); 
        }
        else if(breed == 2){
            pet.setBreed("Charmander"); 
        }
        else if(breed == 3){
            pet.setBreed("Squirtle"); 
        }
        System.out.println("Your choice is: " + breed + ", " + pet.getBreed());

    }
}
