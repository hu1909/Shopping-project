package Shopping_project;

import java.util.ArrayList;

public class Shop {
    private String shop_name;
    private ArrayList<Items> list_items;
    private String Shop_owner;
    

    public Shop(){}

    public Shop(String shop_name, ArrayList<Items> list_items, String shop_owner) {
        this.shop_name = shop_name;
        this.list_items = list_items;
        Shop_owner = shop_owner;
    }

    public ArrayList<Items> getList_items() {
        return this.list_items;
    }

    public String get_ShopName(){
        return this.shop_name;
    }

    

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    

    public void setShop_owner(String shop_owner) {
        Shop_owner = shop_owner;
    }

    public void Update_list_items(String item_name, String type, String value){
        for(Items element:this.list_items){
            if(element.getItem_name() == item_name){
                switch(type){
                    case "Change name":
                        element.setItem_name(value);
                        break;
                    case "Change description":
                        element.setDescription(value);
                        break;
                    case "Change prices":
                        element.setPrices(Double.parseDouble(value));
                        break;
                }
            }else{
                System.out.println("There is no item in the list");
            }
        }

    }

    public ArrayList<Items> Insert_item(Items item){
        this.list_items.add(item);

        return this.list_items;
    }

    public void Delete_item(String item_name){
        for(Items element:this.list_items){
            if(element.getItem_name() == item_name){
                this.list_items.remove(element);
            }else{
                System.out.println("There are no item in the list");
            }
        }
    }

    public Items get_Items(String item_name){
        Items item = new Items();
        for(Items element: this.list_items){
            if(element.getItem_name() == item_name){
                item = element;
            }
        }
        return item;
    }

    @Override
    public String toString() {
        return "Name: " + this.shop_name + "\n" + 
                "List of items: " + this.list_items + "\n" + 
                "Shop owner: " + this.Shop_owner;
    }
    
}
