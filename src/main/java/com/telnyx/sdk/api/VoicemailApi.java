package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.GetVoicemail200Response;
import com.telnyx.sdk.model.VoicemailRequest;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class VoicemailApi {

    private ApiClient apiClient;

    public VoicemailApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VoicemailApi(ApiClient apiClient) {
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
   * Create voicemail
   * Create voicemail settings for a phone number
   * @param phoneNumberId The ID of the phone number. (required)
   * @param voicemailRequest Details to create (required)
   * @return GetVoicemail200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
    public GetVoicemail200Response createVoicemail(
        String phoneNumberId,
        VoicemailRequest voicemailRequest
    ) throws ApiException {
        return createVoicemailWithHttpInfo(
            phoneNumberId,
            voicemailRequest
        ).getData();
    }

    /**
   * Create voicemail
   * Create voicemail settings for a phone number
   * @param phoneNumberId The ID of the phone number. (required)
   * @param voicemailRequest Details to create (required)
   * @return ApiResponse&lt;GetVoicemail200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<GetVoicemail200Response> createVoicemailWithHttpInfo(
        String phoneNumberId,
        VoicemailRequest voicemailRequest
    ) throws ApiException {
        Object localVarPostBody = voicemailRequest;

        // verify the required parameter 'phoneNumberId' is set
        if (phoneNumberId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'phoneNumberId' when calling createVoicemail"
            );
        }

        // verify the required parameter 'voicemailRequest' is set
        if (voicemailRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'voicemailRequest' when calling createVoicemail"
            );
        }

        // create path and map variables
        String localVarPath =
            "/phone_numbers/{phone_number_id}/voicemail".replaceAll(
                    "\\{" + "phone_number_id" + "\\}",
                    apiClient.escapeString(phoneNumberId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<GetVoicemail200Response> localVarReturnType =
            new GenericType<GetVoicemail200Response>() {};

        return apiClient.invokeAPI(
            "VoicemailApi.createVoicemail",
            localVarPath,
            "POST",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Get voicemail
   * Returns the voicemail settings for a phone number
   * @param phoneNumberId The ID of the phone number. (required)
   * @return GetVoicemail200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
    public GetVoicemail200Response getVoicemail(String phoneNumberId)
        throws ApiException {
        return getVoicemailWithHttpInfo(phoneNumberId).getData();
    }

    /**
   * Get voicemail
   * Returns the voicemail settings for a phone number
   * @param phoneNumberId The ID of the phone number. (required)
   * @return ApiResponse&lt;GetVoicemail200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<GetVoicemail200Response> getVoicemailWithHttpInfo(
        String phoneNumberId
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'phoneNumberId' is set
        if (phoneNumberId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'phoneNumberId' when calling getVoicemail"
            );
        }

        // create path and map variables
        String localVarPath =
            "/phone_numbers/{phone_number_id}/voicemail".replaceAll(
                    "\\{" + "phone_number_id" + "\\}",
                    apiClient.escapeString(phoneNumberId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<GetVoicemail200Response> localVarReturnType =
            new GenericType<GetVoicemail200Response>() {};

        return apiClient.invokeAPI(
            "VoicemailApi.getVoicemail",
            localVarPath,
            "GET",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }

    /**
   * Update voicemail
   * Update voicemail settings for a phone number
   * @param phoneNumberId The ID of the phone number. (required)
   * @param voicemailRequest Details to update (required)
   * @return GetVoicemail200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
    public GetVoicemail200Response updateVoicemail(
        String phoneNumberId,
        VoicemailRequest voicemailRequest
    ) throws ApiException {
        return updateVoicemailWithHttpInfo(
            phoneNumberId,
            voicemailRequest
        ).getData();
    }

    /**
   * Update voicemail
   * Update voicemail settings for a phone number
   * @param phoneNumberId The ID of the phone number. (required)
   * @param voicemailRequest Details to update (required)
   * @return ApiResponse&lt;GetVoicemail200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<GetVoicemail200Response> updateVoicemailWithHttpInfo(
        String phoneNumberId,
        VoicemailRequest voicemailRequest
    ) throws ApiException {
        Object localVarPostBody = voicemailRequest;

        // verify the required parameter 'phoneNumberId' is set
        if (phoneNumberId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'phoneNumberId' when calling updateVoicemail"
            );
        }

        // verify the required parameter 'voicemailRequest' is set
        if (voicemailRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'voicemailRequest' when calling updateVoicemail"
            );
        }

        // create path and map variables
        String localVarPath =
            "/phone_numbers/{phone_number_id}/voicemail".replaceAll(
                    "\\{" + "phone_number_id" + "\\}",
                    apiClient.escapeString(phoneNumberId.toString())
                );

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<
            String,
            String
        >();
        Map<String, String> localVarCookieParams = new HashMap<
            String,
            String
        >();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<GetVoicemail200Response> localVarReturnType =
            new GenericType<GetVoicemail200Response>() {};

        return apiClient.invokeAPI(
            "VoicemailApi.updateVoicemail",
            localVarPath,
            "PATCH",
            localVarQueryParams,
            localVarPostBody,
            localVarHeaderParams,
            localVarCookieParams,
            localVarFormParams,
            localVarAccept,
            localVarContentType,
            localVarAuthNames,
            localVarReturnType,
            false
        );
    }
}
