# BulkCredentialsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCredentialAction**](BulkCredentialsApi.md#bulkCredentialAction) | **POST** /actions/{action}/telephony_credentials | Perform activate or deactivate action on all credentials filtered by the provided tag.
[**createBulkTelephonyCredential**](BulkCredentialsApi.md#createBulkTelephonyCredential) | **POST** /actions/bulk/telephony_credentials | Creates several credentials
[**deleteBulkTelephonyCredential**](BulkCredentialsApi.md#deleteBulkTelephonyCredential) | **DELETE** /actions/bulk/telephony_credentials | Delete several credentials
[**updateBulkTelephonyCredential**](BulkCredentialsApi.md#updateBulkTelephonyCredential) | **PATCH** /actions/bulk/telephony_credentials | Update several credentials



## bulkCredentialAction

> BulkCredentialResponse bulkCredentialAction(action, filterTag)

Perform activate or deactivate action on all credentials filtered by the provided tag.

Perform activate or deactivate action on all credentials filtered by the provided tag. Activate action will change the status to active, making it possible to connect calls with the credential. Deactivate action will change the status to inactive, making it impossible to connect calls with the credential.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkCredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkCredentialsApi apiInstance = new BulkCredentialsApi(defaultClient);
        String action = "action_example"; // String | Identifies the action to be taken. Activate will change the status to active. Deactivate will change the status to inactive.
        String filterTag = "filterTag_example"; // String | Filter by tag, required by bulk operations.
        try {
            BulkCredentialResponse result = apiInstance.bulkCredentialAction(action, filterTag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkCredentialsApi#bulkCredentialAction");
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
 **action** | **String**| Identifies the action to be taken. Activate will change the status to active. Deactivate will change the status to inactive. | [enum: activate, deactivate]
 **filterTag** | **String**| Filter by tag, required by bulk operations. |

### Return type

[**BulkCredentialResponse**](BulkCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response for Bulk credential requests |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## createBulkTelephonyCredential

> BulkCredentialResponse createBulkTelephonyCredential(bulkCredentialRequest)

Creates several credentials

Creates several credentials in bulk.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkCredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkCredentialsApi apiInstance = new BulkCredentialsApi(defaultClient);
        BulkCredentialRequest bulkCredentialRequest = new BulkCredentialRequest(); // BulkCredentialRequest | Requested parameters to create credentials on bulk
        try {
            BulkCredentialResponse result = apiInstance.createBulkTelephonyCredential(bulkCredentialRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkCredentialsApi#createBulkTelephonyCredential");
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
 **bulkCredentialRequest** | [**BulkCredentialRequest**](BulkCredentialRequest.md)| Requested parameters to create credentials on bulk |

### Return type

[**BulkCredentialResponse**](BulkCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response for Bulk credential requests |  -  |
| **422** | Bad request |  -  |


## deleteBulkTelephonyCredential

> BulkCredentialResponse deleteBulkTelephonyCredential(filterTag)

Delete several credentials

Delete several credentials in bulk.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkCredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkCredentialsApi apiInstance = new BulkCredentialsApi(defaultClient);
        String filterTag = "filterTag_example"; // String | Filter by tag, required by bulk operations.
        try {
            BulkCredentialResponse result = apiInstance.deleteBulkTelephonyCredential(filterTag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkCredentialsApi#deleteBulkTelephonyCredential");
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
 **filterTag** | **String**| Filter by tag, required by bulk operations. |

### Return type

[**BulkCredentialResponse**](BulkCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response for Bulk credential requests |  -  |
| **422** | Bad request |  -  |


## updateBulkTelephonyCredential

> BulkCredentialResponse updateBulkTelephonyCredential(filterTag, bulkCredentialRequest)

Update several credentials

Update several credentials in bulk.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BulkCredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BulkCredentialsApi apiInstance = new BulkCredentialsApi(defaultClient);
        String filterTag = "filterTag_example"; // String | Filter by tag, required by bulk operations.
        BulkCredentialRequest bulkCredentialRequest = new BulkCredentialRequest(); // BulkCredentialRequest | Parameters to update credentials on bulk
        try {
            BulkCredentialResponse result = apiInstance.updateBulkTelephonyCredential(filterTag, bulkCredentialRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BulkCredentialsApi#updateBulkTelephonyCredential");
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
 **filterTag** | **String**| Filter by tag, required by bulk operations. |
 **bulkCredentialRequest** | [**BulkCredentialRequest**](BulkCredentialRequest.md)| Parameters to update credentials on bulk |

### Return type

[**BulkCredentialResponse**](BulkCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response for Bulk credential requests |  -  |
| **422** | Bad request |  -  |

