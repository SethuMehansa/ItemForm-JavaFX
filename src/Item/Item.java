package Item;

import javafx.scene.control.TextField;

public class Item {

    private String itemId;
    private String itemName;
    private Integer itemQTY;
    private Double itemPrice;
    private String itemDescription;

    public Item(String itemId, String itemName, Integer qty, Double itemPrice, String itemDecription) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemQTY = qty;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDecription;
    }

    public Item(TextField itemId, TextField itemName, TextField itemQty, TextField itemPrice, TextField itemDesc) {

    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getQty() {
        return itemQTY;
    }

    public void setQty(Integer qty) {
        this.itemQTY = qty;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDecription() {
        return itemDescription;
    }

    public void setItemDecription(String itemDecription) {
        this.itemDescription = itemDecription;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", qty=" + itemQTY +
                ", itemPrice=" + itemPrice +
                ", itemDecription='" + itemDescription + '\'' +
                '}';
    }
}
