public class Data {

    private int dia;
    private int mes;
    private int ano;

    public String getData(){
        String data = "";
        data += this.dia +"/"+ this.mes + "/" + this.ano;
        return data;
    }
    public boolean setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        return true;
    }
}
