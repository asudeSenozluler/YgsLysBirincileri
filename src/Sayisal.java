
public class Sayisal extends Aday{

    private int matematik;
    private int fizik;

    public Sayisal(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }

    @Override
    public int puanHesapla() {
    
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1;
        
    
    }

    private int getEdebiyat() {
        return 0;
    }

    private int getTurkce() {
    }

    public int getMatematik() {
        int matematik = 0;
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public String getIsim() {
        return getIsim();
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }
}
