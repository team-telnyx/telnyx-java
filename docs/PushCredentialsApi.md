# PushCredentialsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePushCredentialnById**](PushCredentialsApi.md#deletePushCredentialnById) | **DELETE** /push_credentials/{push_credential_id} | Deletes a push credential
[**getPushCredentialById**](PushCredentialsApi.md#getPushCredentialById) | **GET** /push_credentials/{push_credential_id} | Retrieves a push credential
[**getPushCredentials**](PushCredentialsApi.md#getPushCredentials) | **GET** /mobile_applications/{mobile_application_id}/push_credentials | Retrieves push credentials associated to a mobile application
[**updatePushCredentialById**](PushCredentialsApi.md#updatePushCredentialById) | **PATCH** /push_credentials/{push_credential_id} | Updates a push credential



## deletePushCredentialnById

> deletePushCredentialnById(pushCredentialId)

Deletes a push credential

Deletes a push credential based on the given `id`

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PushCredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PushCredentialsApi apiInstance = new PushCredentialsApi(defaultClient);
        UUID pushCredentialId = UUID.fromString("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0"); // UUID | The unique identifier of a push credential
        try {
            apiInstance.deletePushCredentialnById(pushCredentialId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushCredentialsApi#deletePushCredentialnById");
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
 **pushCredentialId** | **UUID**| The unique identifier of a push credential |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The push credential was deleted successfully |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Resource not found |  -  |
| **422** | Unable to process request |  -  |


## getPushCredentialById

> PushCredentialResponse getPushCredentialById(pushCredentialId)

Retrieves a push credential

Retrieves push credential based on the given `id`

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PushCredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PushCredentialsApi apiInstance = new PushCredentialsApi(defaultClient);
        UUID pushCredentialId = UUID.fromString("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0"); // UUID | The unique identifier of a push credential
        try {
            PushCredentialResponse result = apiInstance.getPushCredentialById(pushCredentialId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushCredentialsApi#getPushCredentialById");
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
 **pushCredentialId** | **UUID**| The unique identifier of a push credential |

### Return type

[**PushCredentialResponse**](PushCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful get push credential response |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Resource not found |  -  |
| **422** | Unable to process request |  -  |


## getPushCredentials

> List&lt;PushCredentialResponse&gt; getPushCredentials(mobileApplicationId, filterCreatedAtEq, filterCreatedAtGte, filterCreatedAtLte, filterAlias)

Retrieves push credentials associated to a mobile application

Retrieves push credentials for a given mobile application based on filters for a user

### Example

```java
import java.time.LocalDate;
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PushCredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PushCredentialsApi apiInstance = new PushCredentialsApi(defaultClient);
        UUID mobileApplicationId = UUID.fromString("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0"); // UUID | The unique identifier of a mobile application
        LocalDate filterCreatedAtEq = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering credentials created on that date
        LocalDate filterCreatedAtGte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering credentials created after that date
        LocalDate filterCreatedAtLte = LocalDate.parse("Sat Apr 24 19:00:00 CDT 2021"); // LocalDate | ISO 8601 date for filtering credentials created before that date
        String filterAlias = "LucyCredential"; // String | Unique push credential alias
        try {
            List<PushCredentialResponse> result = apiInstance.getPushCredentials(mobileApplicationId, filterCreatedAtEq, filterCreatedAtGte, filterCreatedAtLte, filterAlias);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushCredentialsApi#getPushCredentials");
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
 **mobileApplicationId** | **UUID**| The unique identifier of a mobile application |
 **filterCreatedAtEq** | **LocalDate**| ISO 8601 date for filtering credentials created on that date | [optional]
 **filterCreatedAtGte** | **LocalDate**| ISO 8601 date for filtering credentials created after that date | [optional]
 **filterCreatedAtLte** | **LocalDate**| ISO 8601 date for filtering credentials created before that date | [optional]
 **filterAlias** | **String**| Unique push credential alias | [optional]

### Return type

[**List&lt;PushCredentialResponse&gt;**](PushCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mobile application created |  -  |
| **401** | Unauthorized request |  -  |
| **422** | Unable to process request |  -  |


## updatePushCredentialById

> PushCredentialResponse updatePushCredentialById(pushCredentialId, UNKNOWN_BASE_TYPE)

Updates a push credential

Updates a push credential based on the given `id`

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PushCredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PushCredentialsApi apiInstance = new PushCredentialsApi(defaultClient);
        UUID pushCredentialId = UUID.fromString("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0"); // UUID | The unique identifier of a push credential
        UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = new UNKNOWN_BASE_TYPE(); // UNKNOWN_BASE_TYPE | Push credential parameters that need to be sent in the request
        try {
            PushCredentialResponse result = apiInstance.updatePushCredentialById(pushCredentialId, UNKNOWN_BASE_TYPE);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushCredentialsApi#updatePushCredentialById");
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
 **pushCredentialId** | **UUID**| The unique identifier of a push credential |
 **UNKNOWN_BASE_TYPE** | **UNKNOWN_BASE_TYPE**| Push credential parameters that need to be sent in the request | [optional]

### Return type

[**PushCredentialResponse**](PushCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The push credential was updated successfully |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Resource not found |  -  |
| **422** | Unable to process request |  -  |

