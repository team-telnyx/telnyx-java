# DialogflowIntegrationApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDialogflowConnection**](DialogflowIntegrationApi.md#createDialogflowConnection) | **POST** /dialogflow_connections/{connection_id} | Create a Dialogflow Connection
[**deleteDialogflowConnection**](DialogflowIntegrationApi.md#deleteDialogflowConnection) | **DELETE** /dialogflow_connections/{connection_id} | Delete stored Dialogflow Connection
[**getDialogflowConnection**](DialogflowIntegrationApi.md#getDialogflowConnection) | **GET** /dialogflow_connections/{connection_id} | Retrieve stored Dialogflow Connection
[**updateDialogflowConnection**](DialogflowIntegrationApi.md#updateDialogflowConnection) | **PUT** /dialogflow_connections/{connection_id} | Update stored Dialogflow Connection



## createDialogflowConnection

> DialogflowConnectionResponse createDialogflowConnection(connectionId, dialogflowConnection)

Create a Dialogflow Connection

Save Dialogflow Credentiails to Telnyx, so it can be used with other Telnyx services.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DialogflowIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DialogflowIntegrationApi apiInstance = new DialogflowIntegrationApi(defaultClient);
        String connectionId = "connectionId_example"; // String | Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource.
        DialogflowConnection dialogflowConnection = new DialogflowConnection(); // DialogflowConnection | The params expected to create/update a Dialogflow Connection for given connection_id.
        try {
            DialogflowConnectionResponse result = apiInstance.createDialogflowConnection(connectionId, dialogflowConnection);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DialogflowIntegrationApi#createDialogflowConnection");
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
 **connectionId** | **String**| Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. |
 **dialogflowConnection** | [**DialogflowConnection**](DialogflowConnection.md)| The params expected to create/update a Dialogflow Connection for given connection_id. |

### Return type

[**DialogflowConnectionResponse**](DialogflowConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Return details of the Dialogflow connection associated with the given CallControl connection. |  -  |
| **0** | Unexpected error |  -  |


## deleteDialogflowConnection

> deleteDialogflowConnection(connectionId)

Delete stored Dialogflow Connection

Deletes a stored Dialogflow Connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DialogflowIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DialogflowIntegrationApi apiInstance = new DialogflowIntegrationApi(defaultClient);
        String connectionId = "connectionId_example"; // String | Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource.
        try {
            apiInstance.deleteDialogflowConnection(connectionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DialogflowIntegrationApi#deleteDialogflowConnection");
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
 **connectionId** | **String**| Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. |

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
| **204** | The Dialogflow Connection for connection_id was deleted successfully. |  -  |
| **0** | Unexpected error |  -  |


## getDialogflowConnection

> DialogflowConnectionResponse getDialogflowConnection(connectionId)

Retrieve stored Dialogflow Connection

Return details of the Dialogflow connection associated with the given CallControl connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DialogflowIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DialogflowIntegrationApi apiInstance = new DialogflowIntegrationApi(defaultClient);
        String connectionId = "connectionId_example"; // String | Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource.
        try {
            DialogflowConnectionResponse result = apiInstance.getDialogflowConnection(connectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DialogflowIntegrationApi#getDialogflowConnection");
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
 **connectionId** | **String**| Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. |

### Return type

[**DialogflowConnectionResponse**](DialogflowConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return details of the Dialogflow connection associated with the given CallControl connection. |  -  |
| **0** | Unexpected error |  -  |


## updateDialogflowConnection

> DialogflowConnectionResponse updateDialogflowConnection(connectionId, dialogflowConnection)

Update stored Dialogflow Connection

Updates a stored Dialogflow Connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DialogflowIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DialogflowIntegrationApi apiInstance = new DialogflowIntegrationApi(defaultClient);
        String connectionId = "connectionId_example"; // String | Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource.
        DialogflowConnection dialogflowConnection = new DialogflowConnection(); // DialogflowConnection | The params expected to create/update a Dialogflow Connection for given connection_id.
        try {
            DialogflowConnectionResponse result = apiInstance.updateDialogflowConnection(connectionId, dialogflowConnection);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DialogflowIntegrationApi#updateDialogflowConnection");
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
 **connectionId** | **String**| Uniquely identifies a Telnyx application (Call Control, TeXML) or Sip connection resource. |
 **dialogflowConnection** | [**DialogflowConnection**](DialogflowConnection.md)| The params expected to create/update a Dialogflow Connection for given connection_id. |

### Return type

[**DialogflowConnectionResponse**](DialogflowConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return details of the Dialogflow connection associated with the given CallControl connection. |  -  |
| **0** | Unexpected error |  -  |

