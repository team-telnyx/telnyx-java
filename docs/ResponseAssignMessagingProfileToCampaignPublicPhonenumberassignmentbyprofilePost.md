

# ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost

## anyOf schemas
* [AssignProfileToCampaignResponse](AssignProfileToCampaignResponse.md)
* [SettingsDataErrorMessage](SettingsDataErrorMessage.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost;
import com.telnyx.sdk.model.AssignProfileToCampaignResponse;
import com.telnyx.sdk.model.SettingsDataErrorMessage;

public class Example {
    public static void main(String[] args) {
        ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost exampleResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost = new ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost();

        // create a new AssignProfileToCampaignResponse
        AssignProfileToCampaignResponse exampleAssignProfileToCampaignResponse = new AssignProfileToCampaignResponse();
        // set ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost to AssignProfileToCampaignResponse
        exampleResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost.setActualInstance(exampleAssignProfileToCampaignResponse);
        // to get back the AssignProfileToCampaignResponse set earlier
        AssignProfileToCampaignResponse testAssignProfileToCampaignResponse = (AssignProfileToCampaignResponse) exampleResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost.getActualInstance();

        // create a new SettingsDataErrorMessage
        SettingsDataErrorMessage exampleSettingsDataErrorMessage = new SettingsDataErrorMessage();
        // set ResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost to SettingsDataErrorMessage
        exampleResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost.setActualInstance(exampleSettingsDataErrorMessage);
        // to get back the SettingsDataErrorMessage set earlier
        SettingsDataErrorMessage testSettingsDataErrorMessage = (SettingsDataErrorMessage) exampleResponseAssignMessagingProfileToCampaignPublicPhonenumberassignmentbyprofilePost.getActualInstance();
    }
}
```


