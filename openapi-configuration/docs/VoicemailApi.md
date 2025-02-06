# VoicemailApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVoicemail**](VoicemailApi.md#createVoicemail) | **POST** /phone_numbers/{phone_number_id}/voicemail | Create voicemail
[**getVoicemail**](VoicemailApi.md#getVoicemail) | **GET** /phone_numbers/{phone_number_id}/voicemail | Get voicemail
[**updateVoicemail**](VoicemailApi.md#updateVoicemail) | **PATCH** /phone_numbers/{phone_number_id}/voicemail | Update voicemail



## createVoicemail

> GetVoicemail200Response createVoicemail(phoneNumberId, voicemailRequest)

Create voicemail

Create voicemail settings for a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VoicemailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VoicemailApi apiInstance = new VoicemailApi(defaultClient);
        String phoneNumberId = "123455678900"; // String | The ID of the phone number.
        VoicemailRequest voicemailRequest = new VoicemailRequest(); // VoicemailRequest | Details to create
        try {
            GetVoicemail200Response result = apiInstance.createVoicemail(phoneNumberId, voicemailRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VoicemailApi#createVoicemail");
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
 **phoneNumberId** | **String**| The ID of the phone number. |
 **voicemailRequest** | [**VoicemailRequest**](VoicemailRequest.md)| Details to create |

### Return type

[**GetVoicemail200Response**](GetVoicemail200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## getVoicemail

> GetVoicemail200Response getVoicemail(phoneNumberId)

Get voicemail

Returns the voicemail settings for a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VoicemailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VoicemailApi apiInstance = new VoicemailApi(defaultClient);
        String phoneNumberId = "123455678900"; // String | The ID of the phone number.
        try {
            GetVoicemail200Response result = apiInstance.getVoicemail(phoneNumberId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VoicemailApi#getVoicemail");
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
 **phoneNumberId** | **String**| The ID of the phone number. |

### Return type

[**GetVoicemail200Response**](GetVoicemail200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## updateVoicemail

> GetVoicemail200Response updateVoicemail(phoneNumberId, voicemailRequest)

Update voicemail

Update voicemail settings for a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.VoicemailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VoicemailApi apiInstance = new VoicemailApi(defaultClient);
        String phoneNumberId = "123455678900"; // String | The ID of the phone number.
        VoicemailRequest voicemailRequest = new VoicemailRequest(); // VoicemailRequest | Details to update
        try {
            GetVoicemail200Response result = apiInstance.updateVoicemail(phoneNumberId, voicemailRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VoicemailApi#updateVoicemail");
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
 **phoneNumberId** | **String**| The ID of the phone number. |
 **voicemailRequest** | [**VoicemailRequest**](VoicemailRequest.md)| Details to update |

### Return type

[**GetVoicemail200Response**](GetVoicemail200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |

