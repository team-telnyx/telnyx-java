package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import javax.ws.rs.core.GenericType;

import com.telnyx.sdk.model.ListWebhookDeliveriesResponse;
import com.telnyx.sdk.model.RetrieveWebhookDelivery;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhooksApi {
  private ApiClient apiClient;

  public WebhooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
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
   * List webhook deliveries
   * Lists webhook_deliveries for the authenticated user
   * @param filterStatusEq Return only webhook_deliveries matching the given &#x60;status&#x60; (optional)
   * @param filterWebhookContains Return only webhook deliveries whose &#x60;webhook&#x60; component contains the given text (optional)
   * @param filterAttemptsContains Return only webhook_deliveries whose &#x60;attempts&#x60; component contains the given text (optional)
   * @param filterStartedAtGte Return only webhook_deliveries whose delivery started later than or at given ISO 8601 datetime (optional)
   * @param filterStartedAtLte Return only webhook_deliveries whose delivery started earlier than or at given ISO 8601 datetime (optional)
   * @param filterFinishedAtGte Return only webhook_deliveries whose delivery finished later than or at given ISO 8601 datetime (optional)
   * @param filterFinishedAtLte Return only webhook_deliveries whose delivery finished earlier than or at given ISO 8601 datetime (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ListWebhookDeliveriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A paginated array of webhook_delivery attempts </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ListWebhookDeliveriesResponse getWebhookDeliveries(String filterStatusEq, String filterWebhookContains, String filterAttemptsContains, String filterStartedAtGte, String filterStartedAtLte, String filterFinishedAtGte, String filterFinishedAtLte, Integer pageNumber, Integer pageSize) throws ApiException {
    return getWebhookDeliveriesWithHttpInfo(filterStatusEq, filterWebhookContains, filterAttemptsContains, filterStartedAtGte, filterStartedAtLte, filterFinishedAtGte, filterFinishedAtLte, pageNumber, pageSize).getData();
  }

  /**
   * List webhook deliveries
   * Lists webhook_deliveries for the authenticated user
   * @param filterStatusEq Return only webhook_deliveries matching the given &#x60;status&#x60; (optional)
   * @param filterWebhookContains Return only webhook deliveries whose &#x60;webhook&#x60; component contains the given text (optional)
   * @param filterAttemptsContains Return only webhook_deliveries whose &#x60;attempts&#x60; component contains the given text (optional)
   * @param filterStartedAtGte Return only webhook_deliveries whose delivery started later than or at given ISO 8601 datetime (optional)
   * @param filterStartedAtLte Return only webhook_deliveries whose delivery started earlier than or at given ISO 8601 datetime (optional)
   * @param filterFinishedAtGte Return only webhook_deliveries whose delivery finished later than or at given ISO 8601 datetime (optional)
   * @param filterFinishedAtLte Return only webhook_deliveries whose delivery finished earlier than or at given ISO 8601 datetime (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;ListWebhookDeliveriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A paginated array of webhook_delivery attempts </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListWebhookDeliveriesResponse> getWebhookDeliveriesWithHttpInfo(String filterStatusEq, String filterWebhookContains, String filterAttemptsContains, String filterStartedAtGte, String filterStartedAtLte, String filterFinishedAtGte, String filterFinishedAtLte, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/webhook_deliveries";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status][eq]", filterStatusEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[webhook][contains]", filterWebhookContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[attempts][contains]", filterAttemptsContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[started_at][gte]", filterStartedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[started_at][lte]", filterStartedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[finished_at][gte]", filterFinishedAtGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[finished_at][lte]", filterFinishedAtLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListWebhookDeliveriesResponse> localVarReturnType = new GenericType<ListWebhookDeliveriesResponse>() {};

    return apiClient.invokeAPI("WebhooksApi.getWebhookDeliveries", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Find webhook_delivery details by ID
   * Provides webhook_delivery debug data, such as timestamps, delivery status and attempts.
   * @param id Uniquely identifies the webhook_delivery. (required)
   * @return RetrieveWebhookDelivery
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Webhook delivery record. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WebhookDelivery not found </td><td>  -  </td></tr>
     </table>
   */
  public RetrieveWebhookDelivery getWebhookDelivery(UUID id) throws ApiException {
    return getWebhookDeliveryWithHttpInfo(id).getData();
  }

  /**
   * Find webhook_delivery details by ID
   * Provides webhook_delivery debug data, such as timestamps, delivery status and attempts.
   * @param id Uniquely identifies the webhook_delivery. (required)
   * @return ApiResponse&lt;RetrieveWebhookDelivery&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Webhook delivery record. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WebhookDelivery not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RetrieveWebhookDelivery> getWebhookDeliveryWithHttpInfo(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getWebhookDelivery");
    }
    
    // create path and map variables
    String localVarPath = "/webhook_deliveries/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<RetrieveWebhookDelivery> localVarReturnType = new GenericType<RetrieveWebhookDelivery>() {};

    return apiClient.invokeAPI("WebhooksApi.getWebhookDelivery", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
