package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.CampaignCost;
import com.telnyx.sdk.model.CampaignDeletionResponse;
import com.telnyx.sdk.model.CampaignRecordSetCSP;
import com.telnyx.sdk.model.CampaignRequest;
import com.telnyx.sdk.model.CampaignSharingChain;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.MnoMetadata;
import com.telnyx.sdk.model.ResponseSubmitCampaignPublicCampaignbuilderPost;
import com.telnyx.sdk.model.TelnyxCampaignCSP;
import com.telnyx.sdk.model.UpdateCampaignRequest;
import com.telnyx.sdk.model.UsecaseMetadata;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CampaignApi {

    private ApiClient apiClient;

    public CampaignApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CampaignApi(ApiClient apiClient) {
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
   * Accept Shared Campaign
   * Manually accept a campaign shared with Telnyx
   * @param campaignId TCR&#39;s ID for the campaign to import (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public Object acceptCampaign(String campaignId) throws ApiException {
        return acceptCampaignWithHttpInfo(campaignId).getData();
    }

    /**
   * Accept Shared Campaign
   * Manually accept a campaign shared with Telnyx
   * @param campaignId TCR&#39;s ID for the campaign to import (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<Object> acceptCampaignWithHttpInfo(String campaignId)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'campaignId' when calling acceptCampaign"
            );
        }

        // create path and map variables
        String localVarPath =
            "/campaign/acceptSharing/{campaignId}".replaceAll(
                    "\\{" + "campaignId" + "\\}",
                    apiClient.escapeString(campaignId.toString())
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

        GenericType<Object> localVarReturnType = new GenericType<Object>() {};

        return apiClient.invokeAPI(
            "CampaignApi.acceptCampaign",
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
   * Deactivate My Campaign
   * Terminate a campaign. Note that once deactivated, a campaign cannot be restored.
   * @param campaignId  (required)
   * @return CampaignDeletionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public CampaignDeletionResponse deactivateCampaign(String campaignId)
        throws ApiException {
        return deactivateCampaignWithHttpInfo(campaignId).getData();
    }

    /**
   * Deactivate My Campaign
   * Terminate a campaign. Note that once deactivated, a campaign cannot be restored.
   * @param campaignId  (required)
   * @return ApiResponse&lt;CampaignDeletionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<CampaignDeletionResponse> deactivateCampaignWithHttpInfo(
        String campaignId
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'campaignId' when calling deactivateCampaign"
            );
        }

        // create path and map variables
        String localVarPath =
            "/campaign/{campaignId}".replaceAll(
                    "\\{" + "campaignId" + "\\}",
                    apiClient.escapeString(campaignId.toString())
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

        GenericType<CampaignDeletionResponse> localVarReturnType =
            new GenericType<CampaignDeletionResponse>() {};

        return apiClient.invokeAPI(
            "CampaignApi.deactivateCampaign",
            localVarPath,
            "DELETE",
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
   * Get My Campaign
   * Retrieve campaign details by &#x60;campaignId&#x60;.
   * @param campaignId  (required)
   * @return TelnyxCampaignCSP
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public TelnyxCampaignCSP getCampaign(String campaignId)
        throws ApiException {
        return getCampaignWithHttpInfo(campaignId).getData();
    }

    /**
   * Get My Campaign
   * Retrieve campaign details by &#x60;campaignId&#x60;.
   * @param campaignId  (required)
   * @return ApiResponse&lt;TelnyxCampaignCSP&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<TelnyxCampaignCSP> getCampaignWithHttpInfo(
        String campaignId
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'campaignId' when calling getCampaign"
            );
        }

        // create path and map variables
        String localVarPath =
            "/campaign/{campaignId}".replaceAll(
                    "\\{" + "campaignId" + "\\}",
                    apiClient.escapeString(campaignId.toString())
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

        GenericType<TelnyxCampaignCSP> localVarReturnType = new GenericType<
            TelnyxCampaignCSP
        >() {};

        return apiClient.invokeAPI(
            "CampaignApi.getCampaign",
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
   * Get Campaign Cost
   * 
   * @param usecase  (required)
   * @return CampaignCost
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public CampaignCost getCampaignCost(String usecase) throws ApiException {
        return getCampaignCostWithHttpInfo(usecase).getData();
    }

    /**
   * Get Campaign Cost
   * 
   * @param usecase  (required)
   * @return ApiResponse&lt;CampaignCost&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<CampaignCost> getCampaignCostWithHttpInfo(
        String usecase
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'usecase' is set
        if (usecase == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'usecase' when calling getCampaignCost"
            );
        }

        // create path and map variables
        String localVarPath = "/campaign/usecase/cost";

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

        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "usecase", usecase)
        );

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CampaignCost> localVarReturnType = new GenericType<
            CampaignCost
        >() {};

        return apiClient.invokeAPI(
            "CampaignApi.getCampaignCost",
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
   * Get Campaign Mno Metadata
   * Get the campaign metadata for each MNO it was submitted to.
   * @param campaignId ID of the campaign in question (required)
   * @return MnoMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response. It constains a map of usecase metadata for each MNO. The key is the network ID of the MNO (e.g. 10017), the value is the mno metadata for the usecase. The metadata may also include some MNO specific fields. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
    public MnoMetadata getCampaignMnoMetadata(String campaignId)
        throws ApiException {
        return getCampaignMnoMetadataWithHttpInfo(campaignId).getData();
    }

    /**
   * Get Campaign Mno Metadata
   * Get the campaign metadata for each MNO it was submitted to.
   * @param campaignId ID of the campaign in question (required)
   * @return ApiResponse&lt;MnoMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response. It constains a map of usecase metadata for each MNO. The key is the network ID of the MNO (e.g. 10017), the value is the mno metadata for the usecase. The metadata may also include some MNO specific fields. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<MnoMetadata> getCampaignMnoMetadataWithHttpInfo(
        String campaignId
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'campaignId' when calling getCampaignMnoMetadata"
            );
        }

        // create path and map variables
        String localVarPath =
            "/campaign/{campaignId}/mnoMetadata".replaceAll(
                    "\\{" + "campaignId" + "\\}",
                    apiClient.escapeString(campaignId.toString())
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

        GenericType<MnoMetadata> localVarReturnType = new GenericType<
            MnoMetadata
        >() {};

        return apiClient.invokeAPI(
            "CampaignApi.getCampaignMnoMetadata",
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
   * Get My Campaign Operation Status
   * Retrieve campaign&#39;s operation status at MNO level.
   * @param campaignId  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public Object getCampaignOperationStatus(String campaignId)
        throws ApiException {
        return getCampaignOperationStatusWithHttpInfo(campaignId).getData();
    }

    /**
   * Get My Campaign Operation Status
   * Retrieve campaign&#39;s operation status at MNO level.
   * @param campaignId  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<Object> getCampaignOperationStatusWithHttpInfo(
        String campaignId
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'campaignId' when calling getCampaignOperationStatus"
            );
        }

        // create path and map variables
        String localVarPath =
            "/campaign/{campaignId}/operationStatus".replaceAll(
                    "\\{" + "campaignId" + "\\}",
                    apiClient.escapeString(campaignId.toString())
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

        GenericType<Object> localVarReturnType = new GenericType<Object>() {};

        return apiClient.invokeAPI(
            "CampaignApi.getCampaignOperationStatus",
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
   * Get My Osr Campaign Attributes
   * 
   * @param campaignId  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public Object getCampaignOsrAttributes(String campaignId)
        throws ApiException {
        return getCampaignOsrAttributesWithHttpInfo(campaignId).getData();
    }

    /**
   * Get My Osr Campaign Attributes
   * 
   * @param campaignId  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<Object> getCampaignOsrAttributesWithHttpInfo(
        String campaignId
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'campaignId' when calling getCampaignOsrAttributes"
            );
        }

        // create path and map variables
        String localVarPath =
            "/campaign/{campaignId}/osr/attributes".replaceAll(
                    "\\{" + "campaignId" + "\\}",
                    apiClient.escapeString(campaignId.toString())
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

        GenericType<Object> localVarReturnType = new GenericType<Object>() {};

        return apiClient.invokeAPI(
            "CampaignApi.getCampaignOsrAttributes",
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
   * Get Sharing Status
   * 
   * @param campaignId ID of the campaign in question (required)
   * @return CampaignSharingChain
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public CampaignSharingChain getCampaignSharingStatus(String campaignId)
        throws ApiException {
        return getCampaignSharingStatusWithHttpInfo(campaignId).getData();
    }

    /**
   * Get Sharing Status
   * 
   * @param campaignId ID of the campaign in question (required)
   * @return ApiResponse&lt;CampaignSharingChain&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CampaignSharingChain
    > getCampaignSharingStatusWithHttpInfo(String campaignId)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'campaignId' when calling getCampaignSharingStatus"
            );
        }

        // create path and map variables
        String localVarPath =
            "/campaign/{campaignId}/sharing".replaceAll(
                    "\\{" + "campaignId" + "\\}",
                    apiClient.escapeString(campaignId.toString())
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

        GenericType<CampaignSharingChain> localVarReturnType = new GenericType<
            CampaignSharingChain
        >() {};

        return apiClient.invokeAPI(
            "CampaignApi.getCampaignSharingStatus",
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
   * List Campaigns
   * Retrieve a list of campaigns associated with a supplied &#x60;brandId&#x60;.
   * @param brandId  (required)
   * @param page The 1-indexed page number to get. The default value is &#x60;1&#x60;. (optional, default to 1)
   * @param recordsPerPage The amount of records per page, limited to between 1 and 500 inclusive. The default value is &#x60;10&#x60;. (optional, default to 10)
   * @param sort Specifies the sort order for results. If not given, results are sorted by createdAt in descending order. (optional, default to -createdAt)
   * @return CampaignRecordSetCSP
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public CampaignRecordSetCSP getCampaigns(
        String brandId,
        Integer page,
        Integer recordsPerPage,
        String sort
    ) throws ApiException {
        return getCampaignsWithHttpInfo(
            brandId,
            page,
            recordsPerPage,
            sort
        ).getData();
    }

    /**
   * List Campaigns
   * Retrieve a list of campaigns associated with a supplied &#x60;brandId&#x60;.
   * @param brandId  (required)
   * @param page The 1-indexed page number to get. The default value is &#x60;1&#x60;. (optional, default to 1)
   * @param recordsPerPage The amount of records per page, limited to between 1 and 500 inclusive. The default value is &#x60;10&#x60;. (optional, default to 10)
   * @param sort Specifies the sort order for results. If not given, results are sorted by createdAt in descending order. (optional, default to -createdAt)
   * @return ApiResponse&lt;CampaignRecordSetCSP&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<CampaignRecordSetCSP> getCampaignsWithHttpInfo(
        String brandId,
        Integer page,
        Integer recordsPerPage,
        String sort
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'brandId' when calling getCampaigns"
            );
        }

        // create path and map variables
        String localVarPath = "/campaign";

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

        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "brandId", brandId)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page", page)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "recordsPerPage", recordsPerPage)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "sort", sort)
        );

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<CampaignRecordSetCSP> localVarReturnType = new GenericType<
            CampaignRecordSetCSP
        >() {};

        return apiClient.invokeAPI(
            "CampaignApi.getCampaigns",
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
   * Qualify By Usecase
   * This endpoint allows you to see whether or not the supplied brand is suitable for your desired campaign use case.
   * @param usecase  (required)
   * @param brandId  (required)
   * @return UsecaseMetadata
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public UsecaseMetadata getUsecaseQualification(
        String usecase,
        String brandId
    ) throws ApiException {
        return getUsecaseQualificationWithHttpInfo(usecase, brandId).getData();
    }

    /**
   * Qualify By Usecase
   * This endpoint allows you to see whether or not the supplied brand is suitable for your desired campaign use case.
   * @param usecase  (required)
   * @param brandId  (required)
   * @return ApiResponse&lt;UsecaseMetadata&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<UsecaseMetadata> getUsecaseQualificationWithHttpInfo(
        String usecase,
        String brandId
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'usecase' is set
        if (usecase == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'usecase' when calling getUsecaseQualification"
            );
        }

        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'brandId' when calling getUsecaseQualification"
            );
        }

        // create path and map variables
        String localVarPath =
            "/campaignBuilder/brand/{brandId}/usecase/{usecase}".replaceAll(
                    "\\{" + "usecase" + "\\}",
                    apiClient.escapeString(usecase.toString())
                ).replaceAll(
                    "\\{" + "brandId" + "\\}",
                    apiClient.escapeString(brandId.toString())
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

        GenericType<UsecaseMetadata> localVarReturnType = new GenericType<
            UsecaseMetadata
        >() {};

        return apiClient.invokeAPI(
            "CampaignApi.getUsecaseQualification",
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
   * Submit Campaign
   * Before creating a campaign, use the [Qualify By Usecase endpoint](https://developers.telnyx.com/api/messaging/10dlc/get-usecase-qualification) to ensure that the brand you want to assign a new campaign to is qualified for the desired use case of that campaign. **Please note:** After campaign creation, you&#39;ll only be able to edit the campaign&#39;s sample messages. Creating a campaign will entail an upfront, non-refundable three month&#39;s cost that will depend on the campaign&#39;s use case ([see 10DLC Costs section for details](https://developers.telnyx.com/docs/messaging/10dlc/concepts#10dlc-costs)).
   * @param campaignRequest  (required)
   * @return ResponseSubmitCampaignPublicCampaignbuilderPost
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ResponseSubmitCampaignPublicCampaignbuilderPost postCampaign(
        CampaignRequest campaignRequest
    ) throws ApiException {
        return postCampaignWithHttpInfo(campaignRequest).getData();
    }

    /**
   * Submit Campaign
   * Before creating a campaign, use the [Qualify By Usecase endpoint](https://developers.telnyx.com/api/messaging/10dlc/get-usecase-qualification) to ensure that the brand you want to assign a new campaign to is qualified for the desired use case of that campaign. **Please note:** After campaign creation, you&#39;ll only be able to edit the campaign&#39;s sample messages. Creating a campaign will entail an upfront, non-refundable three month&#39;s cost that will depend on the campaign&#39;s use case ([see 10DLC Costs section for details](https://developers.telnyx.com/docs/messaging/10dlc/concepts#10dlc-costs)).
   * @param campaignRequest  (required)
   * @return ApiResponse&lt;ResponseSubmitCampaignPublicCampaignbuilderPost&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        ResponseSubmitCampaignPublicCampaignbuilderPost
    > postCampaignWithHttpInfo(CampaignRequest campaignRequest)
        throws ApiException {
        Object localVarPostBody = campaignRequest;

        // verify the required parameter 'campaignRequest' is set
        if (campaignRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'campaignRequest' when calling postCampaign"
            );
        }

        // create path and map variables
        String localVarPath = "/campaignBuilder";

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

        GenericType<
            ResponseSubmitCampaignPublicCampaignbuilderPost
        > localVarReturnType = new GenericType<
            ResponseSubmitCampaignPublicCampaignbuilderPost
        >() {};

        return apiClient.invokeAPI(
            "CampaignApi.postCampaign",
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
   * Update My Campaign
   * Update a campaign&#39;s properties by &#x60;campaignId&#x60;. **Please note:** only sample messages are editable.
   * @param campaignId  (required)
   * @param updateCampaignRequest  (required)
   * @return TelnyxCampaignCSP
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public TelnyxCampaignCSP updateCampaign(
        String campaignId,
        UpdateCampaignRequest updateCampaignRequest
    ) throws ApiException {
        return updateCampaignWithHttpInfo(
            campaignId,
            updateCampaignRequest
        ).getData();
    }

    /**
   * Update My Campaign
   * Update a campaign&#39;s properties by &#x60;campaignId&#x60;. **Please note:** only sample messages are editable.
   * @param campaignId  (required)
   * @param updateCampaignRequest  (required)
   * @return ApiResponse&lt;TelnyxCampaignCSP&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<TelnyxCampaignCSP> updateCampaignWithHttpInfo(
        String campaignId,
        UpdateCampaignRequest updateCampaignRequest
    ) throws ApiException {
        Object localVarPostBody = updateCampaignRequest;

        // verify the required parameter 'campaignId' is set
        if (campaignId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'campaignId' when calling updateCampaign"
            );
        }

        // verify the required parameter 'updateCampaignRequest' is set
        if (updateCampaignRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'updateCampaignRequest' when calling updateCampaign"
            );
        }

        // create path and map variables
        String localVarPath =
            "/campaign/{campaignId}".replaceAll(
                    "\\{" + "campaignId" + "\\}",
                    apiClient.escapeString(campaignId.toString())
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

        GenericType<TelnyxCampaignCSP> localVarReturnType = new GenericType<
            TelnyxCampaignCSP
        >() {};

        return apiClient.invokeAPI(
            "CampaignApi.updateCampaign",
            localVarPath,
            "PUT",
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
