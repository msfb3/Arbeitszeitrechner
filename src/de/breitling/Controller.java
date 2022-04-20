package de.breitling;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        initiActions();
    }
    public void initiActions() {

    }
}
