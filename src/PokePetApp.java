import java.sql.SQLPermission;
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
        int day = 0;
        int userSelection = 1;
        int abilitySelection = 1;
        System.out.println("Pokepet");
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

        while (userSelection != 0){
            System.out.println("\nDay #" + day);

            System.out.println("\nStats:");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "Hunger: " + pet.getHunger(), "Thirst: " + pet.getThirst(), "Loneliness: " + pet.getLoneliness(), "Bladder: " + pet.getBladder(), "Tiredness: " + pet.getTiredness(), "Dirtiness: " + pet.getDirtiness(), "Exp: " + pet.getExperience());

            if(breed == 1 && pet.getExperience() == 40){
                System.out.println("\nYour " + pet.getBreed() + " is evolving!");
                pet.setBreed("Ivysaur");
                System.out.println("Your Bulbasaur evolved into an " + pet.getBreed() + "!");
            }
            if(breed == 2 && pet.getExperience() == 40){
                System.out.println("\nYour " + pet.getBreed() + " is evolving!");
                pet.setBreed("Charmeleon");
                System.out.println("Your Charmander evolved into a " + pet.getBreed() + "!");
            }
            if(breed == 3 && pet.getExperience() == 40){
                System.out.println("\nYour " + pet.getBreed() + " is evolving!");
                pet.setBreed("Wartortle");
                System.out.println("Your Squirtle evolved into a " + pet.getBreed() + "!");
            }
            if(breed == 1 && pet.getExperience() == 120){
                System.out.println("\nYour " + pet.getBreed() + " is evolving!");
                pet.setBreed("Venosaur");
                System.out.println("Your Ivysaur evolved into a " + pet.getBreed() + "!");
            }
            if(breed == 2 && pet.getExperience() == 120){
                System.out.println("\nYour " + pet.getBreed() + " is evolving!");
                pet.setBreed("Charizard");
                System.out.println("Your Charmeleon evolved into a " + pet.getBreed() + "!");
            }
            if(breed == 3 && pet.getExperience() == 120){
                System.out.println("\nYour " + pet.getBreed() + " is evolving!");
                pet.setBreed("Blastoise");
                System.out.println("Your Wartortle evolved into a " + pet.getBreed() + "!");
            }

            System.out.println("\nWhat would you like " + pet.getBreed() + " to do today?");
            System.out.println(
                "1. Eat" +
                "\n2. Drink Water" +
                "\n3. Play" +
                "\n4. Use da Restroon" +
                "\n5. Sleep" +
                "\n6. Bathe" +
                "\n7. BATTLE" +
                "\n0. Exit");
            userSelection = input.nextInt();;
            
            if (userSelection == 1)
            {
                pet.setHunger(pet.getHunger() - 10);
            }
            if (userSelection == 2)
            {
                pet.setThirst(pet.getThirst() - 10);
                pet.setBladder(pet.getBladder() + 6);
            }
            if (userSelection == 3)
            {
                pet.setLoneliness(pet.getLoneliness() - 10);
                pet.setDirtiness(pet.getDirtiness() + 7);
            }
            if (userSelection == 4)
            {
                pet.setBladder(pet.getBladder() - 10);
                pet.setThirst(pet.getThirst() + 3);
            }
            if (userSelection == 5)
            {
                pet.setTiredness(pet.getTiredness() - 10);
                pet.setHunger(pet.getHunger() + 5);
                pet.setThirst(pet.getThirst() + 5);
            }
            if (userSelection == 6)
            {
                pet.setDirtiness(pet.getDirtiness() - 13);
            }
            if (userSelection == 7)
            {
                if(pet.getExperience() < 40){
                    pet.setExperience(pet.getExperience() + 5);
                    pet.setDirtiness(pet.getExperience() + 8);
                }
                if(breed == 1){
                    if(pet.getExperience() >=40 && pet.getExperience() < 120){

                    } else if(pet.getExperience() >= 120){

                    }
                }
                if(breed == 2){
                if(pet.getExperience() >=40 && pet.getExperience() < 120){

                    } else if(pet.getExperience() >= 120){
                        
                    }
                }
                if(breed == 3){
                    if(pet.getExperience() >=40 && pet.getExperience() < 120){
                        System.out.println("Which ability would you like to train?");
                        System.out.println("1. Tackle" + "/n2. Water Gun");
                        abilitySelection = input.nextInt();
                        if(abilitySelection == 1){
                            pet.setDirtiness(pet.getDirtiness() + 10);
                            pet.setTiredness(pet.getTiredness() + 7);
                        }
                        else if(abilitySelection == 2){
                            pet.setDirtiness(pet.getDirtiness() + 3);
                            pet.setTiredness(pet.getTiredness() + 7);
                        }
                    } else if(pet.getExperience() >= 120){
                        System.out.println("Which ability would you like to train?");
                        System.out.println("1. Skull Bash" + "/n2. Iron Defense" + "\n3. Hydro Pump" + "\n4. Aqua Tail");
                        abilitySelection = input.nextInt();
                        if(abilitySelection == 1){
                            pet.setDirtiness(pet.getDirtiness() + 10);
                            pet.setTiredness(pet.getTiredness() + 10);
                        }
                        else if(abilitySelection == 2){
                            pet.setDirtiness(pet.getDirtiness() + 1);
                            pet.setTiredness(pet.getTiredness() + 6);
                        }
                        else if(abilitySelection == 3){
                            pet.setTiredness(pet.getTiredness() + 13);
                        }
                        else if(abilitySelection == 4){
                            pet.setDirtiness(pet.getDirtiness() + 4);
                            pet.setTiredness(pet.getTiredness() + 9);
                        }
                    }
                }
            }
            
            pet.setHunger(pet.getHunger() + 1);
            pet.setThirst(pet.getThirst() + 1);
            pet.setLoneliness(pet.getLoneliness() + 1);
            pet.setBladder(pet.getBladder() + 1);
            pet.setTiredness(pet.getTiredness() + 1);
            pet.setDirtiness(pet.getDirtiness() + 1);

            day++;
        }
        System.out.println("\nHave a good day!\n");

        
    }
    
}
