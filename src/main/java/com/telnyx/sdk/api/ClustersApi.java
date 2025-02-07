package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.ClusteringRequestInfoData;
import com.telnyx.sdk.model.ClusteringStatusResponseData;
import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.PublicTextClusteringRequest;
import com.telnyx.sdk.model.TextClusteringResponseData;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ClustersApi {

    private ApiClient apiClient;

    public ClustersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClustersApi(ApiClient apiClient) {
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
   * Compute new clusters
   * Starts a background task to compute how the data in an [embedded storage bucket](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding) is clustered. This helps identify common themes and patterns in the data.
   * @param publicTextClusteringRequest  (required)
   * @return TextClusteringResponseData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public TextClusteringResponseData computeNewClusterPublicTextClustersPost(
        PublicTextClusteringRequest publicTextClusteringRequest
    ) throws ApiException {
        return computeNewClusterPublicTextClustersPostWithHttpInfo(
            publicTextClusteringRequest
        ).getData();
    }

    /**
   * Compute new clusters
   * Starts a background task to compute how the data in an [embedded storage bucket](https://developers.telnyx.com/api/inference/inference-embedding/post-embedding) is clustered. This helps identify common themes and patterns in the data.
   * @param publicTextClusteringRequest  (required)
   * @return ApiResponse&lt;TextClusteringResponseData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        TextClusteringResponseData
    > computeNewClusterPublicTextClustersPostWithHttpInfo(
        PublicTextClusteringRequest publicTextClusteringRequest
    ) throws ApiException {
        Object localVarPostBody = publicTextClusteringRequest;

        // verify the required parameter 'publicTextClusteringRequest' is set
        if (publicTextClusteringRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'publicTextClusteringRequest' when calling computeNewClusterPublicTextClustersPost"
            );
        }

        // create path and map variables
        String localVarPath = "/ai/clusters";

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

        GenericType<TextClusteringResponseData> localVarReturnType =
            new GenericType<TextClusteringResponseData>() {};

        return apiClient.invokeAPI(
            "ClustersApi.computeNewClusterPublicTextClustersPost",
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
   * Delete a cluster
   * 
   * @param taskId  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public void deleteClusterByTaskIdPublicTextClustersTaskIdDelete(
        String taskId
    ) throws ApiException {
        deleteClusterByTaskIdPublicTextClustersTaskIdDeleteWithHttpInfo(taskId);
    }

    /**
   * Delete a cluster
   * 
   * @param taskId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        Void
    > deleteClusterByTaskIdPublicTextClustersTaskIdDeleteWithHttpInfo(
        String taskId
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'taskId' when calling deleteClusterByTaskIdPublicTextClustersTaskIdDelete"
            );
        }

        // create path and map variables
        String localVarPath =
            "/ai/clusters/{task_id}".replaceAll(
                    "\\{" + "task_id" + "\\}",
                    apiClient.escapeString(taskId.toString())
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

        return apiClient.invokeAPI(
            "ClustersApi.deleteClusterByTaskIdPublicTextClustersTaskIdDelete",
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
            null,
            false
        );
    }

    /**
   * Fetch a cluster
   * 
   * @param taskId  (required)
   * @param topNNodes The number of nodes in the cluster to return in the response. Nodes will be sorted by their centrality within the cluster. (optional, default to 0)
   * @param showSubclusters Whether or not to include subclusters and their nodes in the response. (optional, default to false)
   * @return ClusteringStatusResponseData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ClusteringStatusResponseData fetchClusterByTaskIdPublicTextClustersTaskIdGet(
        String taskId,
        Integer topNNodes,
        Boolean showSubclusters
    ) throws ApiException {
        return fetchClusterByTaskIdPublicTextClustersTaskIdGetWithHttpInfo(
            taskId,
            topNNodes,
            showSubclusters
        ).getData();
    }

    /**
   * Fetch a cluster
   * 
   * @param taskId  (required)
   * @param topNNodes The number of nodes in the cluster to return in the response. Nodes will be sorted by their centrality within the cluster. (optional, default to 0)
   * @param showSubclusters Whether or not to include subclusters and their nodes in the response. (optional, default to false)
   * @return ApiResponse&lt;ClusteringStatusResponseData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        ClusteringStatusResponseData
    > fetchClusterByTaskIdPublicTextClustersTaskIdGetWithHttpInfo(
        String taskId,
        Integer topNNodes,
        Boolean showSubclusters
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'taskId' when calling fetchClusterByTaskIdPublicTextClustersTaskIdGet"
            );
        }

        // create path and map variables
        String localVarPath =
            "/ai/clusters/{task_id}".replaceAll(
                    "\\{" + "task_id" + "\\}",
                    apiClient.escapeString(taskId.toString())
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

        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "top_n_nodes", topNNodes)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "show_subclusters", showSubclusters)
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

        GenericType<ClusteringStatusResponseData> localVarReturnType =
            new GenericType<ClusteringStatusResponseData>() {};

        return apiClient.invokeAPI(
            "ClustersApi.fetchClusterByTaskIdPublicTextClustersTaskIdGet",
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
   * Fetch a cluster visualization
   * 
   * @param taskId  (required)
   * @param clusterId  (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public Object fetchClusterImageByTaskIdPublicTextClustersTaskIdImageGet(
        String taskId,
        Integer clusterId
    ) throws ApiException {
        return fetchClusterImageByTaskIdPublicTextClustersTaskIdImageGetWithHttpInfo(
            taskId,
            clusterId
        ).getData();
    }

    /**
   * Fetch a cluster visualization
   * 
   * @param taskId  (required)
   * @param clusterId  (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        Object
    > fetchClusterImageByTaskIdPublicTextClustersTaskIdImageGetWithHttpInfo(
        String taskId,
        Integer clusterId
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'taskId' when calling fetchClusterImageByTaskIdPublicTextClustersTaskIdImageGet"
            );
        }

        // create path and map variables
        String localVarPath =
            "/ai/clusters/{task_id}/graph".replaceAll(
                    "\\{" + "task_id" + "\\}",
                    apiClient.escapeString(taskId.toString())
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

        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "cluster_id", clusterId)
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

        GenericType<Object> localVarReturnType = new GenericType<Object>() {};

        return apiClient.invokeAPI(
            "ClustersApi.fetchClusterImageByTaskIdPublicTextClustersTaskIdImageGet",
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
   * List all clusters
   * 
   * @param pageNumber  (optional, default to 0)
   * @param pageSize  (optional, default to 20)
   * @return ClusteringRequestInfoData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ClusteringRequestInfoData listAllRequestedClustersPublicTextClustersGet(
        Integer pageNumber,
        Integer pageSize
    ) throws ApiException {
        return listAllRequestedClustersPublicTextClustersGetWithHttpInfo(
            pageNumber,
            pageSize
        ).getData();
    }

    /**
   * List all clusters
   * 
   * @param pageNumber  (optional, default to 0)
   * @param pageSize  (optional, default to 20)
   * @return ApiResponse&lt;ClusteringRequestInfoData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        ClusteringRequestInfoData
    > listAllRequestedClustersPublicTextClustersGetWithHttpInfo(
        Integer pageNumber,
        Integer pageSize
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/ai/clusters";

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

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<ClusteringRequestInfoData> localVarReturnType =
            new GenericType<ClusteringRequestInfoData>() {};

        return apiClient.invokeAPI(
            "ClustersApi.listAllRequestedClustersPublicTextClustersGet",
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
}
