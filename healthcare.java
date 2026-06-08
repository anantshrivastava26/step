import java.util.*;
class patient{
    String patientName;
    int age;

    patient(String patientName, int age) {
        this.patientName = patientName;
        this.age = age;
    }
}
class doctor{
    String doctorName;
    String department;
    int fee;

    doctor(String doctorName, String department, int fee) {
        this.doctorName = doctorName;
        this.department = department;
        this.fee = fee;
    }
}
class appointment{
    patient patient;
    doctor doctor;

    appointment(patient patient, doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }
}
public class healthcare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Patient Name:");
        String patientName = in.nextLine();
        System.out.println("Enter Patient Age:");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Enter Doctor Name:");
        String doctorName = in.nextLine();
        System.out.println("Enter Department:");
        String department = in.nextLine();
        System.out.println("Enter Consultation Fee:");
        int fee = in.nextInt();
        patient p = new patient(patientName, age);
        doctor d = new doctor(doctorName, department, fee);
        appointment a = new appointment(p, d);
        System.out.println("===== HOSPITAL VISIT =====\n");
        System.out.println("Patient Details");
        System.out.println(displayPatientDetails(p));
        System.out.println("Doctor Details");
        System.out.println(displayDoctorDetails(d));
        System.out.println("Appointment Confirmed");
        System.out.println("Appointment Details : " + a.patient.patientName + " will meet " + a.doctor.doctorName + " from " + a.doctor.department);
        System.out.println("\nFinal Bill : " + d.fee);
        System.out.println("\nVisit Completed Successfully");
        in.close();
    }
    static String displayPatientDetails(patient p) {
        return "Patient Name : " + p.patientName + "\nPatient Age : " + p.age;
    }
    static String displayDoctorDetails(doctor d) {
        return "Doctor Name : " + d.doctorName + "\nDepartment : " + d.department + "\nFee : " + d.fee;
    }
}
