public class Camara {

    double megaPixeles;
    int zoom;
    boolean optico; // lente optico true y false si es digital

    public Camara(){    }

    public Camara(double megaPixeles, int zoom, boolean optico) {
        this.megaPixeles = megaPixeles;
        this.zoom = zoom;
        this.optico = optico;
    }

    public double getMegaPixeles() {
        return megaPixeles;
    }

    public void setMegaPixeles(double megaPixeles) {
        this.megaPixeles = megaPixeles;
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
                "megaPixeles=" + megaPixeles +
                ", zoom=" + zoom +
                ", optico=" + optico +
                '}';
    }
}
