
public class ejemploAuto {

    public static void main(String[] args) {

        Auto ford = new Auto("rojo", 10,5); 
    
        Escena escena1 = new Escena(ford);
        escena1.jugar();
    }
    
}
