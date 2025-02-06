

# AssignProfileToCampaignRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messagingProfileId** | **String** | The ID of the messaging profile that you want to link to the specified campaign. |  |
|**tcrCampaignId** | **String** | The TCR ID of the shared campaign you want to link to the specified messaging profile (for campaigns not created using Telnyx 10DLC services only). If you supply this ID in the request, do not also include a campaignId. |  [optional] |
|**campaignId** | **String** | The ID of the campaign you want to link to the specified messaging profile. If you supply this ID in the request, do not also include a tcrCampaignId. |  [optional] |



