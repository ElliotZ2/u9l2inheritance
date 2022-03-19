public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe("John's Cafe", "720 John Street, NY 10078", 30, "A");
        System.out.println(cafe.getName());
        System.out.println(cafe.getAddress());
        System.out.println(cafe.getHeight());
        System.out.println(cafe.getFoodRating());
        cafe.takeOrder("Joseph");
        cafe.serveFood("Joseph");

        System.out.println();

        Hospital hospital = new Hospital("Hospital Hospital", "473 Jeff Street, NY 10089", 200, 30, 17);
        System.out.println(hospital.getName());
        System.out.println(hospital.getAddress());
        System.out.println(hospital.getHeight());
        System.out.println(hospital.getNumOfDoctors());
        System.out.println(hospital.getNumOfPatients());
        hospital.admitPatient("Smith");
        hospital.admitPatient("Bob");
        System.out.println(hospital.getNumOfPatients());
        System.out.println(hospital.getPatients());
    }
}
