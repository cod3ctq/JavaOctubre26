public class Camara {

    double mpx;
    int zoom;
    boolean optico;

    public Camara(){}

    public Camara(double mpx, int zoom, boolean optico) {
        this.mpx = mpx;
        this.zoom = zoom;
        this.optico = optico;
    }

    public double getMpx() {
        return mpx;
    }

    public void setMpx(double mpx) {
        this.mpx = mpx;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public boolean isOptico() {
        return optico;
    }

    public void setOptico(boolean optico) {
        this.optico = optico;
    }

    @Override
    public String toString() {
        return "Camara{" +
                "mpx=" + mpx +
                ", zoom=" + zoom +
                ", optico=" + optico +
                '}';
    }
}