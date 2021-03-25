package nl.novi.javaprogrammeren.overerving;

public class SpaceXRocket extends Rocket {

    @Override
    public int calculateMetersFlown(int fuel) {
        return fuel * 250;

    }
    // We roepen hier de constructor aan van Rocket
    public SpaceXRocket(int maximumFuel) {
        super(maximumFuel);
    }

}
