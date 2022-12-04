package Person;

public class Pilot extends CabinCrewMember{

    private Rank rank;
    private int licenceNumber;
    public Pilot(String name, Rank rank, int licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public int getLicenceNumber() {
        return licenceNumber;
    }

    public String flyPlane() {
        return String.format("I am flying the plane lalalaa");
    }
}
