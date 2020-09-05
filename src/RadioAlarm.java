import java.util.Date;

public class RadioAlarm implements AlarmInt, RadioInt{

    private Date wake;
    private Double wave;

    @Override
    public void setWake(Date date) {
        this.wake = date;
    }

    @Override
    public Date getWake() {
        return this.wake;
    }

    @Override
    public void setStation(double wave) {
        this.wave = wave;
    }

    @Override
    public double getStation() {
        return this.wave;
    }


    @Override
    public void tell() {

    }
}