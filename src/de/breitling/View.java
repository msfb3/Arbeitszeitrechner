package de.breitling;

import javax.swing.*;
import java.awt.*;

public class View {
    private JTextField txtBegin;
    private JTextField txtEnd;
    private JButton btnUpdate;
    private JButton btnCalculate;
    private JFrame window;
    private JTable timeTable;
    private JTextField txtUserId;

    public View() {
        window = new JFrame("Worktime Calc");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel lblBegin = new JLabel("Startzeit: hh:mm");
        JLabel lblEnd = new JLabel("Endzeit: hh:mm");
        JLabel lblUserId = new JLabel("MitarbeiterID");

        JPanel timePanel = new JPanel();
        JPanel timePanelLeft = new JPanel(new BorderLayout(1,1));
        JPanel timePanelRight = new JPanel(new GridLayout(10,1));
        JSplitPane timePanelSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        txtBegin = new JTextField();
        btnUpdate = new JButton("Aktualisieren");
        btnCalculate = new JButton("Pushen");
        txtEnd = new JTextField();
        txtUserId = new JTextField();
        timeTable = new JTable();

        timePanelLeft.add(new JScrollPane(timeTable));
        timePanelSplitPane.setLeftComponent(timePanelLeft);
        timePanelSplitPane.setRightComponent(timePanelRight);
        timePanel.add(timePanelSplitPane);


        timePanelRight.add(lblUserId);
        timePanelRight.add(txtUserId);
        timePanelRight.add(lblBegin);
        timePanelRight.add(txtBegin);
        timePanelRight.add(lblEnd);
        timePanelRight.add(txtEnd);
        timePanelRight.add(btnUpdate);
        timePanelRight.add(btnCalculate);


        window.setSize(600,600);
        window.add(timePanel);
        window.setVisible(true);

    }

    public JTextField getTxtBegin() {
        return txtBegin;
    }

    public void setTxtBegin(JTextField txtBegin) {
        this.txtBegin = txtBegin;
    }

    public JTextField getTxtEnd() {
        return txtEnd;
    }

    public void setTxtEnd(JTextField txtEnd) {
        this.txtEnd = txtEnd;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    public JButton getBtnCalculate() {
        return btnCalculate;
    }

    public void setBtnCalculate(JButton btnCalculate) {
        this.btnCalculate = btnCalculate;
    }

    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JTable getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(JTable timeTable) {
        this.timeTable = timeTable;
    }

    public JTextField getTxtUserId() {
        return txtUserId;
    }

    public void setTxtUserId(JTextField txtUserId) {
        this.txtUserId = txtUserId;
    }
}
