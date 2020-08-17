# NumberConfigurationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePhoneNumber**](NumberConfigurationsApi.md#deletePhoneNumber) | **DELETE** /phone_numbers/{id} | Delete a phone number
[**enableEmergencyPhoneNumber**](NumberConfigurationsApi.md#enableEmergencyPhoneNumber) | **POST** /phone_numbers/{id}/actions/enable_emergency | Enable emergency for a phone number
[**findPhoneNumberVoices**](NumberConfigurationsApi.md#findPhoneNumberVoices) | **GET** /phone_numbers/voice | List voice settings for multiple phone numbers
[**findPhoneNumbers**](NumberConfigurationsApi.md#findPhoneNumbers) | **GET** /phone_numbers | List all phone numbers
[**getPhoneNumber**](NumberConfigurationsApi.md#getPhoneNumber) | **GET** /phone_numbers/{id} | Get the settings for a phone number
[**listPhoneNumberMessagingSettings**](NumberConfigurationsApi.md#listPhoneNumberMessagingSettings) | **GET** /phone_numbers/messaging | List all phone numbers&#x27; messaging settings
[**retrievePhoneNumberMessagingSettings**](NumberConfigurationsApi.md#retrievePhoneNumberMessagingSettings) | **GET** /phone_numbers/{id}/messaging | Retrieve the messaging settings for a phone number
[**retrievePhoneNumberVoice**](NumberConfigurationsApi.md#retrievePhoneNumberVoice) | **GET** /phone_numbers/{id}/voice | Get the voice settings for a phone number
[**updatePhoneNumber**](NumberConfigurationsApi.md#updatePhoneNumber) | **PATCH** /phone_numbers/{id} | Update the settings for a phone number
[**updatePhoneNumberMessagingSettings**](NumberConfigurationsApi.md#updatePhoneNumberMessagingSettings) | **PATCH** /phone_numbers/{id}/messaging | Update the messaging settings for a phone number
[**updatePhoneNumberVoice**](NumberConfigurationsApi.md#updatePhoneNumberVoice) | **PATCH** /phone_numbers/{id}/voice | Update the voice settings for a phone number

<a name="deletePhoneNumber"></a>
# **deletePhoneNumber**
> DeletePhoneNumberResponse deletePhoneNumber(id)

Delete a phone number

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
String id = "id_example"; // String | Identifies the resource.
try {
    DeletePhoneNumberResponse result = apiInstance.deletePhoneNumber(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#deletePhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the resource. |

### Return type

[**DeletePhoneNumberResponse**](DeletePhoneNumberResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enableEmergencyPhoneNumber"></a>
# **enableEmergencyPhoneNumber**
> PhoneNumberEnableEmergency enableEmergencyPhoneNumber(body, id)

Enable emergency for a phone number

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
PhoneNumberEnableEmergency body = new PhoneNumberEnableEmergency(); // PhoneNumberEnableEmergency | 
String id = "id_example"; // String | Identifies the resource.
try {
    PhoneNumberEnableEmergency result = apiInstance.enableEmergencyPhoneNumber(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#enableEmergencyPhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PhoneNumberEnableEmergency**](PhoneNumberEnableEmergency.md)|  |
 **id** | **String**| Identifies the resource. |

### Return type

[**PhoneNumberEnableEmergency**](PhoneNumberEnableEmergency.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findPhoneNumberVoices"></a>
# **findPhoneNumberVoices**
> ListPhoneNumberVoicesResponse findPhoneNumberVoices(pageNumber, pageSize, filterPhoneNumber, filterConnectionNameContains, filterUsagePaymentMethod, sort)

List voice settings for multiple phone numbers

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
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
String filterConnectionNameContains = "filterConnectionNameContains_example"; // String | Filter contains connection name. Requires at least three characters
String filterUsagePaymentMethod = "filterUsagePaymentMethod_example"; // String | Filter by usage_payment_method.
String sort = "sort_example"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order
try {
    ListPhoneNumberVoicesResponse result = apiInstance.findPhoneNumberVoices(pageNumber, pageSize, filterPhoneNumber, filterConnectionNameContains, filterUsagePaymentMethod, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#findPhoneNumberVoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterPhoneNumber** | **String**| Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterConnectionNameContains** | **String**| Filter contains connection name. Requires at least three characters | [optional]
 **filterUsagePaymentMethod** | **String**| Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order | [optional] [enum: purchased_at, phone_number, connection_name, usage_payment_method]

### Return type

[**ListPhoneNumberVoicesResponse**](ListPhoneNumberVoicesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPhoneNumbers"></a>
# **findPhoneNumbers**
> ListPhoneNumbersResponse findPhoneNumbers(pageNumber, pageSize, filterTag, filterPhoneNumber, filterStatus, filterVoiceConnectionNameContains, filterVoiceConnectionNameStartsWith, filterVoiceConnectionNameEndsWith, filterVoiceConnectionNameEq, filterUsagePaymentMethod, filterBillingGroupId, sort)

List all phone numbers

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
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterTag = "filterTag_example"; // String | Filter by phone number tags
String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
String filterStatus = "filterStatus_example"; // String | Filter by phone number status
String filterVoiceConnectionNameContains = "filterVoiceConnectionNameContains_example"; // String | Filter contains connection name. Requires at least three characters
String filterVoiceConnectionNameStartsWith = "filterVoiceConnectionNameStartsWith_example"; // String | Filter starts with connection name. Requires at least three characters
String filterVoiceConnectionNameEndsWith = "filterVoiceConnectionNameEndsWith_example"; // String | Filter ends with connection name. Requires at least three characters
String filterVoiceConnectionNameEq = "filterVoiceConnectionNameEq_example"; // String | Filter by connection name
String filterUsagePaymentMethod = "filterUsagePaymentMethod_example"; // String | Filter by usage_payment_method.
String filterBillingGroupId = "filterBillingGroupId_example"; // String | Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string 'null'.
String sort = "sort_example"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order
try {
    ListPhoneNumbersResponse result = apiInstance.findPhoneNumbers(pageNumber, pageSize, filterTag, filterPhoneNumber, filterStatus, filterVoiceConnectionNameContains, filterVoiceConnectionNameStartsWith, filterVoiceConnectionNameEndsWith, filterVoiceConnectionNameEq, filterUsagePaymentMethod, filterBillingGroupId, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#findPhoneNumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterTag** | **String**| Filter by phone number tags | [optional]
 **filterPhoneNumber** | **String**| Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterStatus** | **String**| Filter by phone number status | [optional] [enum: purchase_pending, purchase_failed, port_pending, active, deleted, port_failed, emergency_only, ported_out, port_out_pending]
 **filterVoiceConnectionNameContains** | **String**| Filter contains connection name. Requires at least three characters | [optional]
 **filterVoiceConnectionNameStartsWith** | **String**| Filter starts with connection name. Requires at least three characters | [optional]
 **filterVoiceConnectionNameEndsWith** | **String**| Filter ends with connection name. Requires at least three characters | [optional]
 **filterVoiceConnectionNameEq** | **String**| Filter by connection name | [optional]
 **filterUsagePaymentMethod** | **String**| Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
 **filterBillingGroupId** | **String**| Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string &#x27;null&#x27;. | [optional]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order | [optional] [enum: purchased_at, phone_number, connection_name, usage_payment_method]

### Return type

[**ListPhoneNumbersResponse**](ListPhoneNumbersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPhoneNumber"></a>
# **getPhoneNumber**
> RetrievePhoneNumberResponse getPhoneNumber(id)

Get the settings for a phone number

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
String id = "id_example"; // String | Identifies the resource.
try {
    RetrievePhoneNumberResponse result = apiInstance.getPhoneNumber(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#getPhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the resource. |

### Return type

[**RetrievePhoneNumberResponse**](RetrievePhoneNumberResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

<a name="retrievePhoneNumberVoice"></a>
# **retrievePhoneNumberVoice**
> RetrievePhoneNumberVoiceResponse retrievePhoneNumberVoice(id)

Get the voice settings for a phone number

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
String id = "id_example"; // String | Identifies the resource.
try {
    RetrievePhoneNumberVoiceResponse result = apiInstance.retrievePhoneNumberVoice(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberVoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the resource. |

### Return type

[**RetrievePhoneNumberVoiceResponse**](RetrievePhoneNumberVoiceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePhoneNumber"></a>
# **updatePhoneNumber**
> RetrievePhoneNumberResponse updatePhoneNumber(body, id)

Update the settings for a phone number

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
PhoneNumberUpdate body = new PhoneNumberUpdate(); // PhoneNumberUpdate | Updated settings for the phone number
String id = "id_example"; // String | Identifies the resource.
try {
    RetrievePhoneNumberResponse result = apiInstance.updatePhoneNumber(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PhoneNumberUpdate**](PhoneNumberUpdate.md)| Updated settings for the phone number |
 **id** | **String**| Identifies the resource. |

### Return type

[**RetrievePhoneNumberResponse**](RetrievePhoneNumberResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="updatePhoneNumberVoice"></a>
# **updatePhoneNumberVoice**
> RetrievePhoneNumberVoiceResponse updatePhoneNumberVoice(body, id)

Update the voice settings for a phone number

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
VoiceUpdate body = new VoiceUpdate(); // VoiceUpdate | Updated voice settings for the phone number
String id = "id_example"; // String | Identifies the resource.
try {
    RetrievePhoneNumberVoiceResponse result = apiInstance.updatePhoneNumberVoice(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberVoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VoiceUpdate**](VoiceUpdate.md)| Updated voice settings for the phone number |
 **id** | **String**| Identifies the resource. |

### Return type

[**RetrievePhoneNumberVoiceResponse**](RetrievePhoneNumberVoiceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

