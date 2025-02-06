# AudioApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audioPublicAudioTranscriptionsPost**](AudioApi.md#audioPublicAudioTranscriptionsPost) | **POST** /ai/audio/transcriptions | Transcribe speech to text



## audioPublicAudioTranscriptionsPost

> AudioTranscriptionResponse audioPublicAudioTranscriptionsPost(model, _file, fileUrl, responseFormat, timestampGranularities)

Transcribe speech to text

Transcribe speech to text. This endpoint is consistent with the [OpenAI Transcription API](https://platform.openai.com/docs/api-reference/audio/createTranscription) and may be used with the OpenAI JS or Python SDK.

### Example

```java
import java.io.File;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AudioApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AudioApi apiInstance = new AudioApi(defaultClient);
        String model = "distil-whisper/distil-large-v2"; // String | ID of the model to use. `distil-whisper/distil-large-v2` is lower latency but English-only. `openai/whisper-large-v3-turbo` is multi-lingual but slightly higher latency.
        File _file = new File("/path/to/file"); // File | The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. File uploads are limited to 100 MB. Cannot be used together with `file_url`
        String fileUrl = "fileUrl_example"; // String | Link to audio file in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. Support for hosted files is limited to 100MB. Cannot be used together with `file`
        String responseFormat = "json"; // String | The format of the transcript output. Use `verbose_json` to take advantage of timestamps.
        String timestampGranularities = "segment"; // String | The timestamp granularities to populate for this transcription. `response_format` must be set verbose_json to use timestamp granularities. Currently `segment` is supported.
        try {
            AudioTranscriptionResponse result = apiInstance.audioPublicAudioTranscriptionsPost(model, _file, fileUrl, responseFormat, timestampGranularities);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudioApi#audioPublicAudioTranscriptionsPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String**| ID of the model to use. &#x60;distil-whisper/distil-large-v2&#x60; is lower latency but English-only. &#x60;openai/whisper-large-v3-turbo&#x60; is multi-lingual but slightly higher latency. | [default to distil-whisper/distil-large-v2] [enum: distil-whisper/distil-large-v2, openai/whisper-large-v3-turbo]
 **_file** | **File**| The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. File uploads are limited to 100 MB. Cannot be used together with &#x60;file_url&#x60; | [optional]
 **fileUrl** | **String**| Link to audio file in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. Support for hosted files is limited to 100MB. Cannot be used together with &#x60;file&#x60; | [optional]
 **responseFormat** | **String**| The format of the transcript output. Use &#x60;verbose_json&#x60; to take advantage of timestamps. | [optional] [default to json] [enum: json, verbose_json]
 **timestampGranularities** | **String**| The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set verbose_json to use timestamp granularities. Currently &#x60;segment&#x60; is supported. | [optional] [enum: segment]

### Return type

[**AudioTranscriptionResponse**](AudioTranscriptionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

