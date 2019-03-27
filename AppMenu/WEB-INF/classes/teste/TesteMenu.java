package teste;

import java.util.ArrayList;
import java.util.List;

import negocio.Chef;
import negocio.Menu;

public class TesteMenu {

	public static void main(String[] args) {

		Chef chef = new Chef();
		
		List<String> segmento = new ArrayList<String>();
		
		
		Menu menu = new Menu();
		menu.show();

	}

}
