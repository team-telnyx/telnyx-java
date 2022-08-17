# DynamicEmergencyAddressesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDyanmicEmergencyAddress**](DynamicEmergencyAddressesApi.md#createDyanmicEmergencyAddress) | **POST** /dynamic_emergency_addresses | Create a dynamic emergency address.
[**deleteDynamicEmergencyAddress**](DynamicEmergencyAddressesApi.md#deleteDynamicEmergencyAddress) | **DELETE** /dynamic_emergency_addresses/{id} | Delete a dynamic emergency address
[**getDynamicEmergencyAddress**](DynamicEmergencyAddressesApi.md#getDynamicEmergencyAddress) | **GET** /dynamic_emergency_addresses/{id} | Get a dynamic emergency address
[**listDyanmicEmergencyAddresses**](DynamicEmergencyAddressesApi.md#listDyanmicEmergencyAddresses) | **GET** /dynamic_emergency_addresses | List dynamic emergency addresses



## createDyanmicEmergencyAddress

> CreateDyanmicEmergencyAddress201Response createDyanmicEmergencyAddress(dynamicEmergencyAddress)

Create a dynamic emergency address.

Creates a dynamic emergency address.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DynamicEmergencyAddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DynamicEmergencyAddressesApi apiInstance = new DynamicEmergencyAddressesApi(defaultClient);
        DynamicEmergencyAddress dynamicEmergencyAddress = new DynamicEmergencyAddress(); // DynamicEmergencyAddress | 
        try {
            CreateDyanmicEmergencyAddress201Response result = apiInstance.createDyanmicEmergencyAddress(dynamicEmergencyAddress);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamicEmergencyAddressesApi#createDyanmicEmergencyAddress");
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
 **dynamicEmergencyAddress** | [**DynamicEmergencyAddress**](DynamicEmergencyAddress.md)|  |

### Return type

[**CreateDyanmicEmergencyAddress201Response**](CreateDyanmicEmergencyAddress201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Dynamic Emergency Address Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## deleteDynamicEmergencyAddress

> CreateDyanmicEmergencyAddress201Response deleteDynamicEmergencyAddress(id)

Delete a dynamic emergency address

Deletes the dynamic emergency address based on the ID provided

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DynamicEmergencyAddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DynamicEmergencyAddressesApi apiInstance = new DynamicEmergencyAddressesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Dynamic Emergency Address id
        try {
            CreateDyanmicEmergencyAddress201Response result = apiInstance.deleteDynamicEmergencyAddress(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamicEmergencyAddressesApi#deleteDynamicEmergencyAddress");
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
 **id** | **UUID**| Dynamic Emergency Address id |

### Return type

[**CreateDyanmicEmergencyAddress201Response**](CreateDyanmicEmergencyAddress201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dynamic Emergency Address Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## getDynamicEmergencyAddress

> CreateDyanmicEmergencyAddress201Response getDynamicEmergencyAddress(id)

Get a dynamic emergency address

Returns the dynamic emergency address based on the ID provided

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DynamicEmergencyAddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DynamicEmergencyAddressesApi apiInstance = new DynamicEmergencyAddressesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Dynamic Emergency Address id
        try {
            CreateDyanmicEmergencyAddress201Response result = apiInstance.getDynamicEmergencyAddress(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamicEmergencyAddressesApi#getDynamicEmergencyAddress");
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
 **id** | **UUID**| Dynamic Emergency Address id |

### Return type

[**CreateDyanmicEmergencyAddress201Response**](CreateDyanmicEmergencyAddress201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dynamic Emergency Address Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listDyanmicEmergencyAddresses

> ListDyanmicEmergencyAddresses200Response listDyanmicEmergencyAddresses(filterStatus, filterCountryCode, pageNumber, pageSize)

List dynamic emergency addresses

Returns the dynamic emergency addresses according to filters

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DynamicEmergencyAddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DynamicEmergencyAddressesApi apiInstance = new DynamicEmergencyAddressesApi(defaultClient);
        String filterStatus = "pending"; // String | Filter by status.
        String filterCountryCode = "filterCountryCode_example"; // String | Filter by country code.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListDyanmicEmergencyAddresses200Response result = apiInstance.listDyanmicEmergencyAddresses(filterStatus, filterCountryCode, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DynamicEmergencyAddressesApi#listDyanmicEmergencyAddresses");
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

[**ListDyanmicEmergencyAddresses200Response**](ListDyanmicEmergencyAddresses200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dynamic Emergency Address Responses |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |

