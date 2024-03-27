/*
 * Nama: Kinky Maylana Prakoso
 * NIM: 235150701111007
 * Kelas: A
 */

public class LCD {
    
    // Mendeklarasikan variabel status dengan tipe data String
    // Mendeklarasikan variabel volume dengan tipe data int
    // Mendeklarasikan variabel brightness dengan tipe data int
    // Mendeklarasikan variabel cable dengan tipe data String
    private String status;
    private int volume;
    private int brightness;
    private String cable;

    // Merupakan sebuah Constructor
    public LCD() {

        // LCD dengan kondisi default
        this.status = "Off";
        this.volume = 50;
        this.brightness = 50;
        this.cable = null;
        
    }

    // Membuat method untuk status

    // Method untuk menyalakan
    public void turnOn() { 
        this.status = "On";
    }

    //Method untuk mematikan
    public void turnOff() {
        this.status = "Off";
    }

    //Method ngefrez
    public void Freeze() {
        this.status = "Freeze";
    }

    // Membuat method untuk volume

    // Method untuk menambah volume
    public void volumeUp() {
        this.volume++;
    }

    // Method untuk mengurangi volume
    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    // Method untuk mengeset Suara
    public void setVolume(int volume) {
        if (volume >= 0) {
            this.volume = volume;
        }
    }

    // Membuat Method untuk Kecerahan

    // Method untuk menambah kecerahan
    public void brightnessUp() {
        this.brightness++;
    }

    // Method untuk mengurangi kecerahan
    public void brightnessDown() {
        if(this.brightness > 0) {
            this.brightness--;
        }
    }

    // Method untuk mengeset kecerahan
    public void setBrightness(int brightness) {
        if(this.brightness >= 0) {
            this.brightness = brightness;
        }
    }

    // Membuat method untuk Kabel
    // Dengan memakai array
    public void setCable(int option) {
        String[] cableTypes = {
            "VGA",
            "DVI",
            "HDMI",
            "DisplayPort"
        };

        this.cable = cableTypes[option];
    }
    
    // Menampilkan hasil pada layar
    public void displayMessage() {
        System.out.println("LCD Status: " + this.status);
        System.out.println("Volume: " + this.volume);
        System.out.println("Brightness: " + this.brightness);
        System.out.println("Cable: " + this.cable);
    }
}