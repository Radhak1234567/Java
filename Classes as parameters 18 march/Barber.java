class Barber {
    void serve(Customer customer) {
        if (customer != null) {
            customer.getHaircut();
        } else {
            System.out.println("Customer is not present");
        }
    }
}