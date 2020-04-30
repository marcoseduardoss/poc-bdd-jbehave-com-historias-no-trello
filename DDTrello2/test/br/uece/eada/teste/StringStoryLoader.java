package br.uece.eada.teste;

import org.jbehave.core.io.StoryLoader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.julienvey.trello.domain.Card;

import br.uece.jbehave.NetClientGet;

public class StringStoryLoader implements StoryLoader {

	protected String idCard = "";

	public StringStoryLoader(String idCard) {
		this.idCard = idCard;
	}

	@Override
	public String loadResourceAsText(String arg0) {
		String retorno = "";
		return retorno;
	}

	@Override
	public String loadStoryAsText(String arg0) {

		String retorno = "";
		String json = NetClientGet
				.get("https://api.trello.com/1/cards/"
						+ idCard
						+ "?key=<<KEY_TRELLO>>&token=<<TOKEM_TRELLO>>");
		Card obj = null;
		if (json != null) {
			Gson gson = new GsonBuilder()
					.setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
			obj = gson.fromJson(json, Card.class);
		}
		if (obj != null && obj.getName().replaceAll("ó", "o").toLowerCase().startsWith("[historia]")){
			retorno += "\n\n"+obj.getName().replace("[", "").replace("]", ":")+"\n";
			retorno += obj.getDesc() + "\n";
		}


		return retorno;
	}
}
