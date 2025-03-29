import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;

public class ReservationController {
     public ReservationModel model;
     public Reservationview view;
	public ReservationController(ReservationModel model, Reservationview view) {
		this.model = model;
		this.view = view;
		view.addbutton1.addActionListener(new AddingReservationActionListener());
		
		view.professornameField.addKeyListener(new KeyAdapter() {
			 @Override
			    public void keyReleased(KeyEvent e) {
			        view.addbutton1.setEnabled(!view.professornameField.getText().trim().isEmpty());
			    
			 }
		});
	}
	public class professornameFieldListener implements ActionListener{

		
		@Override
		public void actionPerformed(ActionEvent e) {
		   String proffesor = view.professornameField.getText();
		   String date = view.getFormattedDate();
		   String duration = view.getSelectedDuration();
		  String  room = view.getSelectedMeetingRoom();
		   model.addReservation(new Reservation(proffesor, LocalDateTime.parse(date),Integer.parseInt(duration),new MeetingRoom(room, false)));
			view.Settable1Data(model.getReservations());
		}
		
	}
	public class AddingReservationActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
		
	}
	
}
