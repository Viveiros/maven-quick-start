package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;

public class Application {

	public int countWords(String palavras) {
		String[] palavrasSeparadas = StringUtils.split(palavras,' ');
		return(palavrasSeparadas == null) ? 0 : palavrasSeparadas.length;
	}
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	int count = app.countWords("Oi quantas palavra tem aqui");
		System.out.println("Palavras: "+ count);
    }
}