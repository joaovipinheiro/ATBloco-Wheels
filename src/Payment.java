public class Payment {
    private Customer customer = null;
    private int paymentId = 0;
    private static int paymentCount = 001;

    public Payment(Customer cust) {
        customer = cust;
        paymentId = paymentCount++;
    }

    public void calculateTotalPayment(Hire hire) {
        issueReceipt(hire);
    }

    private void issueReceipt(Hire hire) {
        String cust = hire.getCustomer().getName();
        String pCode = hire.getCustomer().getPostcode();
        System.out.println("Printing out receipt for '" + cust + "'....");
        System.out.println("In postcode: " + pCode + "\n");
        System.out.println("Hiring bike number '" + hire.getBike().getBikeNumber()
                + "' for " + hire.getNumberOfDays() + " days" + "\n");
        hire.getBike().calculateCost(hire.getNumberOfDays());
    }
}