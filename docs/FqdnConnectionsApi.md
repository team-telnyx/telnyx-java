# FqdnConnectionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFqdnConnection**](FqdnConnectionsApi.md#createFqdnConnection) | **POST** /fqdn_connections | Create an FQDN connection
[**deleteFqdnConnection**](FqdnConnectionsApi.md#deleteFqdnConnection) | **DELETE** /fqdn_connections/{id} | Delete an FQDN connection
[**listFqdnConnections**](FqdnConnectionsApi.md#listFqdnConnections) | **GET** /fqdn_connections | List FQDN connections
[**retrieveFqdnConnection**](FqdnConnectionsApi.md#retrieveFqdnConnection) | **GET** /fqdn_connections/{id} | Retrieve an FQDN connection
[**updateFqdnConnection**](FqdnConnectionsApi.md#updateFqdnConnection) | **PATCH** /fqdn_connections/{id} | Update an FQDN connection



## createFqdnConnection

> FQDNConnectionResponse createFqdnConnection(createFqdnConnectionRequest)

Create an FQDN connection

Creates a FQDN connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnConnectionsApi apiInstance = new FqdnConnectionsApi(defaultClient);
        CreateFqdnConnectionRequest createFqdnConnectionRequest = new CreateFqdnConnectionRequest(); // CreateFqdnConnectionRequest | Parameters that can be defined during FQDN connection creation
        try {
            FQDNConnectionResponse result = apiInstance.createFqdnConnection(createFqdnConnectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnConnectionsApi#createFqdnConnection");
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
 **createFqdnConnectionRequest** | [**CreateFqdnConnectionRequest**](CreateFqdnConnectionRequest.md)| Parameters that can be defined during FQDN connection creation |

### Return type

[**FQDNConnectionResponse**](FQDNConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response with details about an FQDN connection. |  -  |
| **422** | Bad request |  -  |


## deleteFqdnConnection

> FQDNConnectionResponse deleteFqdnConnection(id)

Delete an FQDN connection

Deletes an FQDN connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnConnectionsApi apiInstance = new FqdnConnectionsApi(defaultClient);
        String id = "id_example"; // String | FQDN Connection ID
        try {
            FQDNConnectionResponse result = apiInstance.deleteFqdnConnection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnConnectionsApi#deleteFqdnConnection");
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
 **id** | **String**| FQDN Connection ID |

### Return type

[**FQDNConnectionResponse**](FQDNConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an FQDN connection. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## listFqdnConnections

> ListFQDNConnectionsResponse listFqdnConnections().pageNumber(pageNumber).pageSize(pageSize).filterConnectionNameContains(filterConnectionNameContains).sort(sort).execute();

List FQDN connections

Returns a list of your FQDN connections.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnConnectionsApi apiInstance = new FqdnConnectionsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterConnectionNameContains = "\"null\""; // String | If present, connections with <code>connection_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
        String sort = connection_name; // String | Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the <code> -</code> prefix.<br/><br/> That is: <ul>   <li>     <code>connection_name</code>: sorts the result by the     <code>connection_name</code> field in ascending order.   </li>    <li>     <code>-connection_name</code>: sorts the result by the     <code>connection_name</code> field in descending order.   </li> </ul> <br/> If not given, results are sorted by <code>created_at</code> in descending order.
        try {
            ListFQDNConnectionsResponse result = api.listFqdnConnections()
                .pageNumber(pageNumber)
                .pageSize(pageSize)
                .filterConnectionNameContains(filterConnectionNameContains)
                .sort(sort)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnConnectionsApi#listFqdnConnections");
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
 **filterConnectionNameContains** | **String**| If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional] [default to &quot;null&quot;]
 **sort** | **String**| Specifies the sort order for results. By default sorting direction is ascending. To have the results sorted in descending order add the &lt;code&gt; -&lt;/code&gt; prefix.&lt;br/&gt;&lt;br/&gt; That is: &lt;ul&gt;   &lt;li&gt;     &lt;code&gt;connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in ascending order.   &lt;/li&gt;    &lt;li&gt;     &lt;code&gt;-connection_name&lt;/code&gt;: sorts the result by the     &lt;code&gt;connection_name&lt;/code&gt; field in descending order.   &lt;/li&gt; &lt;/ul&gt; &lt;br/&gt; If not given, results are sorted by &lt;code&gt;created_at&lt;/code&gt; in descending order. | [optional] [default to created_at] [enum: created_at, connection_name, active]

### Return type

[**ListFQDNConnectionsResponse**](ListFQDNConnectionsResponse.md)

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
| **404** | Resource not found |  -  |


## retrieveFqdnConnection

> FQDNConnectionResponse retrieveFqdnConnection(id)

Retrieve an FQDN connection

Retrieves the details of an existing FQDN connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnConnectionsApi apiInstance = new FqdnConnectionsApi(defaultClient);
        String id = "id_example"; // String | FQDN Connection ID
        try {
            FQDNConnectionResponse result = apiInstance.retrieveFqdnConnection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnConnectionsApi#retrieveFqdnConnection");
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
 **id** | **String**| FQDN Connection ID |

### Return type

[**FQDNConnectionResponse**](FQDNConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an FQDN connection. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## updateFqdnConnection

> FQDNConnectionResponse updateFqdnConnection(id, updateFqdnConnectionRequest)

Update an FQDN connection

Updates settings of an existing FQDN connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.FqdnConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        FqdnConnectionsApi apiInstance = new FqdnConnectionsApi(defaultClient);
        String id = "id_example"; // String | FQDN Connection ID
        UpdateFqdnConnectionRequest updateFqdnConnectionRequest = new UpdateFqdnConnectionRequest(); // UpdateFqdnConnectionRequest | Parameters that can be updated in a FQDN connection
        try {
            FQDNConnectionResponse result = apiInstance.updateFqdnConnection(id, updateFqdnConnectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FqdnConnectionsApi#updateFqdnConnection");
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
 **id** | **String**| FQDN Connection ID |
 **updateFqdnConnectionRequest** | [**UpdateFqdnConnectionRequest**](UpdateFqdnConnectionRequest.md)| Parameters that can be updated in a FQDN connection |

### Return type

[**FQDNConnectionResponse**](FQDNConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with details about an FQDN connection. |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |

