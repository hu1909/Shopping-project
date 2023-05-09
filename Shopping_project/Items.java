package Shopping_project;

public class Items {
    private String item_name;
    private String description;
    private Double prices;
    private String shop_name;


    public Items(String item_name, String description, Double prices, String shop_name) {
        this.item_name = item_name;
        this.description = description;
        this.prices = prices;
        this.shop_name = shop_name;
    }

    public Items() {
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getItem_name() {
        return this.item_name;
    }


    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }


    public String getDescription() {
        return this.description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Double getPrices() {
        return this.prices;
    }


    public void setPrices(Double prices) {
        this.prices = prices;
    }

}
