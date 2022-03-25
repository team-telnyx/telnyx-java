# WhatsAppMediaApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMedia**](WhatsAppMediaApi.md#deleteMedia) | **DELETE** /whatsapp_media/{whatsapp_user_id}/{media_id} | Delete Media
[**downloadMedia**](WhatsAppMediaApi.md#downloadMedia) | **GET** /whatsapp_media/{whatsapp_user_id}/{media_id} | Download Media
[**uploadMedia**](WhatsAppMediaApi.md#uploadMedia) | **POST** /whatsapp_media | Upload Media



## deleteMedia

> deleteMedia(whatsappUserId, mediaId)

Delete Media

Delete uploaded media.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppMediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppMediaApi apiInstance = new WhatsAppMediaApi(defaultClient);
        String whatsappUserId = "whatsappUserId_example"; // String | User's WhatsApp ID
        String mediaId = "mediaId_example"; // String | WhatsApp's Media ID
        try {
            apiInstance.deleteMedia(whatsappUserId, mediaId);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppMediaApi#deleteMedia");
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
 **whatsappUserId** | **String**| User&#39;s WhatsApp ID |
 **mediaId** | **String**| WhatsApp&#39;s Media ID |

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
| **204** | Request successful, empty response body. |  -  |
| **0** | Unexpected error |  -  |


## downloadMedia

> File downloadMedia(whatsappUserId, mediaId)

Download Media

Retrieve uploaded media. Media is typically available for 30 days after uploading.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppMediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppMediaApi apiInstance = new WhatsAppMediaApi(defaultClient);
        String whatsappUserId = "whatsappUserId_example"; // String | User's WhatsApp ID
        String mediaId = "mediaId_example"; // String | WhatsApp's Media ID
        try {
            File result = apiInstance.downloadMedia(whatsappUserId, mediaId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppMediaApi#downloadMedia");
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
 **whatsappUserId** | **String**| User&#39;s WhatsApp ID |
 **mediaId** | **String**| WhatsApp&#39;s Media ID |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: *, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## uploadMedia

> UploadMedia uploadMedia(whatsappUserId, mediaContentType, uploadFile)

Upload Media

Upload media. Accepted media types include image/jpeg, image/png, video/mp4, video/3gpp, audio/aac, audio/ogg.

### Example

```java
import java.io.File;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppMediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppMediaApi apiInstance = new WhatsAppMediaApi(defaultClient);
        String whatsappUserId = "whatsappUserId_example"; // String | The user's WhatsApp ID.
        String mediaContentType = "mediaContentType_example"; // String | The content-type of the uplaoded media.
        File uploadFile = new File("/path/to/file"); // File | The media to store with WhatsApp.
        try {
            UploadMedia result = apiInstance.uploadMedia(whatsappUserId, mediaContentType, uploadFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppMediaApi#uploadMedia");
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
 **whatsappUserId** | **String**| The user&#39;s WhatsApp ID. |
 **mediaContentType** | **String**| The content-type of the uplaoded media. |
 **uploadFile** | **File**| The media to store with WhatsApp. |

### Return type

[**UploadMedia**](UploadMedia.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |

