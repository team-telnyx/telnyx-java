# ExternalConnectionsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExternalConnection**](ExternalConnectionsApi.md#createExternalConnection) | **POST** /external_connections | Creates an External Connection
[**createExternalConnectionUpload**](ExternalConnectionsApi.md#createExternalConnectionUpload) | **POST** /external_connections/{id}/uploads | Creates an Upload request
[**deleteExternalConnection**](ExternalConnectionsApi.md#deleteExternalConnection) | **DELETE** /external_connections/{id} | Deletes an External Connection
[**deleteExternalConnectionLogMessage**](ExternalConnectionsApi.md#deleteExternalConnectionLogMessage) | **DELETE** /external_connections/log_messages/{id} | Dismiss a log message
[**getExternalConnection**](ExternalConnectionsApi.md#getExternalConnection) | **GET** /external_connections/{id} | Retrieve an External Connection
[**getExternalConnectionCivicAddress**](ExternalConnectionsApi.md#getExternalConnectionCivicAddress) | **GET** /external_connections/{id}/civic_addresses/{address_id} | Retrieve a Civic Address
[**getExternalConnectionLogMessage**](ExternalConnectionsApi.md#getExternalConnectionLogMessage) | **GET** /external_connections/log_messages/{id} | Retrieve a log message
[**getExternalConnectionPhoneNumber**](ExternalConnectionsApi.md#getExternalConnectionPhoneNumber) | **GET** /external_connections/{id}/phone_numbers/{phone_number_id} | Retrieve a phone number
[**getExternalConnectionRelease**](ExternalConnectionsApi.md#getExternalConnectionRelease) | **GET** /external_connections/{id}/releases/{release_id} | Retrieve a Release request
[**getExternalConnectionUpload**](ExternalConnectionsApi.md#getExternalConnectionUpload) | **GET** /external_connections/{id}/uploads/{ticket_id} | Retrieve an Upload request
[**getExternalConnectionUploadsStatus**](ExternalConnectionsApi.md#getExternalConnectionUploadsStatus) | **GET** /external_connections/{id}/uploads/status | Get the count of pending upload requests
[**listCivicAddresses**](ExternalConnectionsApi.md#listCivicAddresses) | **GET** /external_connections/{id}/civic_addresses | List all civic addresses and locations
[**listExternalConnectionLogMessages**](ExternalConnectionsApi.md#listExternalConnectionLogMessages) | **GET** /external_connections/log_messages | List all log messages
[**listExternalConnectionPhoneNumbers**](ExternalConnectionsApi.md#listExternalConnectionPhoneNumbers) | **GET** /external_connections/{id}/phone_numbers | List all phone numbers
[**listExternalConnectionReleases**](ExternalConnectionsApi.md#listExternalConnectionReleases) | **GET** /external_connections/{id}/releases | List all Releases
[**listExternalConnectionUploads**](ExternalConnectionsApi.md#listExternalConnectionUploads) | **GET** /external_connections/{id}/uploads | List all Upload requests
[**listExternalConnections**](ExternalConnectionsApi.md#listExternalConnections) | **GET** /external_connections | List all External Connections
[**refreshExternalConnectionUploads**](ExternalConnectionsApi.md#refreshExternalConnectionUploads) | **POST** /external_connections/{id}/uploads/refresh | Refresh the status of all Upload requests
[**retryUpload**](ExternalConnectionsApi.md#retryUpload) | **POST** /external_connections/{id}/uploads/{ticket_id}/retry | Retry an Upload request
[**updateExternalConnection**](ExternalConnectionsApi.md#updateExternalConnection) | **PATCH** /external_connections/{id} | Update an External Connection
[**updateExternalConnectionPhoneNumber**](ExternalConnectionsApi.md#updateExternalConnectionPhoneNumber) | **PATCH** /external_connections/{id}/phone_numbers/{phone_number_id} | Update a phone number
[**updateLocation**](ExternalConnectionsApi.md#updateLocation) | **PATCH** /v2/external_connections/{id}/locations/{location_id} | Update a location&#39;s static emergency address



## createExternalConnection

> ExternalConnectionResponse createExternalConnection(createExternalConnectionRequest)

Creates an External Connection

Creates a new External Connection based on the parameters sent in the request. The external_sip_connection and outbound voice profile id are required. Once created, you can assign phone numbers to your application using the `/phone_numbers` endpoint.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        CreateExternalConnectionRequest createExternalConnectionRequest = new CreateExternalConnectionRequest(); // CreateExternalConnectionRequest | Parameters that can be set when creating a External Connection
        try {
            ExternalConnectionResponse result = apiInstance.createExternalConnection(createExternalConnectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#createExternalConnection");
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
 **createExternalConnectionRequest** | [**CreateExternalConnectionRequest**](CreateExternalConnectionRequest.md)| Parameters that can be set when creating a External Connection |

### Return type

[**ExternalConnectionResponse**](ExternalConnectionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **422** | Bad request |  -  |


## createExternalConnectionUpload

> CreateUploadRequestResponse createExternalConnectionUpload(id, createExternalConnectionUploadRequest)

Creates an Upload request

Creates a new Upload request to Microsoft teams with the included phone numbers. Only one of civic_address_id or location_id must be provided, not both. The maximum allowed phone numbers for the numbers_ids array is 1000.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        CreateExternalConnectionUploadRequest createExternalConnectionUploadRequest = new CreateExternalConnectionUploadRequest(); // CreateExternalConnectionUploadRequest | Parameters that can be set when creating an Upload request.
        try {
            CreateUploadRequestResponse result = apiInstance.createExternalConnectionUpload(id, createExternalConnectionUploadRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#createExternalConnectionUpload");
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
 **createExternalConnectionUploadRequest** | [**CreateExternalConnectionUploadRequest**](CreateExternalConnectionUploadRequest.md)| Parameters that can be set when creating an Upload request. |

### Return type

[**CreateUploadRequestResponse**](CreateUploadRequestResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **413** | Payload too large. The maximum allowed phone numbers for the numbers_ids array is 1000. |  -  |
| **422** | Unprocessable Entity |  -  |
| **504** | Gateway Timeout |  -  |


## deleteExternalConnection

> ExternalConnectionResponse deleteExternalConnection(id)

Deletes an External Connection

Permanently deletes an External Connection. Deletion may be prevented if the application is in use by phone numbers, is active, or if it is an Operator Connect connection. To remove an Operator Connect integration please contact Telnyx support.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            ExternalConnectionResponse result = apiInstance.deleteExternalConnection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#deleteExternalConnection");
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

[**ExternalConnectionResponse**](ExternalConnectionResponse.md)

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
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## deleteExternalConnectionLogMessage

> DismissRequestWasSuccessful deleteExternalConnectionLogMessage(id)

Dismiss a log message

Dismiss a log message for an external connection associated with your account.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            DismissRequestWasSuccessful result = apiInstance.deleteExternalConnectionLogMessage(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#deleteExternalConnectionLogMessage");
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

[**DismissRequestWasSuccessful**](DismissRequestWasSuccessful.md)

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
| **404** | Resource not found |  -  |


## getExternalConnection

> ExternalConnectionResponse getExternalConnection(id)

Retrieve an External Connection

Return the details of an existing External Connection inside the 'data' attribute of the response.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            ExternalConnectionResponse result = apiInstance.getExternalConnection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#getExternalConnection");
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

[**ExternalConnectionResponse**](ExternalConnectionResponse.md)

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
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## getExternalConnectionCivicAddress

> GetCivicAddressResponse getExternalConnectionCivicAddress(id, addressId)

Retrieve a Civic Address

Return the details of an existing Civic Address with its Locations inside the 'data' attribute of the response.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        UUID addressId = UUID.fromString("318fb664-d341-44d2-8405-e6bfb9ced6d9"); // UUID | Identifies a civic address or a location.
        try {
            GetCivicAddressResponse result = apiInstance.getExternalConnectionCivicAddress(id, addressId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#getExternalConnectionCivicAddress");
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
 **addressId** | **UUID**| Identifies a civic address or a location. |

### Return type

[**GetCivicAddressResponse**](GetCivicAddressResponse.md)

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
| **404** | Not found |  -  |
| **500** | Unexpected Error |  -  |
| **502** | Bad Gateway |  -  |


## getExternalConnectionLogMessage

> GetLogMessageResponse getExternalConnectionLogMessage(id)

Retrieve a log message

Retrieve a log message for an external connection associated with your account.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            GetLogMessageResponse result = apiInstance.getExternalConnectionLogMessage(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#getExternalConnectionLogMessage");
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

[**GetLogMessageResponse**](GetLogMessageResponse.md)

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
| **404** | Resource not found |  -  |


## getExternalConnectionPhoneNumber

> GetExternalConnectionPhoneNumberResponse getExternalConnectionPhoneNumber(id, phoneNumberId)

Retrieve a phone number

Return the details of a phone number associated with the given external connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        String phoneNumberId = "1234567889"; // String | A phone number's ID via the Telnyx API
        try {
            GetExternalConnectionPhoneNumberResponse result = apiInstance.getExternalConnectionPhoneNumber(id, phoneNumberId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#getExternalConnectionPhoneNumber");
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
 **phoneNumberId** | **String**| A phone number&#39;s ID via the Telnyx API |

### Return type

[**GetExternalConnectionPhoneNumberResponse**](GetExternalConnectionPhoneNumberResponse.md)

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
| **404** | Not found |  -  |


## getExternalConnectionRelease

> GetReleaseResponse getExternalConnectionRelease(id, releaseId)

Retrieve a Release request

Return the details of a Release request and its phone numbers.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        UUID releaseId = UUID.fromString("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6"); // UUID | Identifies a Release request
        try {
            GetReleaseResponse result = apiInstance.getExternalConnectionRelease(id, releaseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#getExternalConnectionRelease");
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
 **releaseId** | **UUID**| Identifies a Release request |

### Return type

[**GetReleaseResponse**](GetReleaseResponse.md)

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
| **404** | Not found |  -  |


## getExternalConnectionUpload

> GetUploadResponse getExternalConnectionUpload(id, ticketId)

Retrieve an Upload request

Return the details of an Upload request and its phone numbers.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        UUID ticketId = UUID.fromString("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6"); // UUID | Identifies an Upload request
        try {
            GetUploadResponse result = apiInstance.getExternalConnectionUpload(id, ticketId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#getExternalConnectionUpload");
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
 **ticketId** | **UUID**| Identifies an Upload request |

### Return type

[**GetUploadResponse**](GetUploadResponse.md)

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
| **404** | Not found |  -  |


## getExternalConnectionUploadsStatus

> GetUploadsStatusResponse getExternalConnectionUploadsStatus(id)

Get the count of pending upload requests

Returns the count of all pending upload requests for the given external connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            GetUploadsStatusResponse result = apiInstance.getExternalConnectionUploadsStatus(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#getExternalConnectionUploadsStatus");
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

[**GetUploadsStatusResponse**](GetUploadsStatusResponse.md)

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
| **404** | Not found |  -  |


## listCivicAddresses

> GetAllCivicAddressesResponse listCivicAddresses(id)

List all civic addresses and locations

Returns the civic addresses and locations from Microsoft Teams.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            GetAllCivicAddressesResponse result = apiInstance.listCivicAddresses(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#listCivicAddresses");
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

[**GetAllCivicAddressesResponse**](GetAllCivicAddressesResponse.md)

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
| **404** | Not found |  -  |
| **500** | Unexpected Error |  -  |
| **502** | Bad Gateway |  -  |


## listExternalConnectionLogMessages

> ListLogMessagesResponse listExternalConnectionLogMessages(pageNumber, pageSize, filterExternalConnectionId, filterTelephoneNumberContains, filterTelephoneNumberEq)

List all log messages

Retrieve a list of log messages for all external connections associated with your account.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterExternalConnectionId = "67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2"; // String | The external connection ID to filter by or \"null\" to filter for logs without an external connection ID
        String filterTelephoneNumberContains = "+123"; // String | The partial phone number to filter log messages for. Requires 3-15 digits.
        String filterTelephoneNumberEq = "+1234567890"; // String | The phone number to filter log messages for or \"null\" to filter for logs without a phone number
        try {
            ListLogMessagesResponse result = apiInstance.listExternalConnectionLogMessages(pageNumber, pageSize, filterExternalConnectionId, filterTelephoneNumberContains, filterTelephoneNumberEq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#listExternalConnectionLogMessages");
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
 **filterExternalConnectionId** | **String**| The external connection ID to filter by or \&quot;null\&quot; to filter for logs without an external connection ID | [optional]
 **filterTelephoneNumberContains** | **String**| The partial phone number to filter log messages for. Requires 3-15 digits. | [optional]
 **filterTelephoneNumberEq** | **String**| The phone number to filter log messages for or \&quot;null\&quot; to filter for logs without a phone number | [optional]

### Return type

[**ListLogMessagesResponse**](ListLogMessagesResponse.md)

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
| **422** | Bad request |  -  |


## listExternalConnectionPhoneNumbers

> ListExternalConnectionPhoneNumbersResponse listExternalConnectionPhoneNumbers(id, pageNumber, pageSize, filterPhoneNumberEq, filterPhoneNumberContains, filterCivicAddressIdEq, filterLocationIdEq)

List all phone numbers

Returns a list of all active phone numbers associated with the given external connection.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterPhoneNumberEq = "+1234567890"; // String | The phone number to filter by
        String filterPhoneNumberContains = "+15555555555"; // String | If present, connections associated with the given phone_number will be returned. A full match is necessary with a e164 format.
        UUID filterCivicAddressIdEq = UUID.fromString("67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2"); // UUID | The civic address ID to filter by
        UUID filterLocationIdEq = UUID.fromString("52545f6f-9cd5-4a68-8c76-abb3aa5bf5d2"); // UUID | The location ID to filter by
        try {
            ListExternalConnectionPhoneNumbersResponse result = apiInstance.listExternalConnectionPhoneNumbers(id, pageNumber, pageSize, filterPhoneNumberEq, filterPhoneNumberContains, filterCivicAddressIdEq, filterLocationIdEq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#listExternalConnectionPhoneNumbers");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterPhoneNumberEq** | **String**| The phone number to filter by | [optional]
 **filterPhoneNumberContains** | **String**| If present, connections associated with the given phone_number will be returned. A full match is necessary with a e164 format. | [optional]
 **filterCivicAddressIdEq** | **UUID**| The civic address ID to filter by | [optional]
 **filterLocationIdEq** | **UUID**| The location ID to filter by | [optional]

### Return type

[**ListExternalConnectionPhoneNumbersResponse**](ListExternalConnectionPhoneNumbersResponse.md)

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
| **404** | Not found |  -  |
| **422** | Bad request |  -  |


## listExternalConnectionReleases

> ListReleasesResponse listExternalConnectionReleases(id, pageNumber, pageSize, filterStatusEq, filterCivicAddressIdEq, filterLocationIdEq, filterPhoneNumberEq, filterPhoneNumberContains)

List all Releases

Returns a list of your Releases for the given external connection. These are automatically created when you change the `connection_id` of a phone number that is currently on Microsoft Teams.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        List<String> filterStatusEq = Arrays.asList(); // List<String> | The status of the release to filter by
        UUID filterCivicAddressIdEq = UUID.fromString("67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2"); // UUID | The civic address ID to filter by
        UUID filterLocationIdEq = UUID.fromString("52545f6f-9cd5-4a68-8c76-abb3aa5bf5d2"); // UUID | The location ID to filter by
        String filterPhoneNumberEq = "+1234567890"; // String | The phone number to filter by
        String filterPhoneNumberContains = "+123"; // String | The partial phone number to filter by. Requires 3-15 digits.
        try {
            ListReleasesResponse result = apiInstance.listExternalConnectionReleases(id, pageNumber, pageSize, filterStatusEq, filterCivicAddressIdEq, filterLocationIdEq, filterPhoneNumberEq, filterPhoneNumberContains);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#listExternalConnectionReleases");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterStatusEq** | **List&lt;String&gt;**| The status of the release to filter by | [optional] [enum: pending_upload, pending, in_progress, complete, failed, expired, unknown]
 **filterCivicAddressIdEq** | **UUID**| The civic address ID to filter by | [optional]
 **filterLocationIdEq** | **UUID**| The location ID to filter by | [optional]
 **filterPhoneNumberEq** | **String**| The phone number to filter by | [optional]
 **filterPhoneNumberContains** | **String**| The partial phone number to filter by. Requires 3-15 digits. | [optional]

### Return type

[**ListReleasesResponse**](ListReleasesResponse.md)

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
| **404** | Not found |  -  |
| **422** | Bad request |  -  |


## listExternalConnectionUploads

> ListUploadsResponse listExternalConnectionUploads(id, pageNumber, pageSize, filterStatusEq, filterCivicAddressIdEq, filterLocationIdEq, filterPhoneNumberEq, filterPhoneNumberContains)

List all Upload requests

Returns a list of your Upload requests for the given external connection.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        List<String> filterStatusEq = Arrays.asList(); // List<String> | The status of the upload to filter by
        UUID filterCivicAddressIdEq = UUID.fromString("67ea7693-9cd5-4a68-8c76-abb3aa5bf5d2"); // UUID | The civic address ID to filter by
        UUID filterLocationIdEq = UUID.fromString("52545f6f-9cd5-4a68-8c76-abb3aa5bf5d2"); // UUID | The location ID to filter by
        String filterPhoneNumberEq = "+1234567890"; // String | The phone number to filter by
        String filterPhoneNumberContains = "+123"; // String | The partial phone number to filter by. Requires 3-15 digits.
        try {
            ListUploadsResponse result = apiInstance.listExternalConnectionUploads(id, pageNumber, pageSize, filterStatusEq, filterCivicAddressIdEq, filterLocationIdEq, filterPhoneNumberEq, filterPhoneNumberContains);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#listExternalConnectionUploads");
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
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]
 **filterStatusEq** | **List&lt;String&gt;**| The status of the upload to filter by | [optional] [enum: pending_upload, pending, in_progress, success, error]
 **filterCivicAddressIdEq** | **UUID**| The civic address ID to filter by | [optional]
 **filterLocationIdEq** | **UUID**| The location ID to filter by | [optional]
 **filterPhoneNumberEq** | **String**| The phone number to filter by | [optional]
 **filterPhoneNumberContains** | **String**| The partial phone number to filter by. Requires 3-15 digits. | [optional]

### Return type

[**ListUploadsResponse**](ListUploadsResponse.md)

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
| **404** | Not found |  -  |
| **422** | Bad request |  -  |


## listExternalConnections

> GetAllExternalConnectionsResponse listExternalConnections(pageNumber, pageSize, filterConnectionNameContains, filterExternalSipConnection, filterId, filterCreatedAt, filterPhoneNumberContains)

List all External Connections

This endpoint returns a list of your External Connections inside the 'data' attribute of the response. External Connections are used by Telnyx customers to seamless configure SIP trunking integrations with Telnyx Partners, through External Voice Integrations in Mission Control Portal.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterConnectionNameContains = "My Connection"; // String | If present, connections with <code>connection_name</code> containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters.
        String filterExternalSipConnection = "zoom"; // String | If present, connections with <code>external_sip_connection</code> matching the given value will be returned.
        String filterId = "1930241863466354012"; // String | If present, connections with <code>id</code> matching the given value will be returned.
        String filterCreatedAt = "2018-02-02T22:25:27.521Z"; // String | Filter by ISO 8601 formatted date-time string matching resource creation date-time.
        String filterPhoneNumberContains = "+15555555555"; // String | If present, connections associated with the given phone_number will be returned. A full match is necessary with a e164 format.
        try {
            GetAllExternalConnectionsResponse result = apiInstance.listExternalConnections(pageNumber, pageSize, filterConnectionNameContains, filterExternalSipConnection, filterId, filterCreatedAt, filterPhoneNumberContains);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#listExternalConnections");
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
 **filterConnectionNameContains** | **String**| If present, connections with &lt;code&gt;connection_name&lt;/code&gt; containing the given value will be returned. Matching is not case-sensitive. Requires at least three characters. | [optional]
 **filterExternalSipConnection** | **String**| If present, connections with &lt;code&gt;external_sip_connection&lt;/code&gt; matching the given value will be returned. | [optional] [enum: zoom, operator_connect]
 **filterId** | **String**| If present, connections with &lt;code&gt;id&lt;/code&gt; matching the given value will be returned. | [optional]
 **filterCreatedAt** | **String**| Filter by ISO 8601 formatted date-time string matching resource creation date-time. | [optional]
 **filterPhoneNumberContains** | **String**| If present, connections associated with the given phone_number will be returned. A full match is necessary with a e164 format. | [optional]

### Return type

[**GetAllExternalConnectionsResponse**](GetAllExternalConnectionsResponse.md)

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
| **404** | Resource not found |  -  |


## refreshExternalConnectionUploads

> CreateUploadRequestResponse1 refreshExternalConnectionUploads(id)

Refresh the status of all Upload requests

Forces a recheck of the status of all pending Upload requests for the given external connection in the background.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        try {
            CreateUploadRequestResponse1 result = apiInstance.refreshExternalConnectionUploads(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#refreshExternalConnectionUploads");
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

[**CreateUploadRequestResponse1**](CreateUploadRequestResponse1.md)

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
| **404** | Not found |  -  |
| **409** | Status refresh is still in progress, please wait before calling again |  -  |


## retryUpload

> GetUploadResponse retryUpload(id, ticketId)

Retry an Upload request

If there were any errors during the upload process, this endpoint will retry the upload request. In some cases this will reattempt the existing upload request, in other cases it may create a new upload request. Please check the ticket_id in the response to determine if a new upload request was created.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        UUID ticketId = UUID.fromString("7b6a6449-b055-45a6-81f6-f6f0dffa4cc6"); // UUID | Identifies an Upload request
        try {
            GetUploadResponse result = apiInstance.retryUpload(id, ticketId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#retryUpload");
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
 **ticketId** | **UUID**| Identifies an Upload request |

### Return type

[**GetUploadResponse**](GetUploadResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **409** | Order is still in progress, please wait before retrying |  -  |
| **422** | Unprocessable Entity |  -  |


## updateExternalConnection

> ExternalConnectionResponse updateExternalConnection(id, updateExternalConnectionRequest)

Update an External Connection

Updates settings of an existing External Connection based on the parameters of the request.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        UpdateExternalConnectionRequest updateExternalConnectionRequest = new UpdateExternalConnectionRequest(); // UpdateExternalConnectionRequest | Parameters to be updated for the External Connection
        try {
            ExternalConnectionResponse result = apiInstance.updateExternalConnection(id, updateExternalConnectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#updateExternalConnection");
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
 **updateExternalConnectionRequest** | [**UpdateExternalConnectionRequest**](UpdateExternalConnectionRequest.md)| Parameters to be updated for the External Connection |

### Return type

[**ExternalConnectionResponse**](ExternalConnectionResponse.md)

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
| **404** | Resource not found |  -  |
| **422** | Bad request |  -  |


## updateExternalConnectionPhoneNumber

> GetExternalConnectionPhoneNumberResponse updateExternalConnectionPhoneNumber(id, phoneNumberId, updateExternalConnectionPhoneNumberRequest)

Update a phone number

Asynchronously update settings of the phone number associated with the given external connection.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        String id = "1293384261075731499"; // String | Identifies the resource.
        String phoneNumberId = "1234567889"; // String | A phone number's ID via the Telnyx API
        UpdateExternalConnectionPhoneNumberRequest updateExternalConnectionPhoneNumberRequest = new UpdateExternalConnectionPhoneNumberRequest(); // UpdateExternalConnectionPhoneNumberRequest | Values that can be set when updating a phone number
        try {
            GetExternalConnectionPhoneNumberResponse result = apiInstance.updateExternalConnectionPhoneNumber(id, phoneNumberId, updateExternalConnectionPhoneNumberRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#updateExternalConnectionPhoneNumber");
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
 **phoneNumberId** | **String**| A phone number&#39;s ID via the Telnyx API |
 **updateExternalConnectionPhoneNumberRequest** | [**UpdateExternalConnectionPhoneNumberRequest**](UpdateExternalConnectionPhoneNumberRequest.md)| Values that can be set when updating a phone number |

### Return type

[**GetExternalConnectionPhoneNumberResponse**](GetExternalConnectionPhoneNumberResponse.md)

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
| **404** | Not found |  -  |
| **422** | Bad request |  -  |


## updateLocation

> LocationResponse updateLocation(id, locationId, updateLocationRequest)

Update a location&#39;s static emergency address

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ExternalConnectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExternalConnectionsApi apiInstance = new ExternalConnectionsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The ID of the external connection
        UUID locationId = UUID.randomUUID(); // UUID | The ID of the location to update
        UpdateLocationRequest updateLocationRequest = new UpdateLocationRequest(); // UpdateLocationRequest | 
        try {
            LocationResponse result = apiInstance.updateLocation(id, locationId, updateLocationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalConnectionsApi#updateLocation");
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
 **id** | **UUID**| The ID of the external connection |
 **locationId** | **UUID**| The ID of the location to update |
 **updateLocationRequest** | [**UpdateLocationRequest**](UpdateLocationRequest.md)|  |

### Return type

[**LocationResponse**](LocationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Location successfully updated with no associated orders to process |  -  |
| **202** | Location update accepted; associated orders being processed |  -  |
| **404** | Location or external connection not found |  -  |
| **422** | Unprocessable Entity - Location already has an accepted emergency address |  -  |

