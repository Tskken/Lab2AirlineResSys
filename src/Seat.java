public class Seat {
    private String mLocation;
    private ESeatType mSeatType;
    private Boolean mIsOccupied;

    public Seat(String mLocation, ESeatType mSeatType, Boolean mIsOccupied) {
        this.mLocation = mLocation;
        this.mSeatType = mSeatType;
        this.mIsOccupied = mIsOccupied;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public ESeatType getmSeatType() {
        return mSeatType;
    }

    public void setmSeatType(ESeatType mSeatType) {
        this.mSeatType = mSeatType;
    }

    public Boolean getmIsOccupied() {
        return mIsOccupied;
    }

    public void setmIsOccupied(Boolean mIsOccupied) {
        this.mIsOccupied = mIsOccupied;
    }
}
