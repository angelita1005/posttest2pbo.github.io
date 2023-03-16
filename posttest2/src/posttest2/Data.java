package TokoHewanDream;


class Data { // digunakan untuk menyimpan informasi tentang objek-objek yang dibuat dalam program.
    private String name; // atribut yang hanya bisa diakses di class yang sama
    private String tanggalAdopsi;
    private String JenisHewan;
    private int tinggi;
    private double berat;

    // untuk membuat objek baru dari class dgn nilai atribut yang telah
    // diinisialisasi pada saat objek dibuat.
    public Data(String name, String tanggalAdopsi, String JenisHewan, int tinggi, double berat) {
        this.name = name; // untuk menginisialisasi atribut "name"
        this.tanggalAdopsi = tanggalAdopsi;
        this.JenisHewan = JenisHewan;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the TanggalAdopsi
     */
    public String getTanggalAdopsi() {
        return tanggalAdopsi;
    }

    /**
     * @param tanggalLahir the TanggalAdopsi to set
     */
    public void setTanggalLahir(String tanggalAdopsi) {
        this.tanggalAdopsi = tanggalAdopsi;
    }

    /**
     * @return the JenisHewan
     */
    public String getJenisHewan() {
        return JenisHewan;
    }

    /**
     * @param JenisHewan the JenisHewan to set
     */
    public void setJenisHewan(String JenisHewan) {
        this.JenisHewan = JenisHewan;
    }

    /**
     * @return the tinggi
     */
    public int gettinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void settinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the berat
     */
    public double getberat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setberat(double berat) {
        this.berat = berat;
    }
 
}
