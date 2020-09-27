package overriding2;

public class Test {

	public static void main(String[] args) {
		
		Doctor doctorObj = new Doctor();
		// treatPatient method in class Doctor will be executed
		
		doctorObj.treatPatient();
		Surgeon surgeonObj = new Surgeon();
		// treatPatient  method in class Surgeon  will be executed
		surgeonObj.treatPatient();

	}

}
