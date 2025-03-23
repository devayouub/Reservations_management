import javax.swing.*;
import java.awt.*;

public class ReservationView extends JFrame {
    JTextField professorField, dateField, durationField;
    JButton addButton;
    JTextArea messageArea;

    public ReservationView() {
        setTitle("Gestion des Réservations");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Nom de l'enseignant :"));
        professorField = new JTextField();
        add(professorField);

        add(new JLabel("Date (yyyy-MM-dd HH:mm):"));
        dateField = new JTextField();
        add(dateField);

        add(new JLabel("Durée (heures) :"));
        durationField = new JTextField();
        add(durationField);

        addButton = new JButton("Ajouter Réservation");
        add(addButton);

        messageArea = new JTextArea();
        messageArea.setEditable(false);
        add(messageArea);

        setVisible(true);
    }

    public String getProfessorInput() {
        return professorField.getText();
    }

    public String getDateInput() {
        return dateField.getText();
    }

    public String getDurationInput() {
        return durationField.getText();
    }

    public void showMessage(String message) {
        messageArea.setText(message);
    }

    public void clearFields() {
        professorField.setText("");
        dateField.setText("");
        durationField.setText("");
    }
}
