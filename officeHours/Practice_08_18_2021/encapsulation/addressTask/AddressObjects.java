package Practice_08_18_2021.encapsulation.addressTask;

public class AddressObjects {
    public static void main(String[] args) {



        Address cybertek=new Address();
        cybertek.setStreet("7925 Jones Branch DR Suite 3300");
        cybertek.setCity("McLean");
        cybertek.setState("VA");
        cybertek.setZipCode("22182");

        System.out.println("cybertek.toString() = " + cybertek);
        cybertek.setZipCode("221820");
        cybertek.setStreet("");
        System.out.println("cybertek.toString() = " + cybertek);

        System.out.println("======== ALL ARG CONSTR =============");
        Address address=new Address("7925 Jones Branch DR Suite 3300","McLean","VA","22182");
        System.out.println("address = " + address);


    }
}
