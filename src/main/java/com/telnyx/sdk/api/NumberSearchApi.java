package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListAvailablePhoneNumbersBlocksResponse;
import com.telnyx.sdk.model.ListAvailablePhoneNumbersResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NumberSearchApi {
  private ApiClient apiClient;

  public NumberSearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NumberSearchApi(ApiClient apiClient) {
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
   * List available phone number blocks
   * 
   * @param filterPhoneNumberStartsWith Filter number blocks that start with a pattern (meant to be used after &#x60;national_destination_code&#x60; filter has been set). (optional)
   * @param filterPhoneNumberEndsWith Filter numbers ending with a pattern. (optional)
   * @param filterPhoneNumberContains Filter numbers containing a pattern. (optional)
   * @param filterLocality Filter phone numbers by city. (optional)
   * @param filterAdministrativeArea Filter phone numbers by US state/CA province. (optional)
   * @param filterCountryCode Filter phone numbers by ISO alpha-2 country code. (optional)
   * @param filterNationalDestinationCode Filter by the national destination code of the number. This filter is only applicable to North American numbers. (optional)
   * @param filterRateCenter Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers. (optional)
   * @param filterNumberType Filter phone numbers by number type. (optional)
   * @param filterFeatures Filter if the phone number should be used for voice, fax, mms, sms, emergency. (optional)
   * @param filterMinimumBlockSize Filter number blocks by minimum blocks size (optional)
   * @param filterLimit Limits the number of results. (optional)
   * @return ListAvailablePhoneNumbersBlocksResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of available phone numbers blocks. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ListAvailablePhoneNumbersBlocksResponse listAvailablePhoneNumberBlocks(String filterPhoneNumberStartsWith, String filterPhoneNumberEndsWith, String filterPhoneNumberContains, String filterLocality, String filterAdministrativeArea, String filterCountryCode, String filterNationalDestinationCode, String filterRateCenter, String filterNumberType, List<String> filterFeatures, Integer filterMinimumBlockSize, Integer filterLimit) throws ApiException {
    return listAvailablePhoneNumberBlocksWithHttpInfo(filterPhoneNumberStartsWith, filterPhoneNumberEndsWith, filterPhoneNumberContains, filterLocality, filterAdministrativeArea, filterCountryCode, filterNationalDestinationCode, filterRateCenter, filterNumberType, filterFeatures, filterMinimumBlockSize, filterLimit).getData();
  }

  /**
   * List available phone number blocks
   * 
   * @param filterPhoneNumberStartsWith Filter number blocks that start with a pattern (meant to be used after &#x60;national_destination_code&#x60; filter has been set). (optional)
   * @param filterPhoneNumberEndsWith Filter numbers ending with a pattern. (optional)
   * @param filterPhoneNumberContains Filter numbers containing a pattern. (optional)
   * @param filterLocality Filter phone numbers by city. (optional)
   * @param filterAdministrativeArea Filter phone numbers by US state/CA province. (optional)
   * @param filterCountryCode Filter phone numbers by ISO alpha-2 country code. (optional)
   * @param filterNationalDestinationCode Filter by the national destination code of the number. This filter is only applicable to North American numbers. (optional)
   * @param filterRateCenter Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers. (optional)
   * @param filterNumberType Filter phone numbers by number type. (optional)
   * @param filterFeatures Filter if the phone number should be used for voice, fax, mms, sms, emergency. (optional)
   * @param filterMinimumBlockSize Filter number blocks by minimum blocks size (optional)
   * @param filterLimit Limits the number of results. (optional)
   * @return ApiResponse&lt;ListAvailablePhoneNumbersBlocksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response with a list of available phone numbers blocks. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListAvailablePhoneNumbersBlocksResponse> listAvailablePhoneNumberBlocksWithHttpInfo(String filterPhoneNumberStartsWith, String filterPhoneNumberEndsWith, String filterPhoneNumberContains, String filterLocality, String filterAdministrativeArea, String filterCountryCode, String filterNationalDestinationCode, String filterRateCenter, String filterNumberType, List<String> filterFeatures, Integer filterMinimumBlockSize, Integer filterLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/available_phone_number_blocks";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][starts_with]", filterPhoneNumberStartsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][ends_with]", filterPhoneNumberEndsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][contains]", filterPhoneNumberContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[locality]", filterLocality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[administrative_area]", filterAdministrativeArea));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[country_code]", filterCountryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[national_destination_code]", filterNationalDestinationCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rate_center]", filterRateCenter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[number_type]", filterNumberType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[features]", filterFeatures));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[minimum_block_size]", filterMinimumBlockSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[limit]", filterLimit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListAvailablePhoneNumbersBlocksResponse> localVarReturnType = new GenericType<ListAvailablePhoneNumbersBlocksResponse>() {};

    return apiClient.invokeAPI("NumberSearchApi.listAvailablePhoneNumberBlocks", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

private ApiResponse<ListAvailablePhoneNumbersResponse> listAvailablePhoneNumbersWithHttpInfo(String filterPhoneNumberStartsWith, String filterPhoneNumberEndsWith, String filterPhoneNumberContains, String filterLocality, String filterAdministrativeArea, String filterCountryCode, String filterNationalDestinationCode, String filterRateCenter, String filterPhoneNumberType, List<String> filterFeatures, Integer filterLimit, Boolean filterBestEffort, Boolean filterQuickship, Boolean filterReservable, Boolean filterExcludeHeldNumbers) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/available_phone_numbers";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][starts_with]", filterPhoneNumberStartsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][ends_with]", filterPhoneNumberEndsWith));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number][contains]", filterPhoneNumberContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[locality]", filterLocality));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[administrative_area]", filterAdministrativeArea));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[country_code]", filterCountryCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[national_destination_code]", filterNationalDestinationCode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[rate_center]", filterRateCenter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[phone_number_type]", filterPhoneNumberType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filter[features]", filterFeatures));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[limit]", filterLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[best_effort]", filterBestEffort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[quickship]", filterQuickship));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[reservable]", filterReservable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[exclude_held_numbers]", filterExcludeHeldNumbers));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListAvailablePhoneNumbersResponse> localVarReturnType = new GenericType<ListAvailablePhoneNumbersResponse>() {};

    return apiClient.invokeAPI("NumberSearchApi.listAvailablePhoneNumbers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }

  public class APIlistAvailablePhoneNumbersRequest {
    private String filterPhoneNumberStartsWith;
    private String filterPhoneNumberEndsWith;
    private String filterPhoneNumberContains;
    private String filterLocality;
    private String filterAdministrativeArea;
    private String filterCountryCode;
    private String filterNationalDestinationCode;
    private String filterRateCenter;
    private String filterPhoneNumberType;
    private List<String> filterFeatures;
    private Integer filterLimit;
    private Boolean filterBestEffort;
    private Boolean filterQuickship;
    private Boolean filterReservable;
    private Boolean filterExcludeHeldNumbers;

    private APIlistAvailablePhoneNumbersRequest() {
    }

    /**
     * Set filterPhoneNumberStartsWith
     * @param filterPhoneNumberStartsWith Filter numbers starting with a pattern (exclude NDC from start of this filter if used with &#x60;national_destination_code&#x60; filter). (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterPhoneNumberStartsWith(String filterPhoneNumberStartsWith) {
      this.filterPhoneNumberStartsWith = filterPhoneNumberStartsWith;
      return this;
    }

    /**
     * Set filterPhoneNumberEndsWith
     * @param filterPhoneNumberEndsWith Filter numbers ending with a pattern (max length of 4 digits if used with &#x60;national_destination_code&#x60; filter). (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterPhoneNumberEndsWith(String filterPhoneNumberEndsWith) {
      this.filterPhoneNumberEndsWith = filterPhoneNumberEndsWith;
      return this;
    }

    /**
     * Set filterPhoneNumberContains
     * @param filterPhoneNumberContains Filter numbers containing a pattern (must be used with &#x60;national_destination_code&#x60; filter and only searches within last 4 digits). (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterPhoneNumberContains(String filterPhoneNumberContains) {
      this.filterPhoneNumberContains = filterPhoneNumberContains;
      return this;
    }

    /**
     * Set filterLocality
     * @param filterLocality Filter phone numbers by city. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterLocality(String filterLocality) {
      this.filterLocality = filterLocality;
      return this;
    }

    /**
     * Set filterAdministrativeArea
     * @param filterAdministrativeArea Filter phone numbers by US state/CA province. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterAdministrativeArea(String filterAdministrativeArea) {
      this.filterAdministrativeArea = filterAdministrativeArea;
      return this;
    }

    /**
     * Set filterCountryCode
     * @param filterCountryCode Filter phone numbers by ISO alpha-2 country code. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterCountryCode(String filterCountryCode) {
      this.filterCountryCode = filterCountryCode;
      return this;
    }

    /**
     * Set filterNationalDestinationCode
     * @param filterNationalDestinationCode Filter by the national destination code of the number. This filter is only applicable to North American numbers. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterNationalDestinationCode(String filterNationalDestinationCode) {
      this.filterNationalDestinationCode = filterNationalDestinationCode;
      return this;
    }

    /**
     * Set filterRateCenter
     * @param filterRateCenter Filter phone numbers by NANP rate center. This filter is only applicable to North American numbers. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterRateCenter(String filterRateCenter) {
      this.filterRateCenter = filterRateCenter;
      return this;
    }

    /**
     * Set filterPhoneNumberType
     * @param filterPhoneNumberType Filter phone numbers by number type. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterPhoneNumberType(String filterPhoneNumberType) {
      this.filterPhoneNumberType = filterPhoneNumberType;
      return this;
    }

    /**
     * Set filterFeatures
     * @param filterFeatures Filter if the phone number should be used for voice, fax, mms, sms, emergency. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterFeatures(List<String> filterFeatures) {
      this.filterFeatures = filterFeatures;
      return this;
    }

    /**
     * Set filterLimit
     * @param filterLimit Limits the number of results. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterLimit(Integer filterLimit) {
      this.filterLimit = filterLimit;
      return this;
    }

    /**
     * Set filterBestEffort
     * @param filterBestEffort Filter to determine if best effort results should be included. Only available in NANPA countries. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterBestEffort(Boolean filterBestEffort) {
      this.filterBestEffort = filterBestEffort;
      return this;
    }

    /**
     * Set filterQuickship
     * @param filterQuickship Filter to exclude phone numbers that need additional time after to purchase to receive phone calls. Only available for toll-free numbers. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterQuickship(Boolean filterQuickship) {
      this.filterQuickship = filterQuickship;
      return this;
    }

    /**
     * Set filterReservable
     * @param filterReservable Filter to exclude phone numbers that cannot be reserved before purchase. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterReservable(Boolean filterReservable) {
      this.filterReservable = filterReservable;
      return this;
    }

    /**
     * Set filterExcludeHeldNumbers
     * @param filterExcludeHeldNumbers Filter to exclude phone numbers that are currently on hold for your account. (optional)
     * @return APIlistAvailablePhoneNumbersRequest
     */
    public APIlistAvailablePhoneNumbersRequest filterExcludeHeldNumbers(Boolean filterExcludeHeldNumbers) {
      this.filterExcludeHeldNumbers = filterExcludeHeldNumbers;
      return this;
    }

    /**
     * Execute listAvailablePhoneNumbers request
     * @return ListAvailablePhoneNumbersResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of available phone numbers. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ListAvailablePhoneNumbersResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAvailablePhoneNumbers request with HTTP info returned
     * @return ApiResponse&lt;ListAvailablePhoneNumbersResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> Successful response with a list of available phone numbers. </td><td>  -  </td></tr>
         <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
       </table>

     */
    public ApiResponse<ListAvailablePhoneNumbersResponse> executeWithHttpInfo() throws ApiException {
      return listAvailablePhoneNumbersWithHttpInfo(filterPhoneNumberStartsWith, filterPhoneNumberEndsWith, filterPhoneNumberContains, filterLocality, filterAdministrativeArea, filterCountryCode, filterNationalDestinationCode, filterRateCenter, filterPhoneNumberType, filterFeatures, filterLimit, filterBestEffort, filterQuickship, filterReservable, filterExcludeHeldNumbers);
    }
  }

  /**
   * List available phone numbers
   * 
   * @return listAvailablePhoneNumbersRequest
   * @throws ApiException if fails to make API call
   
   
   */
  public APIlistAvailablePhoneNumbersRequest listAvailablePhoneNumbers() throws ApiException {
    return new APIlistAvailablePhoneNumbersRequest();
  }
}
