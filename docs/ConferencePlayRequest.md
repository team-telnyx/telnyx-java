# ConferencePlayRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audioUrl** | **String** | The URL of the file to be played back in the conference. The URL can point to either a WAV or MP3 file. | 
**loop** | **OneOfConferencePlayRequestLoop** | The number of times the audio file should be played. If supplied, the value must be an integer between 1 and 100, or the special string &#x60;infinity&#x60; for an endless loop. |  [optional]
**callControlIds** | **List&lt;String&gt;** | List of call control ids identifying participants the audio file should be played to. If not given, the audio file will be played to the entire conference. |  [optional]
