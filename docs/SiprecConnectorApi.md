# SiprecConnectorApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSiprecConnector**](SiprecConnectorApi.md#createSiprecConnector) | **POST** /siprec_connectors | Creates a siprec connector
[**deleteSiprecConnection**](SiprecConnectorApi.md#deleteSiprecConnection) | **DELETE** /siprec_connectors | Delete stored Siprec Connection
[**getSiprecConnection**](SiprecConnectorApi.md#getSiprecConnection) | **GET** /siprec_connectors | Retrieve stored Siprec Connection
[**updateSiprecConnector**](SiprecConnectorApi.md#updateSiprecConnector) | **PUT** /siprec_connectors | Update stored SIPREC connector



## createSiprecConnector

> SiprecConnectorResponse createSiprecConnector(siprecConnector)

Creates a siprec connector

Saves a siprec connector configuration.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SiprecConnectorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SiprecConnectorApi apiInstance = new SiprecConnectorApi(defaultClient);
        SiprecConnector siprecConnector = new SiprecConnector(); // SiprecConnector | The params expected to create/update a SIPREC connector
        try {
            SiprecConnectorResponse result = apiInstance.createSiprecConnector(siprecConnector);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SiprecConnectorApi#createSiprecConnector");
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
 **siprecConnector** | [**SiprecConnector**](SiprecConnector.md)| The params expected to create/update a SIPREC connector |

### Return type

[**SiprecConnectorResponse**](SiprecConnectorResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Return details of the SIPREC connector associated with the given name. |  -  |
| **0** | Unexpected error |  -  |


## deleteSiprecConnection

> deleteSiprecConnection(siprecConnectorName)

Delete stored Siprec Connection

Deletes a stored Siprec Connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SiprecConnectorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SiprecConnectorApi apiInstance = new SiprecConnectorApi(defaultClient);
        String siprecConnectorName = "siprecConnectorName_example"; // String | Uniquely identifies a SIPREC connector
        try {
            apiInstance.deleteSiprecConnection(siprecConnectorName);
        } catch (ApiException e) {
            System.err.println("Exception when calling SiprecConnectorApi#deleteSiprecConnection");
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
 **siprecConnectorName** | **String**| Uniquely identifies a SIPREC connector |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The SIPREC connector was deleted successfully. |  -  |
| **0** | Unexpected error |  -  |


## getSiprecConnection

> SiprecConnectorResponse getSiprecConnection(siprecConnectorName)

Retrieve stored Siprec Connection

Return details of the Siprec connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SiprecConnectorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SiprecConnectorApi apiInstance = new SiprecConnectorApi(defaultClient);
        String siprecConnectorName = "siprecConnectorName_example"; // String | Uniquely identifies a SIPREC connector
        try {
            SiprecConnectorResponse result = apiInstance.getSiprecConnection(siprecConnectorName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SiprecConnectorApi#getSiprecConnection");
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
 **siprecConnectorName** | **String**| Uniquely identifies a SIPREC connector |

### Return type

[**SiprecConnectorResponse**](SiprecConnectorResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return details of the SIPREC connector associated with the given name. |  -  |
| **0** | Unexpected error |  -  |


## updateSiprecConnector

> SiprecConnectorResponse updateSiprecConnector(siprecConnectorName, siprecConnector)

Update stored SIPREC connector

Updates a stored SIPREC connector

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.SiprecConnectorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SiprecConnectorApi apiInstance = new SiprecConnectorApi(defaultClient);
        String siprecConnectorName = "siprecConnectorName_example"; // String | Uniquely identifies a SIPREC connector
        SiprecConnector siprecConnector = new SiprecConnector(); // SiprecConnector | The params expected to create/update a SIPREC connector
        try {
            SiprecConnectorResponse result = apiInstance.updateSiprecConnector(siprecConnectorName, siprecConnector);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SiprecConnectorApi#updateSiprecConnector");
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
 **siprecConnectorName** | **String**| Uniquely identifies a SIPREC connector |
 **siprecConnector** | [**SiprecConnector**](SiprecConnector.md)| The params expected to create/update a SIPREC connector |

### Return type

[**SiprecConnectorResponse**](SiprecConnectorResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return details of the SIPREC connector associated with the given name. |  -  |
| **0** | Unexpected error |  -  |

