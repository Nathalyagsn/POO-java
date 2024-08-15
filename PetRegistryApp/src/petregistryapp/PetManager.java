import java.util.ArrayList;
import java.util.List;

public class PetManager {
    private List<Pet> pets;

    public PetManager() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }
}