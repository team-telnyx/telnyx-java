

# DetailRecord

An object following one of the schemas published in https://developers.telnyx.com/docs/api/v2/detail-records

## oneOf schemas
* [ConferenceDetailRecord](ConferenceDetailRecord.md)
* [ConferenceParticipantDetailRecord](ConferenceParticipantDetailRecord.md)
* [MessageDetailRecord](MessageDetailRecord.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.DetailRecord;
import com.telnyx.sdk.model.ConferenceDetailRecord;
import com.telnyx.sdk.model.ConferenceParticipantDetailRecord;
import com.telnyx.sdk.model.MessageDetailRecord;

public class Example {
    public static void main(String[] args) {
        DetailRecord exampleDetailRecord = new DetailRecord();

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

        // create a new MessageDetailRecord
        MessageDetailRecord exampleMessageDetailRecord = new MessageDetailRecord();
        // set DetailRecord to MessageDetailRecord
        exampleDetailRecord.setActualInstance(exampleMessageDetailRecord);
        // to get back the MessageDetailRecord set earlier
        MessageDetailRecord testMessageDetailRecord = (MessageDetailRecord) exampleDetailRecord.getActualInstance();
    }
}
```


