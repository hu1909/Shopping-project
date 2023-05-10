import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopRunner {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        List<Shop> shop = List.of(new Shop());
        List<Customer> customer = List.of(new Customer("Hung", "0921992001", "hugn.nq1909@gmail.com", "19/09/2001", "Hanoi", "Credit card"),
                                        new Customer("Trang", "0779912905", "minhtrang01062001@gmail.com", "01/06/2001", "Hanoi", "Cash")
                                        , new Customer("Duc", "011929292", "duc@gmail.com", "12/03/2001", "Hanoi", "Momo"));
        ShopManager manager = new ShopManager();
        manager.setList_customer(new ArrayList<>(customer));
        manager.setList_shop(new ArrayList<>(shop));
        System.out.println("Welcome to our Shopping page !!!");
        System.out.println("Please enter your name: ");
        String name = sc.next();
        
        System.out.println("Nice to meet you, " + name);
        System.out.println("Please choose the role to identity yourself: ");
        System.out.println("1: Customer");
        System.out.println("2: Shop owner");
        
        int input = sc.nextInt();
        switch(input){
            case 1:
                Person person = manager.getPerson(name, 1);
                System.out.println("Please choose your option: ");
                System.out.println("1: Update the profile");
                System.out.println("2: Shopping");
                int new_input = sc.nextInt();
                switch(new_input){
                    case 1: 
                        System.out.println("1: Update Name");
                        System.out.println("2: Update the Date_of_birth");
                        System.out.println("3: Update the address");
                        System.out.println("4: Update the phone number");
                        System.out.println("5: Update the Email address");
                        int update_index = sc.nextInt();
                        switch(update_index){
                            case 1: 
                                System.out.println("Please provide the name that you want to change: ");
                                String name_before = sc.next();
                                person.setName(name_before);
                                System.out.println("Your information has been changed");
                                System.out.println(person.toString());
                            case 2: 
                                System.out.println("Please provide the Date of Birth that you want to change: ");
                                String date = sc.next();
                                person.setDate_of_birth(date);
                                System.out.println("Your information has been changed");
                                System.out.println(person.toString());
                            case 3: 
                                System.out.println("Please provide the Address that you want to change: ");
                                String address = sc.next();
                                person.setAddress(address);
                                System.out.println("Your information has been changed");
                                System.out.println(person.toString());
                            case 4: 
                                System.out.println("Please provide the Phone number that you want to change: ");
                                String phone = sc.next();
                                person.setPhone_number(phone);
                                System.out.println("Your information has been changed");
                                System.out.println(person.toString());
                            case 5: 
                                System.out.println("Please provide the Email address that you want to change: ");
                                String email = sc.next();
                                person.setPhone_number(email);
                                System.out.println("Your information has been changed");
                                System.out.println(person.toString());  
                        }
                    case 2: 
                        System.out.println("Please choose which shop you want by typing the name of that shop: ");
                        String shop_name = sc.next();
                        Shop shop1 = manager.getShop(shop_name);
                        shop1.getList_items().toString();
                        System.out.println("Please choose the item that you want: ");
                        String item_name = sc.next();
                        Customer customer_identity = (Customer) person;
                        customer_identity.Add_items(shop1.get_Items(item_name));
                        System.out.println("New item has been added");
                        System.out.println(customer_identity.get_List_items());
                }
            case 2:
                Person owner = manager.getPerson(name, 2);
                Shop_owner shop_owner = (Shop_owner) owner;
                System.out.println("Please enter the shop that you want to modify: ");
                String shop_name = sc.next();
                System.out.println("Please choose your option: ");
                System.out.println("1: Change the information of shop");
                System.out.println("2: Change the information of the items");
                System.out.println("3: View the list of items");
                int option_owner = sc.nextInt();
                switch(option_owner){
                    case 1: 
                        System.out.println("1: Update the shop name");
                        System.out.println("2: Update the shop owner name");
                        int update_infor = sc.nextInt();
                        switch(update_infor){
                            case 1: 
                                System.out.println("Please enter the name that you want");
                                String shop_name_after = sc.next();
                                shop_owner.getShop_by_name(shop_name).setShop_name(shop_name_after);
                                shop_owner.getShop_by_name(shop_name).toString();
                            case 2: 
                                System.out.println("Please enter the shop owner that you want to change into: ");
                                String shop_owner_name = sc.next();
                                shop_owner.getShop_by_name(shop_name).setShop_owner(shop_owner_name);
                                shop_owner.getShop_by_name(shop_name).toString();
                                
                        }
                    case 2: 
                        System.out.println("1: Update the");
                }

        }
    }
    
    
}
