package Homework;
public class Airport {
	private String portName;

	public Airport(String name) {
		setPortName(name);
	}

	public String getPortName() {
		return portName;
	}

	private void setPortName(String pName) throws IllegalArgumentException{
		if(pName.length() <3 || pName.length() > 3 || pName == null){
			throw new IllegalArgumentException ("Bad value passed in to setPortName");
		}
		portName = pName.toUpperCase();
	}
	public boolean equals(Object object) {
		final Airport other = (Airport) object;
		if (getPortName().equals(other.getPortName())) {
			return true;
		}
		else {return false;}
	}

	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + getPortName().hashCode();
		return result;
	}
	public java.lang.String toString() {
		return "Airport{" +
				"portName='" + portName + '\'' +
				'}';
	}
}

