class Bilgisayar {
    private String islemci;
    public int ram;

    public Bilgisayar(String islemci, int ram) {
        this.islemci = islemci;
        this.ram = ram;
    }

    public String getIslemci() {
        return islemci;
    }

    public void setIslemci(String islemci) {
        this.islemci = islemci;
    }
}

class IsIstasyonu extends Bilgisayar {
    public String isletimSistemi;
    private double ekranBoyutu;

    public IsIstasyonu(String islemci, int ram, String isletimSistemi, double ekranBoyutu) {
        super(islemci, ram);
        this.isletimSistemi = isletimSistemi;
        this.ekranBoyutu = ekranBoyutu;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }
}

public class Main {
    public static void main(String[] args) {
        IsIstasyonu pc = new IsIstasyonu("Intel i7", 16, "Windows 11", 15.6);

        System.out.println("İşlemci: " + pc.getIslemci());
        System.out.println("RAM: " + pc.ram);
        System.out.println("İşletim Sistemi: " + pc.isletimSistemi);
        System.out.println("Ekran Boyutu: " + pc.getEkranBoyutu());
    }
}