package Apartmani_mani_mani;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Apartment {
	Set<Room> rooms=new HashSet<>();
	String adresa;
	int floor;
	public Apartment(String adresa, int floor) {
		this.adresa = adresa;
		this.floor = floor;
	}
	public void addRooms(Room... r) {
		for(int i=0;i<r.length;i++)
			rooms.add(r[i]);
	}
	public void removeRooms(Room... r) {
		for(int i=0;i<r.length;i++)
			rooms.remove(r[i]);
	}
	public boolean containsRoom(Room r) {
		return rooms.contains(r);
	}
	public Iterator<Room> roomIterator(){
		return rooms.iterator();
	}
	
	public double getArea() {
		double area=0.;
		for(Room r:rooms)area+=r.getArea();
		return area;
	}
	public String getAdress() {
		return adresa;
	}
	public int getFloor() {
		return floor;
	}

}
