package de.breitling;

public class Controller {
    private TimeModel timeModel;
    private View view;

    public Controller(TimeModel timeModel, View view) {
        this.timeModel = timeModel;
        this.view = view;
        initiActions();
    }
    public void initiActions() {

    }
}
