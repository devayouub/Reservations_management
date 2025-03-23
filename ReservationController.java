import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReservationController {
    public ReservationModel model;
    public ReservationView view;

    public ReservationController(ReservationModel model, ReservationView view) {
        this.model = model;
        this.view = view;
        view.addButton.addActionListener(new AddingActionListener());
    }

    public class AddingActionListener implements ActionListener {
        private static final int code = 0;

		@Override
        public void actionPerformed(ActionEvent e) {
            try {
                String professor = view.getProfessorInput();
                int duration = Integer.parseInt(view.getDurationInput());
                String dateStr = view.getDateInput();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                LocalDateTime date = LocalDateTime.parse(dateStr, formatter);

               
                Reservation reservation = new Reservation(code,professor, date, duration);

                
                if (model.collision(reservation)) {
                    view.showMessage(" il ya une collision");
                } else {
                    model.addReservation(reservation);
                    
                }

            } catch (Exception k) {
                view.showMessage(k.getMessage());
            }
        }
    }
}
