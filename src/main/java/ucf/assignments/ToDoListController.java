package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ToDoListController {

    @FXML
    private TextField resultDisplay;

    @FXML
    public void allItemsButtonClicked(ActionEvent actionEvent) {
        //
    }

    @FXML
    public void completedItemsButtonClicked(ActionEvent actionEvent) {
        //
    }

    @FXML
    public void incompleteItemsButtonClicked(ActionEvent actionEvent) {
        //
    }

    @FXML
    public void deleteCurrentListButtonClicked(ActionEvent actionEvent) {
        //
    }

    @FXML
    public void addListButtonClicked(ActionEvent actionEvent) {

    }

    @FXML
    public void exportCurrentListButtonClicked(ActionEvent actionEvent) {
        //take in all stored variables (list name, list items, marked as complete variable, etc)
        //create a new variable that stores the file directory
        //prompt for the file directory to be stored in a string
        //create a new txt file under the new file directory
        //copy over the list name
        //in a loop the size of the number of items in the list, copy each item due date, name, and description
        //save the new file with the copied elements
    }

    @FXML
    public void exportAllListsButtonClicked(ActionEvent actionEvent) {
        //take in list counter
        //in a for loop the size of the list counter, do the following:
        //take in all stored variables (list name, list items, marked as complete variable, etc) for the current list
        //create a new variable that stores the file directory
        //prompt for the file directory to be stored in a string(all lists will be stored here)
        //create a new txt file for the current list under the new file directory
        //copy over the list name
        //in a loop the size of the number of items in the list, copy each item due date, name, and description
        //save the new file with the copied elements
        //repeat n times
    }

    @FXML
    public void loadListButtonClicked(ActionEvent actionEvent) {
        //
    }

    @FXML
    public void loadMultipleListsButtonClicked(ActionEvent actionEvent) {
        //
    }

    public void editNameButtonClicked(ActionEvent actionEvent) {
        //
    }
}
