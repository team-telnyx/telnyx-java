# NumberConfigurationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePhoneNumber**](NumberConfigurationsApi.md#deletePhoneNumber) | **DELETE** /phone_numbers/{id} | Delete a phone number
[**enableEmergencyPhoneNumber**](NumberConfigurationsApi.md#enableEmergencyPhoneNumber) | **POST** /phone_numbers/{id}/actions/enable_emergency | Enable emergency for a phone number
[**listPhoneNumbers**](NumberConfigurationsApi.md#listPhoneNumbers) | **GET** /phone_numbers | List phone numbers
[**listPhoneNumbersWithMessagingSettings**](NumberConfigurationsApi.md#listPhoneNumbersWithMessagingSettings) | **GET** /phone_numbers/messaging | List phone numbers with messaging settings
[**listPhoneNumbersWithVoiceSettings**](NumberConfigurationsApi.md#listPhoneNumbersWithVoiceSettings) | **GET** /phone_numbers/voice | List phone numbers with voice settings
[**retrievePhoneNumber**](NumberConfigurationsApi.md#retrievePhoneNumber) | **GET** /phone_numbers/{id} | Retrieve a phone number
[**retrievePhoneNumberWithMessagingSettings**](NumberConfigurationsApi.md#retrievePhoneNumberWithMessagingSettings) | **GET** /phone_numbers/{id}/messaging | Retrieve a phone number with messaging settings
[**retrievePhoneNumberWithVoiceSettings**](NumberConfigurationsApi.md#retrievePhoneNumberWithVoiceSettings) | **GET** /phone_numbers/{id}/voice | Retrieve a phone number with voice settings
[**updatePhoneNumber**](NumberConfigurationsApi.md#updatePhoneNumber) | **PATCH** /phone_numbers/{id} | Update a phone number
[**updatePhoneNumberWithMessagingSettings**](NumberConfigurationsApi.md#updatePhoneNumberWithMessagingSettings) | **PATCH** /phone_numbers/{id}/messaging | Update a phone number with messaging settings
[**updatePhoneNumberWithVoiceSettings**](NumberConfigurationsApi.md#updatePhoneNumberWithVoiceSettings) | **PATCH** /phone_numbers/{id}/voice | Update a phone number with voice settings

<a name="deletePhoneNumber"></a>
# **deletePhoneNumber**
> PhoneNumberResponse deletePhoneNumber(id)

Delete a phone number

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
String id = "id_example"; // String | Identifies the resource.
try {
    PhoneNumberResponse result = apiInstance.deletePhoneNumber(id);
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

[**PhoneNumberResponse**](PhoneNumberResponse.md)

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
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
PhoneNumberEnableEmergencyRequest body = new PhoneNumberEnableEmergencyRequest(); // PhoneNumberEnableEmergencyRequest | 
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
 **body** | [**PhoneNumberEnableEmergencyRequest**](PhoneNumberEnableEmergencyRequest.md)|  |
 **id** | **String**| Identifies the resource. |

### Return type

[**PhoneNumberEnableEmergency**](PhoneNumberEnableEmergency.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPhoneNumbers"></a>
# **listPhoneNumbers**
> ListPhoneNumbersResponse listPhoneNumbers(pageNumber, pageSize, filterTag, filterPhoneNumber, filterStatus, filterVoiceConnectionNameContains, filterVoiceConnectionNameStartsWith, filterVoiceConnectionNameEndsWith, filterVoiceConnectionNameEq, filterUsagePaymentMethod, filterBillingGroupId, sort)

List phone numbers

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterTag = "filterTag_example"; // String | Filter by phone number tags.
String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
String filterStatus = "filterStatus_example"; // String | Filter by phone number status.
String filterVoiceConnectionNameContains = "filterVoiceConnectionNameContains_example"; // String | Filter contains connection name. Requires at least three characters.
String filterVoiceConnectionNameStartsWith = "filterVoiceConnectionNameStartsWith_example"; // String | Filter starts with connection name. Requires at least three characters.
String filterVoiceConnectionNameEndsWith = "filterVoiceConnectionNameEndsWith_example"; // String | Filter ends with connection name. Requires at least three characters.
String filterVoiceConnectionNameEq = "filterVoiceConnectionNameEq_example"; // String | Filter by connection name.
String filterUsagePaymentMethod = "filterUsagePaymentMethod_example"; // String | Filter by usage_payment_method.
String filterBillingGroupId = "filterBillingGroupId_example"; // String | Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string 'null'.
String sort = "sort_example"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
try {
    ListPhoneNumbersResponse result = apiInstance.listPhoneNumbers(pageNumber, pageSize, filterTag, filterPhoneNumber, filterStatus, filterVoiceConnectionNameContains, filterVoiceConnectionNameStartsWith, filterVoiceConnectionNameEndsWith, filterVoiceConnectionNameEq, filterUsagePaymentMethod, filterBillingGroupId, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterTag** | **String**| Filter by phone number tags. | [optional]
 **filterPhoneNumber** | **String**| Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterStatus** | **String**| Filter by phone number status. | [optional] [enum: purchase_pending, purchase_failed, port_pending, active, deleted, port_failed, emergency_only, ported_out, port_out_pending]
 **filterVoiceConnectionNameContains** | **String**| Filter contains connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameStartsWith** | **String**| Filter starts with connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameEndsWith** | **String**| Filter ends with connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameEq** | **String**| Filter by connection name. | [optional]
 **filterUsagePaymentMethod** | **String**| Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
 **filterBillingGroupId** | **String**| Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string &#x27;null&#x27;. | [optional]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: purchased_at, phone_number, connection_name, usage_payment_method]

### Return type

[**ListPhoneNumbersResponse**](ListPhoneNumbersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPhoneNumbersWithMessagingSettings"></a>
# **listPhoneNumbersWithMessagingSettings**
> ListMessagingSettingsResponse listPhoneNumbersWithMessagingSettings()

List phone numbers with messaging settings

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
try {
    ListMessagingSettingsResponse result = apiInstance.listPhoneNumbersWithMessagingSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbersWithMessagingSettings");
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

<a name="listPhoneNumbersWithVoiceSettings"></a>
# **listPhoneNumbersWithVoiceSettings**
> ListPhoneNumbersWithVoiceSettingsResponse listPhoneNumbersWithVoiceSettings(pageNumber, pageSize, filterPhoneNumber, filterConnectionNameContains, filterUsagePaymentMethod, sort)

List phone numbers with voice settings

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
String filterConnectionNameContains = "filterConnectionNameContains_example"; // String | Filter contains connection name. Requires at least three characters.
String filterUsagePaymentMethod = "filterUsagePaymentMethod_example"; // String | Filter by usage_payment_method.
String sort = "sort_example"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
try {
    ListPhoneNumbersWithVoiceSettingsResponse result = apiInstance.listPhoneNumbersWithVoiceSettings(pageNumber, pageSize, filterPhoneNumber, filterConnectionNameContains, filterUsagePaymentMethod, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbersWithVoiceSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]
 **filterPhoneNumber** | **String**| Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterConnectionNameContains** | **String**| Filter contains connection name. Requires at least three characters. | [optional]
 **filterUsagePaymentMethod** | **String**| Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: purchased_at, phone_number, connection_name, usage_payment_method]

### Return type

[**ListPhoneNumbersWithVoiceSettingsResponse**](ListPhoneNumbersWithVoiceSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrievePhoneNumber"></a>
# **retrievePhoneNumber**
> PhoneNumberResponse retrievePhoneNumber(id)

Retrieve a phone number

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
String id = "id_example"; // String | Identifies the resource.
try {
    PhoneNumberResponse result = apiInstance.retrievePhoneNumber(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the resource. |

### Return type

[**PhoneNumberResponse**](PhoneNumberResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrievePhoneNumberWithMessagingSettings"></a>
# **retrievePhoneNumberWithMessagingSettings**
> RetrieveMessagingSettingsResponse retrievePhoneNumberWithMessagingSettings(id)

Retrieve a phone number with messaging settings

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
String id = "id_example"; // String | Identifies the type of resource.
try {
    RetrieveMessagingSettingsResponse result = apiInstance.retrievePhoneNumberWithMessagingSettings(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberWithMessagingSettings");
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

<a name="retrievePhoneNumberWithVoiceSettings"></a>
# **retrievePhoneNumberWithVoiceSettings**
> RetrievePhoneNumberVoiceResponse retrievePhoneNumberWithVoiceSettings(id)

Retrieve a phone number with voice settings

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
String id = "id_example"; // String | Identifies the resource.
try {
    RetrievePhoneNumberVoiceResponse result = apiInstance.retrievePhoneNumberWithVoiceSettings(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberWithVoiceSettings");
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
> PhoneNumberResponse updatePhoneNumber(body, id)

Update a phone number

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
UpdatePhoneNumberRequest body = new UpdatePhoneNumberRequest(); // UpdatePhoneNumberRequest | Updated settings for the phone number.
String id = "id_example"; // String | Identifies the resource.
try {
    PhoneNumberResponse result = apiInstance.updatePhoneNumber(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdatePhoneNumberRequest**](UpdatePhoneNumberRequest.md)| Updated settings for the phone number. |
 **id** | **String**| Identifies the resource. |

### Return type

[**PhoneNumberResponse**](PhoneNumberResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePhoneNumberWithMessagingSettings"></a>
# **updatePhoneNumberWithMessagingSettings**
> RetrieveMessagingSettingsResponse updatePhoneNumberWithMessagingSettings(body, id)

Update a phone number with messaging settings

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
UpdatePhoneNumberMessagingSettingsRequest body = new UpdatePhoneNumberMessagingSettingsRequest(); // UpdatePhoneNumberMessagingSettingsRequest | Updated messaging settings for the phone number
String id = "id_example"; // String | Identifies the type of resource.
try {
    RetrieveMessagingSettingsResponse result = apiInstance.updatePhoneNumberWithMessagingSettings(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberWithMessagingSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdatePhoneNumberMessagingSettingsRequest**](UpdatePhoneNumberMessagingSettingsRequest.md)| Updated messaging settings for the phone number |
 **id** | **String**| Identifies the type of resource. |

### Return type

[**RetrieveMessagingSettingsResponse**](RetrieveMessagingSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePhoneNumberWithVoiceSettings"></a>
# **updatePhoneNumberWithVoiceSettings**
> RetrievePhoneNumberVoiceResponse updatePhoneNumberWithVoiceSettings(body, id)

Update a phone number with voice settings

### Example
```java
// Import classes:
//import com.telnyx.sdk.ApiClient;
//import com.telnyx.sdk.ApiException;
//import com.telnyx.sdk.Configuration;
//import com.telnyx.sdk.auth.*;
//import com.telnyx.sdk.apis.NumberConfigurationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


NumberConfigurationsApi apiInstance = new NumberConfigurationsApi();
UpdatePhoneNumberVoiceSettingsRequest body = new UpdatePhoneNumberVoiceSettingsRequest(); // UpdatePhoneNumberVoiceSettingsRequest | Updated voice settings for the phone number.
String id = "id_example"; // String | Identifies the resource.
try {
    RetrievePhoneNumberVoiceResponse result = apiInstance.updatePhoneNumberWithVoiceSettings(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberWithVoiceSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdatePhoneNumberVoiceSettingsRequest**](UpdatePhoneNumberVoiceSettingsRequest.md)| Updated voice settings for the phone number. |
 **id** | **String**| Identifies the resource. |

### Return type

[**RetrievePhoneNumberVoiceResponse**](RetrievePhoneNumberVoiceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

