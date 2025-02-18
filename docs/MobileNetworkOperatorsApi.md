# MobileNetworkOperatorsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMobileNetworkOperators**](MobileNetworkOperatorsApi.md#getMobileNetworkOperators) | **GET** /mobile_network_operators | List mobile network operators



## getMobileNetworkOperators

> GetMobileNetworkOperators200Response getMobileNetworkOperators(pageNumber, pageSize, filterNameStartsWith, filterNameContains, filterNameEndsWith, filterCountryCode, filterMcc, filterMnc, filterTadig, filterNetworkPreferencesEnabled)

List mobile network operators

Telnyx has a set of GSM mobile operators partners that are available through our mobile network roaming. This resource is entirely managed by Telnyx and may change over time. That means that this resource won't allow any write operations for it. Still, it's available so it can be used as a support resource that can be related to other resources or become a configuration option.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MobileNetworkOperatorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MobileNetworkOperatorsApi apiInstance = new MobileNetworkOperatorsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterNameStartsWith = "AT"; // String | Filter by name starting with.
        String filterNameContains = "T&T"; // String | Filter by name containing match.
        String filterNameEndsWith = "T"; // String | Filter by name ending with.
        String filterCountryCode = "US"; // String | Filter by exact country_code.
        String filterMcc = "310"; // String | Filter by exact MCC.
        String filterMnc = "410"; // String | Filter by exact MNC.
        String filterTadig = "USACG"; // String | Filter by exact TADIG.
        Boolean filterNetworkPreferencesEnabled = true; // Boolean | Filter by network_preferences_enabled.
        try {
            GetMobileNetworkOperators200Response result = apiInstance.getMobileNetworkOperators(pageNumber, pageSize, filterNameStartsWith, filterNameContains, filterNameEndsWith, filterCountryCode, filterMcc, filterMnc, filterTadig, filterNetworkPreferencesEnabled);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileNetworkOperatorsApi#getMobileNetworkOperators");
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
 **filterNameStartsWith** | **String**| Filter by name starting with. | [optional]
 **filterNameContains** | **String**| Filter by name containing match. | [optional]
 **filterNameEndsWith** | **String**| Filter by name ending with. | [optional]
 **filterCountryCode** | **String**| Filter by exact country_code. | [optional]
 **filterMcc** | **String**| Filter by exact MCC. | [optional]
 **filterMnc** | **String**| Filter by exact MNC. | [optional]
 **filterTadig** | **String**| Filter by exact TADIG. | [optional]
 **filterNetworkPreferencesEnabled** | **Boolean**| Filter by network_preferences_enabled. | [optional]

### Return type

[**GetMobileNetworkOperators200Response**](GetMobileNetworkOperators200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

