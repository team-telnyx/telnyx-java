# RcsMessagingApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messsagesRcsPost**](RcsMessagingApi.md#messsagesRcsPost) | **POST** /messsages/rcs | Send an RCS message



## messsagesRcsPost

> RCSResponse messsagesRcsPost(rcSMessage)

Send an RCS message

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.RcsMessagingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        RcsMessagingApi apiInstance = new RcsMessagingApi(defaultClient);
        RCSMessage rcSMessage = new RCSMessage(); // RCSMessage | RCS message body
        try {
            RCSResponse result = apiInstance.messsagesRcsPost(rcSMessage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RcsMessagingApi#messsagesRcsPost");
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
 **rcSMessage** | [**RCSMessage**](RCSMessage.md)| RCS message body |

### Return type

[**RCSResponse**](RCSResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **0** | Unexpected error |  -  |

