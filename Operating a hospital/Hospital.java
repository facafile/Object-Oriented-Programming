package Pravi_labos_5;

import java.util.List;

public class Hospital {
	    private String name;
	    private List<String> patients;
	    public Hospital(String name){
	        this.name=name;
	    }
	    public List<String> getPatients() {
	        return patients;
	    }
	    public void setPatients(List<String> patients) {
	        this.patients = patients;
	    }
	    @Override public String toString() {
	        return "Hospital [name=" + name + ", patients=" + patients + "]";
	    }
	}

