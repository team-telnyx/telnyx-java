package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.CreateFineTuningJobRequest;
import com.telnyx.sdk.model.FineTuningJob;
import com.telnyx.sdk.model.FineTuningJobsListData;
import com.telnyx.sdk.model.HTTPValidationError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class FineTuningApi {

    private ApiClient apiClient;

    public FineTuningApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FineTuningApi(ApiClient apiClient) {
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
   * Cancel a fine tuning job
   * Cancel a fine tuning job.
   * @param jobId  (required)
   * @return FineTuningJob
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public FineTuningJob cancelNewFinetuningjobPublicFinetuningPost(
        String jobId
    ) throws ApiException {
        return cancelNewFinetuningjobPublicFinetuningPostWithHttpInfo(
            jobId
        ).getData();
    }

    /**
   * Cancel a fine tuning job
   * Cancel a fine tuning job.
   * @param jobId  (required)
   * @return ApiResponse&lt;FineTuningJob&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        FineTuningJob
    > cancelNewFinetuningjobPublicFinetuningPostWithHttpInfo(String jobId)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'jobId' when calling cancelNewFinetuningjobPublicFinetuningPost"
            );
        }

        // create path and map variables
        String localVarPath =
            "/ai/fine_tuning/jobs/{job_id}/cancel".replaceAll(
                    "\\{" + "job_id" + "\\}",
                    apiClient.escapeString(jobId.toString())
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

        GenericType<FineTuningJob> localVarReturnType = new GenericType<
            FineTuningJob
        >() {};

        return apiClient.invokeAPI(
            "FineTuningApi.cancelNewFinetuningjobPublicFinetuningPost",
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
   * Create a fine tuning job
   * Create a new fine tuning job.
   * @param createFineTuningJobRequest  (required)
   * @return FineTuningJob
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public FineTuningJob createNewFinetuningjobPublicFinetuningPost(
        CreateFineTuningJobRequest createFineTuningJobRequest
    ) throws ApiException {
        return createNewFinetuningjobPublicFinetuningPostWithHttpInfo(
            createFineTuningJobRequest
        ).getData();
    }

    /**
   * Create a fine tuning job
   * Create a new fine tuning job.
   * @param createFineTuningJobRequest  (required)
   * @return ApiResponse&lt;FineTuningJob&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        FineTuningJob
    > createNewFinetuningjobPublicFinetuningPostWithHttpInfo(
        CreateFineTuningJobRequest createFineTuningJobRequest
    ) throws ApiException {
        Object localVarPostBody = createFineTuningJobRequest;

        // verify the required parameter 'createFineTuningJobRequest' is set
        if (createFineTuningJobRequest == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'createFineTuningJobRequest' when calling createNewFinetuningjobPublicFinetuningPost"
            );
        }

        // create path and map variables
        String localVarPath = "/ai/fine_tuning/jobs";

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

        GenericType<FineTuningJob> localVarReturnType = new GenericType<
            FineTuningJob
        >() {};

        return apiClient.invokeAPI(
            "FineTuningApi.createNewFinetuningjobPublicFinetuningPost",
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
   * List fine tuning jobs
   * Retrieve a list of all fine tuning jobs created by the user.
   * @return FineTuningJobsListData
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public FineTuningJobsListData getFinetuningjobPublicFinetuningGet()
        throws ApiException {
        return getFinetuningjobPublicFinetuningGetWithHttpInfo().getData();
    }

    /**
   * List fine tuning jobs
   * Retrieve a list of all fine tuning jobs created by the user.
   * @return ApiResponse&lt;FineTuningJobsListData&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        FineTuningJobsListData
    > getFinetuningjobPublicFinetuningGetWithHttpInfo() throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/ai/fine_tuning/jobs";

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

        GenericType<FineTuningJobsListData> localVarReturnType =
            new GenericType<FineTuningJobsListData>() {};

        return apiClient.invokeAPI(
            "FineTuningApi.getFinetuningjobPublicFinetuningGet",
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
   * Get a fine tuning job
   * Retrieve a fine tuning job by &#x60;job_id&#x60;.
   * @param jobId  (required)
   * @return FineTuningJob
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public FineTuningJob getFinetuningjobPublicFinetuningJobIdGet(String jobId)
        throws ApiException {
        return getFinetuningjobPublicFinetuningJobIdGetWithHttpInfo(
            jobId
        ).getData();
    }

    /**
   * Get a fine tuning job
   * Retrieve a fine tuning job by &#x60;job_id&#x60;.
   * @param jobId  (required)
   * @return ApiResponse&lt;FineTuningJob&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        FineTuningJob
    > getFinetuningjobPublicFinetuningJobIdGetWithHttpInfo(String jobId)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'jobId' when calling getFinetuningjobPublicFinetuningJobIdGet"
            );
        }

        // create path and map variables
        String localVarPath =
            "/ai/fine_tuning/jobs/{job_id}".replaceAll(
                    "\\{" + "job_id" + "\\}",
                    apiClient.escapeString(jobId.toString())
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

        GenericType<FineTuningJob> localVarReturnType = new GenericType<
            FineTuningJob
        >() {};

        return apiClient.invokeAPI(
            "FineTuningApi.getFinetuningjobPublicFinetuningJobIdGet",
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
