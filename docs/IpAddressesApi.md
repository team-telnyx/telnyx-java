# IpAddressesApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessIPAddressCreate**](IpAddressesApi.md#accessIPAddressCreate) | **POST** /access_ip_address | Create new Access IP Address
[**accessIPAddressDelete**](IpAddressesApi.md#accessIPAddressDelete) | **DELETE** /access_ip_address/{access_ip_address_id} | Delete access IP address
[**accessIPAddressGet**](IpAddressesApi.md#accessIPAddressGet) | **GET** /access_ip_address/{access_ip_address_id} | Retrieve an access IP address
[**accessIPAddressList**](IpAddressesApi.md#accessIPAddressList) | **GET** /access_ip_address | List all Access IP Addresses



## accessIPAddressCreate

> AccessIPAddressResponseSchema accessIPAddressCreate(accessIPAddressPOST)

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
            AccessIPAddressResponseSchema result = apiInstance.accessIPAddressCreate(accessIPAddressPOST);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressesApi#accessIPAddressCreate");
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


## accessIPAddressDelete

> AccessIPAddressResponseSchema accessIPAddressDelete(accessIpAddressId)

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
            AccessIPAddressResponseSchema result = apiInstance.accessIPAddressDelete(accessIpAddressId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressesApi#accessIPAddressDelete");
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


## accessIPAddressGet

> AccessIPAddressResponseSchema accessIPAddressGet(accessIpAddressId)

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
            AccessIPAddressResponseSchema result = apiInstance.accessIPAddressGet(accessIpAddressId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressesApi#accessIPAddressGet");
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


## accessIPAddressList

> AccessIPAddressListResponseSchema accessIPAddressList(filterIpSource, filterIpAddress, filterStatus, filterCreatedAtGt, filterCreatedAtLt, pageNumber, pageSize)

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
        CloudflareSyncStatus filterStatus = CloudflareSyncStatus.fromValue("pending"); // CloudflareSyncStatus | 
        OffsetDateTime filterCreatedAtGt = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime filterCreatedAtLt = OffsetDateTime.now(); // OffsetDateTime | 
        Integer pageNumber = 1; // Integer | 
        Integer pageSize = 20; // Integer | 
        try {
            AccessIPAddressListResponseSchema result = apiInstance.accessIPAddressList(filterIpSource, filterIpAddress, filterStatus, filterCreatedAtGt, filterCreatedAtLt, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpAddressesApi#accessIPAddressList");
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
 **filterStatus** | **CloudflareSyncStatus**|  | [optional] [enum: pending, added]
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

