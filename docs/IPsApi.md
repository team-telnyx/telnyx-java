# IPsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIp**](IPsApi.md#createIp) | **POST** /ips | Create an Ip
[**deleteIp**](IPsApi.md#deleteIp) | **DELETE** /ips/{id} | Delete an Ip
[**listIps**](IPsApi.md#listIps) | **GET** /ips | List Ips
[**retrieveIp**](IPsApi.md#retrieveIp) | **GET** /ips/{id} | Retrieve an Ip
[**updateIp**](IPsApi.md#updateIp) | **PATCH** /ips/{id} | Update an Ip



## createIp

> IpResponse createIp(createIpRequest)

Create an Ip

Create a new IP object.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IPsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IPsApi apiInstance = new IPsApi(defaultClient);
        CreateIpRequest createIpRequest = new CreateIpRequest(); // CreateIpRequest | 
        try {
            IpResponse result = apiInstance.createIp(createIpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IPsApi#createIp");
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
 **createIpRequest** | [**CreateIpRequest**](CreateIpRequest.md)|  | [optional]

### Return type

[**IpResponse**](IpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response with details about an IP. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |


## deleteIp

> IpResponse deleteIp(id)

Delete an Ip

Delete an IP.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IPsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IPsApi apiInstance = new IPsApi(defaultClient);
        UUID id = 6a09cdc3-8948-47f0-aa62-74ac943d6c58; // UUID | Identifies the type of resource.
        try {
            IpResponse result = apiInstance.deleteIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IPsApi#deleteIp");
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
 **id** | [**UUID**](.md)| Identifies the type of resource. |

### Return type

[**IpResponse**](IpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an IP. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |


## listIps

> ListIpsResponse listIps().pageNumber(pageNumber).pageSize(pageSize).filterConnectionId(filterConnectionId).filterIpAddress(filterIpAddress).filterPort(filterPort).execute();

List Ips

Get all IPs belonging to the user that match the given filters.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IPsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IPsApi apiInstance = new IPsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 50; // Integer | The size of the page
        String filterConnectionId = "filterConnectionId_example"; // String | ID of the IP Connection to which this IP should be attached.
        String filterIpAddress = 192.168.0.0; // String | IP adddress represented by this resource.
        Integer filterPort = 5060; // Integer | Port to use when connecting to this IP.
        try {
            ListIpsResponse result = api.listIps()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterConnectionId(filterConnectionId)
                .filterIpAddress(filterIpAddress)
                .filterPort(filterPort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IPsApi#listIps");
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
 **filterConnectionId** | **String**| ID of the IP Connection to which this IP should be attached. | [optional]
 **filterIpAddress** | **String**| IP adddress represented by this resource. | [optional]
 **filterPort** | **Integer**| Port to use when connecting to this IP. | [optional]

### Return type

[**ListIpsResponse**](ListIpsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of IPs. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |


## retrieveIp

> IpResponse retrieveIp(id)

Retrieve an Ip

Return the details regarding a specific IP.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IPsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IPsApi apiInstance = new IPsApi(defaultClient);
        UUID id = 6a09cdc3-8948-47f0-aa62-74ac943d6c58; // UUID | Identifies the type of resource.
        try {
            IpResponse result = apiInstance.retrieveIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IPsApi#retrieveIp");
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
 **id** | [**UUID**](.md)| Identifies the type of resource. |

### Return type

[**IpResponse**](IpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an IP. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |


## updateIp

> IpResponse updateIp(id, updateIpRequest)

Update an Ip

Update the details of a specific IP.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.IPsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        IPsApi apiInstance = new IPsApi(defaultClient);
        UUID id = 6a09cdc3-8948-47f0-aa62-74ac943d6c58; // UUID | Identifies the type of resource.
        UpdateIpRequest updateIpRequest = new UpdateIpRequest(); // UpdateIpRequest | 
        try {
            IpResponse result = apiInstance.updateIp(id, updateIpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IPsApi#updateIp");
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
 **id** | [**UUID**](.md)| Identifies the type of resource. |
 **updateIpRequest** | [**UpdateIpRequest**](UpdateIpRequest.md)|  | [optional]

### Return type

[**IpResponse**](IpResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an IP. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

