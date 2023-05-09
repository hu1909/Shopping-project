package Shopping_project;

import java.util.ArrayList;

public class Shop_owner extends Person{
    private int Role;
    private ArrayList<Shop> list_shop;

    public Shop_owner(String name, String phone_number, String email, String date_of_birth, String address) {
        super(name, phone_number, email, date_of_birth, address);
        this.Role = 2;

    }

    public Shop_owner() {
    }

    public ArrayList<Shop> getList_shop() {
        return list_shop;
    }

    public Shop getShop_by_name(String shop_name){
        Shop new_shop = new Shop();
        for(Shop element: this.list_shop){
            if(element.get_ShopName() == shop_name){
                new_shop = element;
            }
        }
        return new_shop;
    }



    
    
}
