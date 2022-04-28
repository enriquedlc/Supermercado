import com.digitalcastaway.datastructures.utils.SupermarketUtils;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(SupermarketUtils.generarNombrePersonaAleatorio());
            System.out.println(SupermarketUtils.generarNombreProductoAleatorio());
        }

    }
}