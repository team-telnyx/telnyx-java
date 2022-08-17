# InventoryLevelApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInventoryCoverageRequest**](InventoryLevelApi.md#createInventoryCoverageRequest) | **GET** /inventory_coverage | Create an inventory coverage request



## createInventoryCoverageRequest

> CreateInventoryCoverageRequest200Response createInventoryCoverageRequest(filterGroupBy, filterNpa, filterNxx, filterAdministrativeArea, filterPhoneNumberType, filterCountryCode, filterCount)

Create an inventory coverage request

Creates an inventory coverage request. If locality, npa or national_destination_code is used in groupBy, and no region or locality filters are used, the whole paginated set is returned.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.InventoryLevelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        InventoryLevelApi apiInstance = new InventoryLevelApi(defaultClient);
        String filterGroupBy = "locality"; // String | 
        Integer filterNpa = 318; // Integer | 
        Integer filterNxx = 202; // Integer | 
        String filterAdministrativeArea = "LA"; // String | 
        String filterPhoneNumberType = "local"; // String | 
        String filterCountryCode = "US"; // String | 
        Boolean filterCount = true; // Boolean | 
        try {
            CreateInventoryCoverageRequest200Response result = apiInstance.createInventoryCoverageRequest(filterGroupBy, filterNpa, filterNxx, filterAdministrativeArea, filterPhoneNumberType, filterCountryCode, filterCount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InventoryLevelApi#createInventoryCoverageRequest");
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
 **filterGroupBy** | **String**|  | [enum: locality, npa, national_destination_code]
 **filterNpa** | **Integer**|  | [optional]
 **filterNxx** | **Integer**|  | [optional]
 **filterAdministrativeArea** | **String**|  | [optional]
 **filterPhoneNumberType** | **String**|  | [optional] [enum: local, toll_free, national, mobile, landline, shared_cost]
 **filterCountryCode** | **String**|  | [optional] [enum: US, CA, GB]
 **filterCount** | **Boolean**|  | [optional]

### Return type

[**CreateInventoryCoverageRequest200Response**](CreateInventoryCoverageRequest200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of inventory coverage levels |  -  |
| **0** | Unexpected error |  -  |

