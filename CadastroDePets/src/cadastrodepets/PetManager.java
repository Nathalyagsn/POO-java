package cadastrodepets;

import java.util.ArrayList;
import java.util.List;

public class PetManager {
     private List<Pets> pets;

    public PetManager() {
        pets = new ArrayList<>();
    }

    public void addPet(Pets pet) {
        pets.add(pet);
    }

    public List<Pets> getPets() {
        return pets;
    }
}
