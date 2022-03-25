# WhatsAppBusinessAccountApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listWhatsappBusinessAccounts**](WhatsAppBusinessAccountApi.md#listWhatsappBusinessAccounts) | **GET** /whatsapp_business_accounts | Lists the WhatsApp Business Accounts owned by the current organization
[**retrieveWhatsappBusinessAccount**](WhatsAppBusinessAccountApi.md#retrieveWhatsappBusinessAccount) | **GET** /whatsapp_business_accounts/{id} | Retrieves a WhatsApp Business Account
[**retrieveWhatsappBusinessAccountPhoneNumbers**](WhatsAppBusinessAccountApi.md#retrieveWhatsappBusinessAccountPhoneNumbers) | **GET** /whatsapp_business_accounts/{id}/phone_numbers | Retrieves the phone numbers from a WhatsApp Business Account



## listWhatsappBusinessAccounts

> ListWhatsAppBusinessAccountsResponse listWhatsappBusinessAccounts().pageNumber(pageNumber).pageSize(pageSize).execute();

Lists the WhatsApp Business Accounts owned by the current organization

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppBusinessAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppBusinessAccountApi apiInstance = new WhatsAppBusinessAccountApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListWhatsAppBusinessAccountsResponse result = api.listWhatsappBusinessAccounts()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppBusinessAccountApi#listWhatsappBusinessAccounts");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListWhatsAppBusinessAccountsResponse**](ListWhatsAppBusinessAccountsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of WhatsApp Business Accounts. |  -  |
| **0** | Unexpected error |  -  |


## retrieveWhatsappBusinessAccount

> RetrieveWhatsAppBusinessAccount retrieveWhatsappBusinessAccount(id).execute();

Retrieves a WhatsApp Business Account

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppBusinessAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppBusinessAccountApi apiInstance = new WhatsAppBusinessAccountApi(defaultClient);
        String id = "id_example"; // String | Identifies the WhatsApp Business Account
        try {
            RetrieveWhatsAppBusinessAccount result = api.retrieveWhatsappBusinessAccount(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppBusinessAccountApi#retrieveWhatsappBusinessAccount");
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
 **id** | **String**| Identifies the WhatsApp Business Account |

### Return type

[**RetrieveWhatsAppBusinessAccount**](RetrieveWhatsAppBusinessAccount.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WhatsApp Business Account details |  -  |
| **0** | Unexpected error |  -  |


## retrieveWhatsappBusinessAccountPhoneNumbers

> ListWhatsAppPhoneNumbersResponse retrieveWhatsappBusinessAccountPhoneNumbers(id).execute();

Retrieves the phone numbers from a WhatsApp Business Account

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppBusinessAccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppBusinessAccountApi apiInstance = new WhatsAppBusinessAccountApi(defaultClient);
        String id = "id_example"; // String | Identifies the WhatsApp Business Account
        try {
            ListWhatsAppPhoneNumbersResponse result = api.retrieveWhatsappBusinessAccountPhoneNumbers(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppBusinessAccountApi#retrieveWhatsappBusinessAccountPhoneNumbers");
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
 **id** | **String**| Identifies the WhatsApp Business Account |

### Return type

[**ListWhatsAppPhoneNumbersResponse**](ListWhatsAppPhoneNumbersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of WhatsApp Phone Numbers. |  -  |
| **0** | Unexpected error |  -  |

