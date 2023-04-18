import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int select;

        Scanner input = new Scanner(System.in);
        System.out.println("Greetings, young one... welcome to the world. By what name shall your friends call you?");
        String petName = input.nextLine();

        PetNeeds pet = new PetNeeds(petName);
        
        birthMenu(pet);
    }

    public static void birthMenu (PetNeeds newPet) {
        System.out.println(
            "It's a pleasure to meet you, " + newPet.getName() + "! I hope you will care for yourself during your time in this place...\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" 
        );
    }

    public static void gameLoop (PetNeeds newPet) {
        int userSelection = -1; 
        Scanner input2 = new Scanner(System.in);

        while (userSelection != 0) {
            System.out.println(
                "What would you like to do?" +
                "1. Feed Pet" +
                "2. Water Pet" +
                "3. Play With Pet" +
                "4. Take Pet to Bathroom" +
                "5. Put Pet to Bed" +
                "6. Clean Pet" +
                "0. Exit");
            newPet.tick();
            userSelection = input2.nextInt();
            // switch (userSelection) {
            //     case 1: manageHunger();
            //             break;
            //     case 2: drinkPet();   
            //}
        }
        
    }
}
