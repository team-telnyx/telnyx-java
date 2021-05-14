# NumberLookupApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**numberLookup**](NumberLookupApi.md#numberLookup) | **GET** /number_lookup/{phone_number} | Lookup phone number data



## numberLookup

> NumberLookupResponse numberLookup(phoneNumber, type)

Lookup phone number data

Returns information about the provided phone number.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberLookupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberLookupApi apiInstance = new NumberLookupApi(defaultClient);
        String phoneNumber = +18665552368; // String | The phone number to be looked up
        String type = "type_example"; // String | Specifies the type of number lookup to be performed
        try {
            NumberLookupResponse result = apiInstance.numberLookup(phoneNumber, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberLookupApi#numberLookup");
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
 **phoneNumber** | **String**| The phone number to be looked up |
 **type** | **String**| Specifies the type of number lookup to be performed | [optional] [enum: carrier, caller-name]

### Return type

[**NumberLookupResponse**](NumberLookupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Bad Request |  -  |

