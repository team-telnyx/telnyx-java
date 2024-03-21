# GlobalIpsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGlobalIp**](GlobalIpsApi.md#createGlobalIp) | **POST** /global_ips | Create a Global IP
[**createGlobalIpAssignment**](GlobalIpsApi.md#createGlobalIpAssignment) | **POST** /global_ip_assignments | Create a Global IP assignment
[**createGlobalIpHealthCheck**](GlobalIpsApi.md#createGlobalIpHealthCheck) | **POST** /global_ip_health_checks | Create a Global IP health check
[**deleteGlobalIp**](GlobalIpsApi.md#deleteGlobalIp) | **DELETE** /global_ips/{id} | Delete a Global IP
[**deleteGlobalIpAssignment**](GlobalIpsApi.md#deleteGlobalIpAssignment) | **DELETE** /global_ip_assignments/{id} | Delete a Global IP assignment
[**deleteGlobalIpHealthCheck**](GlobalIpsApi.md#deleteGlobalIpHealthCheck) | **DELETE** /global_ip_health_checks/{id} | Delete a Global IP health check
[**getGlobalIp**](GlobalIpsApi.md#getGlobalIp) | **GET** /global_ips/{id} | Retrieve a Global IP
[**getGlobalIpAssignment**](GlobalIpsApi.md#getGlobalIpAssignment) | **GET** /global_ip_assignments/{id} | Retrieve a Global IP
[**getGlobalIpAssignmentHealth**](GlobalIpsApi.md#getGlobalIpAssignmentHealth) | **GET** /global_ip_assignment_health | 
[**getGlobalIpAssignmentUsage**](GlobalIpsApi.md#getGlobalIpAssignmentUsage) | **GET** /global_ip_assignments_usage | 
[**getGlobalIpHealthCheck**](GlobalIpsApi.md#getGlobalIpHealthCheck) | **GET** /global_ip_health_checks/{id} | Retrieve a Global IP health check
[**getGlobalIpLatency**](GlobalIpsApi.md#getGlobalIpLatency) | **GET** /global_ip_latency | 
[**getGlobalIpUsage**](GlobalIpsApi.md#getGlobalIpUsage) | **GET** /global_ip_usage | 
[**listGlobalIpAllowedPorts**](GlobalIpsApi.md#listGlobalIpAllowedPorts) | **GET** /global_ip_allowed_ports | List all Global IP Allowed Ports
[**listGlobalIpAssignments**](GlobalIpsApi.md#listGlobalIpAssignments) | **GET** /global_ip_assignments | List all Global IP assignments
[**listGlobalIpHealthCheckTypes**](GlobalIpsApi.md#listGlobalIpHealthCheckTypes) | **GET** /global_ip_health_check_types | List all Global IP Health check types
[**listGlobalIpHealthChecks**](GlobalIpsApi.md#listGlobalIpHealthChecks) | **GET** /global_ip_health_checks | List all Global IP health checks
[**listGlobalIpProtocols**](GlobalIpsApi.md#listGlobalIpProtocols) | **GET** /global_ip_protocols | List all Global IP Protocols
[**listGlobalIps**](GlobalIpsApi.md#listGlobalIps) | **GET** /global_ips | List all Global IPs
[**updateGlobalIpAssignment**](GlobalIpsApi.md#updateGlobalIpAssignment) | **PATCH** /global_ip_assignments/{id} | Update a Global IP assignment



## createGlobalIp

> CreateGlobalIp202Response createGlobalIp(globalIP)

Create a Global IP

Create a Global IP.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        GlobalIP globalIP = new GlobalIP(); // GlobalIP | 
        try {
            CreateGlobalIp202Response result = apiInstance.createGlobalIp(globalIP);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#createGlobalIp");
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
 **globalIP** | [**GlobalIP**](GlobalIP.md)|  |

### Return type

[**CreateGlobalIp202Response**](CreateGlobalIp202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## createGlobalIpAssignment

> CreateGlobalIpAssignment202Response createGlobalIpAssignment(globalIpAssignment)

Create a Global IP assignment

Create a Global IP assignment.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        GlobalIpAssignment globalIpAssignment = new GlobalIpAssignment(); // GlobalIpAssignment | 
        try {
            CreateGlobalIpAssignment202Response result = apiInstance.createGlobalIpAssignment(globalIpAssignment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#createGlobalIpAssignment");
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
 **globalIpAssignment** | [**GlobalIpAssignment**](GlobalIpAssignment.md)|  |

### Return type

[**CreateGlobalIpAssignment202Response**](CreateGlobalIpAssignment202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## createGlobalIpHealthCheck

> CreateGlobalIpHealthCheck202Response createGlobalIpHealthCheck(globalIPHealthCheck)

Create a Global IP health check

Create a Global IP health check.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        GlobalIPHealthCheck globalIPHealthCheck = new GlobalIPHealthCheck(); // GlobalIPHealthCheck | 
        try {
            CreateGlobalIpHealthCheck202Response result = apiInstance.createGlobalIpHealthCheck(globalIPHealthCheck);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#createGlobalIpHealthCheck");
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
 **globalIPHealthCheck** | [**GlobalIPHealthCheck**](GlobalIPHealthCheck.md)|  |

### Return type

[**CreateGlobalIpHealthCheck202Response**](CreateGlobalIpHealthCheck202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## deleteGlobalIp

> CreateGlobalIp202Response deleteGlobalIp(id)

Delete a Global IP

Delete a Global IP.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateGlobalIp202Response result = apiInstance.deleteGlobalIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#deleteGlobalIp");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**CreateGlobalIp202Response**](CreateGlobalIp202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## deleteGlobalIpAssignment

> CreateGlobalIpAssignment202Response deleteGlobalIpAssignment(id)

Delete a Global IP assignment

Delete a Global IP assignment.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateGlobalIpAssignment202Response result = apiInstance.deleteGlobalIpAssignment(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#deleteGlobalIpAssignment");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**CreateGlobalIpAssignment202Response**](CreateGlobalIpAssignment202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## deleteGlobalIpHealthCheck

> CreateGlobalIpHealthCheck202Response deleteGlobalIpHealthCheck(id)

Delete a Global IP health check

Delete a Global IP health check.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateGlobalIpHealthCheck202Response result = apiInstance.deleteGlobalIpHealthCheck(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#deleteGlobalIpHealthCheck");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**CreateGlobalIpHealthCheck202Response**](CreateGlobalIpHealthCheck202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## getGlobalIp

> CreateGlobalIp202Response getGlobalIp(id)

Retrieve a Global IP

Retrieve a Global IP.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateGlobalIp202Response result = apiInstance.getGlobalIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#getGlobalIp");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**CreateGlobalIp202Response**](CreateGlobalIp202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## getGlobalIpAssignment

> CreateGlobalIpAssignment202Response getGlobalIpAssignment(id)

Retrieve a Global IP

Retrieve a Global IP assignment.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateGlobalIpAssignment202Response result = apiInstance.getGlobalIpAssignment(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#getGlobalIpAssignment");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**CreateGlobalIpAssignment202Response**](CreateGlobalIpAssignment202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## getGlobalIpAssignmentHealth

> GetGlobalIpAssignmentHealth200Response getGlobalIpAssignmentHealth(filterGlobalIpIdIn, filterGlobalIpAssignmentIdIn, filterTimestampGt, filterTimestampLt)



### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        String filterGlobalIpIdIn = "filterGlobalIpIdIn_example"; // String | Filter by Global IP ID(s) separated by commas
        String filterGlobalIpAssignmentIdIn = "filterGlobalIpAssignmentIdIn_example"; // String | Filter by Global IP Assignment ID(s) separated by commas
        OffsetDateTime filterTimestampGt = OffsetDateTime.parse("2019-01-01T00:00Z"); // OffsetDateTime | Filter by timestamp greater than
        OffsetDateTime filterTimestampLt = OffsetDateTime.parse("2019-01-01T00:00Z"); // OffsetDateTime | Filter by timestamp less than
        try {
            GetGlobalIpAssignmentHealth200Response result = apiInstance.getGlobalIpAssignmentHealth(filterGlobalIpIdIn, filterGlobalIpAssignmentIdIn, filterTimestampGt, filterTimestampLt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#getGlobalIpAssignmentHealth");
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
 **filterGlobalIpIdIn** | **String**| Filter by Global IP ID(s) separated by commas | [optional]
 **filterGlobalIpAssignmentIdIn** | **String**| Filter by Global IP Assignment ID(s) separated by commas | [optional]
 **filterTimestampGt** | **OffsetDateTime**| Filter by timestamp greater than | [optional]
 **filterTimestampLt** | **OffsetDateTime**| Filter by timestamp less than | [optional]

### Return type

[**GetGlobalIpAssignmentHealth200Response**](GetGlobalIpAssignmentHealth200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## getGlobalIpAssignmentUsage

> GetGlobalIpAssignmentUsage200Response getGlobalIpAssignmentUsage(filterGlobalIpAssignmentIdIn, filterGlobalIpIdIn, filterTimestampGt, filterTimestampLt)



### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        String filterGlobalIpAssignmentIdIn = "filterGlobalIpAssignmentIdIn_example"; // String | Filter by Global IP Assignment ID(s) separated by commas
        String filterGlobalIpIdIn = "filterGlobalIpIdIn_example"; // String | Filter by Global IP ID(s), separated by commas
        OffsetDateTime filterTimestampGt = OffsetDateTime.parse("2019-01-01T00:00Z"); // OffsetDateTime | Filter by timestamp greater than
        OffsetDateTime filterTimestampLt = OffsetDateTime.parse("2019-01-01T00:00Z"); // OffsetDateTime | Filter by timestamp less than
        try {
            GetGlobalIpAssignmentUsage200Response result = apiInstance.getGlobalIpAssignmentUsage(filterGlobalIpAssignmentIdIn, filterGlobalIpIdIn, filterTimestampGt, filterTimestampLt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#getGlobalIpAssignmentUsage");
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
 **filterGlobalIpAssignmentIdIn** | **String**| Filter by Global IP Assignment ID(s) separated by commas | [optional]
 **filterGlobalIpIdIn** | **String**| Filter by Global IP ID(s), separated by commas | [optional]
 **filterTimestampGt** | **OffsetDateTime**| Filter by timestamp greater than | [optional]
 **filterTimestampLt** | **OffsetDateTime**| Filter by timestamp less than | [optional]

### Return type

[**GetGlobalIpAssignmentUsage200Response**](GetGlobalIpAssignmentUsage200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## getGlobalIpHealthCheck

> CreateGlobalIpHealthCheck202Response getGlobalIpHealthCheck(id)

Retrieve a Global IP health check

Retrieve a Global IP health check.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateGlobalIpHealthCheck202Response result = apiInstance.getGlobalIpHealthCheck(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#getGlobalIpHealthCheck");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**CreateGlobalIpHealthCheck202Response**](CreateGlobalIpHealthCheck202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## getGlobalIpLatency

> GetGlobalIpLatency200Response getGlobalIpLatency(filterGlobalIpIdIn, filterTimestampGt, filterTimestampLt)



### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        String filterGlobalIpIdIn = "filterGlobalIpIdIn_example"; // String | Filter by Global IP ID(s) separated by commas
        OffsetDateTime filterTimestampGt = OffsetDateTime.parse("2019-01-01T00:00Z"); // OffsetDateTime | Filter by timestamp greater than
        OffsetDateTime filterTimestampLt = OffsetDateTime.parse("2019-01-01T00:00Z"); // OffsetDateTime | Filter by timestamp less than
        try {
            GetGlobalIpLatency200Response result = apiInstance.getGlobalIpLatency(filterGlobalIpIdIn, filterTimestampGt, filterTimestampLt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#getGlobalIpLatency");
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
 **filterGlobalIpIdIn** | **String**| Filter by Global IP ID(s) separated by commas | [optional]
 **filterTimestampGt** | **OffsetDateTime**| Filter by timestamp greater than | [optional]
 **filterTimestampLt** | **OffsetDateTime**| Filter by timestamp less than | [optional]

### Return type

[**GetGlobalIpLatency200Response**](GetGlobalIpLatency200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## getGlobalIpUsage

> GetGlobalIpUsage200Response getGlobalIpUsage(filterGlobalIpIdIn, filterTimestampGt, filterTimestampLt)



### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        String filterGlobalIpIdIn = "filterGlobalIpIdIn_example"; // String | Filter by Global IP ID(s) separated by commas
        OffsetDateTime filterTimestampGt = OffsetDateTime.parse("2019-01-01T00:00Z"); // OffsetDateTime | Filter by timestamp greater than
        OffsetDateTime filterTimestampLt = OffsetDateTime.parse("2019-01-01T00:00Z"); // OffsetDateTime | Filter by timestamp less than
        try {
            GetGlobalIpUsage200Response result = apiInstance.getGlobalIpUsage(filterGlobalIpIdIn, filterTimestampGt, filterTimestampLt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#getGlobalIpUsage");
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
 **filterGlobalIpIdIn** | **String**| Filter by Global IP ID(s) separated by commas | [optional]
 **filterTimestampGt** | **OffsetDateTime**| Filter by timestamp greater than | [optional]
 **filterTimestampLt** | **OffsetDateTime**| Filter by timestamp less than | [optional]

### Return type

[**GetGlobalIpUsage200Response**](GetGlobalIpUsage200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## listGlobalIpAllowedPorts

> ListGlobalIpAllowedPorts200Response listGlobalIpAllowedPorts()

List all Global IP Allowed Ports

List all Global IP Allowed Ports

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        try {
            ListGlobalIpAllowedPorts200Response result = apiInstance.listGlobalIpAllowedPorts();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#listGlobalIpAllowedPorts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListGlobalIpAllowedPorts200Response**](ListGlobalIpAllowedPorts200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## listGlobalIpAssignments

> ListGlobalIpAssignments200Response listGlobalIpAssignments(pageNumber, pageSize)

List all Global IP assignments

List all Global IP assignments.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListGlobalIpAssignments200Response result = apiInstance.listGlobalIpAssignments(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#listGlobalIpAssignments");
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

### Return type

[**ListGlobalIpAssignments200Response**](ListGlobalIpAssignments200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## listGlobalIpHealthCheckTypes

> ListGlobalIpHealthCheckTypes200Response listGlobalIpHealthCheckTypes()

List all Global IP Health check types

List all Global IP Health check types.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        try {
            ListGlobalIpHealthCheckTypes200Response result = apiInstance.listGlobalIpHealthCheckTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#listGlobalIpHealthCheckTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListGlobalIpHealthCheckTypes200Response**](ListGlobalIpHealthCheckTypes200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## listGlobalIpHealthChecks

> ListGlobalIpHealthChecks200Response listGlobalIpHealthChecks(pageNumber, pageSize)

List all Global IP health checks

List all Global IP health checks.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListGlobalIpHealthChecks200Response result = apiInstance.listGlobalIpHealthChecks(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#listGlobalIpHealthChecks");
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

### Return type

[**ListGlobalIpHealthChecks200Response**](ListGlobalIpHealthChecks200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## listGlobalIpProtocols

> ListGlobalIpProtocols200Response listGlobalIpProtocols()

List all Global IP Protocols

List all Global IP Protocols

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        try {
            ListGlobalIpProtocols200Response result = apiInstance.listGlobalIpProtocols();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#listGlobalIpProtocols");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListGlobalIpProtocols200Response**](ListGlobalIpProtocols200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## listGlobalIps

> ListGlobalIps200Response listGlobalIps(pageNumber, pageSize)

List all Global IPs

List all Global IPs.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListGlobalIps200Response result = apiInstance.listGlobalIps(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#listGlobalIps");
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

### Return type

[**ListGlobalIps200Response**](ListGlobalIps200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |


## updateGlobalIpAssignment

> CreateGlobalIpAssignment202Response updateGlobalIpAssignment(id, globalIpAssignmentUpdate)

Update a Global IP assignment

Update a Global IP assignment.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.GlobalIpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GlobalIpsApi apiInstance = new GlobalIpsApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        GlobalIpAssignmentUpdate globalIpAssignmentUpdate = new GlobalIpAssignmentUpdate(); // GlobalIpAssignmentUpdate | 
        try {
            CreateGlobalIpAssignment202Response result = apiInstance.updateGlobalIpAssignment(id, globalIpAssignmentUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalIpsApi#updateGlobalIpAssignment");
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
 **id** | **UUID**| Identifies the resource. |
 **globalIpAssignmentUpdate** | [**GlobalIpAssignmentUpdate**](GlobalIpAssignmentUpdate.md)|  |

### Return type

[**CreateGlobalIpAssignment202Response**](CreateGlobalIpAssignment202Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |

