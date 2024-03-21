# MessagingTollfreeVerificationApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteVerificationRequest**](MessagingTollfreeVerificationApi.md#deleteVerificationRequest) | **DELETE** /messaging_tollfree/verification/requests/{id} | Delete Verification Request
[**getVerificationRequest**](MessagingTollfreeVerificationApi.md#getVerificationRequest) | **GET** /messaging_tollfree/verification/requests/{id} | Get Verification Request
[**listVerificationRequests**](MessagingTollfreeVerificationApi.md#listVerificationRequests) | **GET** /messaging_tollfree/verification/requests | List Verification Requests
[**submitVerificationRequest**](MessagingTollfreeVerificationApi.md#submitVerificationRequest) | **POST** /messaging_tollfree/verification/requests | Submit Verification Request
[**updateVerificationRequest**](MessagingTollfreeVerificationApi.md#updateVerificationRequest) | **PATCH** /messaging_tollfree/verification/requests/{id} | Update Verification Request



## deleteVerificationRequest

> Object deleteVerificationRequest(id)

Delete Verification Request

Delete a verification request

A request may only be deleted when when the request is in the "rejected" state.

* `HTTP 200`: request successfully deleted
* `HTTP 400`: request exists but can't be deleted (i.e. not rejected)
* `HTTP 404`: request unknown or already deleted

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingTollfreeVerificationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingTollfreeVerificationApi apiInstance = new MessagingTollfreeVerificationApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Object result = apiInstance.deleteVerificationRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingTollfreeVerificationApi#deleteVerificationRequest");
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
 **id** | **UUID**|  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## getVerificationRequest

> VerificationRequestStatus getVerificationRequest(id)

Get Verification Request

Get a single verification request by its ID.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingTollfreeVerificationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingTollfreeVerificationApi apiInstance = new MessagingTollfreeVerificationApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            VerificationRequestStatus result = apiInstance.getVerificationRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingTollfreeVerificationApi#getVerificationRequest");
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
 **id** | **UUID**|  |

### Return type

[**VerificationRequestStatus**](VerificationRequestStatus.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## listVerificationRequests

> PaginatedVerificationRequestStatus listVerificationRequests(page, pageSize, dateStart, dateEnd, status, phoneNumber)

List Verification Requests

Get a list of previously-submitted tollfree verification requests

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingTollfreeVerificationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingTollfreeVerificationApi apiInstance = new MessagingTollfreeVerificationApi(defaultClient);
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer |          Request this many records per page          This value is automatically clamped if the provided value is too large.         
        OffsetDateTime dateStart = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateEnd = OffsetDateTime.now(); // OffsetDateTime | 
        TFVerificationStatus status = TFVerificationStatus.fromValue("Verified"); // TFVerificationStatus | 
        String phoneNumber = "phoneNumber_example"; // String | 
        try {
            PaginatedVerificationRequestStatus result = apiInstance.listVerificationRequests(page, pageSize, dateStart, dateEnd, status, phoneNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingTollfreeVerificationApi#listVerificationRequests");
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
 **page** | **Integer**|  |
 **pageSize** | **Integer**|          Request this many records per page          This value is automatically clamped if the provided value is too large.          |
 **dateStart** | **OffsetDateTime**|  | [optional]
 **dateEnd** | **OffsetDateTime**|  | [optional]
 **status** | **TFVerificationStatus**|  | [optional] [enum: Verified, Rejected, Waiting For Vendor, Waiting For Customer, In Progress]
 **phoneNumber** | **String**|  | [optional]

### Return type

[**PaginatedVerificationRequestStatus**](PaginatedVerificationRequestStatus.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## submitVerificationRequest

> VerificationRequestEgress submitVerificationRequest(tfVerificationRequest)

Submit Verification Request

Submit a new tollfree verification request

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingTollfreeVerificationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingTollfreeVerificationApi apiInstance = new MessagingTollfreeVerificationApi(defaultClient);
        TFVerificationRequest tfVerificationRequest = new TFVerificationRequest(); // TFVerificationRequest | 
        try {
            VerificationRequestEgress result = apiInstance.submitVerificationRequest(tfVerificationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingTollfreeVerificationApi#submitVerificationRequest");
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
 **tfVerificationRequest** | [**TFVerificationRequest**](TFVerificationRequest.md)|  |

### Return type

[**VerificationRequestEgress**](VerificationRequestEgress.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |


## updateVerificationRequest

> VerificationRequestEgress updateVerificationRequest(id, tfVerificationRequest)

Update Verification Request

Update an existing tollfree verification request. This is particularly useful when there are pending customer actions to be taken.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MessagingTollfreeVerificationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MessagingTollfreeVerificationApi apiInstance = new MessagingTollfreeVerificationApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        TFVerificationRequest tfVerificationRequest = new TFVerificationRequest(); // TFVerificationRequest | 
        try {
            VerificationRequestEgress result = apiInstance.updateVerificationRequest(id, tfVerificationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagingTollfreeVerificationApi#updateVerificationRequest");
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
 **id** | **UUID**|  |
 **tfVerificationRequest** | [**TFVerificationRequest**](TFVerificationRequest.md)|  |

### Return type

[**VerificationRequestEgress**](VerificationRequestEgress.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **0** | Unexpected error |  -  |

