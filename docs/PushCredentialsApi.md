# PushCredentialsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPushCredential**](PushCredentialsApi.md#createPushCredential) | **POST** /mobile_push_credentials | Creates a new mobile push credential
[**deletePushCredentialById**](PushCredentialsApi.md#deletePushCredentialById) | **DELETE** /mobile_push_credentials/{push_credential_id} | Deletes a mobile push credential
[**getPushCredentialById**](PushCredentialsApi.md#getPushCredentialById) | **GET** /mobile_push_credentials/{push_credential_id} | Retrieves a mobile push credential
[**listPushCredentials**](PushCredentialsApi.md#listPushCredentials) | **GET** /mobile_push_credentials | List mobile push credentials



## createPushCredential

> PushCredentialResponse createPushCredential(createPushCredentialRequest)

Creates a new mobile push credential

Creates a new mobile push credential

### Example

```java
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
        CreatePushCredentialRequest createPushCredentialRequest = new CreatePushCredentialRequest(); // CreatePushCredentialRequest | Mobile push credential parameters that need to be sent in the request
        try {
            PushCredentialResponse result = apiInstance.createPushCredential(createPushCredentialRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushCredentialsApi#createPushCredential");
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
 **createPushCredentialRequest** | [**CreatePushCredentialRequest**](CreatePushCredentialRequest.md)| Mobile push credential parameters that need to be sent in the request |

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
| **200** | Mobile push credential created |  -  |
| **401** | Unauthorized request |  -  |
| **422** | Unable to process request |  -  |


## deletePushCredentialById

> deletePushCredentialById(pushCredentialId)

Deletes a mobile push credential

Deletes a mobile push credential based on the given `push_credential_id`

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
        UUID pushCredentialId = UUID.fromString("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0"); // UUID | The unique identifier of a mobile push credential
        try {
            apiInstance.deletePushCredentialById(pushCredentialId);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushCredentialsApi#deletePushCredentialById");
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
 **pushCredentialId** | **UUID**| The unique identifier of a mobile push credential |

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
| **204** | The mobile push credential was deleted successfully |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Resource not found |  -  |
| **422** | Unable to process request |  -  |


## getPushCredentialById

> PushCredentialResponse getPushCredentialById(pushCredentialId)

Retrieves a mobile push credential

Retrieves mobile push credential based on the given `push_credential_id`

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
        UUID pushCredentialId = UUID.fromString("0ccc7b76-4df3-4bca-a05a-3da1ecc389f0"); // UUID | The unique identifier of a mobile push credential
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
 **pushCredentialId** | **UUID**| The unique identifier of a mobile push credential |

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
| **200** | Successful get mobile push credential response |  -  |
| **401** | Unauthorized request |  -  |
| **404** | Resource not found |  -  |
| **422** | Unable to process request |  -  |


## listPushCredentials

> ListPushCredentialsResponse listPushCredentials(filterType, filterAlias, pageSize, pageNumber)

List mobile push credentials

List mobile push credentials

### Example

```java
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
        String filterType = "ios"; // String | type of mobile push credentials
        String filterAlias = "LucyCredential"; // String | Unique mobile push credential alias
        Integer pageSize = 20; // Integer | The size of the page
        Integer pageNumber = 1; // Integer | The page number to load
        try {
            ListPushCredentialsResponse result = apiInstance.listPushCredentials(filterType, filterAlias, pageSize, pageNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushCredentialsApi#listPushCredentials");
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
 **filterType** | **String**| type of mobile push credentials | [optional] [enum: ios, android]
 **filterAlias** | **String**| Unique mobile push credential alias | [optional]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]

### Return type

[**ListPushCredentialsResponse**](ListPushCredentialsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mobile mobile push credentials |  -  |
| **401** | Unauthorized request |  -  |

