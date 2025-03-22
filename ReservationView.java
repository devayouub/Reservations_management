import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ReservationView extends JFrame {
    JTextField nameField=new JTextField();
    JTextField durationField=new JTextField();
    JTextField DayField=new JTextField();
    JTextField MonthField=new JTextField();
    JTextField YearField=new JTextField();
    JTextField TimeField=new JTextField();
    JButton AddButton=new JButton("Add");
    JButton DeletButton=new JButton("Delete");
    JButton ModifierButton=new JButton("Modifier");
    JButton showButton=new JButton("affichier");
    DefaultTableModel model = new DefaultTableModel(new String[]{"Name", "Day","Month","Year","Time","Duration","ID"}, 0);
    JTable table = new JTable(model);

    public ReservationView() {
        this.setTitle("Reservation View");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        JPanel panelinformation=new JPanel();
        panelinformation.add(new JLabel("Name"));
        panelinformation.add(nameField);
        panelinformation.add(new JLabel("Day"));
        panelinformation.add(DayField);
        panelinformation.add(new JLabel("Month"));
        panelinformation.add(MonthField);
        panelinformation.add(new JLabel("Year"));
        panelinformation.add(YearField);
        panelinformation.add(new JLabel("Time"));
        panelinformation.add(TimeField);
        panelinformation.add(new JLabel("Durition"));
        panelinformation.add(durationField);
        JPanel panelButton=new JPanel();
        panelButton.add(AddButton);
        panelButton.add(DeletButton);
        panelButton.add(ModifierButton);
        panelButton.add(showButton);
        this.add(table, BorderLayout.CENTER);
        this.add(panelinformation, BorderLayout.NORTH);
        this.add(panelButton, BorderLayout.SOUTH);

    }
}
