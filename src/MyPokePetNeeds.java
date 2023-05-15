public class MyPokePetNeeds {  
    private String name;
    private String breed;
    private int thirst;
    private int hunger;
    private int loneliness;
    private int dirtiness;
    private int bladder;
    private int tiredness;
    private int experience;

    public MyPokePetNeeds(String newName){
        name = newName;
        breed = "unknown";
        hunger = 1;
        thirst = 1;
        loneliness = 1;
        dirtiness = 1;
        bladder = 1;
        tiredness = 1;
        experience = 0;
    }

    //Getter/Setter pairs
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void setBreed(String newBreed){
        breed = newBreed;
    }
    public String getBreed(){
        return breed;
    }

    public void setThirst(int newThirst){
        thirst = newThirst;
    }
    public int getThirst(){
        return thirst;
    }

    public void setHunger(int newHunger){
        hunger = newHunger;
    }
    public int getHunger(){
        return hunger;
    }

    public void setLoneliness(int newLoneliness){
        loneliness = newLoneliness;
    }
    public int getLoneliness(){
        return loneliness;
    }

    public void setDirtiness(int newDirtiness){
        dirtiness = newDirtiness;
    }
    public int getDirtiness(){
        return dirtiness;
    }

    public void setBladder(int newBladder){
        bladder = newBladder;
    }
    public int getBladder(){
        return bladder;
    }

    public void setTiredness(int newTiredness){
        tiredness = newTiredness;
    }
    public int getTiredness(){
        return tiredness;
    }

    public void setExperience(int newExperience){
        experience = newExperience;
    }
    public int getExperience(){
        return experience;
    }

    public void tick() {
        hunger =+ 1;
        thirst =+ 1;
        loneliness =+ 1;
        dirtiness =+ 1;
        bladder =+ 1;
        tiredness =+ 1;
        experience =+ 1;
    }

    // public String toString() {
    //     String.format("Name: $s\n Breed: %d\n Hunger: d\n Thirst: %d\n Lonliness: %d\n Bladder: %d\n Tiredness: %d\n Dirtiness: %d\n Experience: %d\n", 
    //     name, breed, hunger, thirst, lonliness, bladder, tiredness, dirtiness, ex);
    //     String s = "Name: '" + name;
    //     return s;
    // }
}