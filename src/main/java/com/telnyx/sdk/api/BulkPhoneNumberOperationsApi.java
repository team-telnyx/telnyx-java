package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListPhoneNumbersBackgroundJobsResponse;
import com.telnyx.sdk.model.PhoneNumbersEnableEmergency;
import com.telnyx.sdk.model.PhoneNumbersJob;
import com.telnyx.sdk.model.PhoneNumbersJobDeletePhoneNumbers;
import com.telnyx.sdk.model.PhoneNumbersJobDeletePhoneNumbersRequest;
import com.telnyx.sdk.model.PhoneNumbersJobUpdateEmergencySettingsRequest;
import com.telnyx.sdk.model.PhoneNumbersJobUpdatePhoneNumbers;
import com.telnyx.sdk.model.PhoneNumbersJobUpdatePhoneNumbersRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class BulkPhoneNumberOperationsApi {

    private ApiClient apiClient;

    public BulkPhoneNumberOperationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BulkPhoneNumberOperationsApi(ApiClient apiClient) {
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

    private ApiResponse<
        PhoneNumbersJobDeletePhoneNumbers
    > createDeletePhoneNumbersJobWithHttpInfo(
        PhoneNumbersJobDeletePhoneNumbersRequest phoneNumbersJobDeletePhoneNumbersRequest
    ) throws ApiException {
        Object localVarPostBody = phoneNumbersJobDeletePhoneNumbersRequest;

        // verify the required parameter 'phoneNumbersJobDeletePhoneNumbersRequest' is set
        if (phoneNumbersJobDeletePhoneNumbersRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'phoneNumbersJobDeletePhoneNumbersRequest' when calling createDeletePhoneNumbersJob"
            );
        }

        // create path and map variables
        String localVarPath = "/phone_numbers/jobs/delete_phone_numbers";

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

        GenericType<PhoneNumbersJobDeletePhoneNumbers> localVarReturnType =
            new GenericType<PhoneNumbersJobDeletePhoneNumbers>() {};

        return apiClient.invokeAPI(
            "BulkPhoneNumberOperationsApi.createDeletePhoneNumbersJob",
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

    public class APIcreateDeletePhoneNumbersJobRequest {

        private PhoneNumbersJobDeletePhoneNumbersRequest phoneNumbersJobDeletePhoneNumbersRequest;

        private APIcreateDeletePhoneNumbersJobRequest() {}

        /**
         * Set phoneNumbersJobDeletePhoneNumbersRequest
         * @param phoneNumbersJobDeletePhoneNumbersRequest  (required)
         * @return APIcreateDeletePhoneNumbersJobRequest
         */
        public APIcreateDeletePhoneNumbersJobRequest phoneNumbersJobDeletePhoneNumbersRequest(
            PhoneNumbersJobDeletePhoneNumbersRequest phoneNumbersJobDeletePhoneNumbersRequest
        ) {
            this.phoneNumbersJobDeletePhoneNumbersRequest =
                phoneNumbersJobDeletePhoneNumbersRequest;
            return this;
        }

        /**
     * Execute createDeletePhoneNumbersJob request
     * @return PhoneNumbersJobDeletePhoneNumbers
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> Phone numbers job delete phone numbers requested. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */

        public PhoneNumbersJobDeletePhoneNumbers execute() throws ApiException {
            return this.executeWithHttpInfo().getData();
        }

        /**
     * Execute createDeletePhoneNumbersJob request with HTTP info returned
     * @return ApiResponse&lt;PhoneNumbersJobDeletePhoneNumbers&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> Phone numbers job delete phone numbers requested. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
        public ApiResponse<
            PhoneNumbersJobDeletePhoneNumbers
        > executeWithHttpInfo() throws ApiException {
            return createDeletePhoneNumbersJobWithHttpInfo(
                phoneNumbersJobDeletePhoneNumbersRequest
            );
        }
    }

    /**
   * Delete a batch of numbers
   * Creates a new background job to delete a batch of numbers. At most one thousand numbers can be updated per API call.
   * @return createDeletePhoneNumbersJobRequest
   * @throws ApiException if fails to make API call
   
   
   */
    public APIcreateDeletePhoneNumbersJobRequest createDeletePhoneNumbersJob()
        throws ApiException {
        return new APIcreateDeletePhoneNumbersJobRequest();
    }

    /**
   * Update the emergency settings from a batch of numbers
   * Creates a background job to update the emergency settings of a collection of phone numbers. At most one thousand numbers can be updated per API call.
   * @param phoneNumbersJobUpdateEmergencySettingsRequest  (required)
   * @return PhoneNumbersEnableEmergency
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Phone numbers enable emergency requested. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public PhoneNumbersEnableEmergency createPhoneNumbersJobUpdateEmergencySettings(
        PhoneNumbersJobUpdateEmergencySettingsRequest phoneNumbersJobUpdateEmergencySettingsRequest
    ) throws ApiException {
        return createPhoneNumbersJobUpdateEmergencySettingsWithHttpInfo(
            phoneNumbersJobUpdateEmergencySettingsRequest
        ).getData();
    }

    /**
   * Update the emergency settings from a batch of numbers
   * Creates a background job to update the emergency settings of a collection of phone numbers. At most one thousand numbers can be updated per API call.
   * @param phoneNumbersJobUpdateEmergencySettingsRequest  (required)
   * @return ApiResponse&lt;PhoneNumbersEnableEmergency&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 202 </td><td> Phone numbers enable emergency requested. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        PhoneNumbersEnableEmergency
    > createPhoneNumbersJobUpdateEmergencySettingsWithHttpInfo(
        PhoneNumbersJobUpdateEmergencySettingsRequest phoneNumbersJobUpdateEmergencySettingsRequest
    ) throws ApiException {
        Object localVarPostBody = phoneNumbersJobUpdateEmergencySettingsRequest;

        // verify the required parameter 'phoneNumbersJobUpdateEmergencySettingsRequest' is set
        if (phoneNumbersJobUpdateEmergencySettingsRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'phoneNumbersJobUpdateEmergencySettingsRequest' when calling createPhoneNumbersJobUpdateEmergencySettings"
            );
        }

        // create path and map variables
        String localVarPath = "/phone_numbers/jobs/update_emergency_settings";

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

        GenericType<PhoneNumbersEnableEmergency> localVarReturnType =
            new GenericType<PhoneNumbersEnableEmergency>() {};

        return apiClient.invokeAPI(
            "BulkPhoneNumberOperationsApi.createPhoneNumbersJobUpdateEmergencySettings",
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

    private ApiResponse<
        PhoneNumbersJobUpdatePhoneNumbers
    > createUpdatePhoneNumbersJobWithHttpInfo(
        PhoneNumbersJobUpdatePhoneNumbersRequest phoneNumbersJobUpdatePhoneNumbersRequest,
        String filterHasBundle,
        String filterTag,
        String filterConnectionId,
        String filterPhoneNumber,
        String filterStatus,
        String filterVoiceConnectionNameContains,
        String filterVoiceUsagePaymentMethod,
        String filterBillingGroupId,
        String filterEmergencyAddressId,
        String filterCustomerReference
    ) throws ApiException {
        Object localVarPostBody = phoneNumbersJobUpdatePhoneNumbersRequest;

        // verify the required parameter 'phoneNumbersJobUpdatePhoneNumbersRequest' is set
        if (phoneNumbersJobUpdatePhoneNumbersRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'phoneNumbersJobUpdatePhoneNumbersRequest' when calling createUpdatePhoneNumbersJob"
            );
        }

        // create path and map variables
        String localVarPath = "/phone_numbers/jobs/update_phone_numbers";

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
            apiClient.parameterToPairs(
                "",
                "filter[has_bundle]",
                filterHasBundle
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "filter[tag]", filterTag)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[connection_id]",
                filterConnectionId
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[phone_number]",
                filterPhoneNumber
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "filter[status]", filterStatus)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[voice.connection_name][contains]",
                filterVoiceConnectionNameContains
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[voice.usage_payment_method]",
                filterVoiceUsagePaymentMethod
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[billing_group_id]",
                filterBillingGroupId
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[emergency_address_id]",
                filterEmergencyAddressId
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[customer_reference]",
                filterCustomerReference
            )
        );

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<PhoneNumbersJobUpdatePhoneNumbers> localVarReturnType =
            new GenericType<PhoneNumbersJobUpdatePhoneNumbers>() {};

        return apiClient.invokeAPI(
            "BulkPhoneNumberOperationsApi.createUpdatePhoneNumbersJob",
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

    public class APIcreateUpdatePhoneNumbersJobRequest {

        private PhoneNumbersJobUpdatePhoneNumbersRequest phoneNumbersJobUpdatePhoneNumbersRequest;
        private String filterHasBundle;
        private String filterTag;
        private String filterConnectionId;
        private String filterPhoneNumber;
        private String filterStatus;
        private String filterVoiceConnectionNameContains;
        private String filterVoiceUsagePaymentMethod;
        private String filterBillingGroupId;
        private String filterEmergencyAddressId;
        private String filterCustomerReference;

        private APIcreateUpdatePhoneNumbersJobRequest() {}

        /**
         * Set phoneNumbersJobUpdatePhoneNumbersRequest
         * @param phoneNumbersJobUpdatePhoneNumbersRequest  (required)
         * @return APIcreateUpdatePhoneNumbersJobRequest
         */
        public APIcreateUpdatePhoneNumbersJobRequest phoneNumbersJobUpdatePhoneNumbersRequest(
            PhoneNumbersJobUpdatePhoneNumbersRequest phoneNumbersJobUpdatePhoneNumbersRequest
        ) {
            this.phoneNumbersJobUpdatePhoneNumbersRequest =
                phoneNumbersJobUpdatePhoneNumbersRequest;
            return this;
        }

        /**
         * Set filterHasBundle
         * @param filterHasBundle Filter by phone number that have bundles. (optional)
         * @return APIcreateUpdatePhoneNumbersJobRequest
         */
        public APIcreateUpdatePhoneNumbersJobRequest filterHasBundle(
            String filterHasBundle
        ) {
            this.filterHasBundle = filterHasBundle;
            return this;
        }

        /**
         * Set filterTag
         * @param filterTag Filter by phone number tags. (optional)
         * @return APIcreateUpdatePhoneNumbersJobRequest
         */
        public APIcreateUpdatePhoneNumbersJobRequest filterTag(
            String filterTag
        ) {
            this.filterTag = filterTag;
            return this;
        }

        /**
         * Set filterConnectionId
         * @param filterConnectionId Filter by connection_id. (optional)
         * @return APIcreateUpdatePhoneNumbersJobRequest
         */
        public APIcreateUpdatePhoneNumbersJobRequest filterConnectionId(
            String filterConnectionId
        ) {
            this.filterConnectionId = filterConnectionId;
            return this;
        }

        /**
         * Set filterPhoneNumber
         * @param filterPhoneNumber Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. (optional)
         * @return APIcreateUpdatePhoneNumbersJobRequest
         */
        public APIcreateUpdatePhoneNumbersJobRequest filterPhoneNumber(
            String filterPhoneNumber
        ) {
            this.filterPhoneNumber = filterPhoneNumber;
            return this;
        }

        /**
         * Set filterStatus
         * @param filterStatus Filter by phone number status. (optional)
         * @return APIcreateUpdatePhoneNumbersJobRequest
         */
        public APIcreateUpdatePhoneNumbersJobRequest filterStatus(
            String filterStatus
        ) {
            this.filterStatus = filterStatus;
            return this;
        }

        /**
         * Set filterVoiceConnectionNameContains
         * @param filterVoiceConnectionNameContains Filter contains connection name. Requires at least three characters. (optional)
         * @return APIcreateUpdatePhoneNumbersJobRequest
         */
        public APIcreateUpdatePhoneNumbersJobRequest filterVoiceConnectionNameContains(
            String filterVoiceConnectionNameContains
        ) {
            this.filterVoiceConnectionNameContains =
                filterVoiceConnectionNameContains;
            return this;
        }

        /**
         * Set filterVoiceUsagePaymentMethod
         * @param filterVoiceUsagePaymentMethod Filter by usage_payment_method. (optional)
         * @return APIcreateUpdatePhoneNumbersJobRequest
         */
        public APIcreateUpdatePhoneNumbersJobRequest filterVoiceUsagePaymentMethod(
            String filterVoiceUsagePaymentMethod
        ) {
            this.filterVoiceUsagePaymentMethod = filterVoiceUsagePaymentMethod;
            return this;
        }

        /**
         * Set filterBillingGroupId
         * @param filterBillingGroupId Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string &#39;null&#39;. (optional)
         * @return APIcreateUpdatePhoneNumbersJobRequest
         */
        public APIcreateUpdatePhoneNumbersJobRequest filterBillingGroupId(
            String filterBillingGroupId
        ) {
            this.filterBillingGroupId = filterBillingGroupId;
            return this;
        }

        /**
         * Set filterEmergencyAddressId
         * @param filterEmergencyAddressId Filter by the emergency_address_id associated with phone numbers. To filter only phone numbers that have no emergency address associated with them, set the value of this filter to the string &#39;null&#39;. (optional)
         * @return APIcreateUpdatePhoneNumbersJobRequest
         */
        public APIcreateUpdatePhoneNumbersJobRequest filterEmergencyAddressId(
            String filterEmergencyAddressId
        ) {
            this.filterEmergencyAddressId = filterEmergencyAddressId;
            return this;
        }

        /**
         * Set filterCustomerReference
         * @param filterCustomerReference Filter numbers via the customer_reference set. (optional)
         * @return APIcreateUpdatePhoneNumbersJobRequest
         */
        public APIcreateUpdatePhoneNumbersJobRequest filterCustomerReference(
            String filterCustomerReference
        ) {
            this.filterCustomerReference = filterCustomerReference;
            return this;
        }

        /**
     * Execute createUpdatePhoneNumbersJob request
     * @return PhoneNumbersJobUpdatePhoneNumbers
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> Phone numbers job update phone numbers requested. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */

        public PhoneNumbersJobUpdatePhoneNumbers execute() throws ApiException {
            return this.executeWithHttpInfo().getData();
        }

        /**
     * Execute createUpdatePhoneNumbersJob request with HTTP info returned
     * @return ApiResponse&lt;PhoneNumbersJobUpdatePhoneNumbers&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 202 </td><td> Phone numbers job update phone numbers requested. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
        public ApiResponse<
            PhoneNumbersJobUpdatePhoneNumbers
        > executeWithHttpInfo() throws ApiException {
            return createUpdatePhoneNumbersJobWithHttpInfo(
                phoneNumbersJobUpdatePhoneNumbersRequest,
                filterHasBundle,
                filterTag,
                filterConnectionId,
                filterPhoneNumber,
                filterStatus,
                filterVoiceConnectionNameContains,
                filterVoiceUsagePaymentMethod,
                filterBillingGroupId,
                filterEmergencyAddressId,
                filterCustomerReference
            );
        }
    }

    /**
   * Update a batch of numbers
   * Creates a new background job to update a batch of numbers. At most one thousand numbers can be updated per API call. At least one of the updateable fields must be submitted.
   * @return createUpdatePhoneNumbersJobRequest
   * @throws ApiException if fails to make API call
   
   
   */
    public APIcreateUpdatePhoneNumbersJobRequest createUpdatePhoneNumbersJob()
        throws ApiException {
        return new APIcreateUpdatePhoneNumbersJobRequest();
    }

    private ApiResponse<
        ListPhoneNumbersBackgroundJobsResponse
    > listPhoneNumbersJobsWithHttpInfo(
        String filterType,
        Integer pageNumber,
        Integer pageSize,
        String sort
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/phone_numbers/jobs";

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
            apiClient.parameterToPairs("", "filter[type]", filterType)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[number]", pageNumber)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[size]", pageSize)
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

        GenericType<ListPhoneNumbersBackgroundJobsResponse> localVarReturnType =
            new GenericType<ListPhoneNumbersBackgroundJobsResponse>() {};

        return apiClient.invokeAPI(
            "BulkPhoneNumberOperationsApi.listPhoneNumbersJobs",
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

    public class APIlistPhoneNumbersJobsRequest {

        private String filterType;
        private Integer pageNumber;
        private Integer pageSize;
        private String sort;

        private APIlistPhoneNumbersJobsRequest() {}

        /**
         * Set filterType
         * @param filterType Filter the phone number jobs by type. (optional)
         * @return APIlistPhoneNumbersJobsRequest
         */
        public APIlistPhoneNumbersJobsRequest filterType(String filterType) {
            this.filterType = filterType;
            return this;
        }

        /**
         * Set pageNumber
         * @param pageNumber The page number to load (optional, default to 1)
         * @return APIlistPhoneNumbersJobsRequest
         */
        public APIlistPhoneNumbersJobsRequest pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Set pageSize
         * @param pageSize The size of the page (optional, default to 20)
         * @return APIlistPhoneNumbersJobsRequest
         */
        public APIlistPhoneNumbersJobsRequest pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Set sort
         * @param sort Specifies the sort order for results. If not given, results are sorted by created_at in descending order. (optional)
         * @return APIlistPhoneNumbersJobsRequest
         */
        public APIlistPhoneNumbersJobsRequest sort(String sort) {
            this.sort = sort;
            return this;
        }

        /**
     * Execute listPhoneNumbersJobs request
     * @return ListPhoneNumbersBackgroundJobsResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers background jobs. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */

        public ListPhoneNumbersBackgroundJobsResponse execute()
            throws ApiException {
            return this.executeWithHttpInfo().getData();
        }

        /**
     * Execute listPhoneNumbersJobs request with HTTP info returned
     * @return ApiResponse&lt;ListPhoneNumbersBackgroundJobsResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of phone numbers background jobs. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
        public ApiResponse<
            ListPhoneNumbersBackgroundJobsResponse
        > executeWithHttpInfo() throws ApiException {
            return listPhoneNumbersJobsWithHttpInfo(
                filterType,
                pageNumber,
                pageSize,
                sort
            );
        }
    }

    /**
   * Lists the phone numbers jobs
   * 
   * @return listPhoneNumbersJobsRequest
   * @throws ApiException if fails to make API call
   
   
   */
    public APIlistPhoneNumbersJobsRequest listPhoneNumbersJobs()
        throws ApiException {
        return new APIlistPhoneNumbersJobsRequest();
    }

    private ApiResponse<PhoneNumbersJob> retrievePhoneNumbersJobWithHttpInfo(
        String id
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling retrievePhoneNumbersJob"
            );
        }

        // create path and map variables
        String localVarPath =
            "/phone_numbers/jobs/{id}".replaceAll(
                    "\\{" + "id" + "\\}",
                    apiClient.escapeString(id.toString())
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

        GenericType<PhoneNumbersJob> localVarReturnType = new GenericType<
            PhoneNumbersJob
        >() {};

        return apiClient.invokeAPI(
            "BulkPhoneNumberOperationsApi.retrievePhoneNumbersJob",
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

    public class APIretrievePhoneNumbersJobRequest {

        private String id;

        private APIretrievePhoneNumbersJobRequest(String id) {
            this.id = id;
        }

        /**
     * Execute retrievePhoneNumbersJob request
     * @return PhoneNumbersJob
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Phone numbers job details. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */

        public PhoneNumbersJob execute() throws ApiException {
            return this.executeWithHttpInfo().getData();
        }

        /**
     * Execute retrievePhoneNumbersJob request with HTTP info returned
     * @return ApiResponse&lt;PhoneNumbersJob&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Phone numbers job details. </td><td>  -  </td></tr>
         <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
        public ApiResponse<PhoneNumbersJob> executeWithHttpInfo()
            throws ApiException {
            return retrievePhoneNumbersJobWithHttpInfo(id);
        }
    }

    /**
   * Retrieve a phone numbers job
   * 
   * @param id Identifies the Phone Numbers Job. (required)
   * @return retrievePhoneNumbersJobRequest
   * @throws ApiException if fails to make API call
   
   
   */
    public APIretrievePhoneNumbersJobRequest retrievePhoneNumbersJob(String id)
        throws ApiException {
        return new APIretrievePhoneNumbersJobRequest(id);
    }
}
