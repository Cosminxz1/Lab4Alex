public class Imprimante extends Produse {
    int numarPagPerMin;
    String rezolutie;
    int numarPagini;
    enum modTiparire{
        color,albNegru;
    }
    public Imprimante(String denProdus,int numarInventar,float pret,char zonaMag,int numarPagPerMin, String rezolutie, int numarPagini){
        super(denProdus,numarInventar,pret,zonaMag);
        this.numarPagPerMin=numarPagPerMin;
        this.rezolutie=rezolutie;
        this.numarPagini=numarPagini;
    }
}
