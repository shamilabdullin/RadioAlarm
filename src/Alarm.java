import java.util.Date;

public class Alarm implements AlarmInt{

    private Date wake;

    public Alarm(Date wake) {
        this.wake = wake;
    }

    public void setWake(Date wake) {
        this.wake = wake;
    }

    public Date getWake() {
        return wake;
    }
}