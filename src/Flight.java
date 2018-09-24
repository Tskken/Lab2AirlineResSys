import java.util.Date;

public class Flight {
    private String mID;
    private Date mDepartDate;
    private Date mArriveDate;
    private Airport mOrigin;
    private Airport mDestination;
    private Aircraft mAircraft;

    public Flight(String id, Date departDate, Date arrivalDate, Airport origin, Airport destination, Aircraft aircraft) {
        this.mID = id;
        this.mDepartDate = departDate;
        this.mArriveDate = arrivalDate;
        this.mOrigin = origin;
        this.mDestination = destination;
        this.mAircraft = aircraft;
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public Date getmDepartDate() {
        return mDepartDate;
    }

    public void setmDepartDate(Date mDepartDate) {
        this.mDepartDate = mDepartDate;
    }

    public Date getmArriveDate() {
        return mArriveDate;
    }

    public void setmArriveDate(Date mArriveDate) {
        this.mArriveDate = mArriveDate;
    }

    public Airport getmOrigin() {
        return mOrigin;
    }

    public void setmOrigin(Airport mOrigin) {
        this.mOrigin = mOrigin;
    }

    public Airport getmDestination() {
        return mDestination;
    }

    public void setmDestination(Airport mDestination) {
        this.mDestination = mDestination;
    }

    public Aircraft getmAircraft() {
        return mAircraft;
    }

    public void setmAircraft(Aircraft mAircraft) {
        this.mAircraft = mAircraft;
    }
}
