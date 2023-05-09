public class PetNeeds {
    private String petName;
    private int hunger;
    private int thirst;
    private int loneliness;
    private int bladder;
    private int exhaustion;
    private int dirtiness;

    public PetNeeds(String newPetName) {
        petName = newPetName;
        hunger = 1;
        thirst = 1;
        loneliness = 1;
        bladder = 1;
        exhaustion = 1;
        dirtiness = 1;
    }
    
    // Simulate the passage of time by degrading the pet's stats
    public void tick() {
        petName += 1;
        hunger += 1;
        thirst += 1;
        loneliness += 1;
        bladder += 1;
        exhaustion += 1;
        dirtiness += 1;
    }

    // Increment Stats
    public void changeHunger(int newHunger) {
        hunger += newHunger;
    }

    public void changeThirst(int newThirst) {
        thirst += newThirst;
    }

    public void changeLoneliness(int newLoneliness) {
        loneliness += newLoneliness;
    }

    public void changeExhaustion(int newExhaustion) {
        exhaustion += newExhaustion;
    }

    public void changeDirtiness(int newDirtiness) {
        dirtiness += newDirtiness;
    }

    // Setters
    public void setName(String newName) {
        this.petName = newName;
    }

    public void setThirst(int newThirst) {
        this.thirst = newThirst;
    }

    public void setLoneliness(int newLoneliness) {
        this.loneliness = newLoneliness;
    }

    public void setBladder(int newBladder) {
        this.bladder = newBladder;
    }

    public void setExhaustion(int newExhaustion) {
        this.exhaustion = newExhaustion;
    }

    public void setDirtiness(int newDirtiness) {
        this.dirtiness = newDirtiness;
    }

    // Getters
    public String getName() {
        return petName;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getLoneliness() {
        return loneliness;
    }

    public int getBladder() {
        return bladder;
    }

    public int getExhaustion() {
        return exhaustion;
    }

    public int getDirtiness() {
        return dirtiness;
    }
}
