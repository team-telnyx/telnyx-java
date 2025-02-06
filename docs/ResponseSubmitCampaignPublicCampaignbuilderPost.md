

# ResponseSubmitCampaignPublicCampaignbuilderPost

## anyOf schemas
* [Object](Object.md)
* [TelnyxCampaignCSP](TelnyxCampaignCSP.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.ResponseSubmitCampaignPublicCampaignbuilderPost;
import com.telnyx.sdk.model.Object;
import com.telnyx.sdk.model.TelnyxCampaignCSP;

public class Example {
    public static void main(String[] args) {
        ResponseSubmitCampaignPublicCampaignbuilderPost exampleResponseSubmitCampaignPublicCampaignbuilderPost = new ResponseSubmitCampaignPublicCampaignbuilderPost();

        // create a new Object
        Object exampleObject = new Object();
        // set ResponseSubmitCampaignPublicCampaignbuilderPost to Object
        exampleResponseSubmitCampaignPublicCampaignbuilderPost.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleResponseSubmitCampaignPublicCampaignbuilderPost.getActualInstance();

        // create a new TelnyxCampaignCSP
        TelnyxCampaignCSP exampleTelnyxCampaignCSP = new TelnyxCampaignCSP();
        // set ResponseSubmitCampaignPublicCampaignbuilderPost to TelnyxCampaignCSP
        exampleResponseSubmitCampaignPublicCampaignbuilderPost.setActualInstance(exampleTelnyxCampaignCSP);
        // to get back the TelnyxCampaignCSP set earlier
        TelnyxCampaignCSP testTelnyxCampaignCSP = (TelnyxCampaignCSP) exampleResponseSubmitCampaignPublicCampaignbuilderPost.getActualInstance();
    }
}
```


