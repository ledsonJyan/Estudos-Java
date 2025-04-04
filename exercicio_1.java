import java.util.Locale;

public class exercicio_1 {
    public static void main(String[] args) {
        Locale sistema = Locale.getDefault();
        System.out.println("Linguagem do sistema: " + sistema.getDisplayLanguage());
        System.out.println("O Pais é: " + sistema.getDisplayCountry());
        System.out.println("Idioma é: " + sistema.toString());
    }
}

