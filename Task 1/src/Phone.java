public class Phone {
    static String countryOfManufactureOfThePhone;
    String number;
    String model;
    double weight;

    public Phone() {
    }
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        receiveCall(name, "");
    }
    public void receiveCall(String name, String number) {
//        if (number == "") {
//            System.out.println("Звонит абонент по имени " + name);
//        } else {
//            System.out.println("Звонит абонент по имени " + name + " номер " + number);
//        }
        System.out.println("Звонит абонент по имени " + name + (number == "" ? "" :" номер " + number));
    }
}
