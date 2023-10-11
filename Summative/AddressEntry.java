package Summative;

public class AddressEntry {
    private String name;
    private String address;
    private String telephone;
    private String email;

    public AddressEntry() {
        this.name = "";
        this.address = "";
        this.telephone = "";
        this.email = "";
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //getters
    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public String getTelephone(){
        return this.telephone;
    }

    public String getEmail(){
        return this.email;
    }

    public void displaydata() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Telephone: " + this.telephone);
        System.out.println("Email: " + this.email);
    }

}
