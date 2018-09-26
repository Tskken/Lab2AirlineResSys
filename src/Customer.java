import java.util.ArrayList;

public class Customer {
    private String mFName;
    private String mLName;
    private ArrayList<Itinerary> mItinerarys;

    public Customer(String fName, String lName) {
        this.mFName = fName;
        this.mLName = lName;
        this.mItinerarys = new ArrayList<Itinerary>();
    }

    public void addItinerarys(Itinerary newItinerary){
        this.mItinerarys.add(newItinerary);
    }

    public String getmFName() {
        return mFName;
    }
    public void setmFName(String mFName) {
        this.mFName = mFName;
    }
    public String getmLName() {
        return mLName;
    }
    public void setmLName(String mLName) {
        this.mLName = mLName;
    }
    public ArrayList<Itinerary> getmItinerarys() {
        return mItinerarys;
    }
    public void setmItinerarys(ArrayList<Itinerary> mItinerarys) {
        this.mItinerarys = mItinerarys;
    }

    public void printItineraries() {
        for (int i = 0; i < mItinerarys.size(); i++) {
            System.out.println("Name    : " + mFName);
            System.out.println("Lastname: " + mLName);
            System.out.println("From    : " + mItinerarys.get(i).getmFlight().getmOrigin().getmLocation());
            System.out.println("To      : " + mItinerarys.get(i).getmFlight().getmDestination().getmLocation());
            System.out.println("Seat #  : " + mItinerarys.get(i).getmSeat().getmLocation());
            System.out.println("Carrier : " + mItinerarys.get(i).getmFlight().getmAircraft().getmCompany().getmName());
            System.out.println("----------------------");
        }
        System.out.println("----End of Itinerary----");
    }
}
