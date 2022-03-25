# CredentialsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTelephonyCredential**](CredentialsApi.md#createTelephonyCredential) | **POST** /telephony_credentials | Create a credential
[**deleteTelephonyCredential**](CredentialsApi.md#deleteTelephonyCredential) | **DELETE** /telephony_credentials/{id} | Delete a credential
[**findTelephonyCredentials**](CredentialsApi.md#findTelephonyCredentials) | **GET** /telephony_credentials | List all credentials
[**getTelephonyCredential**](CredentialsApi.md#getTelephonyCredential) | **GET** /telephony_credentials/{id} | Get a credential
[**listTags**](CredentialsApi.md#listTags) | **GET** /telephony_credentials/tags | List all tags
[**telephonyCredentialAction**](CredentialsApi.md#telephonyCredentialAction) | **POST** /telephony_credentials/{id}/actions/{action} | Perform activate or deactivate action on provided Credential
[**updateTelephonyCredential**](CredentialsApi.md#updateTelephonyCredential) | **PATCH** /telephony_credentials/{id} | Update a credential



## createTelephonyCredential

> TelephonyCredentialResponse createTelephonyCredential(telephonyCredentialCreateRequest)

Create a credential

Create a credential.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        TelephonyCredentialCreateRequest telephonyCredentialCreateRequest = new TelephonyCredentialCreateRequest(); // TelephonyCredentialCreateRequest | Parameters that can be defined during credential creation
        try {
            TelephonyCredentialResponse result = apiInstance.createTelephonyCredential(telephonyCredentialCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#createTelephonyCredential");
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
 **telephonyCredentialCreateRequest** | [**TelephonyCredentialCreateRequest**](TelephonyCredentialCreateRequest.md)| Parameters that can be defined during credential creation |

### Return type

[**TelephonyCredentialResponse**](TelephonyCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response with details about a credential |  -  |
| **422** | Bad request |  -  |


## deleteTelephonyCredential

> TelephonyCredentialResponse deleteTelephonyCredential(id)

Delete a credential

Delete an existing credential.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String id = "id_example"; // String | Identifies the resource.
        try {
            TelephonyCredentialResponse result = apiInstance.deleteTelephonyCredential(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#deleteTelephonyCredential");
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

[**TelephonyCredentialResponse**](TelephonyCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a credential |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## findTelephonyCredentials

> GetAllTelephonyCredentialResponse findTelephonyCredentials().pageNumber(pageNumber).pageSize(pageSize).filterTag(filterTag).filterName(filterName).filterStatus(filterStatus).filterResourceId(filterResourceId).filterSipUsername(filterSipUsername).execute();

List all credentials

List all On-demand Credentials.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 50; // Integer | The size of the page
        String filterTag = "filterTag_example"; // String | Filter by tag
        String filterName = "filterName_example"; // String | Filter by name
        String filterStatus = "filterStatus_example"; // String | Filter by status
        String filterResourceId = "filterResourceId_example"; // String | Filter by resource_id
        String filterSipUsername = "filterSipUsername_example"; // String | Filter by sip_username
        try {
            GetAllTelephonyCredentialResponse result = api.findTelephonyCredentials()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterTag(filterTag)
                .filterName(filterName)
                .filterStatus(filterStatus)
                .filterResourceId(filterResourceId)
                .filterSipUsername(filterSipUsername)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#findTelephonyCredentials");
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
 **pageSize** | **Integer**| The size of the page | [optional] [default to 50]
 **filterTag** | **String**| Filter by tag | [optional]
 **filterName** | **String**| Filter by name | [optional]
 **filterStatus** | **String**| Filter by status | [optional]
 **filterResourceId** | **String**| Filter by resource_id | [optional]
 **filterSipUsername** | **String**| Filter by sip_username | [optional]

### Return type

[**GetAllTelephonyCredentialResponse**](GetAllTelephonyCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with multiple credentials |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## getTelephonyCredential

> TelephonyCredentialResponse getTelephonyCredential(id)

Get a credential

Get the details of an existing On-demand Credential.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String id = "id_example"; // String | Identifies the resource.
        try {
            TelephonyCredentialResponse result = apiInstance.getTelephonyCredential(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#getTelephonyCredential");
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

[**TelephonyCredentialResponse**](TelephonyCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a credential |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## listTags

> ListTagsResponse listTags(pageNumber, pageSize)

List all tags

Returns a list of tags used on Credentials

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 50; // Integer | The size of the page
        try {
            ListTagsResponse result = apiInstance.listTags(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#listTags");
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
 **pageSize** | **Integer**| The size of the page | [optional] [default to 50]

### Return type

[**ListTagsResponse**](ListTagsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with multiple tags |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## telephonyCredentialAction

> TelephonyCredentialResponse telephonyCredentialAction(id, action)

Perform activate or deactivate action on provided Credential

Perform activate or deactivate action on provided Credential. Activate action will change the status to active, making it possible to connect calls with the credential. Deactivate action will change the status to inactive, making it impossible to connect calls with the credential.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String id = "id_example"; // String | Identifies the resource.
        String action = "action_example"; // String | Identifies the action to be taken.
        try {
            TelephonyCredentialResponse result = apiInstance.telephonyCredentialAction(id, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#telephonyCredentialAction");
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
 **action** | **String**| Identifies the action to be taken. | [enum: activate, deactivate]

### Return type

[**TelephonyCredentialResponse**](TelephonyCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a credential |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## updateTelephonyCredential

> TelephonyCredentialResponse updateTelephonyCredential(id, telephonyCredentialUpdateRequest)

Update a credential

Update an existing credential.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String id = "id_example"; // String | Identifies the resource.
        TelephonyCredentialUpdateRequest telephonyCredentialUpdateRequest = new TelephonyCredentialUpdateRequest(); // TelephonyCredentialUpdateRequest | Parameters that can be updated in a credential
        try {
            TelephonyCredentialResponse result = apiInstance.updateTelephonyCredential(id, telephonyCredentialUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#updateTelephonyCredential");
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
 **telephonyCredentialUpdateRequest** | [**TelephonyCredentialUpdateRequest**](TelephonyCredentialUpdateRequest.md)| Parameters that can be updated in a credential |

### Return type

[**TelephonyCredentialResponse**](TelephonyCredentialResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about a credential |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |

