package Homework;
import java.util.Objects;
import Homework.NullParameterException;
import Homework.BadParameterException;


public class Airport implements Flight{

    private String name;

    public Airport(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) throws NullParameterException, BadParameterException {
        if (name == null) {
            throw new NullParameterException("Airport name cannot be null.");
        }

        if (name.length() != 3 || !name.equals(name.toUpperCase())) {
            throw new BadParameterException("Invalid name.");
        }

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + getName() + '\'' +
                '}';
    }

	@Override
	public String getFlightNumber() {
		return null;
	}
}