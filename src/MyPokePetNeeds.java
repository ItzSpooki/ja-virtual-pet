public class MyPokePetNeeds {  
    private String name;
    private String breed;
    private int thirst;
    private int hunger;
    private int lonliness;
    private int dirtiness;
    private int bladder;
    private int tiredness;

    public MyPokePetNeeds(String name){
        this.name = name;
    }

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void setBredd(String newBreed){
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

    public void setLonliness(int newLonliness){
        thirst = newLonliness;
    }
    public int getLonliness(){
        return lonliness;
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
}