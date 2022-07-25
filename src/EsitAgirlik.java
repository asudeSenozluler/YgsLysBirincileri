import Aday.Aday;

public class EsitAgirlik extends Aday {

    private int matematik;
    private int fizik;

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        super(turkce, matematik, edebiyat, fizik,isim);
    }

    @Override
    public int puanHesapla() {
        
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;
    }


    public String getIsim() {
    }

    public int getTurkce() {
        int turkce = 0;
        return turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }
}
