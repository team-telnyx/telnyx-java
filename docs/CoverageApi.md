# CoverageApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listNetworkCoverage**](CoverageApi.md#listNetworkCoverage) | **GET** /network_coverage | List network coverage locations



## listNetworkCoverage

> ListNetworkCoverage200Response listNetworkCoverage(pageNumber, pageSize, filtersAvailableServicesContains, filterLocationRegion, filterLocationSite, filterLocationPop, filterLocationCode)

List network coverage locations

List all locations and the interfaces that region supports

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CoverageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CoverageApi apiInstance = new CoverageApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        AvailableService filtersAvailableServicesContains = AvailableService.fromValue("cloud_vpn"); // AvailableService | The region of associated location to filter on.
        String filterLocationRegion = "AMER"; // String | The region of associated location to filter on.
        String filterLocationSite = "SJC"; // String | The site of associated location to filter on.
        String filterLocationPop = "SV1"; // String | The POP of associated location to filter on.
        String filterLocationCode = "silicon_valley-ca"; // String | The code of associated location to filter on.
        try {
            ListNetworkCoverage200Response result = apiInstance.listNetworkCoverage(pageNumber, pageSize, filtersAvailableServicesContains, filterLocationRegion, filterLocationSite, filterLocationPop, filterLocationCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoverageApi#listNetworkCoverage");
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
 **filtersAvailableServicesContains** | **AvailableService**| The region of associated location to filter on. | [optional] [enum: cloud_vpn, private_wireless_gateway, virtual_cross_connect]
 **filterLocationRegion** | **String**| The region of associated location to filter on. | [optional]
 **filterLocationSite** | **String**| The site of associated location to filter on. | [optional]
 **filterLocationPop** | **String**| The POP of associated location to filter on. | [optional]
 **filterLocationCode** | **String**| The code of associated location to filter on. | [optional]

### Return type

[**ListNetworkCoverage200Response**](ListNetworkCoverage200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |

