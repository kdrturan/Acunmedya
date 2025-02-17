public class Musteri {
    private String isim;
    private double bakiye;
    private String sifre;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Musteri(String isim,String sifre){
        this.isim = isim;
        this.bakiye = 500.0;
        this.sifre = sifre;
    }

}
