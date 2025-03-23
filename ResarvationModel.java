import java.util.ArrayList;

public class ReservationModel {
   private ArrayList<Reservation> reservations;
     public ReservationModel{
        this.reservations = new ArrayList<>();
     }
    public void addReservation(Reservation reservation) {
        for(Reservation temporaryReservation : this.reservations) {
            if(reservation.getDate()==temporaryReservation.getDate() && reservation.getRoom()==temporaryReservation.getRoom()) {
                System.out.println("MeetingRoom occupied");
            }
        }


 
    }
   public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	   public void removeReservation(int index) {
		   reservations.remove(index);
	   }
	   public void updateReservation(int index,Reservation reservation) {
		   reservations.set(index, reservation);
	   }

    
    }

}
