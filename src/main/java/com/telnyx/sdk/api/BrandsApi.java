package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.BrandFeedback;
import com.telnyx.sdk.model.BrandRecordSetCSP;
import com.telnyx.sdk.model.CreateBrand;
import com.telnyx.sdk.model.ExternalVetting;
import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.ImportExternalVetting;
import com.telnyx.sdk.model.OrderExternalVetting;
import com.telnyx.sdk.model.TelnyxBrand;
import com.telnyx.sdk.model.UpdateBrand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BrandsApi {
  private ApiClient apiClient;

  public BrandsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BrandsApi(ApiClient apiClient) {
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
   * Create Brand
   * This endpoint is used to create a new brand. A brand is an entity created by The Campaign Registry (TCR) that represents an organization or a company. It is this entity that TCR created campaigns will be associated with. Each brand creation will entail an upfront, non-refundable $4 expense.
   * @param createBrand  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object createBrandPost(CreateBrand createBrand) throws ApiException {
    return createBrandPostWithHttpInfo(createBrand).getData();
  }

  /**
   * Create Brand
   * This endpoint is used to create a new brand. A brand is an entity created by The Campaign Registry (TCR) that represents an organization or a company. It is this entity that TCR created campaigns will be associated with. Each brand creation will entail an upfront, non-refundable $4 expense.
   * @param createBrand  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> createBrandPostWithHttpInfo(CreateBrand createBrand) throws ApiException {
    Object localVarPostBody = createBrand;
    
    // verify the required parameter 'createBrand' is set
    if (createBrand == null) {
      throw new ApiException(400, "Missing the required parameter 'createBrand' when calling createBrandPost");
    }
    
    // create path and map variables
    String localVarPath = "/brand";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("BrandsApi.createBrandPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete Brand
   * 
   * @param brandId  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object deleteBrand(String brandId) throws ApiException {
    return deleteBrandWithHttpInfo(brandId).getData();
  }

  /**
   * Delete Brand
   * 
   * @param brandId  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> deleteBrandWithHttpInfo(String brandId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling deleteBrand");
    }
    
    // create path and map variables
    String localVarPath = "/brand/{brandId}"
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("BrandsApi.deleteBrand", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Brand
   * Retrieve a brand by &#x60;brandId&#x60;.
   * @param brandId  (required)
   * @return TelnyxBrand
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public TelnyxBrand getBrand(String brandId) throws ApiException {
    return getBrandWithHttpInfo(brandId).getData();
  }

  /**
   * Get Brand
   * Retrieve a brand by &#x60;brandId&#x60;.
   * @param brandId  (required)
   * @return ApiResponse&lt;TelnyxBrand&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TelnyxBrand> getBrandWithHttpInfo(String brandId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrand");
    }
    
    // create path and map variables
    String localVarPath = "/brand/{brandId}"
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<TelnyxBrand> localVarReturnType = new GenericType<TelnyxBrand>() {};

    return apiClient.invokeAPI("BrandsApi.getBrand", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Brand Feedback By Id
   * Get feedback about a brand by ID. This endpoint can be used after creating or revetting a brand.  Possible values for &#x60;.category[].id&#x60;:  * &#x60;TAX_ID&#x60; - Data mismatch related to tax id and its associated properties. * &#x60;STOCK_SYMBOL&#x60; - Non public entity registered as a public for profit entity or   the stock information mismatch. * &#x60;GOVERNMENT_ENTITY&#x60; - Non government entity registered as a government entity.   Must be a U.S. government entity. * &#x60;NONPROFIT&#x60; - Not a recognized non-profit entity. No IRS tax-exempt status   found. * &#x60;OTHERS&#x60; - Details of the data misrepresentation if any.
   * @param brandId  (required)
   * @return BrandFeedback
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public BrandFeedback getBrandFeedbackById(String brandId) throws ApiException {
    return getBrandFeedbackByIdWithHttpInfo(brandId).getData();
  }

  /**
   * Get Brand Feedback By Id
   * Get feedback about a brand by ID. This endpoint can be used after creating or revetting a brand.  Possible values for &#x60;.category[].id&#x60;:  * &#x60;TAX_ID&#x60; - Data mismatch related to tax id and its associated properties. * &#x60;STOCK_SYMBOL&#x60; - Non public entity registered as a public for profit entity or   the stock information mismatch. * &#x60;GOVERNMENT_ENTITY&#x60; - Non government entity registered as a government entity.   Must be a U.S. government entity. * &#x60;NONPROFIT&#x60; - Not a recognized non-profit entity. No IRS tax-exempt status   found. * &#x60;OTHERS&#x60; - Details of the data misrepresentation if any.
   * @param brandId  (required)
   * @return ApiResponse&lt;BrandFeedback&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BrandFeedback> getBrandFeedbackByIdWithHttpInfo(String brandId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrandFeedbackById");
    }
    
    // create path and map variables
    String localVarPath = "/brand/feedback/{brandId}"
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<BrandFeedback> localVarReturnType = new GenericType<BrandFeedback>() {};

    return apiClient.invokeAPI("BrandsApi.getBrandFeedbackById", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List Brands
   * This endpoint is used to list all brands associated with your organization.
   * @param page  (optional, default to 1)
   * @param recordsPerPage number of records per page. maximum of 500 (optional, default to 10)
   * @param displayName  (optional)
   * @param entityType  (optional)
   * @param state  (optional)
   * @param country  (optional)
   * @return BrandRecordSetCSP
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public BrandRecordSetCSP getBrands(Integer page, Integer recordsPerPage, String displayName, String entityType, String state, String country) throws ApiException {
    return getBrandsWithHttpInfo(page, recordsPerPage, displayName, entityType, state, country).getData();
  }

  /**
   * List Brands
   * This endpoint is used to list all brands associated with your organization.
   * @param page  (optional, default to 1)
   * @param recordsPerPage number of records per page. maximum of 500 (optional, default to 10)
   * @param displayName  (optional)
   * @param entityType  (optional)
   * @param state  (optional)
   * @param country  (optional)
   * @return ApiResponse&lt;BrandRecordSetCSP&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BrandRecordSetCSP> getBrandsWithHttpInfo(Integer page, Integer recordsPerPage, String displayName, String entityType, String state, String country) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/brand";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordsPerPage", recordsPerPage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "displayName", displayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entityType", entityType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<BrandRecordSetCSP> localVarReturnType = new GenericType<BrandRecordSetCSP>() {};

    return apiClient.invokeAPI("BrandsApi.getBrands", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List External Vettings
   * Get list of valid external vetting record for a given brand
   * @param brandId  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object listExternalVettings(String brandId) throws ApiException {
    return listExternalVettingsWithHttpInfo(brandId).getData();
  }

  /**
   * List External Vettings
   * Get list of valid external vetting record for a given brand
   * @param brandId  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> listExternalVettingsWithHttpInfo(String brandId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling listExternalVettings");
    }
    
    // create path and map variables
    String localVarPath = "/brand/{brandId}/externalVetting"
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("BrandsApi.listExternalVettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Order Brand External Vetting
   * Order new external vetting for a brand
   * @param brandId  (required)
   * @param orderExternalVetting  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object postOrderExternalVetting(String brandId, OrderExternalVetting orderExternalVetting) throws ApiException {
    return postOrderExternalVettingWithHttpInfo(brandId, orderExternalVetting).getData();
  }

  /**
   * Order Brand External Vetting
   * Order new external vetting for a brand
   * @param brandId  (required)
   * @param orderExternalVetting  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> postOrderExternalVettingWithHttpInfo(String brandId, OrderExternalVetting orderExternalVetting) throws ApiException {
    Object localVarPostBody = orderExternalVetting;
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling postOrderExternalVetting");
    }
    
    // verify the required parameter 'orderExternalVetting' is set
    if (orderExternalVetting == null) {
      throw new ApiException(400, "Missing the required parameter 'orderExternalVetting' when calling postOrderExternalVetting");
    }
    
    // create path and map variables
    String localVarPath = "/brand/{brandId}/externalVetting"
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("BrandsApi.postOrderExternalVetting", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Import External Vetting Record
   * This operation can be used to import an external vetting record from a TCR-approved vetting provider. If the vetting provider confirms validity of the record, it will be saved with the brand and will be considered for future campaign qualification.
   * @param brandId  (required)
   * @param importExternalVetting  (required)
   * @return ExternalVetting
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ExternalVetting putExternalVettingRecord(String brandId, ImportExternalVetting importExternalVetting) throws ApiException {
    return putExternalVettingRecordWithHttpInfo(brandId, importExternalVetting).getData();
  }

  /**
   * Import External Vetting Record
   * This operation can be used to import an external vetting record from a TCR-approved vetting provider. If the vetting provider confirms validity of the record, it will be saved with the brand and will be considered for future campaign qualification.
   * @param brandId  (required)
   * @param importExternalVetting  (required)
   * @return ApiResponse&lt;ExternalVetting&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ExternalVetting> putExternalVettingRecordWithHttpInfo(String brandId, ImportExternalVetting importExternalVetting) throws ApiException {
    Object localVarPostBody = importExternalVetting;
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling putExternalVettingRecord");
    }
    
    // verify the required parameter 'importExternalVetting' is set
    if (importExternalVetting == null) {
      throw new ApiException(400, "Missing the required parameter 'importExternalVetting' when calling putExternalVettingRecord");
    }
    
    // create path and map variables
    String localVarPath = "/brand/{brandId}/externalVetting"
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ExternalVetting> localVarReturnType = new GenericType<ExternalVetting>() {};

    return apiClient.invokeAPI("BrandsApi.putExternalVettingRecord", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Revet Brand
   * This operation allows you to revet the brand. However, revetting is allowed once after the successful brand registration and thereafter limited to once every 3 months.
   * @param brandId  (required)
   * @return Object
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public Object revetBrand(String brandId) throws ApiException {
    return revetBrandWithHttpInfo(brandId).getData();
  }

  /**
   * Revet Brand
   * This operation allows you to revet the brand. However, revetting is allowed once after the successful brand registration and thereafter limited to once every 3 months.
   * @param brandId  (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Object> revetBrandWithHttpInfo(String brandId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling revetBrand");
    }
    
    // create path and map variables
    String localVarPath = "/brand/{brandId}/revet"
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};

    return apiClient.invokeAPI("BrandsApi.revetBrand", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Update Brand
   * Update a brand&#39;s attributes by &#x60;brandId&#x60;.
   * @param brandId  (required)
   * @param updateBrand  (required)
   * @return TelnyxBrand
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public TelnyxBrand updateBrand(String brandId, UpdateBrand updateBrand) throws ApiException {
    return updateBrandWithHttpInfo(brandId, updateBrand).getData();
  }

  /**
   * Update Brand
   * Update a brand&#39;s attributes by &#x60;brandId&#x60;.
   * @param brandId  (required)
   * @param updateBrand  (required)
   * @return ApiResponse&lt;TelnyxBrand&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TelnyxBrand> updateBrandWithHttpInfo(String brandId, UpdateBrand updateBrand) throws ApiException {
    Object localVarPostBody = updateBrand;
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling updateBrand");
    }
    
    // verify the required parameter 'updateBrand' is set
    if (updateBrand == null) {
      throw new ApiException(400, "Missing the required parameter 'updateBrand' when calling updateBrand");
    }
    
    // create path and map variables
    String localVarPath = "/brand/{brandId}"
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<TelnyxBrand> localVarReturnType = new GenericType<TelnyxBrand>() {};

    return apiClient.invokeAPI("BrandsApi.updateBrand", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
