import java.util.ArrayList;

public class Hospital extends Building{
    private int numOfDoctors;
    private int numOfPatients;
    private ArrayList<String> patients;

    public Hospital(String name, String address, int height, int numOfDoctors, int numOfPatients) {
        super(name, address, height);
        patients = new ArrayList<String>();
        this.numOfDoctors = numOfDoctors;
        this.numOfPatients = numOfDoctors;
    }

    public void admitPatient(String patientName) {
        patients.add(patientName);
        numOfPatients++;
    }

    public int getNumOfDoctors() {
        return numOfDoctors;
    }

    public int getNumOfPatients() {
        return numOfPatients;
    }

    public ArrayList<String> getPatients() {
        return patients;
    }
}
