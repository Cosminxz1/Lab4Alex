public class Produse {
    String denProdus;
    int numarInventar;
    float pret;
    char zonaMag;
    enum stareProdus{
        achizitionat,expus,vandut;
    }

    public Produse(String denProdus,int numarInventar,float pret,char zonaMag){
        this.denProdus=denProdus;
        this.numarInventar=numarInventar;
        this.pret=pret;
        this.zonaMag=zonaMag;
    }

}
