package iPhoneProjeto;

public class ReprodutorMusical {
	public static void main(String[] args) {
		System.out.println("Selecionar a música.");

		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("tocando a música.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("pausar a música.");
		
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Selecionar a música.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		System.out.println("tocando a música.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fim da música.");		
	}
}

