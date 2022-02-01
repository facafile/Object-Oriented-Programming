package Pravi_labos_5;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;


public class Solution {

	public static Function<Boolean,String> createMessageFunction = (a)->a==true?"Patient hospitalized.":"Patient was not found." ;
	
	public static BiConsumer<Hospital, List<String>> addPatientsBiConsumer(){
		return (hospital,patients)->{if(hospital.getPatients()==null && patients.size()!=0)hospital.setPatients(patients);};
			}
		
	
	public static BiFunction<Hospital, String, Boolean> checkIfPatientIsInHospitalFunction(){
		return (hospital,patients)->hospital.getPatients().contains(patients)?true:false;
	}
	public static String status(Hospital hospital, String patient, BiFunction<Hospital, String, Boolean> checkIfPatientIsInHospital, Function<Boolean,String> createMessage) {
		return createMessage.apply(checkIfPatientIsInHospital.apply(hospital, patient));
	}
}
