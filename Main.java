import java.text.ParseException;

public class Main {
public static void main( String[]args) throws ParseException {
	ReservationModel model = new ReservationModel();
	Reservationview view = new Reservationview();
	new ReservationController(model,view);
}
}
