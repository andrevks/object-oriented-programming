package Chapter11.calculoimc;

public class Homem extends Pessoa implements IAptoCalcularIMC {


    @Override
    public void calcularIMC() {
        float imc = 0;
        float peso = this.getPeso();
        float altura = this.getAltura();
        imc = peso / (altura * altura);
        this.setImc(imc);
    }
}
