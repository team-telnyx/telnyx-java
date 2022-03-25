# AccessControlIpsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessControlIp**](AccessControlIpsApi.md#createAccessControlIp) | **POST** /access_control_ips | Adds an access control IP
[**deleteAccessControlIp**](AccessControlIpsApi.md#deleteAccessControlIp) | **DELETE** /access_control_ips/{id} | Deletes an access control IP
[**findAccessControlIps**](AccessControlIpsApi.md#findAccessControlIps) | **GET** /access_control_ips | List all access control IPs
[**getAccessControlIp**](AccessControlIpsApi.md#getAccessControlIp) | **GET** /access_control_ips/{id} | Retrieve an access control IP
[**updateAccessControlIp**](AccessControlIpsApi.md#updateAccessControlIp) | **PATCH** /access_control_ips/{id} | Update an access control IP



## createAccessControlIp

> AccessControlIpResponse createAccessControlIp(accessControlIpCreate)

Adds an access control IP

This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).)

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AccessControlIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AccessControlIpsApi apiInstance = new AccessControlIpsApi(defaultClient);
        AccessControlIpCreate accessControlIpCreate = new AccessControlIpCreate(); // AccessControlIpCreate | Parameters that can be defined during access control IP creation
        try {
            AccessControlIpResponse result = apiInstance.createAccessControlIp(accessControlIpCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessControlIpsApi#createAccessControlIp");
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
 **accessControlIpCreate** | [**AccessControlIpCreate**](AccessControlIpCreate.md)| Parameters that can be defined during access control IP creation |

### Return type

[**AccessControlIpResponse**](AccessControlIpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | Bad request |  -  |


## deleteAccessControlIp

> AccessControlIpResponse deleteAccessControlIp(id)

Deletes an access control IP

This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).)

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AccessControlIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AccessControlIpsApi apiInstance = new AccessControlIpsApi(defaultClient);
        String id = "id_example"; // String | access control IP ID
        try {
            AccessControlIpResponse result = apiInstance.deleteAccessControlIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessControlIpsApi#deleteAccessControlIp");
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
 **id** | **String**| access control IP ID |

### Return type

[**AccessControlIpResponse**](AccessControlIpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## findAccessControlIps

> GetAllAccessControlIpResponse findAccessControlIps(pageNumber, pageSize, filterIpAddressEq)

List all access control IPs

This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AccessControlIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AccessControlIpsApi apiInstance = new AccessControlIpsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterIpAddressEq = "filterIpAddressEq_example"; // String | Filter access control IPs via the ip_address sent.
        try {
            GetAllAccessControlIpResponse result = apiInstance.findAccessControlIps(pageNumber, pageSize, filterIpAddressEq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessControlIpsApi#findAccessControlIps");
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
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterIpAddressEq** | **String**| Filter access control IPs via the ip_address sent. | [optional]

### Return type

[**GetAllAccessControlIpResponse**](GetAllAccessControlIpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |


## getAccessControlIp

> AccessControlIpResponse getAccessControlIp(id)

Retrieve an access control IP

This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AccessControlIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AccessControlIpsApi apiInstance = new AccessControlIpsApi(defaultClient);
        String id = "id_example"; // String | access control IP ID
        try {
            AccessControlIpResponse result = apiInstance.getAccessControlIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessControlIpsApi#getAccessControlIp");
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
 **id** | **String**| access control IP ID |

### Return type

[**AccessControlIpResponse**](AccessControlIpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## updateAccessControlIp

> AccessControlIpResponse updateAccessControlIp(id, accessControlIpUpdate)

Update an access control IP

This endpoint will be deprecated on 15th March 2022 and has been replaced by the following APIs, [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses) and [api.telnyx.com/v2/access_ip_ranges](https://developers.telnyx.com/docs/api/v2/account/IP-Ranges). We recommend that Customers already using this endpoint transition to using: [api.telnyx.com/v2/access_ip_address](https://developers.telnyx.com/docs/api/v2/account/IP-Addresses).)

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.AccessControlIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        AccessControlIpsApi apiInstance = new AccessControlIpsApi(defaultClient);
        String id = "id_example"; // String | access control IP ID
        AccessControlIpUpdate accessControlIpUpdate = new AccessControlIpUpdate(); // AccessControlIpUpdate | Parameters to update on the access control IP record
        try {
            AccessControlIpResponse result = apiInstance.updateAccessControlIp(id, accessControlIpUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccessControlIpsApi#updateAccessControlIp");
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
 **id** | **String**| access control IP ID |
 **accessControlIpUpdate** | [**AccessControlIpUpdate**](AccessControlIpUpdate.md)| Parameters to update on the access control IP record |

### Return type

[**AccessControlIpResponse**](AccessControlIpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |

