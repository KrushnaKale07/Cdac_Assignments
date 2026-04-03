/*8. Hospital Patient Record System
Create a simple patient management program.
Requirements
● Create a class Patient with:
○ patient ID
○ patient name
○ age
○ disease
● Create objects for at least 3 patients.
● Display patient details.
● Add a method to check whether the patient is a senior citizen (age 60 or above).*/

class HospitalPatientRecordSystem{
	
		int id;
		String name;
		int age;
		String disease;
		
		HospitalPatientRecordSystem(int id, String name, int age, String disease ){
			this.id = id;
			this.name = name;
			this.age = age;
			this.disease = disease;
		}
		
		public void seniorityCheck(){
			if(age > 60){
				System.out.println("Patient ID   : " + id);
				System.out.println("Name         : " + name);
				System.out.println("Age          : " + age);
				System.out.println("Disease      : " + disease);
				System.out.println("Patient is a senior citizen");
				System.out.println();
			}else{
				System.out.println("Patient ID   : " + id);
				System.out.println("Name         : " + name);
				System.out.println("Age          : " + age);
				System.out.println("Disease      : " + disease);
				System.out.println("Patient is not a senior citizen");
				System.out.println();
			}
		}
		
	public static void main(String [] args){		
		HospitalPatientRecordSystem hprs1 = new HospitalPatientRecordSystem(1,"Raman Kumar", 65, "Appendix" );
		hprs1.seniorityCheck();
		HospitalPatientRecordSystem hprs2 = new HospitalPatientRecordSystem(2,"Karan Kumar", 50, "Appendix" );
		hprs2.seniorityCheck();
		HospitalPatientRecordSystem hprs3 = new HospitalPatientRecordSystem(3,"Varun Kumar", 25, "Appendix" );
		hprs3.seniorityCheck();
		
	}
}
