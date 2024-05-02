package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.AudioTranscriptionResponse;
import java.io.File;
import com.telnyx.sdk.model.HTTPValidationError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AudioApi {
  private ApiClient apiClient;

  public AudioApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AudioApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Transcribe speech to text (BETA)
   * Transcribe speech to text. This endpoint is consistent with the [OpenAI Transcription API](https://platform.openai.com/docs/api-reference/audio/createTranscription) and may be used with the OpenAI JS or Python SDK.
   * @param _file The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. File uploads are limited to 100 MB. (required)
   * @param model ID of the model to use. Only &#x60;distil-whisper/distil-large-v2&#x60; is currently available. (required)
   * @param responseFormat The format of the transcript output. Use &#x60;verbose_json&#x60; to take advantage of timestamps. (optional, default to json)
   * @param timestampGranularities The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set verbose_json to use timestamp granularities. Currently &#x60;segment&#x60; is supported. (optional)
   * @return AudioTranscriptionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public AudioTranscriptionResponse audioPublicAudioTranscriptionsPost(File _file, String model, String responseFormat, String timestampGranularities) throws ApiException {
    return audioPublicAudioTranscriptionsPostWithHttpInfo(_file, model, responseFormat, timestampGranularities).getData();
  }

  /**
   * Transcribe speech to text (BETA)
   * Transcribe speech to text. This endpoint is consistent with the [OpenAI Transcription API](https://platform.openai.com/docs/api-reference/audio/createTranscription) and may be used with the OpenAI JS or Python SDK.
   * @param _file The audio file object to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. File uploads are limited to 100 MB. (required)
   * @param model ID of the model to use. Only &#x60;distil-whisper/distil-large-v2&#x60; is currently available. (required)
   * @param responseFormat The format of the transcript output. Use &#x60;verbose_json&#x60; to take advantage of timestamps. (optional, default to json)
   * @param timestampGranularities The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set verbose_json to use timestamp granularities. Currently &#x60;segment&#x60; is supported. (optional)
   * @return ApiResponse&lt;AudioTranscriptionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AudioTranscriptionResponse> audioPublicAudioTranscriptionsPostWithHttpInfo(File _file, String model, String responseFormat, String timestampGranularities) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter '_file' is set
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling audioPublicAudioTranscriptionsPost");
    }
    
    // verify the required parameter 'model' is set
    if (model == null) {
      throw new ApiException(400, "Missing the required parameter 'model' when calling audioPublicAudioTranscriptionsPost");
    }
    
    // create path and map variables
    String localVarPath = "/ai/audio/transcriptions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (_file != null)
      localVarFormParams.put("file", _file);
if (model != null)
      localVarFormParams.put("model", model);
if (responseFormat != null)
      localVarFormParams.put("response_format", responseFormat);
if (timestampGranularities != null)
      localVarFormParams.put("timestamp_granularities[]", timestampGranularities);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<AudioTranscriptionResponse> localVarReturnType = new GenericType<AudioTranscriptionResponse>() {};

    return apiClient.invokeAPI("AudioApi.audioPublicAudioTranscriptionsPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
