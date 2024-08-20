package Model;

public class Libro {

    //: id (único y
    //autoincremental), título, autor, precio y cantidad de copias disponibles.
    //En dicha clase implementa los siguientes métodos:

    public static Integer idContador = 0;
    private Integer id;
    private String titulo;
    private String autor;
    private Float precio;
    private Integer copias;

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCopias() {
        return copias;
    }

    public void setCopias(Integer copias) {
        this.copias = copias;
    }

    public Libro(String titulo, String autor, Float precio, Integer copias){

        idContador++;
        this.id = idContador;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.copias = copias;

    }

public Integer venta(Integer cantidad){

        if(this.copias >= cantidad){
            this.copias -= cantidad;
            System.out.println("");
            System.out.println(cantidad + "copias vendidas");
            System.out.println(this.copias + "copias en stock");
            System.out.println("");
        }else {
            System.out.println("");
            System.out.println("No hay copias suficientes para vender");
            System.out.println("");
        }

        return this.copias;
}

public Integer nuevaCopia(Integer cantidad){

        this.copias += cantidad;

        return this.copias;
}

public void imprimir(){
    System.out.println("");
    System.out.println("Libro " + this.id + " [Titulo: " + this.titulo + ", Autor: " + this.autor + ", Precio: " + this.precio + ", Copias disponibles: " + this.copias + "]");
}



}
