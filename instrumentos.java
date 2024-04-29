//Sinceramente no entiendo bien para que se usa el override, entiendo que es para declararlo explicitamente pero es totalmente necesario?


abstract class InstrumentoMusical {
    String n;


    public InstrumentoMusical(String n) {
        this.n = n;
    }


    abstract void tocar();


}


class InstrumentoCuerda extends InstrumentoMusical {

    public InstrumentoCuerda(String n) {
        super(n);
    }


    @Override
    void tocar() {
        System.out.println(n + " está siendo tocado como un instrumento de cuerda.");
    }


}


class InstrumentoViento extends InstrumentoMusical {
	
    public InstrumentoViento(String n) {
        super(n);
    }
	
    @Override
    void tocar() {
        System.out.println(n + " tocado");
    }
	
}

class InstrumentoPercusion extends InstrumentoMusical {
    
    public InstrumentoPercusion(String n) {
        super(n);
    }
	
    @Override
    void tocar() {
        System.out.println(n + " tocado");
    }
	
}


public class Main {
    public static void main(String[] args) {

        InstrumentoCuerda guitarra = new InstrumentoCuerda("Guitarra");
        InstrumentoViento flauta = new InstrumentoViento("Flauta");
        InstrumentoPercusion bateria = new InstrumentoPercusion("Batería");

        guitarra.tocar();

        flauta.tocar();

        bateria.tocar();

    }
}
