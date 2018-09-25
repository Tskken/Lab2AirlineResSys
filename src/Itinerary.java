public class Itinerary {
    private Flight mFlight;
    private Seat mSeat;
    private Customer mCustomer;

    public Itinerary(Flight flight, Seat seat, Customer customer) {
        this.mFlight = flight;
        this.mSeat = seat;
        this.mCustomer = customer;
    }

    public Flight getmFlight() {
        return mFlight;
    }
    public void setmFlight(Flight mFlight) {
        this.mFlight = mFlight;
    }
    public Seat getmSeat() {
        return mSeat;
    }
    public void setmSeat(Seat mSeat) {
        this.mSeat = mSeat;
    }
    public Customer getmCustomer() {
        return mCustomer;
    }
    public void setmCustomer(Customer mCustomer) {
        this.mCustomer = mCustomer;
    }
}
