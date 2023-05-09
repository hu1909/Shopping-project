package Shopping_project;

import java.util.ArrayList;

public class Customer extends Person{
    private String payment_method;
    private ArrayList<Items> list_items_buy;
    private int Role;

    public Customer(String name, String phone_number, String email, String date_of_birth, String address, String payment_method) {
        super(name, phone_number, email, date_of_birth, address);
        this.payment_method = payment_method; 
        this.Role = 1;
    }

    public Customer() {}

    public void Add_items(Items new_items){
        this.list_items_buy.add(new_items);
    }

    public ArrayList<Items> get_List_items(){
        return this.list_items_buy;
    }

    

	public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    
    
}
