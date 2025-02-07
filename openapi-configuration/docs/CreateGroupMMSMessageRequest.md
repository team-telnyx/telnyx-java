

# CreateGroupMMSMessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**from** | **String** | Phone number, in +E.164 format, used to send the message. |  |
|**to** | **List&lt;String&gt;** | A list of destinations. No more than 8 destinations are allowed. |  |
|**text** | **String** | Message body (i.e., content) as a non-empty string. |  [optional] |
|**subject** | **String** | Subject of multimedia message |  [optional] |
|**mediaUrls** | **List&lt;String&gt;** | A list of media URLs. The total media size must be less than 1 MB. |  [optional] |
|**webhookUrl** | **String** | The URL where webhooks related to this message will be sent. |  [optional] |
|**webhookFailoverUrl** | **String** | The failover URL where webhooks related to this message will be sent if sending to the primary URL fails. |  [optional] |
|**useProfileWebhooks** | **Boolean** | If the profile this number is associated with has webhooks, use them for delivery notifications. If webhooks are also specified on the message itself, they will be attempted first, then those on the profile. |  [optional] |



