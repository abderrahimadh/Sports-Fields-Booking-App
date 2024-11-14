package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ReservationPanel extends JPanel {
    private JComboBox<String> sportComboBox;
    private JComboBox<String> terrainComboBox;
    private JComboBox<String> timeComboBox;
    private JButton reserveButton;
    private JTextArea outputArea;

    public ReservationPanel() {
        setLayout(new BorderLayout());

        // Create components
        sportComboBox = new JComboBox<>(new String[] { "Football", "Basketball", "Volleyball" });
        terrainComboBox = new JComboBox<>();
        timeComboBox = new JComboBox<>(generateTimeSlots());
        reserveButton = new JButton("Réserver");
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        // Add listeners
        sportComboBox.addActionListener(new SportSelectionListener());
        reserveButton.addActionListener(new ReserveButtonListener());

        // Arrange components in the panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Sport:"));
        inputPanel.add(sportComboBox);
        inputPanel.add(new JLabel("Terrain:"));
        inputPanel.add(terrainComboBox);
        inputPanel.add(new JLabel("Heure:"));
        inputPanel.add(timeComboBox);
        inputPanel.add(new JLabel(""));
        inputPanel.add(reserveButton);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
    }

    private String[] generateTimeSlots() {
        String[] times = new String[13];
        for (int i = 0; i <= 12; i++) {
            times[i] = String.format("%02d:00", i + 8);
        }
        return times;
    }

    private class SportSelectionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            terrainComboBox.removeAllItems();
            String selectedSport = (String) sportComboBox.getSelectedItem();
            switch (selectedSport) {
                case "Football":
                    terrainComboBox.addItem("Herbe synthétique");
                    terrainComboBox.addItem("Herbe naturelle");
                    break;
                case "Basketball":
                    terrainComboBox.addItem("Terrain A");
                    terrainComboBox.addItem("Terrain B");
                    break;
                case "Volleyball":
                    terrainComboBox.addItem("Normal");
                    terrainComboBox.addItem("Beach");
                    break;
            }
        }
    }

    private class ReserveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String sport = (String) sportComboBox.getSelectedItem();
            String terrain = (String) terrainComboBox.getSelectedItem();
            String time = (String) timeComboBox.getSelectedItem();

            if (sport != null && terrain != null && time != null) {
                outputArea.append(
                        String.format("Réservation: Sport - %s, Terrain - %s, Heure - %s\n", sport, terrain, time));
                // Here you would add the reservation logic similar to the one in your
                // GestionTerrains class
            } else {
                JOptionPane.showMessageDialog(ReservationPanel.this, "Veuillez remplir tous les champs", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
