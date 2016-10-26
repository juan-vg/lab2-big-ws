package translator.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import translator.Application;
import translator.domain.TranslatedText;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TranslatorServiceTest {

    @Autowired
    TranslatorService translatorService;
    @Test
    public void translateTest() throws Exception {
        TranslatedText translatedText = translatorService.translate("en", "es", "This is a test of translation service");
        assertEquals("Esto es una prueba de servicio de traducción",translatedText.getTranslation());
    }
    
    
    @Test
    /**
     * Test translation from English to Urdu 
     */
    public void translateTestUrdu() throws Exception {
        TranslatedText translatedText = translatorService.translate("en", "ur", "This is a test of translation service");
        assertEquals("یہ ایک ٹیسٹ کے ترجمہ کی خدمت",translatedText.getTranslation());
    }
    
    @Test
    /**
     * Test translation from English to Swahili
     */
    public void translateTestSwahili() throws Exception {
        TranslatedText translatedText = translatorService.translate("en", "sw", "This is a test of translation service");
        assertEquals("Hii ni mtihani wa tafsiri huduma",translatedText.getTranslation());
    }
}
