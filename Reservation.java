import java.time.LocalDateTime;

public class Reservation {
    private int code=1; 
	private String professor;
    private LocalDateTime date;
    private  int duration;
    private MeetingRoom room;
	public Reservation(String professor, LocalDateTime date, int duration, MeetingRoom meetingroom) {
		this.code = this.code++;
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
