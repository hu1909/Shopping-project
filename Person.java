public class Person {
    private String Name;
    private String Phone_number;
    private String Email;
    private String Date_of_birth;
    private String Address;

    
    public Person(String name, String phone_number, String email, String date_of_birth, String address) {
        Name = name;
        Phone_number = phone_number;
        Email = email;
        Date_of_birth = date_of_birth;
        Address = address;
    }

    public Person(){
        
    }

    
    public String getName() {
        return this.Name;
    }


    public void setName(String name) {
        this.Name = name;
    }


    public String getPhone_number() {
        return this.Phone_number;
    }


    public void setPhone_number(String phone_number) {
        this.Phone_number = phone_number;
    }


    public String getEmail() {
        return this.Email;
    }


    public void setEmail(String email) {
        this.Email = email;
    }


    public String getDate_of_birth() {
        return this.Date_of_birth;
    }


    public void setDate_of_birth(String date_of_birth) {
        this.Date_of_birth = date_of_birth;
    }


    public String getAddress() {
        return this.Address;
    }


    public void setAddress(String address) {
        this.Address = address;
    }


    @Override
    public String toString() {
        return "Name: " + this.Name + "\n" + 
                "Phone Number: " + this.Phone_number + "\n" + 
                "Email: " + this.Email + "\n" + 
                "Date of Birth: " + this.Date_of_birth + "\n" + 
                "Address: " + this.Address + "\n";
    }
}
  