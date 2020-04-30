package br.uece.eada.teste;

import java.util.Locale;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;


public class ExecucaoTestAdder extends JUnitStory {

    @Override
    public Configuration configuration() {
    	try{
    	Keywords keywords = new LocalizedKeywords(new Locale("pt_br"));
    	
        MostUsefulConfiguration mostUsefulConfiguration = new MostUsefulConfiguration();
		Configuration useKeywords = mostUsefulConfiguration.useKeywords(keywords);
		Configuration useStoryParser = useKeywords.useStoryParser(new RegexStoryParser(keywords));
        
		// Onde procurar pelas estorias
//		LoadFromClasspath loadFromClasspath = new LoadFromClasspath(this.getClass());
//		StoryLoader loadFromClasspath = (StoryLoader) new LoadOdtFromGoogle("email@email.com.br", "PASSWORD", "https://drive.google.com/folderview?id=0Bz8TuhoV_k8eTVdXOFBhRUw2cms&usp=sharing");
		StringStoryLoader loadFromClasspath = new StringStoryLoader("5614553d5e0a78744c0a913d");
		
		Configuration useStoryLoader = useStoryParser.useStoryLoader(loadFromClasspath);
		StoryReporterBuilder withFormats = new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.HTML);
		// Para onde fazer os reports
		return useStoryLoader.useStoryReporterBuilder(withFormats);
    	} catch(Exception e){
    		e.printStackTrace();
    	}
    	return null;
    }
 
    @Override
    public InjectableStepsFactory stepsFactory() {        
        return new InstanceStepsFactory(configuration(), new AdderSteps());
    }
}
