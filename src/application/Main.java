//Ryan Flynn, CSE360, Homework 1 5/23/24
package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private static final double salesTax = 0.07;

    // Prices for items
    private static final double eggSand = 7.99;
    private static final double bagel = 2.50;
    private static final double pSalad = 4.49;
    private static final double chkSand = 9.99;
    private static final double coffee = 1.99;
    private static final double gTea = 0.99;
    private static final double bTea = 1.25;
    private static final double oj = 2.25;

    private TextArea billTextArea;
    private CheckBox eggSandCB, bagelCB, pSaladCB, chkSandCB;
    private RadioButton coffeeRB, gTeaRB, bTeaRB, ojRB;
    private ToggleGroup drinksGroup;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Homework 1");

        // Title Label
        Label titleLabel = new Label("Ryan's Deli");
        titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        
        // Food selection GridPane
        GridPane foodGrid = new GridPane();
        foodGrid.setVgap(10);
        foodGrid.setPadding(new Insets(20));

        Label foodLabel = new Label("Eat:");
        foodGrid.add(foodLabel, 0, 0);

        eggSandCB = new CheckBox("Egg Sandwich");
        foodGrid.add(eggSandCB, 0, 1);

        chkSandCB = new CheckBox("Chicken Sandwich");
        foodGrid.add(chkSandCB, 0, 2);

        bagelCB = new CheckBox("Bagel");
        foodGrid.add(bagelCB, 0, 3);

        pSaladCB = new CheckBox("Potato Salad");
        foodGrid.add(pSaladCB, 0, 4);

        // Drink selection GridPane
        GridPane drinkGrid = new GridPane();
        drinkGrid.setVgap(10);
        drinkGrid.setPadding(new Insets(20));

        Label drinkLabel = new Label("Drink:");
        drinkGrid.add(drinkLabel, 0, 0);

        drinksGroup = new ToggleGroup();

        bTeaRB = new RadioButton("Black Tea");
        bTeaRB.setToggleGroup(drinksGroup);
        drinkGrid.add(bTeaRB, 0, 1);

        gTeaRB = new RadioButton("Green Tea");
        gTeaRB.setToggleGroup(drinksGroup);
        drinkGrid.add(gTeaRB, 0, 2);

        coffeeRB = new RadioButton("Coffee");
        coffeeRB.setToggleGroup(drinksGroup);
        drinkGrid.add(coffeeRB, 0, 3);

        ojRB = new RadioButton("Orange Juice");
        ojRB.setToggleGroup(drinksGroup);
        drinkGrid.add(ojRB, 0, 4);

        // Bill TextArea
        VBox billBox = new VBox();
        Label billLabel = new Label("Bill");
        billTextArea = new TextArea();
        billTextArea.setPrefHeight(200);
        billTextArea.setEditable(false);
        billBox.getChildren().addAll(billLabel, billTextArea);
        billBox.setPadding(new Insets(20));

        // Main HBox for content
        HBox mainContent = new HBox(20);
        mainContent.getChildren().addAll(foodGrid, drinkGrid, billBox);

        // Buttons HBox
        HBox buttonBox = new HBox(20);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new Insets(10, 20, 20, 20));

        Button orderButton = new Button("Order");
        orderButton.setOnAction(e -> handleOrderButton());
        Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction(e -> handleCancelButton());
        Button confirmButton = new Button("Confirm");
        confirmButton.setOnAction(e -> handleConfirmButton());

        buttonBox.getChildren().addAll(orderButton, cancelButton, confirmButton);

        // Main VBox layout
        VBox mainLayout = new VBox(20);
        mainLayout.setPadding(new Insets(20));
        mainLayout.setAlignment(Pos.TOP_CENTER);
        mainLayout.getChildren().addAll(titleLabel, mainContent, buttonBox);

        Scene scene = new Scene(mainLayout, 900, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleOrderButton() {
        StringBuilder order = new StringBuilder("Order Details:\n");
        double total = 0.0;

        if (eggSandCB.isSelected()) {
            order.append("Egg Sandwich: $").append(eggSand).append("\n");
            total += eggSand;
        }
        if (bagelCB.isSelected()) {
            order.append("Bagel: $").append(bagel).append("\n");
            total += bagel;
        }
        if (pSaladCB.isSelected()) {
            order.append("Potato Salad: $").append(pSalad).append("\n");
            total += pSalad;
        }
        if (chkSandCB.isSelected()) {
            order.append("Chicken Sandwich: $").append(chkSand).append("\n");
            total += chkSand;
        }

        RadioButton selectedDrink = (RadioButton) drinksGroup.getSelectedToggle();
        if (selectedDrink != null) {
            String drink = selectedDrink.getText();
            double drinkPrice = 0.0;

            if (selectedDrink == coffeeRB) {
                drinkPrice = coffee;
            } else if (selectedDrink == gTeaRB) {
                drinkPrice = gTea;
            } else if (selectedDrink == bTeaRB) {
                drinkPrice = bTea;
            } else if (selectedDrink == ojRB) {
                drinkPrice = oj;
            }

            order.append(drink).append(": $").append(drinkPrice).append("\n");
            total += drinkPrice;
        }

        double tax = total * salesTax;
        double finalTotal = total + tax;

        order.append("\nSubtotal: $").append(String.format("%.2f", total))
             .append("\nTax: $").append(String.format("%.2f", tax))
             .append("\nTotal: $").append(String.format("%.2f", finalTotal));

        billTextArea.setText(order.toString());
    }

    private void handleCancelButton() {
        eggSandCB.setSelected(false);
        bagelCB.setSelected(false);
        pSaladCB.setSelected(false);
        chkSandCB.setSelected(false);
        drinksGroup.selectToggle(null);
        billTextArea.clear();
    }

    private void handleConfirmButton() {
    	StringBuilder order = new StringBuilder("Order Confirmed!\n");
    	order.append("Order Details: ").append("\n");
        double total = 0.0;

        if (eggSandCB.isSelected()) {
            order.append("Egg Sandwich: $").append(eggSand).append("\n");
            total += eggSand;
        }
        if (bagelCB.isSelected()) {
            order.append("Bagel: $").append(bagel).append("\n");
            total += bagel;
        }
        if (pSaladCB.isSelected()) {
            order.append("Potato Salad: $").append(pSalad).append("\n");
            total += pSalad;
        }
        if (chkSandCB.isSelected()) {
            order.append("Chicken Sandwich: $").append(chkSand).append("\n");
            total += chkSand;
        }

        RadioButton selectedDrink = (RadioButton) drinksGroup.getSelectedToggle();
        if (selectedDrink != null) {
            String drink = selectedDrink.getText();
            double drinkPrice = 0.0;

            if (selectedDrink == coffeeRB) {
                drinkPrice = coffee;
            } else if (selectedDrink == gTeaRB) {
                drinkPrice = gTea;
            } else if (selectedDrink == bTeaRB) {
                drinkPrice = bTea;
            } else if (selectedDrink == ojRB) {
                drinkPrice = oj;
            }

            order.append(drink).append(": $").append(drinkPrice).append("\n");
            total += drinkPrice;
        }

        double tax = total * salesTax;
        double finalTotal = total + tax;

        order.append("\nSubtotal: $").append(String.format("%.2f", total))
             .append("\nTax: $").append(String.format("%.2f", tax))
             .append("\nTotal: $").append(String.format("%.2f", finalTotal));

        billTextArea.setText(order.toString());
        eggSandCB.setSelected(false);
        bagelCB.setSelected(false);
        pSaladCB.setSelected(false);
        chkSandCB.setSelected(false);
        drinksGroup.selectToggle(null);
    }
}