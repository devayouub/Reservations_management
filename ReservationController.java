import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservationController {
     public ReservationModel model;
     public ReservationView view;
	public ReservationController(ReservationModel model, ReservationView view) {
		this.model = model;
		this.view = view;
		view.addButton.addActionListener(new AddingActionListener());
	}
	public class AddingActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("to be continued");
			
		}
		
		
	}
}
