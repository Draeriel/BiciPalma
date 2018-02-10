import org.junit.Test;

public class BiciPalmaTest {
    @Test
    public void consultar(){
        Estacion estacion = new Estacion(1, "Manacor", 6);
        estacion.consultarEstacion();
        System.out.println("anclajesLibres: " + estacion.anclajesLibres());

        System.out.println("\n **** caso TEST anclar bicicleta(s) **** \n");

        int[] bicicletas = {291, 292, 293, 294};



        for (int id : bicicletas) {
            Bicicleta bicicleta = new Bicicleta(id);
            estacion.anclarBicicleta(bicicleta);}
        System.out.println("anclajesLibres tras generar "+ bicicletas.length + " bicis: " + estacion.anclajesLibres());

        /* caso TEST consultar bicicletas ancladas */

        System.out.println("\n **** caso TEST consultar bicicletas ancladas **** \n");

        estacion.consultarAnclajes();

    }
}
