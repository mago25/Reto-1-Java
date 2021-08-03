public class Autobus{
    //Inserte acá los atributos
    private String nombreConductor;
    private int nPasajeros = 0;
    private double cantidadDinero = 0;
    private int nMaximoPasajeros;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;

    //Inserte acá el método constructor
    public Autobus() {
    }

    public Autobus(String nombreConductor, int nMaximoPasajeros, boolean puertaAbierta) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void recogerPasajero(int estrato) {
        if (!isEnMarcha() && isPuertaAbierta() && this.nPasajeros < this.nMaximoPasajeros){
            this.nPasajeros += 1;
            if (estrato>=0 && estrato<=2){this.cantidadDinero += 1500;}
            else if (estrato==3 || estrato==4){this.cantidadDinero += 2600;}
            else if (estrato==5 || estrato==6){this.cantidadDinero += 3000;}
            else {this.cantidadDinero += 0;}
        }
    }

    public void dejarPasajero() {
        if (isPuertaAbierta() && !isEnMarcha()){this.nPasajeros -= 1;}
    }

    public double calcularDistanciaAcopio() {
        double dist = Math.sqrt((this.localizacionX*this.localizacionX) + (this.localizacionY*this.localizacionY));
        return dist;
    }

    public void gestionarPuerta() {
        if (isMotorEncendido() && isEnMarcha()){
            this.puertaAbierta = false;
        }else { this.puertaAbierta = !isPuertaAbierta() ? true : false; }
    }

    public void gestionarAireAcondicionado() {
        if (isMotorEncendido() && isEnMarcha()){
            this.wifiEncendido = true;
        } else {
            this.wifiEncendido = false;
        }
    }

    public void gestionarMotor() {
        this.motorEncendido = isMotorEncendido() ? false : true;
    }

    public void gestionarWifi() {
        if (isMotorEncendido() && isEnMarcha()){
            this.wifiEncendido = true;
        } else {
            this.wifiEncendido = false;
        }
    }
    
    public void gestionarMarcha() {
        //this.enMarcha = isEnMarcha() ? true : false;
        //this.enMarcha = isMotorEncendido() ? true : false;
        if (isMotorEncendido() && !isPuertaAbierta()){this.enMarcha = isEnMarcha() ? false : true;}
        else {this.enMarcha = false;}
    }

    public void moverDerecha(double d) {
        this.localizacionX += isEnMarcha() ? d : 0;
    }

    public void moverIzquierda(double d) {
        this.localizacionX -= isEnMarcha() ? d : 0;
    }

    public void moverArriba(double d) {
        this.localizacionY += isEnMarcha() ? d : 0;
    }

    public void moverAbajo(double d) {
        this.localizacionY -= isEnMarcha() ? d : 0;
    }

    //Inserte acá los SETTERS Y GETTERS
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
    
}