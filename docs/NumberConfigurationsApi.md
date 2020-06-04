# NumberConfigurationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listPhoneNumberMessagingSettings**](NumberConfigurationsApi.md#listPhoneNumberMessagingSettings) | **GET** /phone_numbers/messaging | List all phone numbers&#x27; messaging settings
[**retrievePhoneNumberMessagingSettings**](NumberConfigurationsApi.md#retrievePhoneNumberMessagingSettings) | **GET** /phone_numbers/{id}/messaging | Retrieve the messaging settings for a phone number
[**updatePhoneNumberMessagingSettings**](NumberConfigurationsApi.md#updatePhoneNumberMessagingSettings) | **PATCH** /phone_numbers/{id}/messaging | Update the messaging settings for a phone number

<a name="listPhoneNumberMessagingSettings"></a>
# **listPhoneNumberMessagingSettings**
> ListMessagingSettingsResponse listPhoneNumberMessagingSettings()

List all phone numbers&#x27; messaging settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
try {
    ListMessagingSettingsResponse result = apiInstance.listPhoneNumberMessagingSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumberMessagingSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListMessagingSettingsResponse**](ListMessagingSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrievePhoneNumberMessagingSettings"></a>
# **retrievePhoneNumberMessagingSettings**
> RetrieveMessagingSettingsResponse retrievePhoneNumberMessagingSettings(id)

Retrieve the messaging settings for a phone number

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
String id = "id_example"; // String | Identifies the type of resource.
try {
    RetrieveMessagingSettingsResponse result = apiInstance.retrievePhoneNumberMessagingSettings(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberMessagingSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the type of resource. |

### Return type

[**RetrieveMessagingSettingsResponse**](RetrieveMessagingSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePhoneNumberMessagingSettings"></a>
# **updatePhoneNumberMessagingSettings**
> RetrieveMessagingSettingsResponse updatePhoneNumberMessagingSettings(body, id)

Update the messaging settings for a phone number

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
MessagingPhoneNumberUpdate body = new MessagingPhoneNumberUpdate(); // MessagingPhoneNumberUpdate | Updated messaging settings for the phone number
String id = "id_example"; // String | Identifies the type of resource.
try {
    RetrieveMessagingSettingsResponse result = apiInstance.updatePhoneNumberMessagingSettings(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberMessagingSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MessagingPhoneNumberUpdate**](MessagingPhoneNumberUpdate.md)| Updated messaging settings for the phone number |
 **id** | **String**| Identifies the type of resource. |

### Return type

[**RetrieveMessagingSettingsResponse**](RetrieveMessagingSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

