package br.com.automacaoWeb.pages;

public class PageHome {

	private static PageHome pageHome;

	private static final String xpath_botão = "//*[@id=\"source\"]";

	public static PageHome getInstance() {
		if (pageHome == null) {
			pageHome = new PageHome();

		}
		return pageHome;

	}

	public static String getBotão() {
		return xpath_botão;
	}

}
