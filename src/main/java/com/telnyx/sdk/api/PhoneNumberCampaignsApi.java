package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.PhoneNumberCampaign;
import com.telnyx.sdk.model.PhoneNumberCampaignCreate;
import com.telnyx.sdk.model.PhoneNumberCampaignPaginated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PhoneNumberCampaignsApi {

    private ApiClient apiClient;

    public PhoneNumberCampaignsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PhoneNumberCampaignsApi(ApiClient apiClient) {
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
   * Create New Phone Number Campaign
   * 
   * @param phoneNumberCampaignCreate  (required)
   * @return PhoneNumberCampaign
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public PhoneNumberCampaign createPhoneNumberCampaign(
        PhoneNumberCampaignCreate phoneNumberCampaignCreate
    ) throws ApiException {
        return createPhoneNumberCampaignWithHttpInfo(
            phoneNumberCampaignCreate
        ).getData();
    }

    /**
   * Create New Phone Number Campaign
   * 
   * @param phoneNumberCampaignCreate  (required)
   * @return ApiResponse&lt;PhoneNumberCampaign&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        PhoneNumberCampaign
    > createPhoneNumberCampaignWithHttpInfo(
        PhoneNumberCampaignCreate phoneNumberCampaignCreate
    ) throws ApiException {
        Object localVarPostBody = phoneNumberCampaignCreate;

        // verify the required parameter 'phoneNumberCampaignCreate' is set
        if (phoneNumberCampaignCreate == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'phoneNumberCampaignCreate' when calling createPhoneNumberCampaign"
            );
        }

        // create path and map variables
        String localVarPath = "/phone_number_campaigns";

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

        GenericType<PhoneNumberCampaign> localVarReturnType = new GenericType<
            PhoneNumberCampaign
        >() {};

        return apiClient.invokeAPI(
            "PhoneNumberCampaignsApi.createPhoneNumberCampaign",
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
   * Delete Phone Number Campaign
   * This endpoint allows you to remove a campaign assignment from the supplied &#x60;phoneNumber&#x60;.
   * @param phoneNumber  (required)
   * @return PhoneNumberCampaign
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public PhoneNumberCampaign deletePhoneNumberCampaign(String phoneNumber)
        throws ApiException {
        return deletePhoneNumberCampaignWithHttpInfo(phoneNumber).getData();
    }

    /**
   * Delete Phone Number Campaign
   * This endpoint allows you to remove a campaign assignment from the supplied &#x60;phoneNumber&#x60;.
   * @param phoneNumber  (required)
   * @return ApiResponse&lt;PhoneNumberCampaign&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        PhoneNumberCampaign
    > deletePhoneNumberCampaignWithHttpInfo(String phoneNumber)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'phoneNumber' when calling deletePhoneNumberCampaign"
            );
        }

        // create path and map variables
        String localVarPath =
            "/phone_number_campaigns/{phoneNumber}".replaceAll(
                    "\\{" + "phoneNumber" + "\\}",
                    apiClient.escapeString(phoneNumber.toString())
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

        GenericType<PhoneNumberCampaign> localVarReturnType = new GenericType<
            PhoneNumberCampaign
        >() {};

        return apiClient.invokeAPI(
            "PhoneNumberCampaignsApi.deletePhoneNumberCampaign",
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
   * Retrieve All Phone Number Campaigns
   * 
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @param filterTelnyxCampaignId Filter results by the Telnyx Campaign id (optional)
   * @param filterTelnyxBrandId Filter results by the Telnyx Brand id (optional)
   * @param filterTcrCampaignId Filter results by the TCR Campaign id (optional)
   * @param filterTcrBrandId Filter results by the TCR Brand id (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by createdAt in descending order. (optional, default to -createdAt)
   * @return PhoneNumberCampaignPaginated
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public PhoneNumberCampaignPaginated getAllPhoneNumberCampaigns(
        Object recordsPerPage,
        Object page,
        UUID filterTelnyxCampaignId,
        UUID filterTelnyxBrandId,
        String filterTcrCampaignId,
        String filterTcrBrandId,
        String sort
    ) throws ApiException {
        return getAllPhoneNumberCampaignsWithHttpInfo(
            recordsPerPage,
            page,
            filterTelnyxCampaignId,
            filterTelnyxBrandId,
            filterTcrCampaignId,
            filterTcrBrandId,
            sort
        ).getData();
    }

    /**
   * Retrieve All Phone Number Campaigns
   * 
   * @param recordsPerPage  (optional, default to 20)
   * @param page  (optional, default to 1)
   * @param filterTelnyxCampaignId Filter results by the Telnyx Campaign id (optional)
   * @param filterTelnyxBrandId Filter results by the Telnyx Brand id (optional)
   * @param filterTcrCampaignId Filter results by the TCR Campaign id (optional)
   * @param filterTcrBrandId Filter results by the TCR Brand id (optional)
   * @param sort Specifies the sort order for results. If not given, results are sorted by createdAt in descending order. (optional, default to -createdAt)
   * @return ApiResponse&lt;PhoneNumberCampaignPaginated&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        PhoneNumberCampaignPaginated
    > getAllPhoneNumberCampaignsWithHttpInfo(
        Object recordsPerPage,
        Object page,
        UUID filterTelnyxCampaignId,
        UUID filterTelnyxBrandId,
        String filterTcrCampaignId,
        String filterTcrBrandId,
        String sort
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/phone_number_campaigns";

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
            apiClient.parameterToPairs("", "recordsPerPage", recordsPerPage)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page", page)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[telnyx_campaign_id]",
                filterTelnyxCampaignId
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[telnyx_brand_id]",
                filterTelnyxBrandId
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[tcr_campaign_id]",
                filterTcrCampaignId
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[tcr_brand_id]",
                filterTcrBrandId
            )
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

        GenericType<PhoneNumberCampaignPaginated> localVarReturnType =
            new GenericType<PhoneNumberCampaignPaginated>() {};

        return apiClient.invokeAPI(
            "PhoneNumberCampaignsApi.getAllPhoneNumberCampaigns",
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
   * Get Single Phone Number Campaign
   * Retrieve an individual phone number/campaign assignment by &#x60;phoneNumber&#x60;.
   * @param phoneNumber  (required)
   * @return PhoneNumberCampaign
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public PhoneNumberCampaign getSinglePhoneNumberCampaign(String phoneNumber)
        throws ApiException {
        return getSinglePhoneNumberCampaignWithHttpInfo(phoneNumber).getData();
    }

    /**
   * Get Single Phone Number Campaign
   * Retrieve an individual phone number/campaign assignment by &#x60;phoneNumber&#x60;.
   * @param phoneNumber  (required)
   * @return ApiResponse&lt;PhoneNumberCampaign&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        PhoneNumberCampaign
    > getSinglePhoneNumberCampaignWithHttpInfo(String phoneNumber)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'phoneNumber' when calling getSinglePhoneNumberCampaign"
            );
        }

        // create path and map variables
        String localVarPath =
            "/phone_number_campaigns/{phoneNumber}".replaceAll(
                    "\\{" + "phoneNumber" + "\\}",
                    apiClient.escapeString(phoneNumber.toString())
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

        GenericType<PhoneNumberCampaign> localVarReturnType = new GenericType<
            PhoneNumberCampaign
        >() {};

        return apiClient.invokeAPI(
            "PhoneNumberCampaignsApi.getSinglePhoneNumberCampaign",
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
   * Create New Phone Number Campaign
   * 
   * @param phoneNumber  (required)
   * @param phoneNumberCampaignCreate  (required)
   * @return PhoneNumberCampaign
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public PhoneNumberCampaign putPhoneNumberCampaign(
        String phoneNumber,
        PhoneNumberCampaignCreate phoneNumberCampaignCreate
    ) throws ApiException {
        return putPhoneNumberCampaignWithHttpInfo(
            phoneNumber,
            phoneNumberCampaignCreate
        ).getData();
    }

    /**
   * Create New Phone Number Campaign
   * 
   * @param phoneNumber  (required)
   * @param phoneNumberCampaignCreate  (required)
   * @return ApiResponse&lt;PhoneNumberCampaign&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<PhoneNumberCampaign> putPhoneNumberCampaignWithHttpInfo(
        String phoneNumber,
        PhoneNumberCampaignCreate phoneNumberCampaignCreate
    ) throws ApiException {
        Object localVarPostBody = phoneNumberCampaignCreate;

        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'phoneNumber' when calling putPhoneNumberCampaign"
            );
        }

        // verify the required parameter 'phoneNumberCampaignCreate' is set
        if (phoneNumberCampaignCreate == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'phoneNumberCampaignCreate' when calling putPhoneNumberCampaign"
            );
        }

        // create path and map variables
        String localVarPath =
            "/phone_number_campaigns/{phoneNumber}".replaceAll(
                    "\\{" + "phoneNumber" + "\\}",
                    apiClient.escapeString(phoneNumber.toString())
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

        GenericType<PhoneNumberCampaign> localVarReturnType = new GenericType<
            PhoneNumberCampaign
        >() {};

        return apiClient.invokeAPI(
            "PhoneNumberCampaignsApi.putPhoneNumberCampaign",
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
