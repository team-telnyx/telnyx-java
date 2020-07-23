# GatherUsingAudioRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audioUrl** | **String** | The URL of a file to be played back at the beginning of each prompt. The URL can point to either a WAV or MP3 file. | 
**invalidAudioUrl** | **String** | The URL of a file to play when digits don&#x27;t match the &#x60;valid_digits&#x60; parameter or the number of digits is not between &#x60;min&#x60; and &#x60;max&#x60;. The URL can point to either a WAV or MP3 file. |  [optional]
**minimumDigits** | **Integer** | The minimum number of digits to fetch. This parameter has a minimum value of 1. |  [optional]
**maximumDigits** | **Integer** | The maximum number of digits to fetch. This parameter has a maximum value of 128. |  [optional]
**maximumTries** | **Integer** | The maximum number of times the file should be played if there is no input from the user on the call. |  [optional]
**timeoutMillis** | **Integer** | The number of milliseconds to wait for a DTMF response after file playback ends before a replaying the sound file. |  [optional]
**terminatingDigit** | **String** | The digit used to terminate input if fewer than &#x60;maximum_digits&#x60; digits have been gathered. |  [optional]
**validDigits** | **String** | A list of all digits accepted as valid. |  [optional]
**interDigitTimeoutMillis** | **Integer** | The number of milliseconds to wait for input between digits. |  [optional]
**clientState** | **String** | Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. |  [optional]
**commandId** | **String** | Use this field to avoid duplicate commands. Telnyx will ignore commands with the same &#x60;command_id&#x60;. |  [optional]
