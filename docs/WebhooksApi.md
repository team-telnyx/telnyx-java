# WebhooksApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWebhookDeliveries**](WebhooksApi.md#getWebhookDeliveries) | **GET** /webhook_deliveries | List webhook deliveries
[**getWebhookDelivery**](WebhooksApi.md#getWebhookDelivery) | **GET** /webhook_deliveries/{id} | Find webhook_delivery details by ID



## getWebhookDeliveries

> ListWebhookDeliveriesResponse getWebhookDeliveries(filterStatusEq, filterWebhookContains, filterAttemptsContains, filterStartedAtGte, filterStartedAtLte, filterFinishedAtGte, filterFinishedAtLte, pageNumber, pageSize)

List webhook deliveries

Lists webhook_deliveries for the authenticated user

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String filterStatusEq = "delivered"; // String | Return only webhook_deliveries matching the given `status`
        String filterWebhookContains = "call.initiated"; // String | Return only webhook deliveries whose `webhook` component contains the given text
        String filterAttemptsContains = "https://fallback.example.com/webhooks"; // String | Return only webhook_deliveries whose `attempts` component contains the given text
        String filterStartedAtGte = "2019-03-29T11:10:00Z"; // String | Return only webhook_deliveries whose delivery started later than or at given ISO 8601 datetime
        String filterStartedAtLte = "2019-03-29T11:10:00Z"; // String | Return only webhook_deliveries whose delivery started earlier than or at given ISO 8601 datetime
        String filterFinishedAtGte = "2019-03-29T11:10:00Z"; // String | Return only webhook_deliveries whose delivery finished later than or at given ISO 8601 datetime
        String filterFinishedAtLte = "2019-03-29T11:10:00Z"; // String | Return only webhook_deliveries whose delivery finished earlier than or at given ISO 8601 datetime
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListWebhookDeliveriesResponse result = apiInstance.getWebhookDeliveries(filterStatusEq, filterWebhookContains, filterAttemptsContains, filterStartedAtGte, filterStartedAtLte, filterFinishedAtGte, filterFinishedAtLte, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getWebhookDeliveries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStatusEq** | **String**| Return only webhook_deliveries matching the given &#x60;status&#x60; | [optional] [enum: delivered, failed]
 **filterWebhookContains** | **String**| Return only webhook deliveries whose &#x60;webhook&#x60; component contains the given text | [optional]
 **filterAttemptsContains** | **String**| Return only webhook_deliveries whose &#x60;attempts&#x60; component contains the given text | [optional]
 **filterStartedAtGte** | **String**| Return only webhook_deliveries whose delivery started later than or at given ISO 8601 datetime | [optional]
 **filterStartedAtLte** | **String**| Return only webhook_deliveries whose delivery started earlier than or at given ISO 8601 datetime | [optional]
 **filterFinishedAtGte** | **String**| Return only webhook_deliveries whose delivery finished later than or at given ISO 8601 datetime | [optional]
 **filterFinishedAtLte** | **String**| Return only webhook_deliveries whose delivery finished earlier than or at given ISO 8601 datetime | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListWebhookDeliveriesResponse**](ListWebhookDeliveriesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paginated array of webhook_delivery attempts |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity |  -  |


## getWebhookDelivery

> RetrieveWebhookDelivery getWebhookDelivery(id)

Find webhook_delivery details by ID

Provides webhook_delivery debug data, such as timestamps, delivery status and attempts.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        UUID id = UUID.fromString("c9c0797e-901d-4349-a33c-c2c8f31a92c2"); // UUID | Uniquely identifies the webhook_delivery.
        try {
            RetrieveWebhookDelivery result = apiInstance.getWebhookDelivery(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getWebhookDelivery");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| Uniquely identifies the webhook_delivery. |

### Return type

[**RetrieveWebhookDelivery**](RetrieveWebhookDelivery.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhook delivery record. |  -  |
| **401** | Unauthorized |  -  |
| **404** | WebhookDelivery not found |  -  |

