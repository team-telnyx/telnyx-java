

# ConferencePlayRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audioUrl** | **String** | The URL of a file to be played back in the conference. media_name and audio_url cannot be used together in one request. |  [optional]
**mediaName** | **String** | The media_name of a file to be played back in the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. |  [optional]
**loop** | [**Loopcount**](Loopcount.md) |  |  [optional]
**callControlIds** | **List&lt;String&gt;** | List of call control ids identifying participants the audio file should be played to. If not given, the audio file will be played to the entire conference. |  [optional]



