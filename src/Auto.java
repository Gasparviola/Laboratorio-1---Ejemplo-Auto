
import javax.swing.JOptionPane;

public class Auto {
         private String color;
         private boolean chocado;
         private int posX;
         private int posY;

        public Auto(String color, int posX, int posY) {
            this.color = color;
            this.posX = posX;
            this.posY = posY;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isChocado() {
            return chocado;
        }

        public void setChocado(boolean chocado) {
            this.chocado = chocado;
        }

        public int getPosX() {
            return posX;
        }

        public void setPosX(int posX) {
            this.posX = posX;
        }

        public int getPosY() {
            return posY;
        }

        public void setPosY(int posY) {
            this.posY = posY;
        }
         
        public void moverArriba(){
            if(!chocado && posY > 0){
                posY = posY - 1;
                System.out.println("POS Y: " + posY);
                
            }else{
                JOptionPane.showMessageDialog(null,"No se puede mover, llegaste muy arriba");
            }
        }
        
        public void moverAbajo(){
            if(!chocado && posY < 22){
                posY = posY + 1;
                System.out.println("POS Y: " + posY);
                
            }else{
                JOptionPane.showMessageDialog(null,"No se puede mover, llegaste muy abajo");
            }
        }
        
        public void moverDerecha(){
            if(!chocado && posX < 80){
                posX = posX + 1;
                System.out.println("POS X: " + posX);
                
            }else{
                JOptionPane.showMessageDialog(null,"No se puede mover, llegaste al tope de la derecha");
            }
        }
        
        public void moverIzquierda(){
            if(!chocado && posY > 0){
                posX = posX - 1;
                System.out.println("POS X: " + posX);
                
            }else{
                JOptionPane.showMessageDialog(null,"No se puede mover, llegaste al tope de la izquierda");
            }
        }
         
}
