# WhatsAppContactsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkContact**](WhatsAppContactsApi.md#checkContact) | **POST** /whatsapp_contacts | Check Contact



## checkContact

> CheckContactResponse checkContact(checkContactRequestBody)

Check Contact

Verify that a phone number belongs to a valid WhatsApp account. You must ensure that the status is valid before you can message a user, and you'll get their WhatsApp ID to use for messaging.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppContactsApi apiInstance = new WhatsAppContactsApi(defaultClient);
        CheckContactRequestBody checkContactRequestBody = new CheckContactRequestBody(); // CheckContactRequestBody | 
        try {
            CheckContactResponse result = apiInstance.checkContact(checkContactRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppContactsApi#checkContact");
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
 **checkContactRequestBody** | [**CheckContactRequestBody**](CheckContactRequestBody.md)|  |

### Return type

[**CheckContactResponse**](CheckContactResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about WhatsApp contact(s). |  -  |
| **0** | Unexpected error |  -  |

