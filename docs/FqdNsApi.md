# FqdNsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFqdn**](FqdNsApi.md#createFqdn) | **POST** /fqdns | Create an Fqdn
[**deleteFqdn**](FqdNsApi.md#deleteFqdn) | **DELETE** /fqdns/{id} | Delete an Fqdn
[**listFqdns**](FqdNsApi.md#listFqdns) | **GET** /fqdns | List Fqdns
[**retrieveFqdn**](FqdNsApi.md#retrieveFqdn) | **GET** /fqdns/{id} | Retrieve an Fqdn
[**updateFqdn**](FqdNsApi.md#updateFqdn) | **PATCH** /fqdns/{id} | Update an Fqdn



## createFqdn

> FqdnResponse createFqdn(createFqdnRequest)

Create an Fqdn

Create a new FQDN object.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdNsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdNsApi apiInstance = new FqdNsApi(defaultClient);
        CreateFqdnRequest createFqdnRequest = new CreateFqdnRequest(); // CreateFqdnRequest | 
        try {
            FqdnResponse result = apiInstance.createFqdn(createFqdnRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdNsApi#createFqdn");
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

[**FqdnResponse**](FqdnResponse.md)

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


## deleteFqdn

> FqdnResponse deleteFqdn(id)

Delete an Fqdn

Delete an FQDN.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdNsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdNsApi apiInstance = new FqdNsApi(defaultClient);
        String id = 1517907029795014409; // String | Identifies the resource.
        try {
            FqdnResponse result = apiInstance.deleteFqdn(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdNsApi#deleteFqdn");
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

[**FqdnResponse**](FqdnResponse.md)

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


## listFqdns

> ListFqdnsResponse listFqdns().pageNumber(pageNumber).pageSize(pageSize).filterConnectionId(filterConnectionId).filterFqdn(filterFqdn).filterPort(filterPort).filterDnsRecordType(filterDnsRecordType).execute();

List Fqdns

Get all FQDNs belonging to the user that match the given filters.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdNsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdNsApi apiInstance = new FqdNsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 250; // Integer | The size of the page
        String filterConnectionId = "filterConnectionId_example"; // String | ID of the FQDN connection to which the FQDN belongs.
        String filterFqdn = example.com; // String | FQDN represented by the resource.
        Integer filterPort = 5060; // Integer | Port to use when connecting to the FQDN.
        String filterDnsRecordType = a; // String | DNS record type used by the FQDN.
        try {
            ListFqdnsResponse result = api.listFqdns()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterConnectionId(filterConnectionId)
                .filterFqdn(filterFqdn)
                .filterPort(filterPort)
                .filterDnsRecordType(filterDnsRecordType)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdNsApi#listFqdns");
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
 **pageSize** | **Integer**| The size of the page | [optional] [default to 250]
 **filterConnectionId** | **String**| ID of the FQDN connection to which the FQDN belongs. | [optional]
 **filterFqdn** | **String**| FQDN represented by the resource. | [optional]
 **filterPort** | **Integer**| Port to use when connecting to the FQDN. | [optional]
 **filterDnsRecordType** | **String**| DNS record type used by the FQDN. | [optional]

### Return type

[**ListFqdnsResponse**](ListFqdnsResponse.md)

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

> FqdnResponse retrieveFqdn(id)

Retrieve an Fqdn

Return the details regarding a specific FQDN.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdNsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdNsApi apiInstance = new FqdNsApi(defaultClient);
        String id = 1517907029795014409; // String | Identifies the resource.
        try {
            FqdnResponse result = apiInstance.retrieveFqdn(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdNsApi#retrieveFqdn");
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

[**FqdnResponse**](FqdnResponse.md)

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


## updateFqdn

> FqdnResponse updateFqdn(id, updateFqdnRequest)

Update an Fqdn

Update the details of a specific FQDN.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdNsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdNsApi apiInstance = new FqdNsApi(defaultClient);
        String id = 1517907029795014409; // String | Identifies the resource.
        UpdateFqdnRequest updateFqdnRequest = new UpdateFqdnRequest(); // UpdateFqdnRequest | 
        try {
            FqdnResponse result = apiInstance.updateFqdn(id, updateFqdnRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdNsApi#updateFqdn");
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

[**FqdnResponse**](FqdnResponse.md)

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

