import java.util.ArrayList;

public class ReservationModel {
         private ArrayList <Reservation> reservations;
private int code=1;
	public ReservationModel() {
			this.reservations = new ArrayList<>();
			}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	 
	 public void addReservation(Reservation reservation) {
		 reservations.add(reservation);
	   }
	   public void removeReservation(int index) {
		   reservations.remove(index);
	   }
	   public void updateReservation(int index,Reservation reservation) {
		   reservations.set(index, reservation);
	   }
	   public boolean collision(Reservation newreservation) {
		    for (Reservation rev : reservations) {
		        if (rev.conflits(newreservation)) return true;
		    }
		    return false;
		}
public void codeafeecter() {
code++;
	
}

}