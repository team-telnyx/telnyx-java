

# StartRecordingRequestTranscriptionLanguage

## oneOf schemas
* [GoogleTranscriptionLanguage](GoogleTranscriptionLanguage.md)
* [TelnyxTranscriptionLanguage](TelnyxTranscriptionLanguage.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.StartRecordingRequestTranscriptionLanguage;
import com.telnyx.sdk.model.GoogleTranscriptionLanguage;
import com.telnyx.sdk.model.TelnyxTranscriptionLanguage;

public class Example {
    public static void main(String[] args) {
        StartRecordingRequestTranscriptionLanguage exampleStartRecordingRequestTranscriptionLanguage = new StartRecordingRequestTranscriptionLanguage();

        // create a new GoogleTranscriptionLanguage
        GoogleTranscriptionLanguage exampleGoogleTranscriptionLanguage = new GoogleTranscriptionLanguage();
        // set StartRecordingRequestTranscriptionLanguage to GoogleTranscriptionLanguage
        exampleStartRecordingRequestTranscriptionLanguage.setActualInstance(exampleGoogleTranscriptionLanguage);
        // to get back the GoogleTranscriptionLanguage set earlier
        GoogleTranscriptionLanguage testGoogleTranscriptionLanguage = (GoogleTranscriptionLanguage) exampleStartRecordingRequestTranscriptionLanguage.getActualInstance();

        // create a new TelnyxTranscriptionLanguage
        TelnyxTranscriptionLanguage exampleTelnyxTranscriptionLanguage = new TelnyxTranscriptionLanguage();
        // set StartRecordingRequestTranscriptionLanguage to TelnyxTranscriptionLanguage
        exampleStartRecordingRequestTranscriptionLanguage.setActualInstance(exampleTelnyxTranscriptionLanguage);
        // to get back the TelnyxTranscriptionLanguage set earlier
        TelnyxTranscriptionLanguage testTelnyxTranscriptionLanguage = (TelnyxTranscriptionLanguage) exampleStartRecordingRequestTranscriptionLanguage.getActualInstance();
    }
}
```


