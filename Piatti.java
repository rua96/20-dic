package ristorante;

public abstract class Piatti {
	protected String nome, categoria;
	protected double prezzo;
	   
    Piatti(String n, double p){
    	 nome=n; prezzo=p;
    	}
    
    public String getNome() {
    	return nome;
   }
    public String getCategoria() {
    	return categoria;
   }
    public double getPrezzo() {
    	return prezzo;
   }
    
    
    public String toString() {
        return " Nome : " + nome + ", Prezzo : " + prezzo + "€." ;
}

}
