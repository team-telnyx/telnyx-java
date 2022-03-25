# RegisterCallApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerCall**](RegisterCallApi.md#registerCall) | **POST** /calls/register | Register the call for Google Verified Calls



## registerCall

> RegisterCallResponse registerCall(registerCallRequest)

Register the call for Google Verified Calls

Register the call before dialing to show your brand on callee's phone.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RegisterCallApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RegisterCallApi apiInstance = new RegisterCallApi(defaultClient);
        RegisterCallRequest registerCallRequest = new RegisterCallRequest(); // RegisterCallRequest | Register call request
        try {
            RegisterCallResponse result = apiInstance.registerCall(registerCallRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegisterCallApi#registerCall");
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
 **registerCallRequest** | [**RegisterCallRequest**](RegisterCallRequest.md)| Register call request |

### Return type

[**RegisterCallResponse**](RegisterCallResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon making a register call command. |  -  |
| **0** | Unexpected error |  -  |

