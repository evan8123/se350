package Homework;
public class Airline {
	private String lineName;

	public Airline(String name) {
		setLineName(name);
	}

	public String getLineName() {
		return lineName;
	}

	private void setLineName(String lName) throws IllegalArgumentException{
		if(lName.length() <=0 || lName.length() > 7 || lName == null){
			throw new IllegalArgumentException ("Bad value passed in to setLineName");
		}
		lineName = lName;
	}
	public boolean equals(Object object) {
		 final Airline other = (Airline) object;
		if (getLineName().equals(other.getLineName())) {
			return true;
		}
		else {return false;}
	}

	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + getLineName().hashCode();
		return result;
	}
	public java.lang.String toString() {
		return "Airline{" +
				"lineName='" + lineName + '\'' +
				'}';
	}
}

