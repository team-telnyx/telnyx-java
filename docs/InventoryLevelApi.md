# InventoryLevelApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInventoryCoverage**](InventoryLevelApi.md#createInventoryCoverage) | **GET** /inventory_coverage | Create an inventory coverage request



## createInventoryCoverage

> CreateInventoryCoverage200Response createInventoryCoverage(filterGroupBy, filterNpa, filterNxx, filterAdministrativeArea, filterPhoneNumberType, filterCountryCode, filterCount, filterFeatures)

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
        List<String> filterFeatures = Arrays.asList(); // List<String> | Filter if the phone number should be used for voice, fax, mms, sms, emergency. Returns features in the response when used.
        try {
            CreateInventoryCoverage200Response result = apiInstance.createInventoryCoverage(filterGroupBy, filterNpa, filterNxx, filterAdministrativeArea, filterPhoneNumberType, filterCountryCode, filterCount, filterFeatures);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InventoryLevelApi#createInventoryCoverage");
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
 **filterFeatures** | **List&lt;String&gt;**| Filter if the phone number should be used for voice, fax, mms, sms, emergency. Returns features in the response when used. | [optional] [enum: sms, mms, voice, fax, emergency]

### Return type

[**CreateInventoryCoverage200Response**](CreateInventoryCoverage200Response.md)

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

