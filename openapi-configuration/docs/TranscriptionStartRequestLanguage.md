

# TranscriptionStartRequestLanguage

## oneOf schemas
* [GoogleTranscriptionLanguage](GoogleTranscriptionLanguage.md)
* [TelnyxTranscriptionLanguage](TelnyxTranscriptionLanguage.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.TranscriptionStartRequestLanguage;
import com.telnyx.sdk.model.GoogleTranscriptionLanguage;
import com.telnyx.sdk.model.TelnyxTranscriptionLanguage;

public class Example {
    public static void main(String[] args) {
        TranscriptionStartRequestLanguage exampleTranscriptionStartRequestLanguage = new TranscriptionStartRequestLanguage();

        // create a new GoogleTranscriptionLanguage
        GoogleTranscriptionLanguage exampleGoogleTranscriptionLanguage = new GoogleTranscriptionLanguage();
        // set TranscriptionStartRequestLanguage to GoogleTranscriptionLanguage
        exampleTranscriptionStartRequestLanguage.setActualInstance(exampleGoogleTranscriptionLanguage);
        // to get back the GoogleTranscriptionLanguage set earlier
        GoogleTranscriptionLanguage testGoogleTranscriptionLanguage = (GoogleTranscriptionLanguage) exampleTranscriptionStartRequestLanguage.getActualInstance();

        // create a new TelnyxTranscriptionLanguage
        TelnyxTranscriptionLanguage exampleTelnyxTranscriptionLanguage = new TelnyxTranscriptionLanguage();
        // set TranscriptionStartRequestLanguage to TelnyxTranscriptionLanguage
        exampleTranscriptionStartRequestLanguage.setActualInstance(exampleTelnyxTranscriptionLanguage);
        // to get back the TelnyxTranscriptionLanguage set earlier
        TelnyxTranscriptionLanguage testTelnyxTranscriptionLanguage = (TelnyxTranscriptionLanguage) exampleTranscriptionStartRequestLanguage.getActualInstance();
    }
}
```


