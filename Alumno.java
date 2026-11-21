public class Alumno {

    protected int cuenta;
    protected String aPaterno;
    protected String aMaterno;
    protected String nombre;
    protected String licenciatura;
    protected String direccion;
    protected String telefono;
    protected int semestre;

    public int getCuenta(){
        return cuenta;
    }

    public void setCuenta(int cuenta){
        this.cuenta = cuenta;
    }

    public String getPaterno(){
        return aPaterno;
    }

    public void setPaterno(String aPaterno){
        this.aPaterno = aPaterno;
    }

    public String getMaterno(){
        return aMaterno;
    }

    public void setMaterno(String aMaterno){
        this.aMaterno = aMaterno;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getLicenciatura(){
        return licenciatura;
    }

    public void setLicenciatura(String licenciatura){
        this.licenciatura = licenciatura;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

       public int getSemestre(){
        return semestre;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

}
