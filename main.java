
public class main {
public static void main(String[]args) {
	ReservationModel model = new ReservationModel();
	ReservationView view = new ReservationView();
	new ReservationController(model,view);
}
}
