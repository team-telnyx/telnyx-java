# NumberPortoutApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findPortoutComments**](NumberPortoutApi.md#findPortoutComments) | **GET** /portouts/{id}/comments | List all comments for a portout request
[**findPortoutRequest**](NumberPortoutApi.md#findPortoutRequest) | **GET** /portouts/{id} | Get a portout request
[**getPortRequestSupportingDocuments**](NumberPortoutApi.md#getPortRequestSupportingDocuments) | **GET** /portouts/{id}/supporting_documents | List supporting documents on a portout request
[**listPortoutRequest**](NumberPortoutApi.md#listPortoutRequest) | **GET** /portouts | List portout requests
[**postPortRequestComment**](NumberPortoutApi.md#postPortRequestComment) | **POST** /portouts/{id}/comments | Create a comment on a portout request
[**postPortRequestSupportingDocuments**](NumberPortoutApi.md#postPortRequestSupportingDocuments) | **POST** /portouts/{id}/supporting_documents | Create a list of supporting documents on a portout request
[**updatePortoutStatus**](NumberPortoutApi.md#updatePortoutStatus) | **PATCH** /portouts/{id}/{status} | Update Status



## findPortoutComments

> FindPortoutComments200Response findPortoutComments(id)

List all comments for a portout request

Returns a list of comments for a portout request.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        try {
            FindPortoutComments200Response result = apiInstance.findPortoutComments(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#findPortoutComments");
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
 **id** | **UUID**| Portout id |

### Return type

[**FindPortoutComments200Response**](FindPortoutComments200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portout Comments |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## findPortoutRequest

> FindPortoutRequest200Response findPortoutRequest(id)

Get a portout request

Returns the portout request based on the ID provided

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        try {
            FindPortoutRequest200Response result = apiInstance.findPortoutRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#findPortoutRequest");
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
 **id** | **UUID**| Portout id |

### Return type

[**FindPortoutRequest200Response**](FindPortoutRequest200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portout Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## getPortRequestSupportingDocuments

> GetPortRequestSupportingDocuments201Response getPortRequestSupportingDocuments(id)

List supporting documents on a portout request

List every supporting documents for a portout request.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        try {
            GetPortRequestSupportingDocuments201Response result = apiInstance.getPortRequestSupportingDocuments(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#getPortRequestSupportingDocuments");
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
 **id** | **UUID**| Portout id |

### Return type

[**GetPortRequestSupportingDocuments201Response**](GetPortRequestSupportingDocuments201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Portout Supporting Documents |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## listPortoutRequest

> ListPortoutRequest200Response listPortoutRequest(filterCarrierName, filterSpid, filterStatus, pageNumber, pageSize)

List portout requests

Returns the portout requests according to filters

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        String filterCarrierName = "filterCarrierName_example"; // String | Filter by new carrier name.
        String filterSpid = "filterSpid_example"; // String | Filter by new carrier spid.
        String filterStatus = "pending"; // String | Filter by portout status.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListPortoutRequest200Response result = apiInstance.listPortoutRequest(filterCarrierName, filterSpid, filterStatus, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#listPortoutRequest");
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
 **filterCarrierName** | **String**| Filter by new carrier name. | [optional]
 **filterSpid** | **String**| Filter by new carrier spid. | [optional]
 **filterStatus** | **String**| Filter by portout status. | [optional] [enum: pending, authorized, ported, rejected, rejected-pending, canceled]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListPortoutRequest200Response**](ListPortoutRequest200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portout Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## postPortRequestComment

> PostPortRequestComment201Response postPortRequestComment(id, postPortRequestCommentRequest)

Create a comment on a portout request

Creates a comment on a portout request.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        PostPortRequestCommentRequest postPortRequestCommentRequest = new PostPortRequestCommentRequest(); // PostPortRequestCommentRequest | 
        try {
            PostPortRequestComment201Response result = apiInstance.postPortRequestComment(id, postPortRequestCommentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#postPortRequestComment");
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
 **id** | **UUID**| Portout id |
 **postPortRequestCommentRequest** | [**PostPortRequestCommentRequest**](PostPortRequestCommentRequest.md)|  |

### Return type

[**PostPortRequestComment201Response**](PostPortRequestComment201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Portout Comment Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## postPortRequestSupportingDocuments

> GetPortRequestSupportingDocuments201Response postPortRequestSupportingDocuments(id, postPortRequestSupportingDocumentsRequest)

Create a list of supporting documents on a portout request

Creates a list of supporting documents on a portout request.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        PostPortRequestSupportingDocumentsRequest postPortRequestSupportingDocumentsRequest = new PostPortRequestSupportingDocumentsRequest(); // PostPortRequestSupportingDocumentsRequest | 
        try {
            GetPortRequestSupportingDocuments201Response result = apiInstance.postPortRequestSupportingDocuments(id, postPortRequestSupportingDocumentsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#postPortRequestSupportingDocuments");
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
 **id** | **UUID**| Portout id |
 **postPortRequestSupportingDocumentsRequest** | [**PostPortRequestSupportingDocumentsRequest**](PostPortRequestSupportingDocumentsRequest.md)|  |

### Return type

[**GetPortRequestSupportingDocuments201Response**](GetPortRequestSupportingDocuments201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Portout Supporting Documents |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## updatePortoutStatus

> FindPortoutRequest200Response updatePortoutStatus(id, status, updatePortoutStatusRequest)

Update Status

Authorize or reject portout request

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        String status = "authorized"; // String | Updated portout status
        UpdatePortoutStatusRequest updatePortoutStatusRequest = new UpdatePortoutStatusRequest(); // UpdatePortoutStatusRequest | 
        try {
            FindPortoutRequest200Response result = apiInstance.updatePortoutStatus(id, status, updatePortoutStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#updatePortoutStatus");
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
 **id** | **UUID**| Portout id |
 **status** | **String**| Updated portout status | [enum: authorized, rejected-pending]
 **updatePortoutStatusRequest** | [**UpdatePortoutStatusRequest**](UpdatePortoutStatusRequest.md)|  |

### Return type

[**FindPortoutRequest200Response**](FindPortoutRequest200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portout Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |

