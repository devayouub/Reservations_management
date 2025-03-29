import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReservationController {
     public ReservationModel model;
     public Reservationview view;
     public MeetingRoomModel model2;
	public ReservationController(ReservationModel model, Reservationview view,MeetingRoomModel model2) {
		this.model = model;
		this.view = view;
		this.model2 = model2;
		view.addbutton1.addActionListener(new AddingReservationActionListener());
		view.addbutton2.addActionListener(new AddRoomActionListener());
		view.deletebutton1.addActionListener(new DeletebuttonActionListener());
		view.deletebutton2.addActionListener(new Deletebutton2ActionListener());
		view.professornameField.addKeyListener(new KeyAdapter() {
			 @Override
			    public void keyReleased(KeyEvent e) {
			        view.addbutton1.setEnabled(!view.professornameField.getText().trim().isEmpty());
			    
			 }
		});
	}
	public class AddingReservationActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		   String proffesor = view.professornameField.getText();
		   String input = view.getFormattedDate().getText();

	        // Convert input string to LocalDateTime
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	        LocalDateTime dateTime = LocalDateTime.parse(input, formatter);
		   String duration = view.getSelectedDuration();
		  String  room = view.getSelectedMeetingRoom();
		   model.addReservation(new Reservation(proffesor,dateTime,duration,new MeetingRoom(room, false)));
			view.Settable1Data(model.getReservations());
			model2.removemeetingRoom(view.getSelectedMeetingRoom1());
			view.Settable2Data(model2.getMeetingRooms());
		}
		
		
	}
	public class AddRoomActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String name = view.getFormattedRoomName();
			model2.addmeetingRoom(new MeetingRoom(name));
			view.Settable2Data(model2.getMeetingRooms());
		}
		
		
		
	}
	
	public class DeletebuttonActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				int selected = view.MeetingRoomsTable.getSelectedRow();
				if(selected!=-1) {
					model.removeReservation(selected);
					view.Settable1Data(model.getReservations());
					view.ClearFields();
					
				}
			
		}
	}
		public class Deletebutton2ActionListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					int selected = view.MeetingRoomsTable.getSelectedRow();
					if(selected!=-1) {
						model2.removemeetingRoom(selected);
						view.Settable2Data(model2.getMeetingRooms());
						view.ClearFields();
						
					}
				
			}
		
		
		
	}
}
