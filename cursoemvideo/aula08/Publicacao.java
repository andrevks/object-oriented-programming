package cursoemvideo.aula08;

public interface Publicacao {
    //Métodos abstratos
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int atePg);
    public abstract void avancarPag();
    public abstract void voltarPag();
}
