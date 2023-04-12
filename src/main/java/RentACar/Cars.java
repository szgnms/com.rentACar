package RentACar;


public class Cars {
    String marka;
    String model;


    // public String getMarka() {
    //     return marka;
    // }

    //  public void setMarka(String marka) {
    //      this.marka = marka;
    //  }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVitesTipi() {
        return vitesTipi;
    }

    public void setVitesTipi(String vitesTipi) {
        this.vitesTipi = vitesTipi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }


    public String getTeslimTarih() {
        return teslimTarih;
    }

    public void setTeslimTarih(String teslimTarih) {
        this.teslimTarih = teslimTarih;
    }

    public String getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(String alisSaati) {
        this.alisSaati = alisSaati;
    }

    public String getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(String teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    String yakitTipi;
    String vitesTipi;
    int fiyat;

    ////////////
    String alisYil;
    String alisAy;
    String alisGun;
    String teslimYil;
    String teslimAy;
    String teslimGun;
    String teslimTarih;
    String alisSaati;
    String teslimSaati;


    Cars(String alisYil, String alisAy, String alisGun) {
        this.alisYil = alisYil;
        this.alisAy = alisAy;
        this.alisGun = alisGun;

    }

    public String getTeslimYil() {
        return teslimYil;
    }

    public void setTeslimYil(String teslimYil) {
        this.teslimYil = teslimYil;
    }

    public String getTeslimAy() {
        return teslimAy;
    }

    public void setTeslimAy(String teslimAy) {
        this.teslimAy = teslimAy;
    }

    public String getTeslimGun() {
        return teslimGun;
    }

    public void setTeslimGun(String teslimGun) {
        this.teslimGun = teslimGun;
    }

    Cars(String teslimYil, String teslimAy, String teslimGun, String a) {
        this.teslimYil = teslimYil;
        this.teslimAy = teslimAy;
        this.teslimGun = teslimGun;

    }

    Cars() {

    }

    public String getAlisYil() {
        return alisYil;
    }

    public void setAlisYil(String alisYil) {
        this.alisYil = alisYil;
    }

    public String getAlisAy() {
        return alisAy;
    }

    public void setAlisAy(String alisAy) {
        this.alisAy = alisAy;
    }

    public String getAlisGun() {
        return alisGun;
    }

    public void setAlisGun(String alisGun) {
        this.alisGun = alisGun;
    }

    Cars(String marka, String model, String yakitTipi, String vitesTipi, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.vitesTipi = vitesTipi;
        this.yakitTipi = yakitTipi;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return
                marka + "    " +
                        model + "    " +
                        yakitTipi + "    " +
                        vitesTipi + "    " +
                        fiyat + "TL";
    }
}
