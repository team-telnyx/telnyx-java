# NumberConfigurationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkUpdateMessagingSettingsOnPhoneNumbers**](NumberConfigurationsApi.md#bulkUpdateMessagingSettingsOnPhoneNumbers) | **POST** /messaging_numbers_bulk_updates | Update the messaging profile of multiple phone numbers
[**getBulkUpdateMessagingSettingsOnPhoneNumbersStatus**](NumberConfigurationsApi.md#getBulkUpdateMessagingSettingsOnPhoneNumbersStatus) | **GET** /messaging_numbers_bulk_updates/{order_id} | Retrieve bulk update status
[**getPhoneNumberMessagingSettings**](NumberConfigurationsApi.md#getPhoneNumberMessagingSettings) | **GET** /phone_numbers/{id}/messaging | Retrieve a phone number with messaging settings
[**listPhoneNumbersWithMessagingSettings**](NumberConfigurationsApi.md#listPhoneNumbersWithMessagingSettings) | **GET** /phone_numbers/messaging | List phone numbers with messaging settings
[**updatePhoneNumberMessagingSettings**](NumberConfigurationsApi.md#updatePhoneNumberMessagingSettings) | **PATCH** /phone_numbers/{id}/messaging | Update the messaging profile and/or messaging product of a phone number



## bulkUpdateMessagingSettingsOnPhoneNumbers

> RetrieveBulkUpdateMessagingSettingsResponse bulkUpdateMessagingSettingsOnPhoneNumbers(bulkMessagingSettingsUpdatePhoneNumbersRequest)

Update the messaging profile of multiple phone numbers

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
        BulkMessagingSettingsUpdatePhoneNumbersRequest bulkMessagingSettingsUpdatePhoneNumbersRequest = new BulkMessagingSettingsUpdatePhoneNumbersRequest(); // BulkMessagingSettingsUpdatePhoneNumbersRequest | 
        try {
            RetrieveBulkUpdateMessagingSettingsResponse result = apiInstance.bulkUpdateMessagingSettingsOnPhoneNumbers(bulkMessagingSettingsUpdatePhoneNumbersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#bulkUpdateMessagingSettingsOnPhoneNumbers");
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
 **bulkMessagingSettingsUpdatePhoneNumbersRequest** | [**BulkMessagingSettingsUpdatePhoneNumbersRequest**](BulkMessagingSettingsUpdatePhoneNumbersRequest.md)|  |

### Return type

[**RetrieveBulkUpdateMessagingSettingsResponse**](RetrieveBulkUpdateMessagingSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about messaging bulk update phone numbers. |  -  |
| **0** | Unexpected error |  -  |


## getBulkUpdateMessagingSettingsOnPhoneNumbersStatus

> RetrieveBulkUpdateMessagingSettingsResponse getBulkUpdateMessagingSettingsOnPhoneNumbersStatus(orderId)

Retrieve bulk update status

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
        String orderId = "orderId_example"; // String | Order ID to verify bulk update status.
        try {
            RetrieveBulkUpdateMessagingSettingsResponse result = apiInstance.getBulkUpdateMessagingSettingsOnPhoneNumbersStatus(orderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#getBulkUpdateMessagingSettingsOnPhoneNumbersStatus");
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
 **orderId** | **String**| Order ID to verify bulk update status. |

### Return type

[**RetrieveBulkUpdateMessagingSettingsResponse**](RetrieveBulkUpdateMessagingSettingsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about messaging bulk update phone numbers. |  -  |
| **0** | Unexpected error |  -  |


## getPhoneNumberMessagingSettings

> RetrieveMessagingSettingsResponse getPhoneNumberMessagingSettings(id)

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
            RetrieveMessagingSettingsResponse result = apiInstance.getPhoneNumberMessagingSettings(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#getPhoneNumberMessagingSettings");
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
| **0** | Unexpected error |  -  |


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
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

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
| **0** | Unexpected error |  -  |


## updatePhoneNumberMessagingSettings

> RetrieveMessagingSettingsResponse updatePhoneNumberMessagingSettings(id, updatePhoneNumberMessagingSettingsRequest)

Update the messaging profile and/or messaging product of a phone number

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
        String id = "id_example"; // String | The phone number to update.
        UpdatePhoneNumberMessagingSettingsRequest updatePhoneNumberMessagingSettingsRequest = new UpdatePhoneNumberMessagingSettingsRequest(); // UpdatePhoneNumberMessagingSettingsRequest | The new configuration to set for this phone number.  To avoid modifying a value, either omit the field or set its value to `null`.
        try {
            RetrieveMessagingSettingsResponse result = apiInstance.updatePhoneNumberMessagingSettings(id, updatePhoneNumberMessagingSettingsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberConfigurationsApi#updatePhoneNumberMessagingSettings");
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
 **id** | **String**| The phone number to update. |
 **updatePhoneNumberMessagingSettingsRequest** | [**UpdatePhoneNumberMessagingSettingsRequest**](UpdatePhoneNumberMessagingSettingsRequest.md)| The new configuration to set for this phone number.  To avoid modifying a value, either omit the field or set its value to &#x60;null&#x60;. |

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
| **0** | Unexpected error |  -  |

