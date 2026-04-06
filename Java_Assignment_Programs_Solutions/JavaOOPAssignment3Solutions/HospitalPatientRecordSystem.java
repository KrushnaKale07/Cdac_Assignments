/*Question 4: Design a Hospital Management System
Requirements:
Each patient has:
● Patient ID, name, age
● Disease
● Contact details
System should:
● Store multiple patients
● Identify senior citizens (age ≥ 60)
● Count total patients
Support:
● Use object composition (Patient → ContactDetails)
Display:
● Patient details with status*/

import java.util.*;
class ContactDetails {
    String phone;
    String email;

    ContactDetails(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }
}
class Patient {
	
		int patientId;
		String name;
		int age;
		String disease;
		ContactDetails contact;
		static int totalPatients = 0;
		
		
		Patient (int patientId, String name, int age, String disease, ContactDetails contact ){
			this.patientId = patientId;
			this.name = name;
			this.age = age;
			this.disease = disease;
			this.contact = contact;
			totalPatients++;
		}
		
		boolean isSeniorCitizen() {
			return age >= 60;
		}
		
		public void display(){
			System.out.println("\n--- Patient Details ---");
			System.out.println("ID       : " + patientId);
			System.out.println("Name     : " + name);
			System.out.println("Age      : " + age);
			System.out.println("Disease  : " + disease);
			System.out.println("Phone    : " + contact.phone);
			System.out.println("Email    : " + contact.email);
			System.out.println("Status   : " + (isSeniorCitizen() ? "Senior Citizen" : "Normal"));

		}
}
		
public class HospitalPatientRecordSystem {
    public static void main(String[] args) {

        // Create patients using composition
        Patient p1 = new Patient(101, "Rahul", 65, "Diabetes",
                new ContactDetails("9876543210", "rahul@mail.com"));

        Patient p2 = new Patient(102, "Anita", 40, "Flu",
                new ContactDetails("9123456780", "anita@mail.com"));

        Patient p3 = new Patient(103, "Suresh", 70, "Heart Disease",
                new ContactDetails("9988776655", "suresh@mail.com"));

        // Store patients
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(p1);
        patients.add(p2);
        patients.add(p3);

        // Display all patients
        for (Patient p : patients) {
            p.display();
        }

        // Total patients
        System.out.println("\nTotal Patients: " + Patient.totalPatients);
    }
}