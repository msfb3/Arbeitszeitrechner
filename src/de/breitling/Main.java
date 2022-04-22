package de.breitling;

public class Main {
    public static void main(String[] args) {

        View view = new View();
        TimeModel timeModel = new TimeModel();
        Controller controller = new Controller(timeModel,view);
    }
}
