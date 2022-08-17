# WhatsAppMessagesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**markMessageAsRead**](WhatsAppMessagesApi.md#markMessageAsRead) | **PATCH** /whatsapp_messages/{message_id} | Mark Message As Read
[**sendMessage**](WhatsAppMessagesApi.md#sendMessage) | **POST** /whatsapp_messages | Send Message



## markMessageAsRead

> markMessageAsRead(messageId, markMessageAsReadRequestBody)

Mark Message As Read

Mark a message as read.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppMessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppMessagesApi apiInstance = new WhatsAppMessagesApi(defaultClient);
        String messageId = "messageId_example"; // String | Message ID from Webhook
        MarkMessageAsReadRequestBody markMessageAsReadRequestBody = new MarkMessageAsReadRequestBody(); // MarkMessageAsReadRequestBody | 
        try {
            apiInstance.markMessageAsRead(messageId, markMessageAsReadRequestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppMessagesApi#markMessageAsRead");
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
 **messageId** | **String**| Message ID from Webhook |
 **markMessageAsReadRequestBody** | [**MarkMessageAsReadRequestBody**](MarkMessageAsReadRequestBody.md)|  |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request successful, empty response body. |  -  |
| **0** | Unexpected error |  -  |


## sendMessage

> SuccessfulResponseWithDetailsAboutTheWhatsAppMessageSent sendMessage(createWhatsAppMessageRequest)

Send Message

Send text messages, media/documents, and message templates to your customers.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppMessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppMessagesApi apiInstance = new WhatsAppMessagesApi(defaultClient);
        CreateWhatsAppMessageRequest createWhatsAppMessageRequest = new CreateWhatsAppMessageRequest(); // CreateWhatsAppMessageRequest | 
        try {
            SuccessfulResponseWithDetailsAboutTheWhatsAppMessageSent result = apiInstance.sendMessage(createWhatsAppMessageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppMessagesApi#sendMessage");
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
 **createWhatsAppMessageRequest** | [**CreateWhatsAppMessageRequest**](CreateWhatsAppMessageRequest.md)|  |

### Return type

[**SuccessfulResponseWithDetailsAboutTheWhatsAppMessageSent**](SuccessfulResponseWithDetailsAboutTheWhatsAppMessageSent.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |

