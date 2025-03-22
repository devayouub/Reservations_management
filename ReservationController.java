import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ReservationController {
     public ReservationModel model;
     public ReservationView view;
	public ReservationController(ReservationModel model, ReservationView view) {
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
		   
		   
			
		}
		
	}
	public class AddingReservationActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
		
	}
}
