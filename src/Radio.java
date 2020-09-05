public class Radio implements RadioInt{

    private double wave;

    public Radio(double wave) {
        this.wave = wave;
    }

    public double getStation() {
        return wave;
    }

    public void setStation(double wave) {
        wave = this.wave;
    }

    public void tell(){

    }
}