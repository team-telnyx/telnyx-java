# DynamicEmergencyEndpointsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDyanmicEmergencyEndpoint**](DynamicEmergencyEndpointsApi.md#createDyanmicEmergencyEndpoint) | **POST** /dynamic_emergency_endpoints | Create a dynamic emergency endpoint.
[**deleteDynamicEmergencyEndpoint**](DynamicEmergencyEndpointsApi.md#deleteDynamicEmergencyEndpoint) | **DELETE** /dynamic_emergency_endpoints/{id} | Delete a dynamic emergency endpoint
[**getDynamicEmergencyEndpoint**](DynamicEmergencyEndpointsApi.md#getDynamicEmergencyEndpoint) | **GET** /dynamic_emergency_endpoints/{id} | Get a dynamic emergency endpoint
[**listDyanmicEmergencyEndpoints**](DynamicEmergencyEndpointsApi.md#listDyanmicEmergencyEndpoints) | **GET** /dynamic_emergency_endpoints | List dynamic emergency endpoints



## createDyanmicEmergencyEndpoint

> DynamicEmergencyEndpointResponse createDyanmicEmergencyEndpoint(dynamicEmergencyEndpoint)

Create a dynamic emergency endpoint.

Creates a dynamic emergency endpoints.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DynamicEmergencyEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DynamicEmergencyEndpointsApi apiInstance = new DynamicEmergencyEndpointsApi(defaultClient);
        DynamicEmergencyEndpoint dynamicEmergencyEndpoint = new DynamicEmergencyEndpoint(); // DynamicEmergencyEndpoint | 
        try {
            DynamicEmergencyEndpointResponse result = apiInstance.createDyanmicEmergencyEndpoint(dynamicEmergencyEndpoint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamicEmergencyEndpointsApi#createDyanmicEmergencyEndpoint");
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
 **dynamicEmergencyEndpoint** | [**DynamicEmergencyEndpoint**](DynamicEmergencyEndpoint.md)|  |

### Return type

[**DynamicEmergencyEndpointResponse**](DynamicEmergencyEndpointResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Dynamic Emergency Endpoint Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## deleteDynamicEmergencyEndpoint

> DynamicEmergencyEndpointResponse deleteDynamicEmergencyEndpoint(id)

Delete a dynamic emergency endpoint

Deletes the dynamic emergency endpoint based on the ID provided

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DynamicEmergencyEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DynamicEmergencyEndpointsApi apiInstance = new DynamicEmergencyEndpointsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Dynamic Emergency Endpoint id
        try {
            DynamicEmergencyEndpointResponse result = apiInstance.deleteDynamicEmergencyEndpoint(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamicEmergencyEndpointsApi#deleteDynamicEmergencyEndpoint");
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
 **id** | **UUID**| Dynamic Emergency Endpoint id |

### Return type

[**DynamicEmergencyEndpointResponse**](DynamicEmergencyEndpointResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dynamic Emergency Endpoint Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## getDynamicEmergencyEndpoint

> DynamicEmergencyEndpointResponse getDynamicEmergencyEndpoint(id)

Get a dynamic emergency endpoint

Returns the dynamic emergency endpoint based on the ID provided

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DynamicEmergencyEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DynamicEmergencyEndpointsApi apiInstance = new DynamicEmergencyEndpointsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Dynamic Emergency Endpoint id
        try {
            DynamicEmergencyEndpointResponse result = apiInstance.getDynamicEmergencyEndpoint(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamicEmergencyEndpointsApi#getDynamicEmergencyEndpoint");
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
 **id** | **UUID**| Dynamic Emergency Endpoint id |

### Return type

[**DynamicEmergencyEndpointResponse**](DynamicEmergencyEndpointResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dynamic Emergency Endpoint Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listDyanmicEmergencyEndpoints

> ListDynamicEmergencyEndpoints listDyanmicEmergencyEndpoints(filterStatus, filterCountryCode, pageNumber, pageSize)

List dynamic emergency endpoints

Returns the dynamic emergency endpoints according to filters

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DynamicEmergencyEndpointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DynamicEmergencyEndpointsApi apiInstance = new DynamicEmergencyEndpointsApi(defaultClient);
        String filterStatus = "pending"; // String | Filter by status.
        String filterCountryCode = "filterCountryCode_example"; // String | Filter by country code.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListDynamicEmergencyEndpoints result = apiInstance.listDyanmicEmergencyEndpoints(filterStatus, filterCountryCode, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamicEmergencyEndpointsApi#listDyanmicEmergencyEndpoints");
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
 **filterStatus** | **String**| Filter by status. | [optional] [enum: pending, activated, rejected]
 **filterCountryCode** | **String**| Filter by country code. | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListDynamicEmergencyEndpoints**](ListDynamicEmergencyEndpoints.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dynamic Emergency Endpoints Responses |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |

