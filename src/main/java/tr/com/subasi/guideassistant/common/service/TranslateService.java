/*
package tr.com.subasi.guideassistant.common.service;

import com.google.cloud.translate.Detection;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class TranslateService {

    public static String translate(String text, String language) {
        if(StringUtils.isEmpty(text))
            return text;

        //Translate translate = TranslateOptions.getDefaultInstance().getService();
        Translate translate = TranslateOptions.newBuilder().setApiKey("myKey").build().getService();


        Detection detection = translate.detect(text);
        String detectedLanguage = detection.getLanguage();

        Translation translation = translate.translate(
                text,
                TranslateOption.sourceLanguage(detectedLanguage),
                TranslateOption.targetLanguage(language));

        return translation.getTranslatedText();
    }

}
*/
