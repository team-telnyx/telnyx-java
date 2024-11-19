

# GatherUsingAIRequestVoiceSettings

The settings associated with the voice selected

## oneOf schemas
* [ElevenLabsVoiceSettings](ElevenLabsVoiceSettings.md)
* [Object](Object.md)
* [TelnyxVoiceSettings](TelnyxVoiceSettings.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.GatherUsingAIRequestVoiceSettings;
import com.telnyx.sdk.model.ElevenLabsVoiceSettings;
import com.telnyx.sdk.model.Object;
import com.telnyx.sdk.model.TelnyxVoiceSettings;

public class Example {
    public static void main(String[] args) {
        GatherUsingAIRequestVoiceSettings exampleGatherUsingAIRequestVoiceSettings = new GatherUsingAIRequestVoiceSettings();

        // create a new ElevenLabsVoiceSettings
        ElevenLabsVoiceSettings exampleElevenLabsVoiceSettings = new ElevenLabsVoiceSettings();
        // set GatherUsingAIRequestVoiceSettings to ElevenLabsVoiceSettings
        exampleGatherUsingAIRequestVoiceSettings.setActualInstance(exampleElevenLabsVoiceSettings);
        // to get back the ElevenLabsVoiceSettings set earlier
        ElevenLabsVoiceSettings testElevenLabsVoiceSettings = (ElevenLabsVoiceSettings) exampleGatherUsingAIRequestVoiceSettings.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set GatherUsingAIRequestVoiceSettings to Object
        exampleGatherUsingAIRequestVoiceSettings.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleGatherUsingAIRequestVoiceSettings.getActualInstance();

        // create a new TelnyxVoiceSettings
        TelnyxVoiceSettings exampleTelnyxVoiceSettings = new TelnyxVoiceSettings();
        // set GatherUsingAIRequestVoiceSettings to TelnyxVoiceSettings
        exampleGatherUsingAIRequestVoiceSettings.setActualInstance(exampleTelnyxVoiceSettings);
        // to get back the TelnyxVoiceSettings set earlier
        TelnyxVoiceSettings testTelnyxVoiceSettings = (TelnyxVoiceSettings) exampleGatherUsingAIRequestVoiceSettings.getActualInstance();
    }
}
```


