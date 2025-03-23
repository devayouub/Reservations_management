import java.awt.TextField;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class Reservationview {
	public JFrame frame;
	public JButton addbutton1,deletebutton1,addbutton2,deletebutton2;
	public JTable reservationtable,MeetingRoomsTable;
	public DefaultTableModel tablemodel1,tablemodel2;
    public TextField professornameField,roomNameField;
    public JLabel professorname,date,duration,roomName,operationsOnReservations,operationsOnMeetingRooms;
    public Reservationview() {
		//---------------frame creation----------------
		frame = new JFrame("RESERVATIONS MANAGMENTS");
		  frame.setSize(900,700);
		    frame.setAlwaysOnTop(true);
		     frame.setLayout(null);
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   //------------------reservations table creation-----------------
	       String [] columns1 = { "name of the professor","meeting room","date","Starts at","finishes at"};
	       tablemodel1 = new DefaultTableModel(columns1,0);    
		       reservationtable = new JTable(tablemodel1);
		          JScrollPane scrollpane1 = new JScrollPane(reservationtable);
		             scrollpane1.setBounds(20, 20, 600, 150);
		             frame.add(scrollpane1);
		        
		           //------------------Available rooms table creation-----------------
		  	       String [] columns2 = { "AVAILABLE MEETING ROOMS"};
		  	     tablemodel2 = new DefaultTableModel(columns2,0);    
		  		     MeetingRoomsTable = new JTable(tablemodel2);
		  		          JScrollPane scrollpane2 = new JScrollPane(MeetingRoomsTable);
		  		             scrollpane2.setBounds(430, 400, 400, 200);
		  		             frame.add(scrollpane2);
		  		            
		//----------------generating reservations buttons-----------------      
		        addbutton1 = new JButton("add reservation");
		        addbutton1.setEnabled(false);
		         addbutton1.setBounds(20,300,150,20);
		          deletebutton1 = new JButton("delete reservation"); 
		           deletebutton1.setBounds(200,300,150,20);
		           deletebutton1.setEnabled(false);
			              frame.add(addbutton1);
		    		         	     frame.add(deletebutton1);
		    		         	  //----------------generating MeetingRooms buttons-----------------      
		    		 		      addbutton2 = new JButton("add room");
		    		 		       addbutton2.setEnabled(false);
		    		 		         addbutton2.setBounds(200,450,150,20);
		    		 		          deletebutton2 = new JButton("delete room"); 
		    		 		         deletebutton2.setEnabled(false);
		    		 		           deletebutton2.setBounds(200,500,150,20);
		    		 			              frame.add(addbutton2);
		    		 		    		         	     frame.add(deletebutton2);
		    		 		    		         	     
	//---------------------Text areas--------------------------
		     	   operationsOnReservations = new JLabel("OPERATIONS ON RESERVATIONS");
		     	  operationsOnReservations.setBounds(100, 190, 400, 20); 
		    		 		    		         	     
		    		 		    		         	     
               professornameField = new TextField();
		       	   professornameField.setBounds(40,250,100,20);
		        	  professorname = new JLabel();
		        	    professorname.setText("professor's name:");
		         	       professorname.setBounds(40, 225 , 200, 15);
		         	     
		         	    date = new JLabel();
		         	   date.setText("date :");
		         	  date.setBounds(180, 225 , 100, 15);     		         	  
		         	  
		         	  
		         	  
		         	 try {
	                      MaskFormatter mask = new MaskFormatter("##-##-#### ##:##");
	                      mask.setPlaceholderCharacter('_');
	                      JFormattedTextField formattedField = new JFormattedTextField(mask);
	                      formattedField.setColumns(10);
	                      frame.add(formattedField);
	                      formattedField.setBounds(180,250, 100, 20);
	                  } catch (ParseException e) {
	                      e.printStackTrace();
	                  }
		         	  
		         	 String[] durations = {"1 heure", "1 heure 30 min","2 heures","2 heures 30 min"};
		             JComboBox<String> durationBox = new JComboBox<>(durations);   		         	
		         	    durationBox.setBounds(300,250,100,20);
		         	    duration = new JLabel(); 
		         	    duration.setText("set duration");
		         	        duration.setBounds(300, 181,100, 100);
		         	        
		         	       operationsOnMeetingRooms = new JLabel("OPERATIONS ON MEETING ROOMS");
		         	      operationsOnMeetingRooms.setBounds(90, 400,400, 20);
		         	       try {
			                      MaskFormatter mask = new MaskFormatter("U-##");
			                      mask.setPlaceholderCharacter('_');
			                      JFormattedTextField formattedField = new JFormattedTextField(mask);
			                      formattedField.setColumns(10);
			                      frame.add(formattedField);
			                      formattedField.setBounds(100,450, 50, 20);
			                  } catch (ParseException e) {
			                      e.printStackTrace();
			                  }
		         	       
		         	     roomName = new JLabel("Room name:");
		         	        roomName.setBounds(020, 450, 100, 20);
		         	        
                                       frame.add(roomName);
		         	               frame.add(professornameField);
				         	     frame.add(durationBox);
				         	   frame.add(duration);
					      	  frame.add(professorname);
					          frame.add(date);
		                      frame.add(operationsOnMeetingRooms);
		                      frame.add(operationsOnReservations);
	 	             
	frame.setVisible(true);
    }
    
}
