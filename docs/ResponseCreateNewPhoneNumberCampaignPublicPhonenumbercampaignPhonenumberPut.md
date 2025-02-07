

# ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut

## anyOf schemas
* [Object](Object.md)
* [PhoneNumberCampaign](PhoneNumberCampaign.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut;
import com.telnyx.sdk.model.Object;
import com.telnyx.sdk.model.PhoneNumberCampaign;

public class Example {
    public static void main(String[] args) {
        ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut exampleResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut = new ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut();

        // create a new Object
        Object exampleObject = new Object();
        // set ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut to Object
        exampleResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut.getActualInstance();

        // create a new PhoneNumberCampaign
        PhoneNumberCampaign examplePhoneNumberCampaign = new PhoneNumberCampaign();
        // set ResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut to PhoneNumberCampaign
        exampleResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut.setActualInstance(examplePhoneNumberCampaign);
        // to get back the PhoneNumberCampaign set earlier
        PhoneNumberCampaign testPhoneNumberCampaign = (PhoneNumberCampaign) exampleResponseCreateNewPhoneNumberCampaignPublicPhonenumbercampaignPhonenumberPut.getActualInstance();
    }
}
```


