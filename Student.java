public class Student {
    //Attributes
    public int id;
    private String name;
    private double grade;
    
    //double x = 0.0
    //float x = 0.0f

    //Constructor
    public Student(){
        this.id = 0;
        this.name = "";
        this.grade = 0.0;
    }

    //Setter
    public void setName(String newName){
        this.name = newName;
    }

    public void setGrade(double newGrade){
        this.grade = newGrade;
    }


    //Getter
    public String getName(){
        return this.name;
    }

    public String getGrade(){
        return this.name;
    }

    //Custom method
    public String displayInfo(){
        String info = "ID: " + this.id + "\n";
        info = info + "Name: " + this.name + "\n";
        info = info + "Grade: " + this.grade + "\n";

        return info;
    }
}
