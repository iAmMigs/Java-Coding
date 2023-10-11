package Summative;

public class Room {
    private int roomnum;
    private String roomtype;
    private String roomarea;
    private boolean ACmachine;

    public Room() {
        this.roomnum = 0;
        this.roomtype = "";
        this.roomarea = "";
        this.ACmachine = false;
    }

    //setters
    public void setRoomnum(int newroomnum){
        this.roomnum = newroomnum;
    }

    public void setRoomtype(String newroomtype){
        this.roomtype = newroomtype;
    }

    public void setRoomarea(String newroomarea){
        this.roomarea = newroomarea;
    }

    public void setACmachine(boolean newACmachine){
        this.ACmachine = newACmachine;
    }


    public void displaydata() {
        System.out.println("Room Number: " + this.roomnum);
        System.out.println("Room Type: " + this.roomtype);
        System.out.println("Room Area: " + this.roomarea);
        System.out.println("AC Machine: " + this.ACmachine);
    }
}
