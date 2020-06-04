# ShortCodesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listShortCodes**](ShortCodesApi.md#listShortCodes) | **GET** /short_codes | List all short codes
[**retrieveShortCode**](ShortCodesApi.md#retrieveShortCode) | **GET** /short_codes/{id} | Retrieve a short code
[**updateShortCode**](ShortCodesApi.md#updateShortCode) | **PATCH** /short_codes/{id} | Update short code

<a name="listShortCodes"></a>
# **listShortCodes**
> ListShortCodesResponse listShortCodes(pageNumber, pageSize, filterMessagingProfileId)

List all short codes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShortCodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ShortCodesApi apiInstance = new ShortCodesApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterMessagingProfileId = "filterMessagingProfileId_example"; // String | Filter by Messaging Profile ID. Use the string `null` for phone numbers without assigned profiles. A synonym for the `/messaging_profiles/{id}/short_codes` endpoint when querying about an extant profile.
try {
    ListShortCodesResponse result = apiInstance.listShortCodes(pageNumber, pageSize, filterMessagingProfileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortCodesApi#listShortCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterMessagingProfileId** | **String**| Filter by Messaging Profile ID. Use the string &#x60;null&#x60; for phone numbers without assigned profiles. A synonym for the &#x60;/messaging_profiles/{id}/short_codes&#x60; endpoint when querying about an extant profile. | [optional]

### Return type

[**ListShortCodesResponse**](ListShortCodesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveShortCode"></a>
# **retrieveShortCode**
> RetrieveShortCodeResponse retrieveShortCode(id)

Retrieve a short code

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShortCodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ShortCodesApi apiInstance = new ShortCodesApi();
UUID id = new UUID(); // UUID | The id of the short code
try {
    RetrieveShortCodeResponse result = apiInstance.retrieveShortCode(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortCodesApi#retrieveShortCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The id of the short code |

### Return type

[**RetrieveShortCodeResponse**](RetrieveShortCodeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateShortCode"></a>
# **updateShortCode**
> UpdateShortCodeResponse updateShortCode(body, id)

Update short code

Update the settings for a specific short code. To unbind a short code from a profile, set the &#x60;messaging_profile_id&#x60; to &#x60;null&#x60; or an empty string.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShortCodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ShortCodesApi apiInstance = new ShortCodesApi();
ShortCodeUpdate body = new ShortCodeUpdate(); // ShortCodeUpdate | Short code update
UUID id = new UUID(); // UUID | The id of the short code
try {
    UpdateShortCodeResponse result = apiInstance.updateShortCode(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortCodesApi#updateShortCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ShortCodeUpdate**](ShortCodeUpdate.md)| Short code update |
 **id** | [**UUID**](.md)| The id of the short code |

### Return type

[**UpdateShortCodeResponse**](UpdateShortCodeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

