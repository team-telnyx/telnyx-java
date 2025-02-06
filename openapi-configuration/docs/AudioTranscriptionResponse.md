

# AudioTranscriptionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **String** | The transcribed text for the audio file. |  |
|**duration** | **BigDecimal** | The duration of the audio file in seconds. This is only included if &#x60;response_format&#x60; is set to &#x60;verbose_json&#x60;. |  [optional] |
|**segments** | [**List&lt;AudioTranscriptionResponseSegments&gt;**](AudioTranscriptionResponseSegments.md) | Segments of the transcribed text and their corresponding details. This is only included if &#x60;response_format&#x60; is set to &#x60;verbose_json&#x60;. |  [optional] |



