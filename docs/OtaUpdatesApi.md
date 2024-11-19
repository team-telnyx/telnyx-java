# OtaUpdatesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOtaUpdate**](OtaUpdatesApi.md#getOtaUpdate) | **GET** /ota_updates/{id} | Get OTA update
[**listOtaUpdates**](OtaUpdatesApi.md#listOtaUpdates) | **GET** /ota_updates | List OTA updates



## getOtaUpdate

> GetOtaUpdate200Response getOtaUpdate(id)

Get OTA update

This API returns the details of an Over the Air (OTA) update.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OtaUpdatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OtaUpdatesApi apiInstance = new OtaUpdatesApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            GetOtaUpdate200Response result = apiInstance.getOtaUpdate(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OtaUpdatesApi#getOtaUpdate");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**GetOtaUpdate200Response**](GetOtaUpdate200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |


## listOtaUpdates

> ListOtaUpdates200Response listOtaUpdates(pageNumber, pageSize, filterStatus, filterSimCardId, filterType)

List OTA updates

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.OtaUpdatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OtaUpdatesApi apiInstance = new OtaUpdatesApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterStatus = "in-progress"; // String | Filter by a specific status of the resource's lifecycle.
        String filterSimCardId = "filterSimCardId_example"; // String | The SIM card identification UUID.
        String filterType = "sim_card_network_preferences"; // String | Filter by type.
        try {
            ListOtaUpdates200Response result = apiInstance.listOtaUpdates(pageNumber, pageSize, filterStatus, filterSimCardId, filterType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OtaUpdatesApi#listOtaUpdates");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterStatus** | **String**| Filter by a specific status of the resource&#39;s lifecycle. | [optional] [enum: in-progress, completed, failed]
 **filterSimCardId** | **String**| The SIM card identification UUID. | [optional]
 **filterType** | **String**| Filter by type. | [optional] [enum: sim_card_network_preferences]

### Return type

[**ListOtaUpdates200Response**](ListOtaUpdates200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

