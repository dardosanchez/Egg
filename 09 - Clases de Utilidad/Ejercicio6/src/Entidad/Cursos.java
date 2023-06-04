
package Entidad;


public class Cursos {
    // ATRIBUTOS
    
    private String nombreCurso;
    private double cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private char turno;
    private double precioPorHora;
    private String [] Alumnos = new String [5];

    public Cursos() {
    }

    public Cursos(String nombreCurso, double cantidadHorasPorDia, int cantidadDiasPorSemana, char turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

   

    public String getNombreCurso() {
        return nombreCurso;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public double getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public char getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return Alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] Alumnos) {
        this.Alumnos = Alumnos;
    }
    
    
    
}
