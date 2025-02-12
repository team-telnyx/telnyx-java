

# CreatePushCredentialRequest

## oneOf schemas
* [CreateAndroidPushCredentialRequest](CreateAndroidPushCredentialRequest.md)
* [CreateIosPushCredentialRequest](CreateIosPushCredentialRequest.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.CreatePushCredentialRequest;
import com.telnyx.sdk.model.CreateAndroidPushCredentialRequest;
import com.telnyx.sdk.model.CreateIosPushCredentialRequest;

public class Example {
    public static void main(String[] args) {
        CreatePushCredentialRequest exampleCreatePushCredentialRequest = new CreatePushCredentialRequest();

        // create a new CreateAndroidPushCredentialRequest
        CreateAndroidPushCredentialRequest exampleCreateAndroidPushCredentialRequest = new CreateAndroidPushCredentialRequest();
        // set CreatePushCredentialRequest to CreateAndroidPushCredentialRequest
        exampleCreatePushCredentialRequest.setActualInstance(exampleCreateAndroidPushCredentialRequest);
        // to get back the CreateAndroidPushCredentialRequest set earlier
        CreateAndroidPushCredentialRequest testCreateAndroidPushCredentialRequest = (CreateAndroidPushCredentialRequest) exampleCreatePushCredentialRequest.getActualInstance();

        // create a new CreateIosPushCredentialRequest
        CreateIosPushCredentialRequest exampleCreateIosPushCredentialRequest = new CreateIosPushCredentialRequest();
        // set CreatePushCredentialRequest to CreateIosPushCredentialRequest
        exampleCreatePushCredentialRequest.setActualInstance(exampleCreateIosPushCredentialRequest);
        // to get back the CreateIosPushCredentialRequest set earlier
        CreateIosPushCredentialRequest testCreateIosPushCredentialRequest = (CreateIosPushCredentialRequest) exampleCreatePushCredentialRequest.getActualInstance();
    }
}
```


