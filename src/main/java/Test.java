

public class Test {

    public static void main(String[] args) {
        BirthDayParser parser = new BirthDayParser("26-03-2000");
        parser.checkIsDateAWorkingDay();

        Person person = new Person("Bob", 20, new Address());
        System.out.println(person.address().getStreet().length());

    }
}
