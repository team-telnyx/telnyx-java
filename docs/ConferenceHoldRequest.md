

# ConferenceHoldRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callControlIds** | **List&lt;String&gt;** | List of unique identifiers and tokens for controlling the call. When empty all participants will be placed on hold. |  [optional] |
|**audioUrl** | **String** | The URL of a file to be played to the participants when they are put on hold. media_name and audio_url cannot be used together in one request. |  [optional] |
|**mediaName** | **String** | The media_name of a file to be played to the participants when they are put on hold. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. |  [optional] |



