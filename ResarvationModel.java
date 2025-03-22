import java.util.ArrayList;

public class ResarvationModel {
    ArrayList<Reservation> reservations=new ArrayList<>();
    public void addReservation(Reservation r) {
        for(Reservation rr : reservations) {
            if(r.getDate()==rr.getDate() && r.getRoom()==rr.getRoom()) {
                System.out.println("Reservation already exists");
            }
        }



    }
    public void DeleteReservation(Reservation r) {
        reservations.remove(r);
    }
    public void ModifyReservation(Reservation r,int code,String professor,int duration,MeetingRoom room) {
        r.setCode(code);
        r.setProfessor(professor);
        r.setDuration(duration);
        r.setRoom(room);
    }
    public void afficherReservation() {
        for(Reservation r : reservations) {
            System.out.println(r);
        }

    }

}
