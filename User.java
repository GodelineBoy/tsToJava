import java.util.Date;

public class User {
    private Date birthdate;
    private double size; 
    private Photo[] photos;
    private Address address; 

    public User(Date birthDate, double size, Photo[] photos, Address address) {
        this.birthdate = birthDate;
        this.size = size; 
        this.photos = photos;
        this.address = address; 
    }

    public Date getBirthdate() {return this.birthdate;}
    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}

    public double getSize() {return this.size;}
    public void setSize(double size) {this.size = size;}

    public Photo[] getPhotos() {return this.photos;}
    public void setCity(Photo[] photos) {this.photos = photos;}

    public Address getAddress() {return this.address;}
    public void setAddress(Address address) {this.address = address;}

}
