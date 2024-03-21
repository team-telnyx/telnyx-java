# PhoneNumberConfigurationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePhoneNumber**](PhoneNumberConfigurationsApi.md#deletePhoneNumber) | **DELETE** /phone_numbers/{id} | Delete a phone number
[**enablePhoneNumberEmergency**](PhoneNumberConfigurationsApi.md#enablePhoneNumberEmergency) | **POST** /phone_numbers/{id}/actions/enable_emergency | Enable emergency for a phone number
[**getPhoneNumberVoiceSettings**](PhoneNumberConfigurationsApi.md#getPhoneNumberVoiceSettings) | **GET** /phone_numbers/{id}/voice | Retrieve a phone number with voice settings
[**listPhoneNumbers**](PhoneNumberConfigurationsApi.md#listPhoneNumbers) | **GET** /phone_numbers | List phone numbers
[**listPhoneNumbersWithVoiceSettings**](PhoneNumberConfigurationsApi.md#listPhoneNumbersWithVoiceSettings) | **GET** /phone_numbers/voice | List phone numbers with voice settings
[**retrievePhoneNumber**](PhoneNumberConfigurationsApi.md#retrievePhoneNumber) | **GET** /phone_numbers/{id} | Retrieve a phone number
[**slimListPhoneNumbers**](PhoneNumberConfigurationsApi.md#slimListPhoneNumbers) | **GET** /phone_numbers/slim | Slim List phone numbers
[**updatePhoneNumber**](PhoneNumberConfigurationsApi.md#updatePhoneNumber) | **PATCH** /phone_numbers/{id} | Update a phone number
[**updatePhoneNumberVoiceSettings**](PhoneNumberConfigurationsApi.md#updatePhoneNumberVoiceSettings) | **PATCH** /phone_numbers/{id}/voice | Update a phone number with voice settings



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
import com.telnyx.sdk.api.PhoneNumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberConfigurationsApi apiInstance = new PhoneNumberConfigurationsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            PhoneNumberResponse1 result = apiInstance.deletePhoneNumber(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberConfigurationsApi#deletePhoneNumber");
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
| **0** | Unexpected error |  -  |


## enablePhoneNumberEmergency

> PhoneNumberEnableEmergency enablePhoneNumberEmergency(id, phoneNumberEnableEmergencyRequest)

Enable emergency for a phone number

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberConfigurationsApi apiInstance = new PhoneNumberConfigurationsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        PhoneNumberEnableEmergencyRequest phoneNumberEnableEmergencyRequest = new PhoneNumberEnableEmergencyRequest(); // PhoneNumberEnableEmergencyRequest | 
        try {
            PhoneNumberEnableEmergency result = apiInstance.enablePhoneNumberEmergency(id, phoneNumberEnableEmergencyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberConfigurationsApi#enablePhoneNumberEmergency");
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
| **0** | Unexpected error |  -  |


## getPhoneNumberVoiceSettings

> RetrievePhoneNumberVoiceResponse getPhoneNumberVoiceSettings(id)

Retrieve a phone number with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberConfigurationsApi apiInstance = new PhoneNumberConfigurationsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            RetrievePhoneNumberVoiceResponse result = apiInstance.getPhoneNumberVoiceSettings(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberConfigurationsApi#getPhoneNumberVoiceSettings");
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
| **0** | Unexpected error |  -  |


## listPhoneNumbers

> ListPhoneNumbersResponse listPhoneNumbers().pageNumber(pageNumber).pageSize(pageSize).filterTag(filterTag).filterPhoneNumber(filterPhoneNumber).filterStatus(filterStatus).filterConnectionId(filterConnectionId).filterVoiceConnectionNameContains(filterVoiceConnectionNameContains).filterVoiceConnectionNameStartsWith(filterVoiceConnectionNameStartsWith).filterVoiceConnectionNameEndsWith(filterVoiceConnectionNameEndsWith).filterVoiceConnectionNameEq(filterVoiceConnectionNameEq).filterVoiceUsagePaymentMethod(filterVoiceUsagePaymentMethod).filterBillingGroupId(filterBillingGroupId).filterEmergencyAddressId(filterEmergencyAddressId).filterCustomerReference(filterCustomerReference).sort(sort).execute();

List phone numbers

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberConfigurationsApi apiInstance = new PhoneNumberConfigurationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterTag = "filterTag_example"; // String | Filter by phone number tags.
        String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
        String filterStatus = "purchase_pending"; // String | Filter by phone number status.
        String filterConnectionId = "1521916448077776306"; // String | Filter by connection_id.
        String filterVoiceConnectionNameContains = "test"; // String | Filter contains connection name. Requires at least three characters.
        String filterVoiceConnectionNameStartsWith = "test"; // String | Filter starts with connection name. Requires at least three characters.
        String filterVoiceConnectionNameEndsWith = "test"; // String | Filter ends with connection name. Requires at least three characters.
        String filterVoiceConnectionNameEq = "test"; // String | Filter by connection name.
        String filterVoiceUsagePaymentMethod = "pay-per-minute"; // String | Filter by usage_payment_method.
        String filterBillingGroupId = "62e4bf2e-c278-4282-b524-488d9c9c43b2"; // String | Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string 'null'.
        String filterEmergencyAddressId = "9102160989215728032"; // String | Filter by the emergency_address_id associated with phone numbers. To filter only phone numbers that have no emergency address associated with them, set the value of this filter to the string 'null'.
        String filterCustomerReference = "filterCustomerReference_example"; // String | Filter numbers via the customer_reference set.
        String sort = "purchased_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPhoneNumbersResponse result = api.listPhoneNumbers()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterTag(filterTag)
                .filterPhoneNumber(filterPhoneNumber)
                .filterStatus(filterStatus)
                .filterConnectionId(filterConnectionId)
                .filterVoiceConnectionNameContains(filterVoiceConnectionNameContains)
                .filterVoiceConnectionNameStartsWith(filterVoiceConnectionNameStartsWith)
                .filterVoiceConnectionNameEndsWith(filterVoiceConnectionNameEndsWith)
                .filterVoiceConnectionNameEq(filterVoiceConnectionNameEq)
                .filterVoiceUsagePaymentMethod(filterVoiceUsagePaymentMethod)
                .filterBillingGroupId(filterBillingGroupId)
                .filterEmergencyAddressId(filterEmergencyAddressId)
                .filterCustomerReference(filterCustomerReference)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberConfigurationsApi#listPhoneNumbers");
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
 **filterTag** | **String**| Filter by phone number tags. | [optional]
 **filterPhoneNumber** | **String**| Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterStatus** | **String**| Filter by phone number status. | [optional] [enum: purchase_pending, purchase_failed, port_pending, active, deleted, port_failed, emergency_only, ported_out, port_out_pending]
 **filterConnectionId** | **String**| Filter by connection_id. | [optional]
 **filterVoiceConnectionNameContains** | **String**| Filter contains connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameStartsWith** | **String**| Filter starts with connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameEndsWith** | **String**| Filter ends with connection name. Requires at least three characters. | [optional]
 **filterVoiceConnectionNameEq** | **String**| Filter by connection name. | [optional]
 **filterVoiceUsagePaymentMethod** | **String**| Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
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
| **0** | Unexpected error |  -  |


## listPhoneNumbersWithVoiceSettings

> ListPhoneNumbersWithVoiceSettingsResponse listPhoneNumbersWithVoiceSettings().pageNumber(pageNumber).pageSize(pageSize).filterPhoneNumber(filterPhoneNumber).filterConnectionNameContains(filterConnectionNameContains).filterCustomerReference(filterCustomerReference).filterVoiceUsagePaymentMethod(filterVoiceUsagePaymentMethod).sort(sort).execute();

List phone numbers with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberConfigurationsApi apiInstance = new PhoneNumberConfigurationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
        String filterConnectionNameContains = "test"; // String | Filter contains connection name. Requires at least three characters.
        String filterCustomerReference = "filterCustomerReference_example"; // String | Filter numbers via the customer_reference set.
        String filterVoiceUsagePaymentMethod = "pay-per-minute"; // String | Filter by usage_payment_method.
        String sort = "purchased_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPhoneNumbersWithVoiceSettingsResponse result = api.listPhoneNumbersWithVoiceSettings()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterPhoneNumber(filterPhoneNumber)
                .filterConnectionNameContains(filterConnectionNameContains)
                .filterCustomerReference(filterCustomerReference)
                .filterVoiceUsagePaymentMethod(filterVoiceUsagePaymentMethod)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberConfigurationsApi#listPhoneNumbersWithVoiceSettings");
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
 **filterPhoneNumber** | **String**| Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterConnectionNameContains** | **String**| Filter contains connection name. Requires at least three characters. | [optional]
 **filterCustomerReference** | **String**| Filter numbers via the customer_reference set. | [optional]
 **filterVoiceUsagePaymentMethod** | **String**| Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
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
| **0** | Unexpected error |  -  |


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
import com.telnyx.sdk.api.PhoneNumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberConfigurationsApi apiInstance = new PhoneNumberConfigurationsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            PhoneNumberResponse result = apiInstance.retrievePhoneNumber(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberConfigurationsApi#retrievePhoneNumber");
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
| **0** | Unexpected error |  -  |


## slimListPhoneNumbers

> ListPhoneNumbersResponse1 slimListPhoneNumbers().pageNumber(pageNumber).pageSize(pageSize).includeConnection(includeConnection).includeTags(includeTags).filterTag(filterTag).filterPhoneNumber(filterPhoneNumber).filterStatus(filterStatus).filterConnectionId(filterConnectionId).filterVoiceConnectionNameContains(filterVoiceConnectionNameContains).filterVoiceConnectionNameStartsWith(filterVoiceConnectionNameStartsWith).filterVoiceConnectionNameEndsWith(filterVoiceConnectionNameEndsWith).filterVoiceConnectionName(filterVoiceConnectionName).filterVoiceUsagePaymentMethod(filterVoiceUsagePaymentMethod).filterBillingGroupId(filterBillingGroupId).filterEmergencyAddressId(filterEmergencyAddressId).filterCustomerReference(filterCustomerReference).sort(sort).execute();

Slim List phone numbers

List phone numbers, This endpoint is a lighter version of the /phone_numbers endpoint having higher performance and rate limit.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberConfigurationsApi apiInstance = new PhoneNumberConfigurationsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        Boolean includeConnection = false; // Boolean | Include the connection associated with the phone number.
        Boolean includeTags = false; // Boolean | Include the tags associated with the phone number.
        String filterTag = "filterTag_example"; // String | Filter by phone number tags. (This requires the include_tags param)
        String filterPhoneNumber = "filterPhoneNumber_example"; // String | Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned.
        String filterStatus = "purchase_pending"; // String | Filter by phone number status.
        String filterConnectionId = "1521916448077776306"; // String | Filter by connection_id.
        String filterVoiceConnectionNameContains = "test"; // String | Filter contains connection name. Requires at least three characters and the include_connection param.
        String filterVoiceConnectionNameStartsWith = "test"; // String | Filter starts with connection name. Requires at least three characters and the include_connection param.
        String filterVoiceConnectionNameEndsWith = "test"; // String | Filter ends with connection name. Requires at least three characters and the include_connection param.
        String filterVoiceConnectionName = "test"; // String | Filter by connection name , requires the include_connection param and the include_connection param.
        String filterVoiceUsagePaymentMethod = "pay-per-minute"; // String | Filter by usage_payment_method.
        String filterBillingGroupId = "62e4bf2e-c278-4282-b524-488d9c9c43b2"; // String | Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string 'null'.
        String filterEmergencyAddressId = "9102160989215728032"; // String | Filter by the emergency_address_id associated with phone numbers. To filter only phone numbers that have no emergency address associated with them, set the value of this filter to the string 'null'.
        String filterCustomerReference = "filterCustomerReference_example"; // String | Filter numbers via the customer_reference set.
        String sort = "purchased_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPhoneNumbersResponse1 result = api.slimListPhoneNumbers()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .includeConnection(includeConnection)
                .includeTags(includeTags)
                .filterTag(filterTag)
                .filterPhoneNumber(filterPhoneNumber)
                .filterStatus(filterStatus)
                .filterConnectionId(filterConnectionId)
                .filterVoiceConnectionNameContains(filterVoiceConnectionNameContains)
                .filterVoiceConnectionNameStartsWith(filterVoiceConnectionNameStartsWith)
                .filterVoiceConnectionNameEndsWith(filterVoiceConnectionNameEndsWith)
                .filterVoiceConnectionName(filterVoiceConnectionName)
                .filterVoiceUsagePaymentMethod(filterVoiceUsagePaymentMethod)
                .filterBillingGroupId(filterBillingGroupId)
                .filterEmergencyAddressId(filterEmergencyAddressId)
                .filterCustomerReference(filterCustomerReference)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberConfigurationsApi#slimListPhoneNumbers");
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
 **includeConnection** | **Boolean**| Include the connection associated with the phone number. | [optional] [default to false]
 **includeTags** | **Boolean**| Include the tags associated with the phone number. | [optional] [default to false]
 **filterTag** | **String**| Filter by phone number tags. (This requires the include_tags param) | [optional]
 **filterPhoneNumber** | **String**| Filter by phone number. Requires at least three digits.              Non-numerical characters will result in no values being returned. | [optional]
 **filterStatus** | **String**| Filter by phone number status. | [optional] [enum: purchase_pending, purchase_failed, port_pending, active, deleted, port_failed, emergency_only, ported_out, port_out_pending]
 **filterConnectionId** | **String**| Filter by connection_id. | [optional]
 **filterVoiceConnectionNameContains** | **String**| Filter contains connection name. Requires at least three characters and the include_connection param. | [optional]
 **filterVoiceConnectionNameStartsWith** | **String**| Filter starts with connection name. Requires at least three characters and the include_connection param. | [optional]
 **filterVoiceConnectionNameEndsWith** | **String**| Filter ends with connection name. Requires at least three characters and the include_connection param. | [optional]
 **filterVoiceConnectionName** | **String**| Filter by connection name , requires the include_connection param and the include_connection param. | [optional]
 **filterVoiceUsagePaymentMethod** | **String**| Filter by usage_payment_method. | [optional] [enum: pay-per-minute, channel]
 **filterBillingGroupId** | **String**| Filter by the billing_group_id associated with phone numbers. To filter to only phone numbers that have no billing group associated them, set the value of this filter to the string &#39;null&#39;. | [optional]
 **filterEmergencyAddressId** | **String**| Filter by the emergency_address_id associated with phone numbers. To filter only phone numbers that have no emergency address associated with them, set the value of this filter to the string &#39;null&#39;. | [optional]
 **filterCustomerReference** | **String**| Filter numbers via the customer_reference set. | [optional]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: purchased_at, phone_number, connection_name, usage_payment_method]

### Return type

[**ListPhoneNumbersResponse1**](ListPhoneNumbersResponse1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of phone numbers. |  -  |
| **0** | Unexpected error |  -  |


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
import com.telnyx.sdk.api.PhoneNumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberConfigurationsApi apiInstance = new PhoneNumberConfigurationsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        UpdatePhoneNumberRequest updatePhoneNumberRequest = new UpdatePhoneNumberRequest(); // UpdatePhoneNumberRequest | Updated settings for the phone number.
        try {
            PhoneNumberResponse result = apiInstance.updatePhoneNumber(id, updatePhoneNumberRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberConfigurationsApi#updatePhoneNumber");
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
| **0** | Unexpected error |  -  |


## updatePhoneNumberVoiceSettings

> RetrievePhoneNumberVoiceResponse updatePhoneNumberVoiceSettings(id, updatePhoneNumberVoiceSettingsRequest)

Update a phone number with voice settings

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PhoneNumberConfigurationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PhoneNumberConfigurationsApi apiInstance = new PhoneNumberConfigurationsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        UpdatePhoneNumberVoiceSettingsRequest updatePhoneNumberVoiceSettingsRequest = new UpdatePhoneNumberVoiceSettingsRequest(); // UpdatePhoneNumberVoiceSettingsRequest | Updated voice settings for the phone number.
        try {
            RetrievePhoneNumberVoiceResponse result = apiInstance.updatePhoneNumberVoiceSettings(id, updatePhoneNumberVoiceSettingsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PhoneNumberConfigurationsApi#updatePhoneNumberVoiceSettings");
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
| **0** | Unexpected error |  -  |

