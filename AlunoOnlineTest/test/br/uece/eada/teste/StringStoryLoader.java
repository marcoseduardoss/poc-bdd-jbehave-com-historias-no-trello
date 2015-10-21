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
						+ "?key=9d31db58c7b43cb5b11e0832df3a6bc2&token=a5948f990dce6320b68739410ee0ca92b57956233f7cc1a1daaa6ef47feb01f0");
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
