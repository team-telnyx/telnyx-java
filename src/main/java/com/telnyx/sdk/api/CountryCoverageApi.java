package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.RetreiveCountryCoverage200Response;
import com.telnyx.sdk.model.RetreiveSpecificCountryCoverage200Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CountryCoverageApi {

    private ApiClient apiClient;

    public CountryCoverageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CountryCoverageApi(ApiClient apiClient) {
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
   * Get country coverage
   * Get country coverage
   * @return RetreiveCountryCoverage200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response for country coverage </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public RetreiveCountryCoverage200Response retreiveCountryCoverage()
        throws ApiException {
        return retreiveCountryCoverageWithHttpInfo().getData();
    }

    /**
   * Get country coverage
   * Get country coverage
   * @return ApiResponse&lt;RetreiveCountryCoverage200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response for country coverage </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        RetreiveCountryCoverage200Response
    > retreiveCountryCoverageWithHttpInfo() throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/country_coverage";

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

        GenericType<RetreiveCountryCoverage200Response> localVarReturnType =
            new GenericType<RetreiveCountryCoverage200Response>() {};

        return apiClient.invokeAPI(
            "CountryCoverageApi.retreiveCountryCoverage",
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
   * Get coverage for a specific country
   * Get coverage for a specific country
   * @param countryCode Country ISO code. (required)
   * @return RetreiveSpecificCountryCoverage200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response for specific country coverage </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public RetreiveSpecificCountryCoverage200Response retreiveSpecificCountryCoverage(
        String countryCode
    ) throws ApiException {
        return retreiveSpecificCountryCoverageWithHttpInfo(
            countryCode
        ).getData();
    }

    /**
   * Get coverage for a specific country
   * Get coverage for a specific country
   * @param countryCode Country ISO code. (required)
   * @return ApiResponse&lt;RetreiveSpecificCountryCoverage200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Response for specific country coverage </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
    public ApiResponse<
        RetreiveSpecificCountryCoverage200Response
    > retreiveSpecificCountryCoverageWithHttpInfo(String countryCode)
        throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException(
                400,
                "Missing the required parameter 'countryCode' when calling retreiveSpecificCountryCoverage"
            );
        }

        // create path and map variables
        String localVarPath =
            "/country_coverage/countries/{country_code}".replaceAll(
                    "\\{" + "country_code" + "\\}",
                    apiClient.escapeString(countryCode.toString())
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

        GenericType<
            RetreiveSpecificCountryCoverage200Response
        > localVarReturnType = new GenericType<
            RetreiveSpecificCountryCoverage200Response
        >() {};

        return apiClient.invokeAPI(
            "CountryCoverageApi.retreiveSpecificCountryCoverage",
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
