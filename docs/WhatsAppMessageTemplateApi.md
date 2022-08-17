# WhatsAppMessageTemplateApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWhatsappMessageTemplates**](WhatsAppMessageTemplateApi.md#createWhatsappMessageTemplates) | **POST** /whatsapp_business_accounts/{id}/whatsapp_message_templates | Create WhatsApp Message Templates
[**deleteWhatsappMessageTemplates**](WhatsAppMessageTemplateApi.md#deleteWhatsappMessageTemplates) | **DELETE** /whatsapp_business_accounts/{id}/whatsapp_message_templates/{name} | Delete WhatsApp Message Templates
[**listWhatsappMessageTemplates**](WhatsAppMessageTemplateApi.md#listWhatsappMessageTemplates) | **GET** /whatsapp_business_accounts/{id}/whatsapp_message_templates | List WhatsApp Message Templates



## createWhatsappMessageTemplates

> WhatsAppMessageTemplate1 createWhatsappMessageTemplates(id, createWhatsappMessageTemplateRequestBody)

Create WhatsApp Message Templates

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppMessageTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppMessageTemplateApi apiInstance = new WhatsAppMessageTemplateApi(defaultClient);
        UUID id = UUID.fromString("12ade33a-21c0-473b-b055-b3c836e1c292"); // UUID | Identifies the WhatsApp Business Account
        CreateWhatsappMessageTemplateRequestBody createWhatsappMessageTemplateRequestBody = new CreateWhatsappMessageTemplateRequestBody(); // CreateWhatsappMessageTemplateRequestBody | 
        try {
            WhatsAppMessageTemplate1 result = apiInstance.createWhatsappMessageTemplates(id, createWhatsappMessageTemplateRequestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppMessageTemplateApi#createWhatsappMessageTemplates");
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
 **id** | **UUID**| Identifies the WhatsApp Business Account |
 **createWhatsappMessageTemplateRequestBody** | [**CreateWhatsappMessageTemplateRequestBody**](CreateWhatsappMessageTemplateRequestBody.md)|  | [optional]

### Return type

[**WhatsAppMessageTemplate1**](WhatsAppMessageTemplate1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WhatsApp Message Template |  -  |
| **0** | Unexpected error |  -  |


## deleteWhatsappMessageTemplates

> deleteWhatsappMessageTemplates(id, name)

Delete WhatsApp Message Templates

Deletes all of the message templates with the given name and business account

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppMessageTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppMessageTemplateApi apiInstance = new WhatsAppMessageTemplateApi(defaultClient);
        UUID id = UUID.fromString("12ade33a-21c0-473b-b055-b3c836e1c292"); // UUID | Identifies the WhatsApp Business Account
        String name = "my_test_template2"; // String | The name of the Whatsapp Message Template
        try {
            apiInstance.deleteWhatsappMessageTemplates(id, name);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppMessageTemplateApi#deleteWhatsappMessageTemplates");
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
 **id** | **UUID**| Identifies the WhatsApp Business Account |
 **name** | **String**| The name of the Whatsapp Message Template |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | All message templates with the given name have been deleted |  -  |
| **0** | Unexpected error |  -  |


## listWhatsappMessageTemplates

> WhatsAppMessageTemplate listWhatsappMessageTemplates(id).category(category).language(language).name(name).qualityScore(qualityScore).rejectedReason(rejectedReason).limit(limit).before(before).after(after).status(status).execute();

List WhatsApp Message Templates

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppMessageTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppMessageTemplateApi apiInstance = new WhatsAppMessageTemplateApi(defaultClient);
        UUID id = UUID.fromString("12ade33a-21c0-473b-b055-b3c836e1c292"); // UUID | Identifies the WhatsApp Business Account
        String category = "ACCOUNT_UPDATE"; // String | The template category
        String language = "af"; // String | The language of the whatsapp message template
        String name = "name_example"; // String | A name identifying this whatsapp message template
        String qualityScore = "qualityScore_example"; // String | The score of the whatsapp message template
        String rejectedReason = "rejectedReason_example"; // String | The reason why a message template was rejected by Whatsapp
        String limit = "10"; // String | The maximum number of message_templates to be returned on a query, we may return less than the limit number even if more pages are available.
        String before = "QAVCEP"; // String | Indicates that this is a query for entries before the given cursor
        String after = "QAVCEP"; // String | Indicates that this is a query for entries after the given cursor
        String status = "APPROVED"; // String | Identifies the whatsApp Message Template status
        try {
            WhatsAppMessageTemplate result = api.listWhatsappMessageTemplates(id)
                .category(category)
                .language(language)
                .name(name)
                .qualityScore(qualityScore)
                .rejectedReason(rejectedReason)
                .limit(limit)
                .before(before)
                .after(after)
                .status(status)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppMessageTemplateApi#listWhatsappMessageTemplates");
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
 **id** | **UUID**| Identifies the WhatsApp Business Account |
 **category** | **String**| The template category | [optional] [enum: ACCOUNT_UPDATE, PAYMENT_UPDATE, PERSONAL_FINANCE_UPDATE, SHIPPING_UPDATE, RESERVATION_UPDATE, ISSUE_RESOLUTION, APPOINTMENT_UPDATE, TRANSPORTATION_UPDATE, TICKET_UPDATE, ALERT_UPDATE, AUTO_REPLY]
 **language** | **String**| The language of the whatsapp message template | [optional] [enum: af, sq, ar, az, bn, bg, ca, zh_CN, zh_HK, zh_TW, hr, cs, da, nl, en, en_GB, en_US, et, fil, fi, fr, ka, de, el, gu, ha, he, hi, hu, id, ga, it, ja, kn, kk, rw_RW, ko, ky_KG, lo, lv, lt, mk, ms, ml, mr, nb, fa, pl, pt_BR, pt_PT, pa, ro, ru, sr, sk, sl, es, es_AR, es_ES, es_MX, sw, sv, ta, te, th, tr, uk, ur, uz, vi, zu]
 **name** | **String**| A name identifying this whatsapp message template | [optional]
 **qualityScore** | **String**| The score of the whatsapp message template | [optional]
 **rejectedReason** | **String**| The reason why a message template was rejected by Whatsapp | [optional]
 **limit** | **String**| The maximum number of message_templates to be returned on a query, we may return less than the limit number even if more pages are available. | [optional]
 **before** | **String**| Indicates that this is a query for entries before the given cursor | [optional]
 **after** | **String**| Indicates that this is a query for entries after the given cursor | [optional]
 **status** | **String**| Identifies the whatsApp Message Template status | [optional]

### Return type

[**WhatsAppMessageTemplate**](WhatsAppMessageTemplate.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WhatsApp Message Template |  -  |
| **0** | Unexpected error |  -  |

