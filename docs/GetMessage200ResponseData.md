

# GetMessage200ResponseData

## oneOf schemas
* [InboundMessagePayload](InboundMessagePayload.md)
* [OutboundMessagePayload](OutboundMessagePayload.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.GetMessage200ResponseData;
import com.telnyx.sdk.model.InboundMessagePayload;
import com.telnyx.sdk.model.OutboundMessagePayload;

public class Example {
    public static void main(String[] args) {
        GetMessage200ResponseData exampleGetMessage200ResponseData = new GetMessage200ResponseData();

        // create a new InboundMessagePayload
        InboundMessagePayload exampleInboundMessagePayload = new InboundMessagePayload();
        // set GetMessage200ResponseData to InboundMessagePayload
        exampleGetMessage200ResponseData.setActualInstance(exampleInboundMessagePayload);
        // to get back the InboundMessagePayload set earlier
        InboundMessagePayload testInboundMessagePayload = (InboundMessagePayload) exampleGetMessage200ResponseData.getActualInstance();

        // create a new OutboundMessagePayload
        OutboundMessagePayload exampleOutboundMessagePayload = new OutboundMessagePayload();
        // set GetMessage200ResponseData to OutboundMessagePayload
        exampleGetMessage200ResponseData.setActualInstance(exampleOutboundMessagePayload);
        // to get back the OutboundMessagePayload set earlier
        OutboundMessagePayload testOutboundMessagePayload = (OutboundMessagePayload) exampleGetMessage200ResponseData.getActualInstance();
    }
}
```


