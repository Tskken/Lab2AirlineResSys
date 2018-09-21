import java.util.ArrayList;
import java.util.Map;

public class Aircraft {
    private Company mCompany;
    private int mSeatCount;
    private Map<String, ArrayList<Seat>> mSeatList;

    public Aircraft(Company mCompany, int mSeatCount, Map<String, ArrayList<Seat>> mSeatList) {
        this.mCompany = mCompany;
        this.mSeatCount = mSeatCount;
        this.mSeatList = mSeatList;
    }

    public Company getmCompany() {
        return mCompany;
    }

    public void setmCompany(Company mCompany) {
        this.mCompany = mCompany;
    }

    public int getmSeatCount() {
        return mSeatCount;
    }

    public void setmSeatCount(int mSeatCount) {
        this.mSeatCount = mSeatCount;
    }

    public Map<String, ArrayList<Seat>> getmSeatList() {
        return mSeatList;
    }

    public void setmSeatList(Map<String, ArrayList<Seat>> mSeatList) {
        this.mSeatList = mSeatList;
    }
}
