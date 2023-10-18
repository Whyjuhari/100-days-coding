public class Player{

    // attribut atau properti
    String nama;
    int speed;
    int healthPoint;

    // method atau perilaku
    void berlari(){
        System.out.println(nama + " Sedang berlari...");
        System.out.println("Kecepatan : " + speed);
    }

    // method untuk mengecek nilai healtPoint
    boolean isDead() {
        if (healthPoint <= 0) return true;
        return false;
    }

    // SETTER AND GETTER
    // Nama
    void setName(String nama){
        this.nama = nama;
    }
    String getName(){
        return nama;
    }
    
    // Speed
    void setSpeed(int speed) {
        this.speed = speed;
    }
    int getSpeed(){
        return speed;
    }

    // HealtPoint
    void setHealtpoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    int getHealtpoint(){
        return healthPoint;
    }

}