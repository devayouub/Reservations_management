import java.util.ArrayList;

public class MeetingRoomModel {
	private ArrayList <MeetingRoom> MeetingRooms;
	
	public MeetingRoomModel() {
		MeetingRooms = new ArrayList<MeetingRoom>();
	}
	public ArrayList<MeetingRoom> getMeetingRooms() {
		return MeetingRooms;
	}

	public void setMeetingRooms(ArrayList<MeetingRoom> meetingRooms) {
		MeetingRooms = meetingRooms;
	}
	public void addmeetingRoom(MeetingRoom room) {
		MeetingRooms.add(room);
	   }
	   public void removemeetingRoom(int index) {
		   MeetingRooms.remove(index);
	   }
	   public void updatemeetingRoom(int index,MeetingRoom room) {
		   MeetingRooms.set(index, room);
	   }
	   public MeetingRoom getFirstEmptyRoom() {
		   for(MeetingRoom Temporaryroom : MeetingRooms) {
			   if(Temporaryroom.isEmpty()) {
				   return Temporaryroom;
			   }   
		   }
		return null;
	   }
}

