import java.text.ParseException;

public class Main {
public static void main( String[]args) throws ParseException {
	ReservationModel model = new ReservationModel();
	Reservationview view = new Reservationview();
	MeetingRoomModel model2 = new MeetingRoomModel();
	new ReservationController(model,view,model2);
}
}
