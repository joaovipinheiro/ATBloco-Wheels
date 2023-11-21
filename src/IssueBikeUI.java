import java.util.Date;
public class IssueBikeUI {
    private Bike chosenBike = null;
    private Customer customer = null;
    private Payment payment = null;
    private Hire hire = null;
    private int numberOfDays = 0;

    public void showBikeDetails(int bikeNum) {
        chosenBike = Bike.findBikeByNumber(bikeNum);
        if (chosenBike != null) {
            chosenBike.showDetails();
        }
    }

    public void calculateCost(int numDays) {
        numberOfDays = numDays;
        chosenBike.calculateCost(numDays);
    }

    public void createCustomer(String name, String postcode, int telephone) {
        customer = new Customer(name, postcode, telephone);
        payment = new Payment(customer);
        hire = new Hire(new Date(), numberOfDays, chosenBike, customer);
    }

    public void calculateTotalPayment() {
        payment.calculateTotalPayment(hire);
    }
}