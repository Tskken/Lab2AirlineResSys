import java.util.Date;

public class main {
    public static void main(String args[]){
        Aircraft airCraft1 = new Aircraft();

        Company delta = new Company("Delta Air lines, Inc.");
        airCraft1.setmCompany(delta);

        Flight flight1 = new Flight();
        flight1.setmAircraft(airCraft1);
        flight1.setmDepartDate(new Date(1507644000000L));
        flight1.setmOrigin(new Airport("Burlington Airport", "Burlington, VT"));
        flight1.setmDestination(new Airport("JFK Airport", "New York City, NY"));
        flight1.setmArriveDate(new Date(1507647600000L));

        Flight flight2 = new Flight();
        flight2.setmAircraft(airCraft1);
        flight2.setmDepartDate(new Date(1507644000000L));
        flight2.setmOrigin(new Airport("JFK Airport", "New York City, NY"));
        flight2.setmDestination(new Airport("Atlanta Airport", "Atlanta, GA"));
        flight2.setmArriveDate(new Date(1507647600000L));

        Customer customerMurat = new Customer("Murat", "Gungor");
        Itinerary itin1 = new Itinerary(flight1, new Seat("12A", ESeatType.REGULAR, true), customerMurat);
        Itinerary itin2 = new Itinerary(flight2, new Seat("15E", ESeatType.VIP, true), customerMurat);
        customerMurat.addItinerarys(itin1);
        customerMurat.addItinerarys(itin2);
        customerMurat.printItineraries();
    }
}
