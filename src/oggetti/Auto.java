package oggetti;
public class Auto {
    private String marca;
    private String modello;
    private double prezzo;
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setMarca(String m){
        marca=m;
    }

    public void setModello(String m) {
        modello=m;
    }
    public void setPrezzo(double p){
        if(p<0.0){
            System.out.println("prezzo non valido, impostato a 0");
            prezzo=0.0;
        }else
            prezzo=p;
    }
    public Auto (String ma, String mo,double p ){
        marca=ma;
        modello=mo;
        if(p<0.0){
            System.out.println("prezzo non valido, impostato a 0");
            prezzo=0.0;
        }else
            prezzo=p;
    }
    public Auto () {
        marca = "sconosciuta";
        modello= "sconosciuto";
        prezzo= 0.0;
    }
    public Auto (String ma){
        marca=ma;
    }



}
