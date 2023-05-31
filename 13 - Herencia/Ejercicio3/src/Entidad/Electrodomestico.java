package Entidad;


public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    private char comprobarConsumoEnergetico(char letra) {
        char consumo;
        letra = Character.toUpperCase(letra);
        if(letra >= 'A' && letra<'F'){
            consumo = letra;
        } else {
            consumo = 'F';
        }
        return consumo;
    }
    
    private String  comprobarColor (String color){
        color = color.toUpperCase();
        String colores [] = {"NEGRO","ROJO","AZUL","GRIS"};
        String retorno = "BLANCO";
        int i=0;
        boolean encontrado= false;
        
        while(i<colores.length && !encontrado){
            if(colores[i].equals(color)){
                retorno = colores[i];
                encontrado = true;
            }
            i++;
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "\n - Precio: " + precio + 
                "\n - Color: " + color + 
                "\n - Consumo: " + consumo + 
                "\n - Peso: " + peso;
    }
    
    
    
    
}
