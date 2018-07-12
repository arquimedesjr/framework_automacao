package br.com.automacaoMobile.pages;

public class PageTeclado {

	private static PageTeclado pageTeclado;

	private final static String id_teclado1 = "com.simpler.dialer:id/one";

	private final static String id_teclado2 = "com.simpler.dialer:id/two";

	private final static String id_teclado3 = "com.simpler.dialer:id/three";

	private final static String id_teclado4 = "com.simpler.dialer:id/four";

	private final static String id_teclado5 = "com.simpler.dialer:id/five";

	private final static String id_teclado6 = "com.simpler.dialer:id/six";

	private final static String id_teclado7 = "com.simpler.dialer:id/seven";

	private final static String id_teclado8 = "com.simpler.dialer:id/eight";

	private final static String id_teclado9 = "com.simpler.dialer:id/nine";

	private final static String id_teclado0 = "com.simpler.dialer:id/zero";

	public static PageTeclado getInstance() {
		if (pageTeclado == null) {
			pageTeclado = new PageTeclado();
		}
		return pageTeclado;
	}

	public static String getIdTeclado1() {
		return id_teclado1;
	}

	public static String getIdTeclado2() {
		return id_teclado2;
	}

	public static String getIdTeclado3() {
		return id_teclado3;
	}

	public static String getIdTeclado4() {
		return id_teclado4;
	}

	public static String getIdTeclado5() {
		return id_teclado5;
	}

	public static String getIdTeclado6() {
		return id_teclado6;
	}

	public static String getIdTeclado7() {
		return id_teclado7;
	}

	public static String getIdTeclado8() {
		return id_teclado8;
	}

	public static String getIdTeclado9() {
		return id_teclado9;
	}

	public static String getIdTeclado0() {
		return id_teclado0;
	}

}
