public class BusDetails {
    public String BusName;
    public String Route;
    public int Capacity;
    public int Fare;
    public boolean AcNonAC;

    BusDetails(String bname, String route, int cap, int fare, boolean ac) {
        this.BusName = bname;
        this.Route = route;
        this.Capacity = cap;
        this.Fare = fare;
        this.AcNonAC = ac;
    }


    public String getBusName() {
        return BusName;
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String route) {
        Route = route;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int cap) {
        Capacity = cap;
    }

    public int getFare() {
        return Fare;
    }

    public void setFare(int fare) {
        Fare = fare;
    }

    public boolean isAcNonAC() {
        return AcNonAC;
    }

    public void BusDisplayinfo() {
        System.out.println("Bus Name:" + BusName + " ||Route :" + Route + " ||BusCapacity: " + Capacity + " ||BusFare: " + Fare + " ||Ac: " + AcNonAC);
        System.out.println("-------------------------------------------------------------------");
    }
}
