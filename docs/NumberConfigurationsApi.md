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



## deletePhoneNumber

> PhoneNumberResponse1 deletePhoneNumber(id)

Delete a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            PhoneNumberResponse1 result = apiInstance.deletePhoneNumber(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#deletePhoneNumber");
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
 **id** | **String**| Identifies the resource. |

### Return type

[**PhoneNumberResponse1**](PhoneNumberResponse1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number. |  -  |
| **0** | Bad Request |  -  |


## enableEmergencyPhoneNumber

> PhoneNumberEnableEmergency enableEmergencyPhoneNumber(id, phoneNumberEnableEmergencyRequest)

Enable emergency for a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        PhoneNumberEnableEmergencyRequest phoneNumberEnableEmergencyRequest = new PhoneNumberEnableEmergencyRequest(); // PhoneNumberEnableEmergencyRequest | 
        try {
            PhoneNumberEnableEmergency result = apiInstance.enableEmergencyPhoneNumber(id, phoneNumberEnableEmergencyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#enableEmergencyPhoneNumber");
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
 **id** | **String**| Identifies the resource. |
 **phoneNumberEnableEmergencyRequest** | [**PhoneNumberEnableEmergencyRequest**](PhoneNumberEnableEmergencyRequest.md)|  |

### Return type

[**PhoneNumberEnableEmergency**](PhoneNumberEnableEmergency.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Phone number emergency enabled. |  -  |
| **202** | Phone number emergency requested. |  -  |
| **0** | Bad Request |  -  |


## listPhoneNumbers

> ListPhoneNumbersResponse listPhoneNumbers().pageNumber(pageNumber).pageSize(pageSize).filterTag(filterTag).filterPhoneNumber(filterPhoneNumber).filterStatus(filterStatus).filterVoiceConnectionNameContains(filterVoiceConnectionNameContains).filterVoiceConnectionNameStartsWith(filterVoiceConnectionNameStartsWith).filterVoiceConnectionNameEndsWith(filterVoiceConnectionNameEndsWith).filterVoiceConnectionNameEq(filterVoiceConnectionNameEq).filterUsagePaymentMethod(filterUsagePaymentMethod).filterBillingGroupId(filterBillingGroupId).filterEmergencyAddressId(filterEmergencyAddressId).filterCustomerReference(filterCustomerReference).sort(sort).execute();

List phone numbers

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load.
        Integer pageSize = 20; // Integer | The size of the page.
        String filterTag = "filterTag_example"; // String | Filter by phone number tags.
        String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
        String filterStatus = active; // String | Filter by phone number status.
        String filterVoiceConnectionNameContains = test; // String | Filter contains connection name. Requires at least three characters.
        String filterVoiceConnectionNameStartsWith = test; // String | Filter starts with connection name. Requires at least three characters.
        String filterVoiceConnectionNameEndsWith = test; // String | Filter ends with connection name. Requires at least three characters.
        String filterVoiceConnectionNameEq = test; // String | Filter by connection name.
        String filterUsagePaymentMethod = channel; // String | Filter by usage_payment_method.
        String filterBillingGroupId = 62e4bf2e-c278-4282-b524-488d9c9c43b2; // String | Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string 'null'.
        String filterEmergencyAddressId = 9102160989215728032; // String | Filter by the emergency_address_id associated with phone numbers. To filter only phone numbers that have no emergency address associated with them, set the value of this filter to the string 'null'.
        String filterCustomerReference = MY REF 001; // String | Filter numbers via the customer_reference set.
        String sort = connection_name; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPhoneNumbersResponse result = api.listPhoneNumbers()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterTag(filterTag)
                .filterPhoneNumber(filterPhoneNumber)
                .filterStatus(filterStatus)
                .filterVoiceConnectionNameContains(filterVoiceConnectionNameContains)
                .filterVoiceConnectionNameStartsWith(filterVoiceConnectionNameStartsWith)
                .filterVoiceConnectionNameEndsWith(filterVoiceConnectionNameEndsWith)
                .filterVoiceConnectionNameEq(filterVoiceConnectionNameEq)
                .filterUsagePaymentMethod(filterUsagePaymentMethod)
                .filterBillingGroupId(filterBillingGroupId)
                .filterEmergencyAddressId(filterEmergencyAddressId)
                .filterCustomerReference(filterCustomerReference)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbers");
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
 **pageNumber** | **Integer**| The page number to load. | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page. | [optional] [default to 20]
 **filterTag** | **String**| Filter by phone number tags. | [optional]
 **filterPhoneNumber** | **String**| Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterStatus** | **String**| Filter by phone number status. | [optional] [enum: purchase_pending, purchase_failed, port_pending, active, deleted, port_failed, emergency_only, ported_out, port_out_pending]
 **filterVoiceConnectionNameContains** | **String**| Filter contains connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameStartsWith** | **String**| Filter starts with connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameEndsWith** | **String**| Filter ends with connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameEq** | **String**| Filter by connection name. | [optional]
 **filterUsagePaymentMethod** | **String**| Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
 **filterBillingGroupId** | **String**| Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string &#39;null&#39;. | [optional]
 **filterEmergencyAddressId** | **String**| Filter by the emergency_address_id associated with phone numbers. To filter only phone numbers that have no emergency address associated with them, set the value of this filter to the string &#39;null&#39;. | [optional]
 **filterCustomerReference** | **String**| Filter numbers via the customer_reference set. | [optional]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: purchased_at, phone_number, connection_name, usage_payment_method]

### Return type

[**ListPhoneNumbersResponse**](ListPhoneNumbersResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers. |  -  |
| **0** | Bad Request |  -  |


## listPhoneNumbersWithMessagingSettings

> ListMessagingSettingsResponse listPhoneNumbersWithMessagingSettings().pageNumber(pageNumber).pageSize(pageSize).execute();

List phone numbers with messaging settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load.
        Integer pageSize = 20; // Integer | The size of the page.
        try {
            ListMessagingSettingsResponse result = api.listPhoneNumbersWithMessagingSettings()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbersWithMessagingSettings");
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
 **pageNumber** | **Integer**| The page number to load. | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page. | [optional] [default to 20]

### Return type

[**ListMessagingSettingsResponse**](ListMessagingSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers with messaging settings. |  -  |
| **0** | Bad Request |  -  |


## listPhoneNumbersWithVoiceSettings

> ListPhoneNumbersWithVoiceSettingsResponse listPhoneNumbersWithVoiceSettings().pageNumber(pageNumber).pageSize(pageSize).filterPhoneNumber(filterPhoneNumber).filterConnectionNameContains(filterConnectionNameContains).filterCustomerReference(filterCustomerReference).filterUsagePaymentMethod(filterUsagePaymentMethod).sort(sort).execute();

List phone numbers with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load.
        Integer pageSize = 20; // Integer | The size of the page.
        String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
        String filterConnectionNameContains = test; // String | Filter contains connection name. Requires at least three characters.
        String filterCustomerReference = "filterCustomerReference_example"; // String | Filter numbers via the customer_reference set.
        String filterUsagePaymentMethod = channel; // String | Filter by usage_payment_method.
        String sort = connection_name; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPhoneNumbersWithVoiceSettingsResponse result = api.listPhoneNumbersWithVoiceSettings()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterPhoneNumber(filterPhoneNumber)
                .filterConnectionNameContains(filterConnectionNameContains)
                .filterCustomerReference(filterCustomerReference)
                .filterUsagePaymentMethod(filterUsagePaymentMethod)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#listPhoneNumbersWithVoiceSettings");
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
 **pageNumber** | **Integer**| The page number to load. | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page. | [optional] [default to 20]
 **filterPhoneNumber** | **String**| Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterConnectionNameContains** | **String**| Filter contains connection name. Requires at least three characters. | [optional]
 **filterCustomerReference** | **String**| Filter numbers via the customer_reference set. | [optional]
 **filterUsagePaymentMethod** | **String**| Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: purchased_at, phone_number, connection_name, usage_payment_method]

### Return type

[**ListPhoneNumbersWithVoiceSettingsResponse**](ListPhoneNumbersWithVoiceSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers with voice settings. |  -  |
| **0** | Bad Request |  -  |


## retrievePhoneNumber

> PhoneNumberResponse retrievePhoneNumber(id)

Retrieve a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            PhoneNumberResponse result = apiInstance.retrievePhoneNumber(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumber");
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
 **id** | **String**| Identifies the resource. |

### Return type

[**PhoneNumberResponse**](PhoneNumberResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number. |  -  |
| **0** | Bad Request |  -  |


## retrievePhoneNumberWithMessagingSettings

> RetrieveMessagingSettingsResponse retrievePhoneNumberWithMessagingSettings(id)

Retrieve a phone number with messaging settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        try {
            RetrieveMessagingSettingsResponse result = apiInstance.retrievePhoneNumberWithMessagingSettings(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberWithMessagingSettings");
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
 **id** | **String**| Identifies the type of resource. |

### Return type

[**RetrieveMessagingSettingsResponse**](RetrieveMessagingSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Bad Request |  -  |


## retrievePhoneNumberWithVoiceSettings

> RetrievePhoneNumberVoiceResponse retrievePhoneNumberWithVoiceSettings(id)

Retrieve a phone number with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        try {
            RetrievePhoneNumberVoiceResponse result = apiInstance.retrievePhoneNumberWithVoiceSettings(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#retrievePhoneNumberWithVoiceSettings");
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
 **id** | **String**| Identifies the resource. |

### Return type

[**RetrievePhoneNumberVoiceResponse**](RetrievePhoneNumberVoiceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Bad Request |  -  |


## updatePhoneNumber

> PhoneNumberResponse updatePhoneNumber(id, updatePhoneNumberRequest)

Update a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        UpdatePhoneNumberRequest updatePhoneNumberRequest = new UpdatePhoneNumberRequest(); // UpdatePhoneNumberRequest | Updated settings for the phone number.
        try {
            PhoneNumberResponse result = apiInstance.updatePhoneNumber(id, updatePhoneNumberRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumber");
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
 **id** | **String**| Identifies the resource. |
 **updatePhoneNumberRequest** | [**UpdatePhoneNumberRequest**](UpdatePhoneNumberRequest.md)| Updated settings for the phone number. |

### Return type

[**PhoneNumberResponse**](PhoneNumberResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number. |  -  |
| **0** | Bad Request |  -  |


## updatePhoneNumberWithMessagingSettings

> RetrieveMessagingSettingsResponse updatePhoneNumberWithMessagingSettings(id, updatePhoneNumberMessagingSettingsRequest)

Update a phone number with messaging settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = "id_example"; // String | Identifies the type of resource.
        UpdatePhoneNumberMessagingSettingsRequest updatePhoneNumberMessagingSettingsRequest = new UpdatePhoneNumberMessagingSettingsRequest(); // UpdatePhoneNumberMessagingSettingsRequest | Updated messaging settings for the phone number
        try {
            RetrieveMessagingSettingsResponse result = apiInstance.updatePhoneNumberWithMessagingSettings(id, updatePhoneNumberMessagingSettingsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberWithMessagingSettings");
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
 **id** | **String**| Identifies the type of resource. |
 **updatePhoneNumberMessagingSettingsRequest** | [**UpdatePhoneNumberMessagingSettingsRequest**](UpdatePhoneNumberMessagingSettingsRequest.md)| Updated messaging settings for the phone number |

### Return type

[**RetrieveMessagingSettingsResponse**](RetrieveMessagingSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Bad Request |  -  |


## updatePhoneNumberWithVoiceSettings

> RetrievePhoneNumberVoiceResponse updatePhoneNumberWithVoiceSettings(id, updatePhoneNumberVoiceSettingsRequest)

Update a phone number with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberConfigurationsApi apiInstance = new NumberConfigurationsApi(defaultClient);
        String id = 1293384261075731499; // String | Identifies the resource.
        UpdatePhoneNumberVoiceSettingsRequest updatePhoneNumberVoiceSettingsRequest = new UpdatePhoneNumberVoiceSettingsRequest(); // UpdatePhoneNumberVoiceSettingsRequest | Updated voice settings for the phone number.
        try {
            RetrievePhoneNumberVoiceResponse result = apiInstance.updatePhoneNumberWithVoiceSettings(id, updatePhoneNumberVoiceSettingsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberWithVoiceSettings");
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
 **id** | **String**| Identifies the resource. |
 **updatePhoneNumberVoiceSettingsRequest** | [**UpdatePhoneNumberVoiceSettingsRequest**](UpdatePhoneNumberVoiceSettingsRequest.md)| Updated voice settings for the phone number. |

### Return type

[**RetrievePhoneNumberVoiceResponse**](RetrievePhoneNumberVoiceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a phone number including voice settings. |  -  |
| **0** | Bad Request |  -  |

