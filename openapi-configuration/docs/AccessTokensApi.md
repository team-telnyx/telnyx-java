# AccessTokensApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTelephonyCredentialToken**](AccessTokensApi.md#createTelephonyCredentialToken) | **POST** /telephony_credentials/{id}/token | Create an Access Token.



## createTelephonyCredentialToken

> String createTelephonyCredentialToken(id)

Create an Access Token.

Create an Access Token (JWT) for the credential.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AccessTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AccessTokensApi apiInstance = new AccessTokensApi(defaultClient);
        String id = "id_example"; // String | Identifies the resource.
        try {
            String result = apiInstance.createTelephonyCredentialToken(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessTokensApi#createTelephonyCredentialToken");
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
 **id** | **String**| Identifies the resource. |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | JWT |  -  |
| **404** | Resource not Found |  -  |

