# ShortCodesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listShortCodes**](ShortCodesApi.md#listShortCodes) | **GET** /short_codes | List short codes
[**retrieveShortCode**](ShortCodesApi.md#retrieveShortCode) | **GET** /short_codes/{id} | Retrieve a short code
[**updateShortCode**](ShortCodesApi.md#updateShortCode) | **PATCH** /short_codes/{id} | Update short code


<a name="listShortCodes"></a>
# **listShortCodes**
> ListShortCodesResponse listShortCodes().pageNumber(pageNumber).pageSize(pageSize).filterMessagingProfileId(filterMessagingProfileId).execute();

List short codes

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ShortCodesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShortCodesApi apiInstance = new ShortCodesApi(defaultClient);
    Integer pageNumber = 1; // Integer | The page number to load
    Integer pageSize = 20; // Integer | The size of the page
    String filterMessagingProfileId = "filterMessagingProfileId_example"; // String | Filter by Messaging Profile ID. Use the string `null` for phone numbers without assigned profiles. A synonym for the `/messaging_profiles/{id}/short_codes` endpoint when querying about an extant profile.
    try {
      ListShortCodesResponse result = apiInstance.listShortCodes()
            .pageNumber(pageNumber)
            .pageSize(pageSize)
            .filterMessagingProfileId(filterMessagingProfileId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShortCodesApi#listShortCodes");
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
 **filterMessagingProfileId** | **String**| Filter by Messaging Profile ID. Use the string &#x60;null&#x60; for phone numbers without assigned profiles. A synonym for the &#x60;/messaging_profiles/{id}/short_codes&#x60; endpoint when querying about an extant profile. | [optional]

### Return type

[**ListShortCodesResponse**](ListShortCodesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with a list of short codes. |  -  |
**0** | Unexpected error |  -  |

<a name="retrieveShortCode"></a>
# **retrieveShortCode**
> ShortCodeResponse retrieveShortCode(id).execute();

Retrieve a short code

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ShortCodesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShortCodesApi apiInstance = new ShortCodesApi(defaultClient);
    UUID id = new UUID(); // UUID | The id of the short code
    try {
      ShortCodeResponse result = apiInstance.retrieveShortCode(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShortCodesApi#retrieveShortCode");
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
 **id** | [**UUID**](.md)| The id of the short code |

### Return type

[**ShortCodeResponse**](ShortCodeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a short code. |  -  |
**0** | Unexpected error |  -  |

<a name="updateShortCode"></a>
# **updateShortCode**
> ShortCodeResponse updateShortCode(id, updateShortCodeRequest).execute();

Update short code

Update the settings for a specific short code. To unbind a short code from a profile, set the &#x60;messaging_profile_id&#x60; to &#x60;null&#x60; or an empty string.

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.ShortCodesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ShortCodesApi apiInstance = new ShortCodesApi(defaultClient);
    UUID id = new UUID(); // UUID | The id of the short code
    UpdateShortCodeRequest updateShortCodeRequest = new UpdateShortCodeRequest(); // UpdateShortCodeRequest | Short code update
    try {
      ShortCodeResponse result = apiInstance.updateShortCode(id, updateShortCodeRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShortCodesApi#updateShortCode");
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
 **id** | [**UUID**](.md)| The id of the short code |
 **updateShortCodeRequest** | [**UpdateShortCodeRequest**](UpdateShortCodeRequest.md)| Short code update |

### Return type

[**ShortCodeResponse**](ShortCodeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a short code. |  -  |
**0** | Unexpected error |  -  |

