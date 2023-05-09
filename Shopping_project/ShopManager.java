package Shopping_project;

import java.util.ArrayList;
import java.util.List;

public class ShopManager {
    private ArrayList<Customer> list_customer;
    private ArrayList<Shop_owner> list_shop_owners;
    private ArrayList<Shop> list_shop;


    public void setList_customer(ArrayList<Customer> list_customer) {
        this.list_customer = list_customer;
    }

    public void setList_shop_owners(ArrayList<Shop_owner> list_shop_owners) {
        this.list_shop_owners = list_shop_owners;
    }

    public void setList_shop(ArrayList<Shop> list_shop) {
        this.list_shop = list_shop;
    }

    public ArrayList<Customer> getList_customer() {
        return this.list_customer;
    }
    
    public ArrayList<Shop_owner> getList_shop_owners() {
        return this.list_shop_owners;
    }

    public ArrayList<Shop> getList_shop(){
        return this.list_shop;
    }

    public Person getPerson(String name, int role){
        Person person = new Person();
        if(role == 1){
            for(Customer element:this.list_customer){
                if(element.getName().equals(name)){
                    person = element;
                }
            }
        }else{
            for(Shop_owner element:this.list_shop_owners){
                if(element.getName().equals(name)){
                    person = element;
                }
            }
        }

        return person;
        
    }

    public Shop getShop(String shop_name){
        Shop new_shop = new Shop();
        for(Shop element:this.list_shop){
            if(element.get_ShopName().equals(shop_name)){
                new_shop = element;
            }
        }
        return new_shop;
    }

    
    
}
