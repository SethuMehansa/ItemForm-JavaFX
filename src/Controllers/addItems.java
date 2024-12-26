package Controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import DBConnection.DBConnection;
import Item.Item;

public class addItems {

    public TextField itemId;
    public TextField itemName;
    public TextField itemQty;
    public TextField itemPrice;
    public TextField itemDesc;

    private static int idCount = 1;

    public void initialize() {
        updateNextItemId();
    }

    public void addItemOnAction(ActionEvent actionEvent) {

        String ITEMID = "ITM" + String.format("%04d", idCount);
        String ITEMNAME=itemName.getText();
        Integer ITEMQTY= Integer.valueOf(itemQty.getText());
        Double ITEMPRICE= Double.valueOf(itemPrice.getText());
        String ITEMDESCRIPTION=itemDesc.getText();

        Item t1=new Item(ITEMID,ITEMNAME,ITEMQTY,ITEMPRICE,ITEMDESCRIPTION);

        boolean isAdded=DBConnection.getInstance().getConnection().add(t1);

        if(isAdded){
            System.out.println("Item added successfully." + "Total items: " + DBConnection.getInstance().getConnection().size());
        }else{
            System.out.println("Adding Fail");
        }

        idCount++;
        updateNextItemId();
        clearInputFields();
        System.out.println(DBConnection.getInstance().getConnection().toString());

    }

    private void updateNextItemId() {

        itemId.setText("ITM" + String.format("%04d", idCount));

    }

    private void clearInputFields() {
        itemName.clear();
        itemQty.clear();
        itemPrice.clear();
        itemDesc.clear();
    }

    public void itemFormCloseOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

}
