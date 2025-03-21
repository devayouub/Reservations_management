
public class MeetingRoom {
    private String name;
    private boolean isEmpty;
	public MeetingRoom(String name) {
		this.name = name;
		this.isEmpty = true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEmpty() {
		return isEmpty;
	}
	public void setEmpty() {
		this.isEmpty = true;
	}

}
