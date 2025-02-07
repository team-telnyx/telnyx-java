# IpAddressesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessIpAddress**](IpAddressesApi.md#createAccessIpAddress) | **POST** /access_ip_address | Create new Access IP Address
[**deleteAccessIpAddress**](IpAddressesApi.md#deleteAccessIpAddress) | **DELETE** /access_ip_address/{access_ip_address_id} | Delete access IP address
[**getAccessIpAddress**](IpAddressesApi.md#getAccessIpAddress) | **GET** /access_ip_address/{access_ip_address_id} | Retrieve an access IP address
[**listAccessIpAddresses**](IpAddressesApi.md#listAccessIpAddresses) | **GET** /access_ip_address | List all Access IP Addresses



## createAccessIpAddress

> AccessIPAddressResponseSchema createAccessIpAddress(accessIPAddressPOST)

Create new Access IP Address

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpAddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpAddressesApi apiInstance = new IpAddressesApi(defaultClient);
        AccessIPAddressPOST accessIPAddressPOST = new AccessIPAddressPOST(); // AccessIPAddressPOST | 
        try {
            AccessIPAddressResponseSchema result = apiInstance.createAccessIpAddress(accessIPAddressPOST);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressesApi#createAccessIpAddress");
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
 **accessIPAddressPOST** | [**AccessIPAddressPOST**](AccessIPAddressPOST.md)|  |

### Return type

[**AccessIPAddressResponseSchema**](AccessIPAddressResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## deleteAccessIpAddress

> AccessIPAddressResponseSchema deleteAccessIpAddress(accessIpAddressId)

Delete access IP address

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpAddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpAddressesApi apiInstance = new IpAddressesApi(defaultClient);
        String accessIpAddressId = "accessIpAddressId_example"; // String | 
        try {
            AccessIPAddressResponseSchema result = apiInstance.deleteAccessIpAddress(accessIpAddressId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressesApi#deleteAccessIpAddress");
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
 **accessIpAddressId** | **String**|  |

### Return type

[**AccessIPAddressResponseSchema**](AccessIPAddressResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getAccessIpAddress

> AccessIPAddressResponseSchema getAccessIpAddress(accessIpAddressId)

Retrieve an access IP address

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpAddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpAddressesApi apiInstance = new IpAddressesApi(defaultClient);
        String accessIpAddressId = "accessIpAddressId_example"; // String | 
        try {
            AccessIPAddressResponseSchema result = apiInstance.getAccessIpAddress(accessIpAddressId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressesApi#getAccessIpAddress");
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
 **accessIpAddressId** | **String**|  |

### Return type

[**AccessIPAddressResponseSchema**](AccessIPAddressResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## listAccessIpAddresses

> AccessIPAddressListResponseSchema listAccessIpAddresses(filterIpSource, filterIpAddress, filterCreatedAtGt, filterCreatedAtLt, pageNumber, pageSize)

List all Access IP Addresses

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IpAddressesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IpAddressesApi apiInstance = new IpAddressesApi(defaultClient);
        String filterIpSource = "filterIpSource_example"; // String | 
        String filterIpAddress = "filterIpAddress_example"; // String | 
        OffsetDateTime filterCreatedAtGt = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime filterCreatedAtLt = OffsetDateTime.now(); // OffsetDateTime | 
        Integer pageNumber = 1; // Integer | 
        Integer pageSize = 20; // Integer | 
        try {
            AccessIPAddressListResponseSchema result = apiInstance.listAccessIpAddresses(filterIpSource, filterIpAddress, filterCreatedAtGt, filterCreatedAtLt, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressesApi#listAccessIpAddresses");
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
 **filterIpSource** | **String**|  | [optional]
 **filterIpAddress** | **String**|  | [optional]
 **filterCreatedAtGt** | **OffsetDateTime**|  | [optional]
 **filterCreatedAtLt** | **OffsetDateTime**|  | [optional]
 **pageNumber** | **Integer**|  | [optional] [default to 1]
 **pageSize** | **Integer**|  | [optional] [default to 20]

### Return type

[**AccessIPAddressListResponseSchema**](AccessIPAddressListResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

