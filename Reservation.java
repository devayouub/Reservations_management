import java.time.LocalDateTime;

public class Reservation {
    private static int code=1; 
	private int ReservationCode;
    private String professor;
	
    private LocalDateTime date;
    private  String duration;
    private MeetingRoom room;
	public MeetingRoom getRoom() {
		return room;
	}
	public void setRoom(MeetingRoom room) {
		this.room = room;
	}
	public Reservation(String professor, LocalDateTime date, String duration, MeetingRoom meetingroom) {
		this.ReservationCode = this.code++;
		this.professor = professor;
		this.date = date;
		this.duration = duration;
	    room = meetingroom;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

}
