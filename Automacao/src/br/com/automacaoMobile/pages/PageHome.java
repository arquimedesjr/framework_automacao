package br.com.automacaoMobile.pages;

public class PageHome {

	private static PageHome pageHome;

	private final static String id_botaoMenu = "com.simpler.dialer:id/dialpad_fab";

	public static PageHome getInstance() {
		if (pageHome == null) {
			pageHome = new PageHome();
		}
		return pageHome;

	}

	public static String getIdBotaomenu() {
		return id_botaoMenu;
	}

}
