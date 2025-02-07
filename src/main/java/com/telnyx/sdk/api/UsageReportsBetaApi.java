package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.ErrorResponse;
import com.telnyx.sdk.model.UsageReportsOptionsResponse;
import com.telnyx.sdk.model.UsageReportsResponse;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UsageReportsBetaApi {

    private ApiClient apiClient;

    public UsageReportsBetaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsageReportsBetaApi(ApiClient apiClient) {
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
   * Get Telnyx product usage data (BETA)
   * Get Telnyx usage data by product, broken out by the specified dimensions
   * @param product Telnyx product (required)
   * @param dimensions Breakout by specified product dimensions (required)
   * @param metrics Specified product usage values (required)
   * @param startDate The start date for the time range you are interested in. The maximum time range is 31 days. Format: YYYY-MM-DDTHH:mm:ssZ (optional)
   * @param endDate The end date for the time range you are interested in. The maximum time range is 31 days. Format: YYYY-MM-DDTHH:mm:ssZ (optional)
   * @param dateRange A more user-friendly way to specify the timespan you want to filter by. More options can be found in the Telnyx API Reference docs. (optional)
   * @param filter Filter records on dimensions (optional)
   * @param managedAccounts Return the aggregations for all Managed Accounts under the user making the request. (optional)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 20)
   * @param sort Specifies the sort order for results (optional)
   * @param format Specify the response format (csv or json). JSON is returned by default, even if not specified. (optional)
   * @param authorizationBearerLessThanTOKENGreaterThan  (optional)
   * @return UsageReportsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
    public UsageReportsResponse getUsageReport(
        String product,
        List<String> dimensions,
        List<String> metrics,
        String startDate,
        String endDate,
        String dateRange,
        String filter,
        Boolean managedAccounts,
        Integer pageNumber,
        Integer pageSize,
        List<String> sort,
        String format,
        String authorizationBearerLessThanTOKENGreaterThan
    ) throws ApiException {
        return getUsageReportWithHttpInfo(
            product,
            dimensions,
            metrics,
            startDate,
            endDate,
            dateRange,
            filter,
            managedAccounts,
            pageNumber,
            pageSize,
            sort,
            format,
            authorizationBearerLessThanTOKENGreaterThan
        ).getData();
    }

    /**
   * Get Telnyx product usage data (BETA)
   * Get Telnyx usage data by product, broken out by the specified dimensions
   * @param product Telnyx product (required)
   * @param dimensions Breakout by specified product dimensions (required)
   * @param metrics Specified product usage values (required)
   * @param startDate The start date for the time range you are interested in. The maximum time range is 31 days. Format: YYYY-MM-DDTHH:mm:ssZ (optional)
   * @param endDate The end date for the time range you are interested in. The maximum time range is 31 days. Format: YYYY-MM-DDTHH:mm:ssZ (optional)
   * @param dateRange A more user-friendly way to specify the timespan you want to filter by. More options can be found in the Telnyx API Reference docs. (optional)
   * @param filter Filter records on dimensions (optional)
   * @param managedAccounts Return the aggregations for all Managed Accounts under the user making the request. (optional)
   * @param pageNumber  (optional, default to 1)
   * @param pageSize  (optional, default to 20)
   * @param sort Specifies the sort order for results (optional)
   * @param format Specify the response format (csv or json). JSON is returned by default, even if not specified. (optional)
   * @param authorizationBearerLessThanTOKENGreaterThan  (optional)
   * @return ApiResponse&lt;UsageReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<UsageReportsResponse> getUsageReportWithHttpInfo(
        String product,
        List<String> dimensions,
        List<String> metrics,
        String startDate,
        String endDate,
        String dateRange,
        String filter,
        Boolean managedAccounts,
        Integer pageNumber,
        Integer pageSize,
        List<String> sort,
        String format,
        String authorizationBearerLessThanTOKENGreaterThan
    ) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'product' is set
        if (product == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'product' when calling getUsageReport"
            );
        }

        // verify the required parameter 'dimensions' is set
        if (dimensions == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'dimensions' when calling getUsageReport"
            );
        }

        // verify the required parameter 'metrics' is set
        if (metrics == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'metrics' when calling getUsageReport"
            );
        }

        // create path and map variables
        String localVarPath = "/usage_reports";

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
            apiClient.parameterToPairs("", "product", product)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("multi", "dimensions", dimensions)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("multi", "metrics", metrics)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "start_date", startDate)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "end_date", endDate)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "date_range", dateRange)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "filter", filter)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "managed_accounts", managedAccounts)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[number]", pageNumber)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "page[size]", pageSize)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("multi", "sort", sort)
        );
        localVarQueryParams.addAll(
            apiClient.parameterToPairs("", "format", format)
        );

        if (
            authorizationBearerLessThanTOKENGreaterThan != null
        ) localVarHeaderParams.put(
            "Authorization: Bearer &lt;TOKEN&gt;",
            apiClient.parameterToString(
                authorizationBearerLessThanTOKENGreaterThan
            )
        );

        final String[] localVarAccepts = { "application/json", "text/csv" };
        final String localVarAccept = apiClient.selectHeaderAccept(
            localVarAccepts
        );

        final String[] localVarContentTypes = {};
        final String localVarContentType = apiClient.selectHeaderContentType(
            localVarContentTypes
        );

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        GenericType<UsageReportsResponse> localVarReturnType = new GenericType<
            UsageReportsResponse
        >() {};

        return apiClient.invokeAPI(
            "UsageReportsBetaApi.getUsageReport",
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
   * Get Usage Reports query options (BETA)
   * Get the Usage Reports options for querying usage, including the products available and their respective metrics and dimensions
   * @param product Options (dimensions and metrics) for a given product. If none specified, all products will be returned. (optional)
   * @param authorizationBearerLessThanTOKENGreaterThan  (optional)
   * @return UsageReportsOptionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
    public UsageReportsOptionsResponse listUsageReportsOptions(
        String product,
        String authorizationBearerLessThanTOKENGreaterThan
    ) throws ApiException {
        return listUsageReportsOptionsWithHttpInfo(
            product,
            authorizationBearerLessThanTOKENGreaterThan
        ).getData();
    }

    /**
   * Get Usage Reports query options (BETA)
   * Get the Usage Reports options for querying usage, including the products available and their respective metrics and dimensions
   * @param product Options (dimensions and metrics) for a given product. If none specified, all products will be returned. (optional)
   * @param authorizationBearerLessThanTOKENGreaterThan  (optional)
   * @return ApiResponse&lt;UsageReportsOptionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        UsageReportsOptionsResponse
    > listUsageReportsOptionsWithHttpInfo(
        String product,
        String authorizationBearerLessThanTOKENGreaterThan
    ) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/usage_reports/options";

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
            apiClient.parameterToPairs("", "product", product)
        );

        if (
            authorizationBearerLessThanTOKENGreaterThan != null
        ) localVarHeaderParams.put(
            "Authorization: Bearer &lt;TOKEN&gt;",
            apiClient.parameterToString(
                authorizationBearerLessThanTOKENGreaterThan
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

        GenericType<UsageReportsOptionsResponse> localVarReturnType =
            new GenericType<UsageReportsOptionsResponse>() {};

        return apiClient.invokeAPI(
            "UsageReportsBetaApi.listUsageReportsOptions",
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
