

# ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost

## anyOf schemas
* [Object](Object.md)
* [PhoneNumberCampaign](PhoneNumberCampaign.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost;
import com.telnyx.sdk.model.Object;
import com.telnyx.sdk.model.PhoneNumberCampaign;

public class Example {
    public static void main(String[] args) {
        ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost exampleResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost = new ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost();

        // create a new Object
        Object exampleObject = new Object();
        // set ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost to Object
        exampleResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost.getActualInstance();

        // create a new PhoneNumberCampaign
        PhoneNumberCampaign examplePhoneNumberCampaign = new PhoneNumberCampaign();
        // set ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost to PhoneNumberCampaign
        exampleResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost.setActualInstance(examplePhoneNumberCampaign);
        // to get back the PhoneNumberCampaign set earlier
        PhoneNumberCampaign testPhoneNumberCampaign = (PhoneNumberCampaign) exampleResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPost.getActualInstance();
    }
}
```


