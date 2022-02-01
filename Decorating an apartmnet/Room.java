package Apartmani_mani_mani;
import java.awt.Color;

public class Room {
	FloorType floorType;
	double area;
	boolean heated;
	int numberOfWindows;
	Color wallColor;
	
	public Room(FloorType floorType, double area, boolean heated, int numberOfWindows, Color wallColor) {
		this.floorType = floorType;
		this.area = area;
		this.heated = heated;
		this.numberOfWindows = numberOfWindows;
		this.wallColor = wallColor;
	}

	public FloorType getFloorType() {
		return floorType;
	}

	public double getArea() {
		return area;
	}

	public boolean isHeated() {
		return heated;
	}

	public int getNumberOfWindows() {
		return numberOfWindows;
	}

	public Color getWallColor() {
		return wallColor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((floorType == null) ? 0 : floorType.hashCode());
		result = prime * result + (heated ? 1231 : 1237);
		result = prime * result + numberOfWindows;
		result = prime * result + ((wallColor == null) ? 0 : wallColor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (floorType != other.floorType)
			return false;
		if (heated != other.heated)
			return false;
		if (numberOfWindows != other.numberOfWindows)
			return false;
		if (wallColor == null) {
			if (other.wallColor != null)
				return false;
		} else if (!wallColor.equals(other.wallColor))
			return false;
		return true;
	}
	
	
}
