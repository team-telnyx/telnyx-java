package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.CheckContactRequestBody;
import com.telnyx.sdk.model.CheckContactResponse;
import com.telnyx.sdk.model.Errors;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class WhatsAppContactsApi {

    private ApiClient apiClient;

    public WhatsAppContactsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WhatsAppContactsApi(ApiClient apiClient) {
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
   * Check Contact
   * Verify that a phone number belongs to a valid WhatsApp account. You must ensure that the status is valid before you can message a user, and you&#39;ll get their WhatsApp ID to use for messaging.
   * @param checkContactRequestBody  (required)
   * @return CheckContactResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about WhatsApp contact(s). </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CheckContactResponse checkContact(
        CheckContactRequestBody checkContactRequestBody
    ) throws ApiException {
        return checkContactWithHttpInfo(checkContactRequestBody).getData();
    }

    /**
   * Check Contact
   * Verify that a phone number belongs to a valid WhatsApp account. You must ensure that the status is valid before you can message a user, and you&#39;ll get their WhatsApp ID to use for messaging.
   * @param checkContactRequestBody  (required)
   * @return ApiResponse&lt;CheckContactResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with details about WhatsApp contact(s). </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<CheckContactResponse> checkContactWithHttpInfo(
        CheckContactRequestBody checkContactRequestBody
    ) throws ApiException {
        Object localVarPostBody = checkContactRequestBody;

        // verify the required parameter 'checkContactRequestBody' is set
        if (checkContactRequestBody == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'checkContactRequestBody' when calling checkContact"
            );
        }

        // create path and map variables
        String localVarPath = "/whatsapp_contacts";

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

        GenericType<CheckContactResponse> localVarReturnType = new GenericType<
            CheckContactResponse
        >() {};

        return apiClient.invokeAPI(
            "WhatsAppContactsApi.checkContact",
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
}
