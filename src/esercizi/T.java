package esercizi;

public class T {
    private int ore;
    private int minuti;
    private int secondi;

    public T(){

    }

    public T(int ore, int minuti, int secondi){
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public int getOre() {
        return ore;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void setOre(int ore) {
        try{
            if(ore < 0 || ore > 24){
                throw new Exception("Inserisci un numero tra 0 e 24");
            }
            this.ore = ore;
        }
        catch (Exception e){
            e.getMessage();
        }

    }

    public void setMinuti(int minuti) {
        try{
            if(minuti < 0 || minuti > 60){
                throw new Exception("Inserisci un numero tra 0 e 60");
            }
            this.minuti = minuti;
        }
        catch (Exception e){
            e.getMessage();
        }

    }

    public void setSecondi(int secondi) {
        try{
            if(secondi < 0 || secondi > 60){
                throw new Exception("Inserisci un numero tra 0 e 60");
            }
            this.secondi = secondi;
        }
        catch (Exception e){
            e.getMessage();
        }
    }
}