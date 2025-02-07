

# GatherUsingSpeakRequestVoiceSettings

The settings associated with the voice selected

## oneOf schemas
* [ElevenLabsVoiceSettings](ElevenLabsVoiceSettings.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.GatherUsingSpeakRequestVoiceSettings;
import com.telnyx.sdk.model.ElevenLabsVoiceSettings;

public class Example {
    public static void main(String[] args) {
        GatherUsingSpeakRequestVoiceSettings exampleGatherUsingSpeakRequestVoiceSettings = new GatherUsingSpeakRequestVoiceSettings();

        // create a new ElevenLabsVoiceSettings
        ElevenLabsVoiceSettings exampleElevenLabsVoiceSettings = new ElevenLabsVoiceSettings();
        // set GatherUsingSpeakRequestVoiceSettings to ElevenLabsVoiceSettings
        exampleGatherUsingSpeakRequestVoiceSettings.setActualInstance(exampleElevenLabsVoiceSettings);
        // to get back the ElevenLabsVoiceSettings set earlier
        ElevenLabsVoiceSettings testElevenLabsVoiceSettings = (ElevenLabsVoiceSettings) exampleGatherUsingSpeakRequestVoiceSettings.getActualInstance();
    }
}
```


