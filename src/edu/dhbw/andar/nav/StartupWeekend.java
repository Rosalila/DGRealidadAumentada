package edu.dhbw.andar.nav;

import semita.diseno.grafico.Global;
import edu.dhbw.andobjviewer.graphics.MiCharacter;
import edu.dhbw.andobjviewer.models.Model;

public class StartupWeekend extends MiCharacter {

	static String model = "Camiseta.obj";
	static String pattern = "camisa1.patt";
	
	public StartupWeekend() {
		super(Global.getModel(model), pattern);
		this.selected.model.scale=0;
	}
	
}
