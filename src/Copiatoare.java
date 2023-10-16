public class Copiatoare extends Produse {
    int nrPagCopiator;
    enum formatCopiere{
        A3,A4;
    }
    public Copiatoare(String denProdus,int numarInventar,float pret,char zonaMag, int nrPagCopiator){
        super(denProdus,numarInventar,pret,zonaMag);
        this.nrPagCopiator=nrPagCopiator;
    }
}
