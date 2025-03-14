public class Celular {
    private String marca, modelo;
    private double precio;

    public Celular(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void aplicarDes(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            precio -= precio * (porcentaje / 100);
        } else {
            System.out.println("Descuento no valido.");
        }
    }

    public String compararPrecio(Celular otroCel) {
        if (this.precio > otroCel.precio) {
            return this.marca + " " + this.modelo + " es más caro que "
                    + otroCel.marca + " " + otroCel.modelo;
        } else if (this.precio < otroCel.precio) {
            return this.marca + " " + this.modelo + " es más barato que "
                    + otroCel.marca + " " + otroCel.modelo;
        } else {
            return "Ambos celulares tienen el mismo precio.";
        }
    }

    public boolean gamaAlta() {
        return precio > 3000000;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}