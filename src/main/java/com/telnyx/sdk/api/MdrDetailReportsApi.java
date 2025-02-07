package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.MdrGetDetailResponse;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class MdrDetailReportsApi {

    private ApiClient apiClient;

    public MdrDetailReportsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MdrDetailReportsApi(ApiClient apiClient) {
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
   * Fetch all Mdr records
   * Fetch all Mdr records 
   * @param startDate Pagination start date (optional)
   * @param endDate Pagination end date (optional)
   * @param id  (optional)
   * @param direction  (optional)
   * @param profile  (optional)
   * @param cld  (optional)
   * @param cli  (optional)
   * @param status  (optional)
   * @param messageType  (optional)
   * @return MdrGetDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
    public MdrGetDetailResponse getPaginatedMdrs(
        String startDate,
        String endDate,
        String id,
        String direction,
        String profile,
        String cld,
        String cli,
        String status,
        String messageType
    ) throws ApiException {
        return getPaginatedMdrsWithHttpInfo(
            startDate,
            endDate,
            id,
            direction,
            profile,
            cld,
            cli,
            status,
            messageType
        ).getData();
    }

    /**
   * Fetch all Mdr records
   * Fetch all Mdr records 
   * @param startDate Pagination start date (optional)
   * @param endDate Pagination end date (optional)
   * @param id  (optional)
   * @param direction  (optional)
   * @param profile  (optional)
   * @param cld  (optional)
   * @param cli  (optional)
   * @param status  (optional)
   * @param messageType  (optional)
   * @return ApiResponse&lt;MdrGetDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<MdrGetDetailResponse> getPaginatedMdrsWithHttpInfo(
        String startDate,
        String endDate,
        String id,
        String direction,
        String profile,
        String cld,
        String cli,
        String status,
        String messageType
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/reports/mdrs";

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
            apiClient.parameterToPairs("", "start_date", startDate)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "end_date", endDate)
        );
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "direction", direction)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "profile", profile)
        );
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cld", cld));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cli", cli));
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "status", status)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "message_type", messageType)
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

        GenericType<MdrGetDetailResponse> localVarReturnType = new GenericType<
            MdrGetDetailResponse
        >() {};

        return apiClient.invokeAPI(
            "MdrDetailReportsApi.getPaginatedMdrs",
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
