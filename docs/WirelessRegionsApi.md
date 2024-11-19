# WirelessRegionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**wirelessRegionsGetAll**](WirelessRegionsApi.md#wirelessRegionsGetAll) | **GET** /wireless/regions | Get all wireless regions



## wirelessRegionsGetAll

> ListRegions200Response wirelessRegionsGetAll(product)

Get all wireless regions

Retrieve all wireless regions for the given product.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WirelessRegionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WirelessRegionsApi apiInstance = new WirelessRegionsApi(defaultClient);
        String product = "public_ips"; // String | The product for which to list regions (e.g., 'public_ips').
        try {
            ListRegions200Response result = apiInstance.wirelessRegionsGetAll(product);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WirelessRegionsApi#wirelessRegionsGetAll");
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
 **product** | **String**| The product for which to list regions (e.g., &#39;public_ips&#39;). |

### Return type

[**ListRegions200Response**](ListRegions200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of wireless regions |  -  |
| **404** | Resource not found |  -  |
| **0** | Unexpected error |  -  |

