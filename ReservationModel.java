import java.util.ArrayList;

public class ReservationModel {
         private ArrayList <Reservation> reservations;
         
	public ReservationModel() {
			this.reservations = new ArrayList<Reservation>();
			}

	
	 public void addReservation(Reservation reservation) {
		 reservations.add(reservation);
	   }
	

}
