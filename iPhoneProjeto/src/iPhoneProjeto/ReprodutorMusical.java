package iPhoneProjeto;

public class ReprodutorMusical {
	public static void main(String[] args) {
		System.out.println("Selecionar a m�sica.");

		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("tocando a m�sica.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("pausar a m�sica.");
		
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Selecionar a m�sica.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		System.out.println("tocando a m�sica.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fim da m�sica.");		
	}
}

