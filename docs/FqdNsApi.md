# FqdnsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessFqdn**](FqdnsApi.md#createAccessFqdn) | **POST** /access_fqdns | Create new Access FQDN
[**createFqdn**](FqdnsApi.md#createFqdn) | **POST** /fqdns | Create an FQDN
[**deleteAccessFqdn**](FqdnsApi.md#deleteAccessFqdn) | **DELETE** /access_fqdns/{fqdn_id} | Delete Access FQDN
[**deleteFqdn**](FqdnsApi.md#deleteFqdn) | **DELETE** /fqdns/{id} | Delete an FQDN
[**listAccessFqdnById**](FqdnsApi.md#listAccessFqdnById) | **GET** /access_fqdns/{fqdn_id} | List an Access FQDN
[**listAllAccessFqdns**](FqdnsApi.md#listAllAccessFqdns) | **GET** /access_fqdns | List all Access FQDNs
[**listAllIpsByFqdn**](FqdnsApi.md#listAllIpsByFqdn) | **GET** /access_fqdns/{fqdn_id}/ips | List Access FQDN&#39;s IP Addresses
[**listFqdns**](FqdnsApi.md#listFqdns) | **GET** /fqdns | List FQDNs
[**retrieveFqdn**](FqdnsApi.md#retrieveFqdn) | **GET** /fqdns/{id} | Retrieve an FQDN
[**updateAccessFqdn**](FqdnsApi.md#updateAccessFqdn) | **PATCH** /access_fqdns/{fqdn_id} | Update Access FQDN
[**updateFqdn**](FqdnsApi.md#updateFqdn) | **PATCH** /fqdns/{id} | Update an FQDN



## createAccessFqdn

> CustomerFacingFQDNsResponseSchema createAccessFqdn(customerFacingFQDNsPost)

Create new Access FQDN

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnsApi apiInstance = new FqdnsApi(defaultClient);
        CustomerFacingFQDNsPost customerFacingFQDNsPost = new CustomerFacingFQDNsPost(); // CustomerFacingFQDNsPost | 
        try {
            CustomerFacingFQDNsResponseSchema result = apiInstance.createAccessFqdn(customerFacingFQDNsPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnsApi#createAccessFqdn");
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
 **customerFacingFQDNsPost** | [**CustomerFacingFQDNsPost**](CustomerFacingFQDNsPost.md)|  |

### Return type

[**CustomerFacingFQDNsResponseSchema**](CustomerFacingFQDNsResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## createFqdn

> FQDNResponse createFqdn(createFqdnRequest)

Create an FQDN

Create a new FQDN object.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnsApi apiInstance = new FqdnsApi(defaultClient);
        CreateFqdnRequest createFqdnRequest = new CreateFqdnRequest(); // CreateFqdnRequest | 
        try {
            FQDNResponse result = apiInstance.createFqdn(createFqdnRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnsApi#createFqdn");
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
 **createFqdnRequest** | [**CreateFqdnRequest**](CreateFqdnRequest.md)|  | [optional]

### Return type

[**FQDNResponse**](FQDNResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response with details about an FQDN connection. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |


## deleteAccessFqdn

> CustomerFacingFQDNsResponseSchema deleteAccessFqdn(fqdnId)

Delete Access FQDN

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnsApi apiInstance = new FqdnsApi(defaultClient);
        String fqdnId = "fqdnId_example"; // String | 
        try {
            CustomerFacingFQDNsResponseSchema result = apiInstance.deleteAccessFqdn(fqdnId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnsApi#deleteAccessFqdn");
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
 **fqdnId** | **String**|  |

### Return type

[**CustomerFacingFQDNsResponseSchema**](CustomerFacingFQDNsResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## deleteFqdn

> FQDNResponse deleteFqdn(id)

Delete an FQDN

Delete an FQDN.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnsApi apiInstance = new FqdnsApi(defaultClient);
        String id = "1517907029795014409"; // String | Identifies the resource.
        try {
            FQDNResponse result = apiInstance.deleteFqdn(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnsApi#deleteFqdn");
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

[**FQDNResponse**](FQDNResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an FQDN connection. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |


## listAccessFqdnById

> CustomerFacingFQDNsResponseSchema listAccessFqdnById(fqdnId)

List an Access FQDN

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnsApi apiInstance = new FqdnsApi(defaultClient);
        String fqdnId = "fqdnId_example"; // String | 
        try {
            CustomerFacingFQDNsResponseSchema result = apiInstance.listAccessFqdnById(fqdnId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnsApi#listAccessFqdnById");
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
 **fqdnId** | **String**|  |

### Return type

[**CustomerFacingFQDNsResponseSchema**](CustomerFacingFQDNsResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## listAllAccessFqdns

> CustomerFacingFQDNsListResponse listAllAccessFqdns(pageNumber, pageSize)

List all Access FQDNs

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnsApi apiInstance = new FqdnsApi(defaultClient);
        Integer pageNumber = 1; // Integer | 
        Integer pageSize = 20; // Integer | 
        try {
            CustomerFacingFQDNsListResponse result = apiInstance.listAllAccessFqdns(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnsApi#listAllAccessFqdns");
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
 **pageNumber** | **Integer**|  | [optional] [default to 1]
 **pageSize** | **Integer**|  | [optional] [default to 20]

### Return type

[**CustomerFacingFQDNsListResponse**](CustomerFacingFQDNsListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## listAllIpsByFqdn

> CustomerFacingFQDNsGetIPResponse listAllIpsByFqdn(fqdnId, pageNumber, pageSize)

List Access FQDN&#39;s IP Addresses

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnsApi apiInstance = new FqdnsApi(defaultClient);
        String fqdnId = "fqdnId_example"; // String | 
        Integer pageNumber = 1; // Integer | 
        Integer pageSize = 20; // Integer | 
        try {
            CustomerFacingFQDNsGetIPResponse result = apiInstance.listAllIpsByFqdn(fqdnId, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnsApi#listAllIpsByFqdn");
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
 **fqdnId** | **String**|  |
 **pageNumber** | **Integer**|  | [optional] [default to 1]
 **pageSize** | **Integer**|  | [optional] [default to 20]

### Return type

[**CustomerFacingFQDNsGetIPResponse**](CustomerFacingFQDNsGetIPResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## listFqdns

> ListFQDNsResponse listFqdns().pageNumber(pageNumber).pageSize(pageSize).filterConnectionId(filterConnectionId).filterFqdn(filterFqdn).filterPort(filterPort).filterDnsRecordType(filterDnsRecordType).execute();

List FQDNs

Get all FQDNs belonging to the user that match the given filters.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnsApi apiInstance = new FqdnsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterConnectionId = "filterConnectionId_example"; // String | ID of the FQDN connection to which the FQDN belongs.
        String filterFqdn = "example.com"; // String | FQDN represented by the resource.
        Integer filterPort = 5060; // Integer | Port to use when connecting to the FQDN.
        String filterDnsRecordType = "a"; // String | DNS record type used by the FQDN.
        try {
            ListFQDNsResponse result = api.listFqdns()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterConnectionId(filterConnectionId)
                .filterFqdn(filterFqdn)
                .filterPort(filterPort)
                .filterDnsRecordType(filterDnsRecordType)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnsApi#listFqdns");
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
 **filterConnectionId** | **String**| ID of the FQDN connection to which the FQDN belongs. | [optional]
 **filterFqdn** | **String**| FQDN represented by the resource. | [optional]
 **filterPort** | **Integer**| Port to use when connecting to the FQDN. | [optional]
 **filterDnsRecordType** | **String**| DNS record type used by the FQDN. | [optional]

### Return type

[**ListFQDNsResponse**](ListFQDNsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of FQDN connections. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |


## retrieveFqdn

> FQDNResponse retrieveFqdn(id)

Retrieve an FQDN

Return the details regarding a specific FQDN.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnsApi apiInstance = new FqdnsApi(defaultClient);
        String id = "1517907029795014409"; // String | Identifies the resource.
        try {
            FQDNResponse result = apiInstance.retrieveFqdn(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnsApi#retrieveFqdn");
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

[**FQDNResponse**](FQDNResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an FQDN connection. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |


## updateAccessFqdn

> CustomerFacingFQDNsResponseSchema updateAccessFqdn(fqdnId, customerFacingFQDNsPatch)

Update Access FQDN

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnsApi apiInstance = new FqdnsApi(defaultClient);
        String fqdnId = "fqdnId_example"; // String | 
        CustomerFacingFQDNsPatch customerFacingFQDNsPatch = new CustomerFacingFQDNsPatch(); // CustomerFacingFQDNsPatch | 
        try {
            CustomerFacingFQDNsResponseSchema result = apiInstance.updateAccessFqdn(fqdnId, customerFacingFQDNsPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnsApi#updateAccessFqdn");
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
 **fqdnId** | **String**|  |
 **customerFacingFQDNsPatch** | [**CustomerFacingFQDNsPatch**](CustomerFacingFQDNsPatch.md)|  |

### Return type

[**CustomerFacingFQDNsResponseSchema**](CustomerFacingFQDNsResponseSchema.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## updateFqdn

> FQDNResponse updateFqdn(id, updateFqdnRequest)

Update an FQDN

Update the details of a specific FQDN.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnsApi apiInstance = new FqdnsApi(defaultClient);
        String id = "1517907029795014409"; // String | Identifies the resource.
        UpdateFqdnRequest updateFqdnRequest = new UpdateFqdnRequest(); // UpdateFqdnRequest | 
        try {
            FQDNResponse result = apiInstance.updateFqdn(id, updateFqdnRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnsApi#updateFqdn");
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
 **updateFqdnRequest** | [**UpdateFqdnRequest**](UpdateFqdnRequest.md)|  | [optional]

### Return type

[**FQDNResponse**](FQDNResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an FQDN connection. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |

