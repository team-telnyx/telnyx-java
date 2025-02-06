

# AIAssistantStartRequestVoiceSettings

The settings associated with the voice selected

## oneOf schemas
* [ElevenLabsVoiceSettings](ElevenLabsVoiceSettings.md)
* [Object](Object.md)
* [TelnyxVoiceSettings](TelnyxVoiceSettings.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.AIAssistantStartRequestVoiceSettings;
import com.telnyx.sdk.model.ElevenLabsVoiceSettings;
import com.telnyx.sdk.model.Object;
import com.telnyx.sdk.model.TelnyxVoiceSettings;

public class Example {
    public static void main(String[] args) {
        AIAssistantStartRequestVoiceSettings exampleAIAssistantStartRequestVoiceSettings = new AIAssistantStartRequestVoiceSettings();

        // create a new ElevenLabsVoiceSettings
        ElevenLabsVoiceSettings exampleElevenLabsVoiceSettings = new ElevenLabsVoiceSettings();
        // set AIAssistantStartRequestVoiceSettings to ElevenLabsVoiceSettings
        exampleAIAssistantStartRequestVoiceSettings.setActualInstance(exampleElevenLabsVoiceSettings);
        // to get back the ElevenLabsVoiceSettings set earlier
        ElevenLabsVoiceSettings testElevenLabsVoiceSettings = (ElevenLabsVoiceSettings) exampleAIAssistantStartRequestVoiceSettings.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set AIAssistantStartRequestVoiceSettings to Object
        exampleAIAssistantStartRequestVoiceSettings.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleAIAssistantStartRequestVoiceSettings.getActualInstance();

        // create a new TelnyxVoiceSettings
        TelnyxVoiceSettings exampleTelnyxVoiceSettings = new TelnyxVoiceSettings();
        // set AIAssistantStartRequestVoiceSettings to TelnyxVoiceSettings
        exampleAIAssistantStartRequestVoiceSettings.setActualInstance(exampleTelnyxVoiceSettings);
        // to get back the TelnyxVoiceSettings set earlier
        TelnyxVoiceSettings testTelnyxVoiceSettings = (TelnyxVoiceSettings) exampleAIAssistantStartRequestVoiceSettings.getActualInstance();
    }
}
```


