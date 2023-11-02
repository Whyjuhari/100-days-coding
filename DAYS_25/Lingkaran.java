package DAYS_25;

public class Lingkaran extends BangunDatar {
    int r;

    public Lingkaran(int jari_jari) {
        this.r = jari_jari;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r);
    }
}
