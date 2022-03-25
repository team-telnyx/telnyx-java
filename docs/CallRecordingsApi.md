# CallRecordingsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomStorageCredentials**](CallRecordingsApi.md#createCustomStorageCredentials) | **POST** /custom_storage_credentials/{connection_id} | Create custom storage credentials
[**deleteCustomStorageCredentials**](CallRecordingsApi.md#deleteCustomStorageCredentials) | **DELETE** /custom_storage_credentials/{connection_id} | Delete stored credentials
[**getCustomStorageCredentials**](CallRecordingsApi.md#getCustomStorageCredentials) | **GET** /custom_storage_credentials/{connection_id} | Retrieve stored credentials
[**updateCustomStorageCredentials**](CallRecordingsApi.md#updateCustomStorageCredentials) | **PUT** /custom_storage_credentials/{connection_id} | Update stored credentials



## createCustomStorageCredentials

> CredentialsResponse createCustomStorageCredentials(connectionId, gcSConfiguration)

Create custom storage credentials

Creates custom storage credentials configuration.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource.
        GCSConfiguration gcSConfiguration = new GCSConfiguration(); // GCSConfiguration | Creates new credentials resource for given connection_id.
        try {
            CredentialsResponse result = apiInstance.createCustomStorageCredentials(connectionId, gcSConfiguration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#createCustomStorageCredentials");
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
 **connectionId** | **String**| Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. |
 **gcSConfiguration** | [**GCSConfiguration**](GCSConfiguration.md)| Creates new credentials resource for given connection_id. |

### Return type

[**CredentialsResponse**](CredentialsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with credentials resource. |  -  |
| **0** | Unexpected error |  -  |


## deleteCustomStorageCredentials

> deleteCustomStorageCredentials(connectionId)

Delete stored credentials

Deletes a stored custom credentials configuration.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource.
        try {
            apiInstance.deleteCustomStorageCredentials(connectionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#deleteCustomStorageCredentials");
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
 **connectionId** | **String**| Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. |

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
| **204** | The credentials configuration for connection_id was deleted successfully. |  -  |
| **0** | Unexpected error |  -  |


## getCustomStorageCredentials

> CredentialsResponse getCustomStorageCredentials(connectionId)

Retrieve stored credentials

Returns the information about custom storage credentials.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource.
        try {
            CredentialsResponse result = apiInstance.getCustomStorageCredentials(connectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#getCustomStorageCredentials");
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
 **connectionId** | **String**| Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. |

### Return type

[**CredentialsResponse**](CredentialsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with credentials resource. |  -  |
| **0** | Unexpected error |  -  |


## updateCustomStorageCredentials

> CredentialsResponse updateCustomStorageCredentials(connectionId, gcSConfiguration)

Update stored credentials

Updates a stored custom credentials configuration.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CallRecordingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CallRecordingsApi apiInstance = new CallRecordingsApi(defaultClient);
        String connectionId = "connectionId_example"; // String | Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource.
        GCSConfiguration gcSConfiguration = new GCSConfiguration(); // GCSConfiguration | Creates new credentials resource for given connection_id.
        try {
            CredentialsResponse result = apiInstance.updateCustomStorageCredentials(connectionId, gcSConfiguration);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallRecordingsApi#updateCustomStorageCredentials");
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
 **connectionId** | **String**| Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. |
 **gcSConfiguration** | [**GCSConfiguration**](GCSConfiguration.md)| Creates new credentials resource for given connection_id. |

### Return type

[**CredentialsResponse**](CredentialsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with credentials resource. |  -  |
| **0** | Unexpected error |  -  |

