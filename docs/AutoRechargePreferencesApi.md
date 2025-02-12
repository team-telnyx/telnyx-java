# AutoRechargePreferencesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAutoRechargePrefs**](AutoRechargePreferencesApi.md#getAutoRechargePrefs) | **GET** /payment/auto_recharge_prefs | List auto recharge preferences
[**updateAutoRechargePrefs**](AutoRechargePreferencesApi.md#updateAutoRechargePrefs) | **PATCH** /payment/auto_recharge_prefs | Update auto recharge preferences



## getAutoRechargePrefs

> GetAutoRechargePrefs200Response getAutoRechargePrefs()

List auto recharge preferences

Returns the payment auto recharge preferences.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AutoRechargePreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AutoRechargePreferencesApi apiInstance = new AutoRechargePreferencesApi(defaultClient);
        try {
            GetAutoRechargePrefs200Response result = apiInstance.getAutoRechargePrefs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutoRechargePreferencesApi#getAutoRechargePrefs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetAutoRechargePrefs200Response**](GetAutoRechargePrefs200Response.md)

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


## updateAutoRechargePrefs

> GetAutoRechargePrefs200Response updateAutoRechargePrefs(autoRechargePrefRequest)

Update auto recharge preferences

Update payment auto recharge preferences.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AutoRechargePreferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AutoRechargePreferencesApi apiInstance = new AutoRechargePreferencesApi(defaultClient);
        AutoRechargePrefRequest autoRechargePrefRequest = new AutoRechargePrefRequest(); // AutoRechargePrefRequest | Details to update auto recharge preferences
        try {
            GetAutoRechargePrefs200Response result = apiInstance.updateAutoRechargePrefs(autoRechargePrefRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutoRechargePreferencesApi#updateAutoRechargePrefs");
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
 **autoRechargePrefRequest** | [**AutoRechargePrefRequest**](AutoRechargePrefRequest.md)| Details to update auto recharge preferences |

### Return type

[**GetAutoRechargePrefs200Response**](GetAutoRechargePrefs200Response.md)

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

