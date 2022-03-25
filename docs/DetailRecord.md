

# DetailRecord

An object following one of the schemas published in https://developers.telnyx.com/docs/api/v2/detail-records

## oneOf schemas
* [AmdDetailRecord](AmdDetailRecord.md)
* [ConferenceDetailRecord](ConferenceDetailRecord.md)
* [ConferenceParticipantDetailRecord](ConferenceParticipantDetailRecord.md)
* [MediaStorageDetailRecord](MediaStorageDetailRecord.md)
* [MessageDetailRecord](MessageDetailRecord.md)
* [SimCardUsageDetailRecord](SimCardUsageDetailRecord.md)
* [VerifyDetailRecord](VerifyDetailRecord.md)
* [WhatsAppDetailRecord](WhatsAppDetailRecord.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.DetailRecord;
import com.telnyx.sdk.model.AmdDetailRecord;
import com.telnyx.sdk.model.ConferenceDetailRecord;
import com.telnyx.sdk.model.ConferenceParticipantDetailRecord;
import com.telnyx.sdk.model.MediaStorageDetailRecord;
import com.telnyx.sdk.model.MessageDetailRecord;
import com.telnyx.sdk.model.SimCardUsageDetailRecord;
import com.telnyx.sdk.model.VerifyDetailRecord;
import com.telnyx.sdk.model.WhatsAppDetailRecord;

public class Example {
    public static void main(String[] args) {
        DetailRecord exampleDetailRecord = new DetailRecord();

        // create a new AmdDetailRecord
        AmdDetailRecord exampleAmdDetailRecord = new AmdDetailRecord();
        // set DetailRecord to AmdDetailRecord
        exampleDetailRecord.setActualInstance(exampleAmdDetailRecord);
        // to get back the AmdDetailRecord set earlier
        AmdDetailRecord testAmdDetailRecord = (AmdDetailRecord) exampleDetailRecord.getActualInstance();

        // create a new ConferenceDetailRecord
        ConferenceDetailRecord exampleConferenceDetailRecord = new ConferenceDetailRecord();
        // set DetailRecord to ConferenceDetailRecord
        exampleDetailRecord.setActualInstance(exampleConferenceDetailRecord);
        // to get back the ConferenceDetailRecord set earlier
        ConferenceDetailRecord testConferenceDetailRecord = (ConferenceDetailRecord) exampleDetailRecord.getActualInstance();

        // create a new ConferenceParticipantDetailRecord
        ConferenceParticipantDetailRecord exampleConferenceParticipantDetailRecord = new ConferenceParticipantDetailRecord();
        // set DetailRecord to ConferenceParticipantDetailRecord
        exampleDetailRecord.setActualInstance(exampleConferenceParticipantDetailRecord);
        // to get back the ConferenceParticipantDetailRecord set earlier
        ConferenceParticipantDetailRecord testConferenceParticipantDetailRecord = (ConferenceParticipantDetailRecord) exampleDetailRecord.getActualInstance();

        // create a new MediaStorageDetailRecord
        MediaStorageDetailRecord exampleMediaStorageDetailRecord = new MediaStorageDetailRecord();
        // set DetailRecord to MediaStorageDetailRecord
        exampleDetailRecord.setActualInstance(exampleMediaStorageDetailRecord);
        // to get back the MediaStorageDetailRecord set earlier
        MediaStorageDetailRecord testMediaStorageDetailRecord = (MediaStorageDetailRecord) exampleDetailRecord.getActualInstance();

        // create a new MessageDetailRecord
        MessageDetailRecord exampleMessageDetailRecord = new MessageDetailRecord();
        // set DetailRecord to MessageDetailRecord
        exampleDetailRecord.setActualInstance(exampleMessageDetailRecord);
        // to get back the MessageDetailRecord set earlier
        MessageDetailRecord testMessageDetailRecord = (MessageDetailRecord) exampleDetailRecord.getActualInstance();

        // create a new SimCardUsageDetailRecord
        SimCardUsageDetailRecord exampleSimCardUsageDetailRecord = new SimCardUsageDetailRecord();
        // set DetailRecord to SimCardUsageDetailRecord
        exampleDetailRecord.setActualInstance(exampleSimCardUsageDetailRecord);
        // to get back the SimCardUsageDetailRecord set earlier
        SimCardUsageDetailRecord testSimCardUsageDetailRecord = (SimCardUsageDetailRecord) exampleDetailRecord.getActualInstance();

        // create a new VerifyDetailRecord
        VerifyDetailRecord exampleVerifyDetailRecord = new VerifyDetailRecord();
        // set DetailRecord to VerifyDetailRecord
        exampleDetailRecord.setActualInstance(exampleVerifyDetailRecord);
        // to get back the VerifyDetailRecord set earlier
        VerifyDetailRecord testVerifyDetailRecord = (VerifyDetailRecord) exampleDetailRecord.getActualInstance();

        // create a new WhatsAppDetailRecord
        WhatsAppDetailRecord exampleWhatsAppDetailRecord = new WhatsAppDetailRecord();
        // set DetailRecord to WhatsAppDetailRecord
        exampleDetailRecord.setActualInstance(exampleWhatsAppDetailRecord);
        // to get back the WhatsAppDetailRecord set earlier
        WhatsAppDetailRecord testWhatsAppDetailRecord = (WhatsAppDetailRecord) exampleDetailRecord.getActualInstance();
    }
}
```


