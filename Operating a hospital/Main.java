package Pravi_labos_5;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Hospital hospital = new Hospital("Nasa mala klinika"); 
		List<String> patients = Arrays.asList("Zoe", "Koko", "Flaco", "Zadro", "Raul");
		Solution.addPatientsBiConsumer().accept(hospital, patients);
		System.out.println(hospital.getPatients());
		System.out.println(Solution.status(hospital, "Zadro", Solution.checkIfPatientIsInHospitalFunction(), Solution.createMessageFunction));
		System.out.println(Solution.status(hospital, "Mickey", Solution.checkIfPatientIsInHospitalFunction(), Solution.createMessageFunction));

	}

}
