public class Teren extends TipProprietate {
    private RangLocalitate rangulLocatiei;
 
 public Teren(int pret, int suprafata, Adresa adresa, RangLocalitate rangulLocatiei) {
     super(300, suprafata, adresa);
     this.rangulLocatiei = rangulLocatiei;
 }
 
 @Override
 public int impozit() {
       return this.getPret()*this.getSuprafata()/rangulLocatiei.getRang();
     
 }
   
 }