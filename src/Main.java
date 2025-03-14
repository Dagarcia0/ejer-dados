public class Main {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Samsung",
                "Galaxy S24 Ultra", 4330241);
        Celular celular2 = new Celular("Google",
                "Pixel 8a", 1853305);
        Celular celular3 = new Celular("Vivo",
                "V40", 1027910);
        Celular celular4 = new Celular("Xiaomi",
                "14", 4537111);

        System.out.println("Datos:");
        System.out.println(celular1);
        System.out.println(celular2);
        System.out.println(celular3);
        System.out.println(celular4);
        celular1.aplicarDes(10); // 10% de descuento
        celular3.aplicarDes(5); // 5% de descuento

        System.out.println("\nDespués de aplicar descuentos:");
        System.out.println(celular1);
        System.out.println(celular3);

        // Comparar precios
        System.out.println("\nComparación de precios:");
        System.out.println(celular1.compararPrecio(celular2));
        System.out.println(celular3.compararPrecio(celular4));

        System.out.println("\n¿Son gama alta?");
        System.out.println(celular1.getMarca() + " "
                + celular1.getModelo() + ": " + celular1.gamaAlta());

        System.out.println(celular3.getMarca()
                + " " + celular3.getModelo() + ": " + celular3.gamaAlta());
    }

}