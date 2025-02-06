

# ExternalVetting


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evpId** | **String** | External vetting provider ID for the brand. |  [optional] |
|**vettingId** | **String** | Unique ID that identifies a vetting transaction performed by a vetting provider. This ID is provided by the vetting provider at time of vetting. |  [optional] |
|**vettingToken** | **String** | Required by some providers for vetting record confirmation. |  [optional] |
|**vettingScore** | **Integer** | Vetting score ranging from 0-100. |  [optional] |
|**vettingClass** | **String** | Identifies the vetting classification. |  [optional] |
|**vettedDate** | **String** | Vetting effective date. This is the date when vetting was completed, or the starting effective date in ISO 8601 format. If this date is missing, then the vetting was not complete or not valid. |  [optional] |
|**createDate** | **String** | Vetting submission date. This is the date when the vetting request is generated in ISO 8601 format. |  [optional] |



