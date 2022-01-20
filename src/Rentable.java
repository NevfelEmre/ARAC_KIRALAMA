/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nevfe
 */
public class Rentable {

    private String numberPlate = "---";
    private String deadline = "---";
    private String startDate = "---";

    Rentable(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    Rentable(String numberPlate, String startDate, String deadline) {
        this.numberPlate = numberPlate;
        this.deadline = deadline;
        this.startDate = startDate;
    }

    public String getNumberPlate() {
        return this.numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
