package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.CreateVirtualCrossConnect200Response;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListVirtualCrossConnectCoverage200Response;
import com.telnyx.sdk.model.ListVirtualCrossConnects200Response;
import com.telnyx.sdk.model.VirtualCrossConnectCreate;
import com.telnyx.sdk.model.VirtualCrossConnectPatch;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class VirtualCrossConnectsApi {

    private ApiClient apiClient;

    public VirtualCrossConnectsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualCrossConnectsApi(ApiClient apiClient) {
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
   * Create a Virtual Cross Connect
   * Create a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;For AWS and GCE, you have the option of creating the primary connection first and the secondary connection later. You also have the option of disabling the primary and/or secondary connections at any time and later re-enabling them. With Azure, you do not have this option. Azure requires both the primary and secondary connections to be created at the same time and they can not be independantly disabled.
   * @param virtualCrossConnectCreate  (required)
   * @return CreateVirtualCrossConnect200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CreateVirtualCrossConnect200Response createVirtualCrossConnect(
        VirtualCrossConnectCreate virtualCrossConnectCreate
    ) throws ApiException {
        return createVirtualCrossConnectWithHttpInfo(
            virtualCrossConnectCreate
        ).getData();
    }

    /**
   * Create a Virtual Cross Connect
   * Create a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;For AWS and GCE, you have the option of creating the primary connection first and the secondary connection later. You also have the option of disabling the primary and/or secondary connections at any time and later re-enabling them. With Azure, you do not have this option. Azure requires both the primary and secondary connections to be created at the same time and they can not be independantly disabled.
   * @param virtualCrossConnectCreate  (required)
   * @return ApiResponse&lt;CreateVirtualCrossConnect200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CreateVirtualCrossConnect200Response
    > createVirtualCrossConnectWithHttpInfo(
        VirtualCrossConnectCreate virtualCrossConnectCreate
    ) throws ApiException {
        Object localVarPostBody = virtualCrossConnectCreate;

        // verify the required parameter 'virtualCrossConnectCreate' is set
        if (virtualCrossConnectCreate == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'virtualCrossConnectCreate' when calling createVirtualCrossConnect"
            );
        }

        // create path and map variables
        String localVarPath = "/virtual_cross_connects";

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

        GenericType<CreateVirtualCrossConnect200Response> localVarReturnType =
            new GenericType<CreateVirtualCrossConnect200Response>() {};

        return apiClient.invokeAPI(
            "VirtualCrossConnectsApi.createVirtualCrossConnect",
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
   * Delete a Virtual Cross Connect
   * Delete a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return CreateVirtualCrossConnect200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CreateVirtualCrossConnect200Response deleteVirtualCrossConnect(
        UUID id
    ) throws ApiException {
        return deleteVirtualCrossConnectWithHttpInfo(id).getData();
    }

    /**
   * Delete a Virtual Cross Connect
   * Delete a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateVirtualCrossConnect200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CreateVirtualCrossConnect200Response
    > deleteVirtualCrossConnectWithHttpInfo(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling deleteVirtualCrossConnect"
            );
        }

        // create path and map variables
        String localVarPath =
            "/virtual_cross_connects/{id}".replaceAll(
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

        GenericType<CreateVirtualCrossConnect200Response> localVarReturnType =
            new GenericType<CreateVirtualCrossConnect200Response>() {};

        return apiClient.invokeAPI(
            "VirtualCrossConnectsApi.deleteVirtualCrossConnect",
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
   * Retrieve a Virtual Cross Connect
   * Retrieve a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return CreateVirtualCrossConnect200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CreateVirtualCrossConnect200Response getVirtualCrossConnect(UUID id)
        throws ApiException {
        return getVirtualCrossConnectWithHttpInfo(id).getData();
    }

    /**
   * Retrieve a Virtual Cross Connect
   * Retrieve a Virtual Cross Connect.
   * @param id Identifies the resource. (required)
   * @return ApiResponse&lt;CreateVirtualCrossConnect200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CreateVirtualCrossConnect200Response
    > getVirtualCrossConnectWithHttpInfo(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling getVirtualCrossConnect"
            );
        }

        // create path and map variables
        String localVarPath =
            "/virtual_cross_connects/{id}".replaceAll(
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

        GenericType<CreateVirtualCrossConnect200Response> localVarReturnType =
            new GenericType<CreateVirtualCrossConnect200Response>() {};

        return apiClient.invokeAPI(
            "VirtualCrossConnectsApi.getVirtualCrossConnect",
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
   * List Virtual Cross Connect Cloud Coverage
   * List Virtual Cross Connects Cloud Coverage.&lt;br /&gt;&lt;br /&gt;This endpoint shows which cloud regions are available for the &#x60;location_code&#x60; your Virtual Cross Connect will be provisioned in.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filtersAvailableBandwidthContains The available bandwidth to filter on. (optional)
   * @param filterCloudProvider The Telnyx region code (optional)
   * @param filterCloudProviderRegion The cloud provider region code to filter on (optional)
   * @param filterLocationRegion The region of associated location to filter on. (optional)
   * @param filterLocationSite The site of associated location to filter on. (optional)
   * @param filterLocationPop The POP of associated location to filter on. (optional)
   * @param filterLocationCode The code of associated location to filter on. (optional)
   * @return ListVirtualCrossConnectCoverage200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ListVirtualCrossConnectCoverage200Response listVirtualCrossConnectCoverage(
        Integer pageNumber,
        Integer pageSize,
        Integer filtersAvailableBandwidthContains,
        String filterCloudProvider,
        String filterCloudProviderRegion,
        String filterLocationRegion,
        String filterLocationSite,
        String filterLocationPop,
        String filterLocationCode
    ) throws ApiException {
        return listVirtualCrossConnectCoverageWithHttpInfo(
            pageNumber,
            pageSize,
            filtersAvailableBandwidthContains,
            filterCloudProvider,
            filterCloudProviderRegion,
            filterLocationRegion,
            filterLocationSite,
            filterLocationPop,
            filterLocationCode
        ).getData();
    }

    /**
   * List Virtual Cross Connect Cloud Coverage
   * List Virtual Cross Connects Cloud Coverage.&lt;br /&gt;&lt;br /&gt;This endpoint shows which cloud regions are available for the &#x60;location_code&#x60; your Virtual Cross Connect will be provisioned in.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filtersAvailableBandwidthContains The available bandwidth to filter on. (optional)
   * @param filterCloudProvider The Telnyx region code (optional)
   * @param filterCloudProviderRegion The cloud provider region code to filter on (optional)
   * @param filterLocationRegion The region of associated location to filter on. (optional)
   * @param filterLocationSite The site of associated location to filter on. (optional)
   * @param filterLocationPop The POP of associated location to filter on. (optional)
   * @param filterLocationCode The code of associated location to filter on. (optional)
   * @return ApiResponse&lt;ListVirtualCrossConnectCoverage200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        ListVirtualCrossConnectCoverage200Response
    > listVirtualCrossConnectCoverageWithHttpInfo(
        Integer pageNumber,
        Integer pageSize,
        Integer filtersAvailableBandwidthContains,
        String filterCloudProvider,
        String filterCloudProviderRegion,
        String filterLocationRegion,
        String filterLocationSite,
        String filterLocationPop,
        String filterLocationCode
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/virtual_cross_connects_coverage";

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
            apiClient.parameterToPairs("", "page[number]", pageNumber)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[size]", pageSize)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filters[available_bandwidth][contains]",
                filtersAvailableBandwidthContains
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[cloud_provider]",
                filterCloudProvider
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[cloud_provider_region]",
                filterCloudProviderRegion
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[location.region]",
                filterLocationRegion
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[location.site]",
                filterLocationSite
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[location.pop]",
                filterLocationPop
            )
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[location.code]",
                filterLocationCode
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

        GenericType<
            ListVirtualCrossConnectCoverage200Response
        > localVarReturnType = new GenericType<
            ListVirtualCrossConnectCoverage200Response
        >() {};

        return apiClient.invokeAPI(
            "VirtualCrossConnectsApi.listVirtualCrossConnectCoverage",
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
   * List all Virtual Cross Connects
   * List all Virtual Cross Connects.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return ListVirtualCrossConnects200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ListVirtualCrossConnects200Response listVirtualCrossConnects(
        Integer pageNumber,
        Integer pageSize,
        String filterNetworkId
    ) throws ApiException {
        return listVirtualCrossConnectsWithHttpInfo(
            pageNumber,
            pageSize,
            filterNetworkId
        ).getData();
    }

    /**
   * List all Virtual Cross Connects
   * List all Virtual Cross Connects.
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @param filterNetworkId The associated network id to filter on. (optional)
   * @return ApiResponse&lt;ListVirtualCrossConnects200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        ListVirtualCrossConnects200Response
    > listVirtualCrossConnectsWithHttpInfo(
        Integer pageNumber,
        Integer pageSize,
        String filterNetworkId
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/virtual_cross_connects";

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
            apiClient.parameterToPairs("", "page[number]", pageNumber)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[size]", pageSize)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs(
                "",
                "filter[network_id]",
                filterNetworkId
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

        GenericType<ListVirtualCrossConnects200Response> localVarReturnType =
            new GenericType<ListVirtualCrossConnects200Response>() {};

        return apiClient.invokeAPI(
            "VirtualCrossConnectsApi.listVirtualCrossConnects",
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
   * Update the Virtual Cross Connect
   * Update the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;Cloud IPs can only be patched during the &#x60;created&#x60; state, as GCE will only inform you of your generated IP once the pending connection requested has been accepted. Once the Virtual Cross Connect has moved to &#x60;provisioning&#x60;, the IPs can no longer be patched.&lt;br /&gt;&lt;br /&gt;Once the Virtual Cross Connect has moved to &#x60;provisioned&#x60; and you are ready to enable routing, you can toggle the routing announcements to &#x60;true&#x60;.
   * @param id Identifies the resource. (required)
   * @param virtualCrossConnectPatch  (required)
   * @return CreateVirtualCrossConnect200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public CreateVirtualCrossConnect200Response updateVirtualCrossConnect(
        UUID id,
        VirtualCrossConnectPatch virtualCrossConnectPatch
    ) throws ApiException {
        return updateVirtualCrossConnectWithHttpInfo(
            id,
            virtualCrossConnectPatch
        ).getData();
    }

    /**
   * Update the Virtual Cross Connect
   * Update the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;Cloud IPs can only be patched during the &#x60;created&#x60; state, as GCE will only inform you of your generated IP once the pending connection requested has been accepted. Once the Virtual Cross Connect has moved to &#x60;provisioning&#x60;, the IPs can no longer be patched.&lt;br /&gt;&lt;br /&gt;Once the Virtual Cross Connect has moved to &#x60;provisioned&#x60; and you are ready to enable routing, you can toggle the routing announcements to &#x60;true&#x60;.
   * @param id Identifies the resource. (required)
   * @param virtualCrossConnectPatch  (required)
   * @return ApiResponse&lt;CreateVirtualCrossConnect200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity. Check the &#39;detail&#39; field in response for details. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        CreateVirtualCrossConnect200Response
    > updateVirtualCrossConnectWithHttpInfo(
        UUID id,
        VirtualCrossConnectPatch virtualCrossConnectPatch
    ) throws ApiException {
        Object localVarPostBody = virtualCrossConnectPatch;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'id' when calling updateVirtualCrossConnect"
            );
        }

        // verify the required parameter 'virtualCrossConnectPatch' is set
        if (virtualCrossConnectPatch == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'virtualCrossConnectPatch' when calling updateVirtualCrossConnect"
            );
        }

        // create path and map variables
        String localVarPath =
            "/virtual_cross_connects/{id}".replaceAll(
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

        GenericType<CreateVirtualCrossConnect200Response> localVarReturnType =
            new GenericType<CreateVirtualCrossConnect200Response>() {};

        return apiClient.invokeAPI(
            "VirtualCrossConnectsApi.updateVirtualCrossConnect",
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
