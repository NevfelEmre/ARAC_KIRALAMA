
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nevfe
 */
public class Customer extends Person {

    private String numberPlate = "---";
    private String deadline = "---";
    private String startDate = "---";
    private boolean isAvailable = true;
    private List<Rentable> history = new ArrayList<Rentable>();

    Customer(String name, String surname, String identity) {
        super(name, surname, identity);
    }

    public List<Rentable> getHistory() {
        return this.history;
    }

    public void addToHistory(Car car) {
        this.history.add(new Rentable(car.getNumberPlate(), car.getStartDate(), car.getDeadline()));
    }

    public String getNumberPlate() {
        return this.numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void changeAvailability() {
        if (isAvailable) {
            this.isAvailable = false;
        } else {
            this.isAvailable = true;
        }
    }
}
