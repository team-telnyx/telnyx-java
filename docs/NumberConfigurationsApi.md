# NumberConfigurationsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPhoneNumberMessagingSettings**](NumberConfigurationsApi.md#getPhoneNumberMessagingSettings) | **GET** /phone_numbers/{id}/messaging | Retrieve a phone number with messaging settings
[**listPhoneNumbersWithMessagingSettings**](NumberConfigurationsApi.md#listPhoneNumbersWithMessagingSettings) | **GET** /phone_numbers/messaging | List phone numbers with messaging settings
[**updatePhoneNumberMessagingSettings**](NumberConfigurationsApi.md#updatePhoneNumberMessagingSettings) | **PATCH** /phone_numbers/{id}/messaging | Update a phone number with messaging settings



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
| **0** | Unexpected error |  -  |

