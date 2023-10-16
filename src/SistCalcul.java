public class SistCalcul extends Produse {
    String tipMon;
    int vitProcesor;
    int capHdd;
    enum sistOperare{
        windows,linux
    }

    public SistCalcul(String denProdus,int numarInventar,float pret,char zonaMag,String tipMon,int vitProcesor,int capHdd){
        super(denProdus,numarInventar,pret,zonaMag);
        this.tipMon=tipMon;
        this.vitProcesor=vitProcesor;
        this.capHdd=capHdd;
    }
}
