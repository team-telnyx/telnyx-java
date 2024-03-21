

# ResponseSubmitCampaignPublicCampaignbuilderPost

## anyOf schemas
* [CampaignCSP](CampaignCSP.md)
* [Object](Object.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.ResponseSubmitCampaignPublicCampaignbuilderPost;
import com.telnyx.sdk.model.CampaignCSP;
import com.telnyx.sdk.model.Object;

public class Example {
    public static void main(String[] args) {
        ResponseSubmitCampaignPublicCampaignbuilderPost exampleResponseSubmitCampaignPublicCampaignbuilderPost = new ResponseSubmitCampaignPublicCampaignbuilderPost();

        // create a new CampaignCSP
        CampaignCSP exampleCampaignCSP = new CampaignCSP();
        // set ResponseSubmitCampaignPublicCampaignbuilderPost to CampaignCSP
        exampleResponseSubmitCampaignPublicCampaignbuilderPost.setActualInstance(exampleCampaignCSP);
        // to get back the CampaignCSP set earlier
        CampaignCSP testCampaignCSP = (CampaignCSP) exampleResponseSubmitCampaignPublicCampaignbuilderPost.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set ResponseSubmitCampaignPublicCampaignbuilderPost to Object
        exampleResponseSubmitCampaignPublicCampaignbuilderPost.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleResponseSubmitCampaignPublicCampaignbuilderPost.getActualInstance();
    }
}
```


