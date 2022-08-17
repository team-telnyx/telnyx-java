

# ActionsParticipantsRequestParticipants

Either a list of participant id to perform the action on, or the keyword \"all\" to perform the action on all participant.

## oneOf schemas
* [List<UUID>](List<UUID>.md)
* [String](String.md)

## Example

```java
// Import classes:

import com.telnyx.sdk.model.List<UUID>;
import com.telnyx.sdk.model.String;

public class Example {
    public static void main(String[] args) {
        ActionsParticipantsRequestParticipants exampleActionsParticipantsRequestParticipants = new ActionsParticipantsRequestParticipants();

        // create a new List<UUID>
        List<UUID> exampleList<UUID > = new List<UUID>();
        // set ActionsParticipantsRequestParticipants to List<UUID>
        exampleActionsParticipantsRequestParticipants.setActualInstance(exampleList < UUID >);
        // to get back the List<UUID> set earlier
        List<UUID> testList<UUID > = (List<UUID>) exampleActionsParticipantsRequestParticipants.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ActionsParticipantsRequestParticipants to String
        exampleActionsParticipantsRequestParticipants.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleActionsParticipantsRequestParticipants.getActualInstance();
    }
}
```


