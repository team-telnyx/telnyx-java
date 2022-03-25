# PhoneNumberPortingApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postPortabilityCheck**](PhoneNumberPortingApi.md#postPortabilityCheck) | **POST** /portability_checks | Run a portability check



## postPortabilityCheck

> PortabilityCheckResponse postPortabilityCheck(createPortabilityCheckRequest)

Run a portability check

Runs a portability check, returning the results immediately.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberPortingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberPortingApi apiInstance = new PhoneNumberPortingApi(defaultClient);
        CreatePortabilityCheckRequest createPortabilityCheckRequest = new CreatePortabilityCheckRequest(); // CreatePortabilityCheckRequest | 
        try {
            PortabilityCheckResponse result = apiInstance.postPortabilityCheck(createPortabilityCheckRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberPortingApi#postPortabilityCheck");
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
 **createPortabilityCheckRequest** | [**CreatePortabilityCheckRequest**](CreatePortabilityCheckRequest.md)|  |

### Return type

[**PortabilityCheckResponse**](PortabilityCheckResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | PortabilityCheck Response |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |

