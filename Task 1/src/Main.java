public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("11223344","Nokia",100);
        phone.receiveCall("Vasya");
        Phone phone1 = new Phone("44885533","Samsung",120);
        phone1.receiveCall("Petya", "55448899");
        Phone.countryOfManufactureOfThePhone = "China";

        System.out.println(phone.countryOfManufactureOfThePhone);
        System.out.println(phone1.countryOfManufactureOfThePhone);
    }
}
