
public class MeetingRoom {
    private String name;
    private boolean isEmpty;
    
	public MeetingRoom(String name, boolean isEmpty) {
		super();
		this.name = name;
		this.isEmpty = isEmpty;
	}
	public MeetingRoom(String name) {
		if(!name.matches("^[A-D]-\\d{2}$")) {
		  throw new IllegalArgumentException("no available room with that name");	
		}
		this.name = name;
		this.isEmpty = true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(!name.matches("^[A-D]\\d{2}$")) {
			  throw new IllegalArgumentException("no available room with that name");	
			}
		this.name = name;
	}
	public boolean isEmpty() {
		return isEmpty;
	}
	public void setEmpty() {
		this.isEmpty = true;
	}
}
