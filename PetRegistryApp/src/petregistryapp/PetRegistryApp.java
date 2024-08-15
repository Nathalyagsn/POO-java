import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetRegistryApp {
    private PetManager petManager;

    public PetRegistryApp() {
        petManager = new PetManager();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Pet Registry");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();
        JLabel breedLabel = new JLabel("Breed:");
        JTextField breedField = new JTextField();

        JButton addButton = new JButton("Add Pet");
        JButton showButton = new JButton("Show Pets");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(breedLabel);
        panel.add(breedField);
        panel.add(addButton);
        panel.add(showButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                String breed = breedField.getText();
                Pet pet = new Pet(name, age, breed);
                petManager.addPet(pet);
                JOptionPane.showMessageDialog(frame, "Pet added successfully!");
                nameField.setText("");
                ageField.setText("");
                breedField.setText("");
            }
        });

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Pet> pets = petManager.getPets();
                StringBuilder sb = new StringBuilder();
                for (Pet pet : pets) {
                    sb.append(pet.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(frame, sb.toString());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PetRegistryApp());
    }
}