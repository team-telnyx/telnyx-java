package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.CreateRequirementGroupRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.RequirementGroup;
import com.telnyx.sdk.model.SubNumberOrderRequirementGroupResponse;
import com.telnyx.sdk.model.UpdateNumberOrderPhoneNumberRequirementGroup200Response;
import com.telnyx.sdk.model.UpdateNumberOrderPhoneNumberRequirementGroupRequest;
import com.telnyx.sdk.model.UpdateRequirementGroupRequest;
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
public class RequirementGroupsApi {

    private ApiClient apiClient;

    public RequirementGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RequirementGroupsApi(ApiClient apiClient) {
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
   * Create a new requirement group
   * 
   * @param createRequirementGroupRequest  (required)
   * @return RequirementGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Requirement group created </td><td>  -  </td></tr>
     </table>
   */
    public RequirementGroup createRequirementGroup(
        CreateRequirementGroupRequest createRequirementGroupRequest
    ) throws ApiException {
        return createRequirementGroupWithHttpInfo(
            createRequirementGroupRequest
        ).getData();
    }

    /**
   * Create a new requirement group
   * 
   * @param createRequirementGroupRequest  (required)
   * @return ApiResponse&lt;RequirementGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Requirement group created </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<RequirementGroup> createRequirementGroupWithHttpInfo(
        CreateRequirementGroupRequest createRequirementGroupRequest
    ) throws ApiException {
        Object localVarPostBody = createRequirementGroupRequest;

        // verify the required parameter 'createRequirementGroupRequest' is set
        if (createRequirementGroupRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'createRequirementGroupRequest' when calling createRequirementGroup"
            );
        }

        // create path and map variables
        String localVarPath = "/requirement_groups";

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

        GenericType<RequirementGroup> localVarReturnType = new GenericType<
            RequirementGroup
        >() {};

        return apiClient.invokeAPI(
            "RequirementGroupsApi.createRequirementGroup",
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
   * Delete a requirement group by ID
   * 
   * @param id ID of the requirement group (required)
   * @return RequirementGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Deleted requirement group </td><td>  -  </td></tr>
     </table>
   */
    public RequirementGroup deleteRequirementGroup(String id)
        throws ApiException {
        return deleteRequirementGroupWithHttpInfo(id).getData();
    }

    /**
   * Delete a requirement group by ID
   * 
   * @param id ID of the requirement group (required)
   * @return ApiResponse&lt;RequirementGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Deleted requirement group </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<RequirementGroup> deleteRequirementGroupWithHttpInfo(
        String id
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling deleteRequirementGroup"
            );
        }

        // create path and map variables
        String localVarPath =
            "/requirement_groups/{id}".replaceAll(
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

        GenericType<RequirementGroup> localVarReturnType = new GenericType<
            RequirementGroup
        >() {};

        return apiClient.invokeAPI(
            "RequirementGroupsApi.deleteRequirementGroup",
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
   * Get a single requirement group by ID
   * 
   * @param id ID of the requirement group to retrieve (required)
   * @return RequirementGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A single requirement group </td><td>  -  </td></tr>
     </table>
   */
    public RequirementGroup getRequirementGroup(String id) throws ApiException {
        return getRequirementGroupWithHttpInfo(id).getData();
    }

    /**
   * Get a single requirement group by ID
   * 
   * @param id ID of the requirement group to retrieve (required)
   * @return ApiResponse&lt;RequirementGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A single requirement group </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<RequirementGroup> getRequirementGroupWithHttpInfo(
        String id
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling getRequirementGroup"
            );
        }

        // create path and map variables
        String localVarPath =
            "/requirement_groups/{id}".replaceAll(
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

        GenericType<RequirementGroup> localVarReturnType = new GenericType<
            RequirementGroup
        >() {};

        return apiClient.invokeAPI(
            "RequirementGroupsApi.getRequirementGroup",
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
   * List requirement groups
   * 
   * @param filterCountryCode Filter requirement groups by country code (iso alpha 2) (optional)
   * @param filterPhoneNumberType Filter requirement groups by phone number type. (optional)
   * @param filterAction Filter requirement groups by action type (optional)
   * @param filterStatus Filter requirement groups by status (optional)
   * @param filterCustomerReference Filter requirement groups by customer reference (optional)
   * @return List&lt;RequirementGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List requirement groups </td><td>  -  </td></tr>
     </table>
   */
    public List<RequirementGroup> getRequirementGroups(
        String filterCountryCode,
        String filterPhoneNumberType,
        String filterAction,
        String filterStatus,
        String filterCustomerReference
    ) throws ApiException {
        return getRequirementGroupsWithHttpInfo(
            filterCountryCode,
            filterPhoneNumberType,
            filterAction,
            filterStatus,
            filterCustomerReference
        ).getData();
    }

    /**
   * List requirement groups
   * 
   * @param filterCountryCode Filter requirement groups by country code (iso alpha 2) (optional)
   * @param filterPhoneNumberType Filter requirement groups by phone number type. (optional)
   * @param filterAction Filter requirement groups by action type (optional)
   * @param filterStatus Filter requirement groups by status (optional)
   * @param filterCustomerReference Filter requirement groups by customer reference (optional)
   * @return ApiResponse&lt;List&lt;RequirementGroup&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List requirement groups </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<List<RequirementGroup>> getRequirementGroupsWithHttpInfo(
        String filterCountryCode,
        String filterPhoneNumberType,
        String filterAction,
        String filterStatus,
        String filterCustomerReference
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/requirement_groups";

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
                "filter[country_code]",
                filterCountryCode
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[phone_number_type]",
                filterPhoneNumberType
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "filter[action]", filterAction)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "filter[status]", filterStatus)
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

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<List<RequirementGroup>> localVarReturnType =
            new GenericType<List<RequirementGroup>>() {};

        return apiClient.invokeAPI(
            "RequirementGroupsApi.getRequirementGroups",
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
   * Submit a Requirement Group for Approval
   * 
   * @param id ID of the requirement group to submit (required)
   * @return RequirementGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A single requirement group </td><td>  -  </td></tr>
     </table>
   */
    public RequirementGroup submitRequirementGroup(String id)
        throws ApiException {
        return submitRequirementGroupWithHttpInfo(id).getData();
    }

    /**
   * Submit a Requirement Group for Approval
   * 
   * @param id ID of the requirement group to submit (required)
   * @return ApiResponse&lt;RequirementGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A single requirement group </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<RequirementGroup> submitRequirementGroupWithHttpInfo(
        String id
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling submitRequirementGroup"
            );
        }

        // create path and map variables
        String localVarPath =
            "/requirement_groups/{id}/submit_for_approval".replaceAll(
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

        GenericType<RequirementGroup> localVarReturnType = new GenericType<
            RequirementGroup
        >() {};

        return apiClient.invokeAPI(
            "RequirementGroupsApi.submitRequirementGroup",
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
   * Update requirement group for a phone number order
   * 
   * @param id The unique identifier of the number order phone number (required)
   * @param updateNumberOrderPhoneNumberRequirementGroupRequest  (required)
   * @return UpdateNumberOrderPhoneNumberRequirementGroup200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with updated phone number order details </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public UpdateNumberOrderPhoneNumberRequirementGroup200Response updateNumberOrderPhoneNumberRequirementGroup(
        UUID id,
        UpdateNumberOrderPhoneNumberRequirementGroupRequest updateNumberOrderPhoneNumberRequirementGroupRequest
    ) throws ApiException {
        return updateNumberOrderPhoneNumberRequirementGroupWithHttpInfo(
            id,
            updateNumberOrderPhoneNumberRequirementGroupRequest
        ).getData();
    }

    /**
   * Update requirement group for a phone number order
   * 
   * @param id The unique identifier of the number order phone number (required)
   * @param updateNumberOrderPhoneNumberRequirementGroupRequest  (required)
   * @return ApiResponse&lt;UpdateNumberOrderPhoneNumberRequirementGroup200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with updated phone number order details </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        UpdateNumberOrderPhoneNumberRequirementGroup200Response
    > updateNumberOrderPhoneNumberRequirementGroupWithHttpInfo(
        UUID id,
        UpdateNumberOrderPhoneNumberRequirementGroupRequest updateNumberOrderPhoneNumberRequirementGroupRequest
    ) throws ApiException {
        Object localVarPostBody =
            updateNumberOrderPhoneNumberRequirementGroupRequest;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling updateNumberOrderPhoneNumberRequirementGroup"
            );
        }

        // verify the required parameter 'updateNumberOrderPhoneNumberRequirementGroupRequest' is set
        if (updateNumberOrderPhoneNumberRequirementGroupRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'updateNumberOrderPhoneNumberRequirementGroupRequest' when calling updateNumberOrderPhoneNumberRequirementGroup"
            );
        }

        // create path and map variables
        String localVarPath =
            "/number_order_phone_numbers/{id}/requirement_group".replaceAll(
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

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<
            UpdateNumberOrderPhoneNumberRequirementGroup200Response
        > localVarReturnType = new GenericType<
            UpdateNumberOrderPhoneNumberRequirementGroup200Response
        >() {};

        return apiClient.invokeAPI(
            "RequirementGroupsApi.updateNumberOrderPhoneNumberRequirementGroup",
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
   * Update requirement values in requirement group
   * 
   * @param id ID of the requirement group (required)
   * @param updateRequirementGroupRequest  (required)
   * @return RequirementGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Updated requirement group </td><td>  -  </td></tr>
     </table>
   */
    public RequirementGroup updateRequirementGroup(
        String id,
        UpdateRequirementGroupRequest updateRequirementGroupRequest
    ) throws ApiException {
        return updateRequirementGroupWithHttpInfo(
            id,
            updateRequirementGroupRequest
        ).getData();
    }

    /**
   * Update requirement values in requirement group
   * 
   * @param id ID of the requirement group (required)
   * @param updateRequirementGroupRequest  (required)
   * @return ApiResponse&lt;RequirementGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Updated requirement group </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<RequirementGroup> updateRequirementGroupWithHttpInfo(
        String id,
        UpdateRequirementGroupRequest updateRequirementGroupRequest
    ) throws ApiException {
        Object localVarPostBody = updateRequirementGroupRequest;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling updateRequirementGroup"
            );
        }

        // verify the required parameter 'updateRequirementGroupRequest' is set
        if (updateRequirementGroupRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'updateRequirementGroupRequest' when calling updateRequirementGroup"
            );
        }

        // create path and map variables
        String localVarPath =
            "/requirement_groups/{id}".replaceAll(
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

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<RequirementGroup> localVarReturnType = new GenericType<
            RequirementGroup
        >() {};

        return apiClient.invokeAPI(
            "RequirementGroupsApi.updateRequirementGroup",
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

    /**
   * Update requirement group for a sub number order
   * 
   * @param id The ID of the sub number order (required)
   * @param updateNumberOrderPhoneNumberRequirementGroupRequest  (required)
   * @return SubNumberOrderRequirementGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Sub number order requirement group updated successfully </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public SubNumberOrderRequirementGroupResponse updateSubNumberOrderRequirementGroup(
        UUID id,
        UpdateNumberOrderPhoneNumberRequirementGroupRequest updateNumberOrderPhoneNumberRequirementGroupRequest
    ) throws ApiException {
        return updateSubNumberOrderRequirementGroupWithHttpInfo(
            id,
            updateNumberOrderPhoneNumberRequirementGroupRequest
        ).getData();
    }

    /**
   * Update requirement group for a sub number order
   * 
   * @param id The ID of the sub number order (required)
   * @param updateNumberOrderPhoneNumberRequirementGroupRequest  (required)
   * @return ApiResponse&lt;SubNumberOrderRequirementGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Sub number order requirement group updated successfully </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        SubNumberOrderRequirementGroupResponse
    > updateSubNumberOrderRequirementGroupWithHttpInfo(
        UUID id,
        UpdateNumberOrderPhoneNumberRequirementGroupRequest updateNumberOrderPhoneNumberRequirementGroupRequest
    ) throws ApiException {
        Object localVarPostBody =
            updateNumberOrderPhoneNumberRequirementGroupRequest;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling updateSubNumberOrderRequirementGroup"
            );
        }

        // verify the required parameter 'updateNumberOrderPhoneNumberRequirementGroupRequest' is set
        if (updateNumberOrderPhoneNumberRequirementGroupRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'updateNumberOrderPhoneNumberRequirementGroupRequest' when calling updateSubNumberOrderRequirementGroup"
            );
        }

        // create path and map variables
        String localVarPath =
            "/sub_number_orders/{id}/requirement_group".replaceAll(
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

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<SubNumberOrderRequirementGroupResponse> localVarReturnType =
            new GenericType<SubNumberOrderRequirementGroupResponse>() {};

        return apiClient.invokeAPI(
            "RequirementGroupsApi.updateSubNumberOrderRequirementGroup",
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
