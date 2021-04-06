package avaliacao.modeloConceitual;

public class Comissionado extends Empregado {
    /*
     * Significado de Comissionado
     *
     * Que exerce um cargo por comissão (nomeação).
     * */

    private float percentualComissao;

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
