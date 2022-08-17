# WhatsAppPhoneNumberApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**patchWhatsappPhoneNumber**](WhatsAppPhoneNumberApi.md#patchWhatsappPhoneNumber) | **PATCH** /whatsapp_phone_numbers/{id} | Update a WhatsApp Phone Number webhook
[**patchWhatsappPhoneNumberAbout**](WhatsAppPhoneNumberApi.md#patchWhatsappPhoneNumberAbout) | **PATCH** /whatsapp_phone_numbers/{id}/about | Update a WhatsApp Phone Number about text
[**patchWhatsappProfilePhoto**](WhatsAppPhoneNumberApi.md#patchWhatsappProfilePhoto) | **PATCH** /whatsapp_phone_numbers/{id}/photo | Update the Whatsapp Profile Photo for a given Whatsapp Phone Number
[**retrieveWhatsappPhoneNumber**](WhatsAppPhoneNumberApi.md#retrieveWhatsappPhoneNumber) | **GET** /whatsapp_phone_numbers/{id} | Retrieves a WhatsApp Phone Number
[**retrieveWhatsappProfilePhoto**](WhatsAppPhoneNumberApi.md#retrieveWhatsappProfilePhoto) | **GET** /whatsapp_phone_numbers/{id}/photo | Retrieves a Whatsapp Profile Photo for a WhatsApp Phone Number



## patchWhatsappPhoneNumber

> WhatsAppPhoneNumber patchWhatsappPhoneNumber(id).updateWhatsappPhoneNumberRequest(updateWhatsappPhoneNumberRequest).execute();

Update a WhatsApp Phone Number webhook

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppPhoneNumberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppPhoneNumberApi apiInstance = new WhatsAppPhoneNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the WhatsApp Phone Number
        UpdateWhatsappPhoneNumberRequest updateWhatsappPhoneNumberRequest = new UpdateWhatsappPhoneNumberRequest(); // UpdateWhatsappPhoneNumberRequest | 
        try {
            WhatsAppPhoneNumber result = api.patchWhatsappPhoneNumber(id)
                .updateWhatsappPhoneNumberRequest(updateWhatsappPhoneNumberRequest)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppPhoneNumberApi#patchWhatsappPhoneNumber");
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
 **id** | **String**| Identifies the WhatsApp Phone Number |
 **updateWhatsappPhoneNumberRequest** | [**UpdateWhatsappPhoneNumberRequest**](UpdateWhatsappPhoneNumberRequest.md)|  |

### Return type

[**WhatsAppPhoneNumber**](WhatsAppPhoneNumber.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated WhatsApp Phone Number details |  -  |
| **0** | Unexpected error |  -  |


## patchWhatsappPhoneNumberAbout

> patchWhatsappPhoneNumberAbout(id).updateWhatsappPhoneNumberAboutRequest(updateWhatsappPhoneNumberAboutRequest).execute();

Update a WhatsApp Phone Number about text

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppPhoneNumberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppPhoneNumberApi apiInstance = new WhatsAppPhoneNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the WhatsApp Phone Number
        UpdateWhatsappPhoneNumberAboutRequest updateWhatsappPhoneNumberAboutRequest = new UpdateWhatsappPhoneNumberAboutRequest(); // UpdateWhatsappPhoneNumberAboutRequest | 
        try {
            api.patchWhatsappPhoneNumberAbout(id)
                .updateWhatsappPhoneNumberAboutRequest(updateWhatsappPhoneNumberAboutRequest)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppPhoneNumberApi#patchWhatsappPhoneNumberAbout");
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
 **id** | **String**| Identifies the WhatsApp Phone Number |
 **updateWhatsappPhoneNumberAboutRequest** | [**UpdateWhatsappPhoneNumberAboutRequest**](UpdateWhatsappPhoneNumberAboutRequest.md)|  |

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
| **200** | Updated WhatsApp Phone Number about text |  -  |
| **0** | Unexpected error |  -  |


## patchWhatsappProfilePhoto

> WhatsAppProfilePhoto patchWhatsappProfilePhoto(id).photo(photo).execute();

Update the Whatsapp Profile Photo for a given Whatsapp Phone Number

### Example

```java
import java.io.File;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppPhoneNumberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppPhoneNumberApi apiInstance = new WhatsAppPhoneNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the WhatsApp Phone Number
        File photo = new File("/path/to/file"); // File | Must be an image with exactly 640x640px dimensions.
        try {
            WhatsAppProfilePhoto result = api.patchWhatsappProfilePhoto(id)
                .photo(photo)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppPhoneNumberApi#patchWhatsappProfilePhoto");
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
 **id** | **String**| Identifies the WhatsApp Phone Number |
 **photo** | **File**| Must be an image with exactly 640x640px dimensions. |

### Return type

[**WhatsAppProfilePhoto**](WhatsAppProfilePhoto.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WhatsApp Profile Photo |  -  |
| **0** | Unexpected error |  -  |


## retrieveWhatsappPhoneNumber

> WhatsAppPhoneNumber retrieveWhatsappPhoneNumber(id).execute();

Retrieves a WhatsApp Phone Number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppPhoneNumberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppPhoneNumberApi apiInstance = new WhatsAppPhoneNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the WhatsApp Phone Number
        try {
            WhatsAppPhoneNumber result = api.retrieveWhatsappPhoneNumber(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppPhoneNumberApi#retrieveWhatsappPhoneNumber");
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
 **id** | **String**| Identifies the WhatsApp Phone Number |

### Return type

[**WhatsAppPhoneNumber**](WhatsAppPhoneNumber.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WhatsApp Phone Number details |  -  |
| **0** | Unexpected error |  -  |


## retrieveWhatsappProfilePhoto

> WhatsAppProfilePhoto retrieveWhatsappProfilePhoto(id).execute();

Retrieves a Whatsapp Profile Photo for a WhatsApp Phone Number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppPhoneNumberApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppPhoneNumberApi apiInstance = new WhatsAppPhoneNumberApi(defaultClient);
        String id = "id_example"; // String | Identifies the WhatsApp Phone Number
        try {
            WhatsAppProfilePhoto result = api.retrieveWhatsappProfilePhoto(id)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppPhoneNumberApi#retrieveWhatsappProfilePhoto");
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
 **id** | **String**| Identifies the WhatsApp Phone Number |

### Return type

[**WhatsAppProfilePhoto**](WhatsAppProfilePhoto.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | WhatsApp Profile Photo |  -  |
| **0** | Unexpected error |  -  |

