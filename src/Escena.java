
import java.util.Scanner;


public class Escena {
        private Auto auto;
        private Pared pared;
        
        public Escena(Auto auto){
            this.auto = auto;
            this.pared = new Pared();
        }

        public void setAuto(Auto auto) {
            this.auto = auto;
        }

            public Pared getPared() {
                return pared;
            }

        
        public void jugar(){    
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Comience a moverse");
            
            while(true){           
                String movimiento = leer.nextLine();
                
                if( movimiento.equals("a")){
                    
                auto.moverIzquierda();
                    if(auto.getPosX() >= pared.getPosX()){ 
                        System.out.println("El auto choco, fin del juego");
                        break;                    
                    }else if(auto.getPosX() == 0){
                        System.out.println("Llegaste al limite de la izq, vuelve a empezar");
                        break;
                    }else{
                        System.out.println("Moviendo 1 paso hacia la Izquierda");
                    }             
                
                    }else if( movimiento.equals("d")){
                        
                        auto.moverDerecha();     
                        if(auto.getPosX() >= pared.getPosX()){
                            System.out.println("El auto choco, fin del juego");
                            break;
                        }else{
                            System.out.println("Moviendo 1 paso hacia la Derecha");
                        }

                    }else if ( movimiento.equals("w")){
                        
                        auto.moverArriba();
                        if(auto.getPosY() >= pared.getPosY()){
                            System.out.println("El auto choco, fin del juego");
                            break;
                        }else{
                            System.out.println("Moviendo 1 paso hacia Arriba");
                        }

                    }else if ( movimiento.equals("s")){
                        
                        auto.moverAbajo();
                        if(auto.getPosY() >= pared.getPosY()){
                            System.out.println("El auto choco, fin del juego");
                            break;
                        }else{
                            System.out.println("Moviendo 1 paso hacia Abajo");
                        } 
                        
                    }else if(movimiento.equals("e")){
                        System.out.println("Saliendo");
                        break;
                    }
            }                
        }

        

}
