package tdea.construccion2.app.controller;


public class AppInfo {
    private String nombreAplicativo;
    private String desarrollador;
    private String estado;
    
    public AppInfo(){
    
    }
    
    public AppInfo(String nombreAplicativo, String desarrollador, String estado){
        this.nombreAplicativo = nombreAplicativo;
        this.desarrollador = desarrollador;
        this.estado = estado;
    }

    public String getNombreAplicativo() {
        return nombreAplicativo;
    }

    public void setNombreAplicativo(String nombreAplicativo) {
        this.nombreAplicativo = nombreAplicativo;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
