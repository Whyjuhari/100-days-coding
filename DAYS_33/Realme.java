package DAYS_33;

public class Realme implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Realme() {
        // Set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di REALME 8");
        System.out.println("Android Version 12");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("Sudahh " + this.getVolume() + "%");
            } else {
                this.volume += 5;
                System.out.println("Volume sekarang : " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan dulu dong HP-nya!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 5;
                System.out.println("Volume sekarang : " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan dulu dong HP-nya!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
