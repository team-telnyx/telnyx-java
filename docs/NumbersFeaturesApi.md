# NumbersFeaturesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postNumbersFeatures**](NumbersFeaturesApi.md#postNumbersFeatures) | **POST** /numbers_features | Retrieve the features for a list of numbers



## postNumbersFeatures

> PostNumbersFeatures200Response postNumbersFeatures(postNumbersFeaturesRequest)

Retrieve the features for a list of numbers

Retrieve the features for a list of numbers

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumbersFeaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumbersFeaturesApi apiInstance = new NumbersFeaturesApi(defaultClient);
        PostNumbersFeaturesRequest postNumbersFeaturesRequest = new PostNumbersFeaturesRequest(); // PostNumbersFeaturesRequest | 
        try {
            PostNumbersFeatures200Response result = apiInstance.postNumbersFeatures(postNumbersFeaturesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumbersFeaturesApi#postNumbersFeatures");
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
 **postNumbersFeaturesRequest** | [**PostNumbersFeaturesRequest**](PostNumbersFeaturesRequest.md)|  |

### Return type

[**PostNumbersFeatures200Response**](PostNumbersFeatures200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

