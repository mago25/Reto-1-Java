
public class Main {
    public static void main(String[] args) {

        ClearConsole();

        // Evaluacion de Estados:
        // Estado 1:
        Autobus c1 = new Autobus("Pepe", 30, false);
        //imprEstados(c1);

        // Estado 2:
        c1.moverDerecha(5);
        //imprEstados(c1);

        // Estado 3:
        c1.gestionarWifi();
        c1.gestionarAireAcondicionado();
        c1.gestionarMarcha();
        //imprEstados(c1);

        // Estado 4:
        c1.gestionarMotor();
        c1.gestionarMarcha();
        c1.moverDerecha(5);
        //imprEstados(c1);

        // Estado 5:
        c1.recogerPasajero(2);
        c1.gestionarPuerta();
        c1.moverArriba(10);
        //imprEstados(c1);

        // Estado 6:
        c1.gestionarMarcha();
        c1.gestionarPuerta();
        c1.recogerPasajero(1);
        c1.recogerPasajero(4);
        c1.recogerPasajero(6);
        //imprEstados(c1);

        // Estado 7:
        c1.gestionarWifi();
        c1.gestionarAireAcondicionado();
        c1.gestionarMarcha();
        c1.moverIzquierda(2);
        //imprEstados(c1);
        
        // Estado 8:
        c1.dejarPasajero();;
        c1.gestionarMotor();;
        c1.calcularDistanciaAcopio();
        //imprEstados(c1);
        //System.out.println("distAcopio:" + "\t\t" + c1.calcularDistanciaAcopio());

        Autobus c2 = new Autobus("Juan", 2, true);
        c2.gestionarMarcha();
        c2.gestionarMotor();
        c2.recogerPasajero(2);
        c2.gestionarMarcha();
        c2.dejarPasajero();
        c2.gestionarMarcha(); 
        c2.recogerPasajero(2);
        c2.recogerPasajero(3);
        c2.recogerPasajero(6);
        //imprEstados(c2);
        //System.out.println("distAcopio:" + "\t\t" + c2.calcularDistanciaAcopio());

        c2.setNombreConductor("peter");
        c2.setnMaximoPasajeros(3);
        c2.setPuertaAbierta(false);
        c2.gestionarPuerta();
        c2.recogerPasajero(1);
        c2.gestionarMarcha();
        c2.moverArriba(10);
        c2.gestionarPuerta();
        c2.gestionarMarcha();
        c2.moverIzquierda(10);
        c2.moverArriba(3);
        imprEstados(c2);
        System.out.println("distAcopio:" + "\t\t" + c2.calcularDistanciaAcopio());


    }

    private static void imprEstados(Autobus auto) {
        System.out.println("nombreConductor:" + "\t\t" + auto.getNombreConductor());
        System.out.println("nPasajeros:" + "\t\t\t" + auto.getnPasajeros());
        System.out.println("cantidadDinero:" + "\t\t\t" + auto.getCantidadDinero());
        System.out.println("nMaximoPasajeros:" + "\t\t" + auto.getnMaximoPasajeros());
        System.out.println("localizacionX:" + "\t\t\t" + auto.getLocalizacionX());
        System.out.println("localizacionY:" + "\t\t\t" + auto.getLocalizacionY());
        System.out.println("puertaAbierta:" + "\t\t\t" + auto.isPuertaAbierta());
        System.out.println("aireAcondicionadoActivado:" + "\t" + auto.isAireAcondicionadoActivado());
        System.out.println("motorEncendido:" + "\t\t\t" + auto.isMotorEncendido());
        System.out.println("wifiEncendido:" + "\t\t\t" + auto.isWifiEncendido());
        System.out.println("enMarcha:" + "\t\t\t" + auto.isEnMarcha());
    }

    public static void ClearConsole(){
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system
              
            if(operatingSystem.contains("Windows")){        
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } 
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
