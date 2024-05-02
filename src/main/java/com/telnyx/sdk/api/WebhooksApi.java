package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.GetWebhookDeliveries200Response;
import com.telnyx.sdk.model.GetWebhookDelivery200Response;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
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
   * @param filterEventType Return only webhook_deliveries matching the given value of &#x60;event_type&#x60;. Accepts multiple values separated by a &#x60;,&#x60;. (optional)
   * @param filterWebhookContains Return only webhook deliveries whose &#x60;webhook&#x60; component contains the given text (optional)
   * @param filterAttemptsContains Return only webhook_deliveries whose &#x60;attempts&#x60; component contains the given text (optional)
   * @param filterStartedAtGte Return only webhook_deliveries whose delivery started later than or at given ISO 8601 datetime (optional)
   * @param filterStartedAtLte Return only webhook_deliveries whose delivery started earlier than or at given ISO 8601 datetime (optional)
   * @param filterFinishedAtGte Return only webhook_deliveries whose delivery finished later than or at given ISO 8601 datetime (optional)
   * @param filterFinishedAtLte Return only webhook_deliveries whose delivery finished earlier than or at given ISO 8601 datetime (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return GetWebhookDeliveries200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A paginated array of webhook_delivery attempts </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public GetWebhookDeliveries200Response getWebhookDeliveries(String filterStatusEq, String filterEventType, String filterWebhookContains, String filterAttemptsContains, String filterStartedAtGte, String filterStartedAtLte, String filterFinishedAtGte, String filterFinishedAtLte, Integer pageNumber, Integer pageSize) throws ApiException {
    return getWebhookDeliveriesWithHttpInfo(filterStatusEq, filterEventType, filterWebhookContains, filterAttemptsContains, filterStartedAtGte, filterStartedAtLte, filterFinishedAtGte, filterFinishedAtLte, pageNumber, pageSize).getData();
  }

  /**
   * List webhook deliveries
   * Lists webhook_deliveries for the authenticated user
   * @param filterStatusEq Return only webhook_deliveries matching the given &#x60;status&#x60; (optional)
   * @param filterEventType Return only webhook_deliveries matching the given value of &#x60;event_type&#x60;. Accepts multiple values separated by a &#x60;,&#x60;. (optional)
   * @param filterWebhookContains Return only webhook deliveries whose &#x60;webhook&#x60; component contains the given text (optional)
   * @param filterAttemptsContains Return only webhook_deliveries whose &#x60;attempts&#x60; component contains the given text (optional)
   * @param filterStartedAtGte Return only webhook_deliveries whose delivery started later than or at given ISO 8601 datetime (optional)
   * @param filterStartedAtLte Return only webhook_deliveries whose delivery started earlier than or at given ISO 8601 datetime (optional)
   * @param filterFinishedAtGte Return only webhook_deliveries whose delivery finished later than or at given ISO 8601 datetime (optional)
   * @param filterFinishedAtLte Return only webhook_deliveries whose delivery finished earlier than or at given ISO 8601 datetime (optional)
   * @param pageNumber The page number to load (optional, default to 1)
   * @param pageSize The size of the page (optional, default to 20)
   * @return ApiResponse&lt;GetWebhookDeliveries200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> A paginated array of webhook_delivery attempts </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetWebhookDeliveries200Response> getWebhookDeliveriesWithHttpInfo(String filterStatusEq, String filterEventType, String filterWebhookContains, String filterAttemptsContains, String filterStartedAtGte, String filterStartedAtLte, String filterFinishedAtGte, String filterFinishedAtLte, Integer pageNumber, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/webhook_deliveries";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[status][eq]", filterStatusEq));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[event_type]", filterEventType));
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

    GenericType<GetWebhookDeliveries200Response> localVarReturnType = new GenericType<GetWebhookDeliveries200Response>() {};

    return apiClient.invokeAPI("WebhooksApi.getWebhookDeliveries", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Find webhook_delivery details by ID
   * Provides webhook_delivery debug data, such as timestamps, delivery status and attempts.
   * @param id Uniquely identifies the webhook_delivery. (required)
   * @return GetWebhookDelivery200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Webhook delivery record. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WebhookDelivery not found </td><td>  -  </td></tr>
     </table>
   */
  public GetWebhookDelivery200Response getWebhookDelivery(UUID id) throws ApiException {
    return getWebhookDeliveryWithHttpInfo(id).getData();
  }

  /**
   * Find webhook_delivery details by ID
   * Provides webhook_delivery debug data, such as timestamps, delivery status and attempts.
   * @param id Uniquely identifies the webhook_delivery. (required)
   * @return ApiResponse&lt;GetWebhookDelivery200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Webhook delivery record. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> WebhookDelivery not found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetWebhookDelivery200Response> getWebhookDeliveryWithHttpInfo(UUID id) throws ApiException {
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

    GenericType<GetWebhookDelivery200Response> localVarReturnType = new GenericType<GetWebhookDelivery200Response>() {};

    return apiClient.invokeAPI("WebhooksApi.getWebhookDelivery", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
