# TeXmlRestCommandsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateTeXMLCall**](TeXmlRestCommandsApi.md#updateTeXMLCall) | **POST** /texml/{call_sid}/update | Update call



## updateTeXMLCall

> TeXmlRESTCommandResponse updateTeXMLCall(callSid).updateCallRequest(updateCallRequest).execute();

Update call

Update TeXml call

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.TeXmlRestCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TeXmlRestCommandsApi apiInstance = new TeXmlRestCommandsApi(defaultClient);
        String callSid = "callSid_example"; // String | The CallSid that identifies the call to update.
        UpdateCallRequest updateCallRequest = new UpdateCallRequest(); // UpdateCallRequest | Update Call request object
        try {
            TeXmlRESTCommandResponse result = api.updateTeXMLCall(callSid)
                .updateCallRequest(updateCallRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeXmlRestCommandsApi#updateTeXMLCall");
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
 **callSid** | **String**| The CallSid that identifies the call to update. |
 **updateCallRequest** | [**UpdateCallRequest**](UpdateCallRequest.md)| Update Call request object |

### Return type

[**TeXmlRESTCommandResponse**](TeXmlRESTCommandResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response upon updating a TeXml call. |  -  |

