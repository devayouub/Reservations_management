import java.util.ArrayList;

public class ReservationModel {
    ArrayList<Reservation> reservations;
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
    public void DeleteReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    
    }

}
