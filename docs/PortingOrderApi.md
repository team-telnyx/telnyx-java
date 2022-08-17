# PortingOrderApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activatePortingOrder**](PortingOrderApi.md#activatePortingOrder) | **POST** /porting_orders/{id}/actions/activate | Activates every number on a porting order.
[**cancelPortingOrder**](PortingOrderApi.md#cancelPortingOrder) | **POST** /porting_orders/{id}/actions/cancel | Cancel a porting order
[**confirmPortingOrder**](PortingOrderApi.md#confirmPortingOrder) | **POST** /porting_orders/{id}/actions/confirm | Submit a porting order.
[**createPortingOrder**](PortingOrderApi.md#createPortingOrder) | **POST** /porting_orders | Create a porting order
[**createPortingOrderComment**](PortingOrderApi.md#createPortingOrderComment) | **POST** /porting_orders/{id}/comments | Create a comment for a porting order
[**deletePortingOrder**](PortingOrderApi.md#deletePortingOrder) | **DELETE** /porting_orders/{id} | Delete a porting order
[**getPortingOrder**](PortingOrderApi.md#getPortingOrder) | **GET** /porting_orders/{id} | Retrieve a porting order
[**getPortingOrderLOATemplate**](PortingOrderApi.md#getPortingOrderLOATemplate) | **GET** /porting_orders/{id}/loa_template | Download a porting order loa template
[**getPortingOrderSubRequest**](PortingOrderApi.md#getPortingOrderSubRequest) | **GET** /porting_orders/{id}/sub_request | Retrieve the associated V1 sub_request_id and port_request_id
[**getPortingOrdersActivationJob**](PortingOrderApi.md#getPortingOrdersActivationJob) | **GET** /porting_orders/{id}/activation_jobs/{activationJobId} | Retrieve a porting activation job
[**listAllowedFocWindows**](PortingOrderApi.md#listAllowedFocWindows) | **GET** /porting_orders/{id}/allowed_foc_windows | List allowed FOC dates
[**listPortingOrderDocuments**](PortingOrderApi.md#listPortingOrderDocuments) | **GET** /porting_orders/{id}/documents | List all documents associated with a porting order
[**listPortingOrderRequirements**](PortingOrderApi.md#listPortingOrderRequirements) | **GET** /porting_orders/{id}/requirements | List all required documents for this porting order
[**listPortingOrders**](PortingOrderApi.md#listPortingOrders) | **GET** /porting_orders | List all porting orders
[**listPortingOrdersActivationJobs**](PortingOrderApi.md#listPortingOrdersActivationJobs) | **GET** /porting_orders/{id}/activation_jobs | List all porting activation jobs
[**listPortingOrdersComments**](PortingOrderApi.md#listPortingOrdersComments) | **GET** /porting_orders/{id}/comments | List all comments of a porting order
[**listPortingOrdersExceptionTypes**](PortingOrderApi.md#listPortingOrdersExceptionTypes) | **GET** /porting_orders/exception_types | List all exception types
[**listPortingPhoneNumbers**](PortingOrderApi.md#listPortingPhoneNumbers) | **GET** /porting_phone_numbers | List all porting phone numbers
[**updatePortingOrder**](PortingOrderApi.md#updatePortingOrder) | **PATCH** /porting_orders/{id} | Edit a porting order
[**uploadPortingOrderDocuments**](PortingOrderApi.md#uploadPortingOrderDocuments) | **POST** /porting_orders/{id}/documents | Associate a list of documents with a porting order



## activatePortingOrder

> ActivatePortingOrder202Response activatePortingOrder(id)

Activates every number on a porting order.

Activate every numbers of a porting order asynchronously.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            ActivatePortingOrder202Response result = apiInstance.activatePortingOrder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#activatePortingOrder");
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
 **id** | **UUID**| Porting Order id |

### Return type

[**ActivatePortingOrder202Response**](ActivatePortingOrder202Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## cancelPortingOrder

> CancelPortingOrder200Response cancelPortingOrder(id)

Cancel a porting order

Cancel a porting order

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            CancelPortingOrder200Response result = apiInstance.cancelPortingOrder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#cancelPortingOrder");
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
 **id** | **UUID**| Porting Order id |

### Return type

[**CancelPortingOrder200Response**](CancelPortingOrder200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## confirmPortingOrder

> ConfirmPortingOrder200Response confirmPortingOrder(id)

Submit a porting order.

Confirm and submit your porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            ConfirmPortingOrder200Response result = apiInstance.confirmPortingOrder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#confirmPortingOrder");
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
 **id** | **UUID**| Porting Order id |

### Return type

[**ConfirmPortingOrder200Response**](ConfirmPortingOrder200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## createPortingOrder

> CreatePortingOrder201Response createPortingOrder(createPortingOrder)

Create a porting order

Creates a new porting order object.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        CreatePortingOrder createPortingOrder = new CreatePortingOrder(); // CreatePortingOrder | 
        try {
            CreatePortingOrder201Response result = apiInstance.createPortingOrder(createPortingOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#createPortingOrder");
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
 **createPortingOrder** | [**CreatePortingOrder**](CreatePortingOrder.md)|  |

### Return type

[**CreatePortingOrder201Response**](CreatePortingOrder201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## createPortingOrderComment

> CreatePortingOrderComment201Response createPortingOrderComment(id, createPortingOrderComment)

Create a comment for a porting order

Creates a new comment for a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        CreatePortingOrderComment createPortingOrderComment = new CreatePortingOrderComment(); // CreatePortingOrderComment | 
        try {
            CreatePortingOrderComment201Response result = apiInstance.createPortingOrderComment(id, createPortingOrderComment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#createPortingOrderComment");
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
 **id** | **UUID**| Porting Order id |
 **createPortingOrderComment** | [**CreatePortingOrderComment**](CreatePortingOrderComment.md)|  |

### Return type

[**CreatePortingOrderComment201Response**](CreatePortingOrderComment201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## deletePortingOrder

> deletePortingOrder(id)

Delete a porting order

Deletes an existing porting order. This operation is restrict to porting orders in draft state.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            apiInstance.deletePortingOrder(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#deletePortingOrder");
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
 **id** | **UUID**| Porting Order id |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## getPortingOrder

> GetPortingOrder200Response getPortingOrder(id, includePhoneNumbers)

Retrieve a porting order

Retrieves the details of an existing porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        Boolean includePhoneNumbers = true; // Boolean | Include the first 50 phone number objects in the results
        try {
            GetPortingOrder200Response result = apiInstance.getPortingOrder(id, includePhoneNumbers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#getPortingOrder");
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
 **id** | **UUID**| Porting Order id |
 **includePhoneNumbers** | **Boolean**| Include the first 50 phone number objects in the results | [optional] [default to true]

### Return type

[**GetPortingOrder200Response**](GetPortingOrder200Response.md)

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


## getPortingOrderLOATemplate

> File getPortingOrderLOATemplate(id)

Download a porting order loa template

Download a porting order loa template

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            File result = apiInstance.getPortingOrderLOATemplate(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#getPortingOrderLOATemplate");
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
 **id** | **UUID**| Porting Order id |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |


## getPortingOrderSubRequest

> GetPortingOrderSubRequest200Response getPortingOrderSubRequest(id)

Retrieve the associated V1 sub_request_id and port_request_id

Retrieve the associated V1 sub_request_id and port_request_id

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            GetPortingOrderSubRequest200Response result = apiInstance.getPortingOrderSubRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#getPortingOrderSubRequest");
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
 **id** | **UUID**| Porting Order id |

### Return type

[**GetPortingOrderSubRequest200Response**](GetPortingOrderSubRequest200Response.md)

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
| **404** | Porting Order not found |  -  |


## getPortingOrdersActivationJob

> ActivatePortingOrder202Response getPortingOrdersActivationJob(id, activationJobId)

Retrieve a porting activation job

Returns a porting activation job.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        UUID activationJobId = UUID.randomUUID(); // UUID | Activation Job Identifier
        try {
            ActivatePortingOrder202Response result = apiInstance.getPortingOrdersActivationJob(id, activationJobId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#getPortingOrdersActivationJob");
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
 **id** | **UUID**| Porting Order id |
 **activationJobId** | **UUID**| Activation Job Identifier |

### Return type

[**ActivatePortingOrder202Response**](ActivatePortingOrder202Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listAllowedFocWindows

> ListAllowedFocWindows200Response listAllowedFocWindows(id)

List allowed FOC dates

Returns a list of allowed FOC dates for a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        try {
            ListAllowedFocWindows200Response result = apiInstance.listAllowedFocWindows(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#listAllowedFocWindows");
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
 **id** | **UUID**| Porting Order id |

### Return type

[**ListAllowedFocWindows200Response**](ListAllowedFocWindows200Response.md)

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


## listPortingOrderDocuments

> ListPortingOrderDocuments200Response listPortingOrderDocuments(id, pageNumber, pageSize)

List all documents associated with a porting order

Returns a list of all documents associated with a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListPortingOrderDocuments200Response result = apiInstance.listPortingOrderDocuments(id, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#listPortingOrderDocuments");
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
 **id** | **UUID**| Porting Order id |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListPortingOrderDocuments200Response**](ListPortingOrderDocuments200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingOrderRequirements

> ListPortingOrderRequirements200Response listPortingOrderRequirements(id, pageNumber, pageSize)

List all required documents for this porting order

Returns a list of all requirements for this porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListPortingOrderRequirements200Response result = apiInstance.listPortingOrderRequirements(id, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#listPortingOrderRequirements");
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
 **id** | **UUID**| Porting Order id |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListPortingOrderRequirements200Response**](ListPortingOrderRequirements200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingOrders

> ListPortingOrders200Response listPortingOrders(pageNumber, pageSize, includePhoneNumbers, filterStatus, filterCustomerReference, filterPhoneNumbersCountryCode, filterPhoneNumbersCarrierName, filterMiscType, filterEndUserAdminEntityName, filterEndUserAdminAuthPersonName, filterActivationSettingsFastPortEligible, filterActivationSettingsFocDatetimeRequestedGt, filterActivationSettingsFocDatetimeRequestedLt, sort)

List all porting orders

Returns a list of your porting order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        Boolean includePhoneNumbers = true; // Boolean | Include the first 50 phone number objects in the results
        String filterStatus = "draft"; // String | Filter results by status
        String filterCustomerReference = "123abc"; // String | Filter results by user reference
        String filterPhoneNumbersCountryCode = "US"; // String | Filter results by country ISO 3166-1 alpha-2 code
        String filterPhoneNumbersCarrierName = "Telnyx"; // String | Filter results by old service provider
        PortingOrderType filterMiscType = PortingOrderType.fromValue("full"); // PortingOrderType | Filter results by porting order type
        String filterEndUserAdminEntityName = "Porter McPortersen"; // String | Filter results by person or company name
        String filterEndUserAdminAuthPersonName = "Admin McPortersen"; // String | Filter results by authorized person
        Boolean filterActivationSettingsFastPortEligible = false; // Boolean | Filter results by fast port eligible
        String filterActivationSettingsFocDatetimeRequestedGt = "2021-03-25T10:00:00.000Z"; // String | Filter results by foc date later than this value
        String filterActivationSettingsFocDatetimeRequestedLt = "2021-03-25T10:00:00.000Z"; // String | Filter results by foc date earlier than this value
        String sort = "created_at"; // String | Specifies the sort order for results. If not given, results are sorted by created_at in descending order.
        try {
            ListPortingOrders200Response result = apiInstance.listPortingOrders(pageNumber, pageSize, includePhoneNumbers, filterStatus, filterCustomerReference, filterPhoneNumbersCountryCode, filterPhoneNumbersCarrierName, filterMiscType, filterEndUserAdminEntityName, filterEndUserAdminAuthPersonName, filterActivationSettingsFastPortEligible, filterActivationSettingsFocDatetimeRequestedGt, filterActivationSettingsFocDatetimeRequestedLt, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#listPortingOrders");
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
 **includePhoneNumbers** | **Boolean**| Include the first 50 phone number objects in the results | [optional] [default to true]
 **filterStatus** | **String**| Filter results by status | [optional] [enum: draft, in-process, submitted, exception, foc-date-confirmed, cancel-pending, ported, cancelled]
 **filterCustomerReference** | **String**| Filter results by user reference | [optional]
 **filterPhoneNumbersCountryCode** | **String**| Filter results by country ISO 3166-1 alpha-2 code | [optional]
 **filterPhoneNumbersCarrierName** | **String**| Filter results by old service provider | [optional]
 **filterMiscType** | **PortingOrderType**| Filter results by porting order type | [optional] [enum: full, partial]
 **filterEndUserAdminEntityName** | **String**| Filter results by person or company name | [optional]
 **filterEndUserAdminAuthPersonName** | **String**| Filter results by authorized person | [optional]
 **filterActivationSettingsFastPortEligible** | **Boolean**| Filter results by fast port eligible | [optional]
 **filterActivationSettingsFocDatetimeRequestedGt** | **String**| Filter results by foc date later than this value | [optional]
 **filterActivationSettingsFocDatetimeRequestedLt** | **String**| Filter results by foc date earlier than this value | [optional]
 **sort** | **String**| Specifies the sort order for results. If not given, results are sorted by created_at in descending order. | [optional] [enum: created_at, -created_at, activation_settings.foc_datetime_requested, -activation_settings.foc_datetime_requested]

### Return type

[**ListPortingOrders200Response**](ListPortingOrders200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingOrdersActivationJobs

> ListPortingOrdersActivationJobs200Response listPortingOrdersActivationJobs(id, pageNumber, pageSize)

List all porting activation jobs

Returns a list of your porting activation jobs.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListPortingOrdersActivationJobs200Response result = apiInstance.listPortingOrdersActivationJobs(id, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#listPortingOrdersActivationJobs");
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
 **id** | **UUID**| Porting Order id |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListPortingOrdersActivationJobs200Response**](ListPortingOrdersActivationJobs200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingOrdersComments

> ListPortingOrdersComments200Response listPortingOrdersComments(id, pageNumber, pageSize)

List all comments of a porting order

Returns a list of all comments of a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListPortingOrdersComments200Response result = apiInstance.listPortingOrdersComments(id, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#listPortingOrdersComments");
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
 **id** | **UUID**| Porting Order id |
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListPortingOrdersComments200Response**](ListPortingOrdersComments200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingOrdersExceptionTypes

> ListPortingOrdersExceptionTypes200Response listPortingOrdersExceptionTypes()

List all exception types

Returns a list of all possible exception types for a porting order.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        try {
            ListPortingOrdersExceptionTypes200Response result = apiInstance.listPortingOrdersExceptionTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#listPortingOrdersExceptionTypes");
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

[**ListPortingOrdersExceptionTypes200Response**](ListPortingOrdersExceptionTypes200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## listPortingPhoneNumbers

> ListPortingPhoneNumbers200Response listPortingPhoneNumbers(pageNumber, pageSize, filterPortingOrderId, filterPortingOrderIdIn, filterSupportKeyEq, filterSupportKeyIn, filterPhoneNumber, filterPhoneNumberIn, filterPortingOrderStatus, filterActivationStatus, filterPortabilityStatus)

List all porting phone numbers

Returns a list of your porting phone numbers.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        UUID filterPortingOrderId = UUID.fromString("f3575e15-32ce-400e-a4c0-dd78800c20b0"); // UUID | Filter results by porting order id
        List<UUID> filterPortingOrderIdIn = Arrays.asList(); // List<UUID> | Filter results by a list of porting order ids
        String filterSupportKeyEq = "sr_a12345"; // String | Filter results by support key
        List<String> filterSupportKeyIn = Arrays.asList(); // List<String> | Filter results by a list of support keys
        String filterPhoneNumber = "+12003151212"; // String | Filter results by phone number
        List<String> filterPhoneNumberIn = Arrays.asList(); // List<String> | Filter results by a list of phone numbers
        String filterPortingOrderStatus = "draft"; // String | Filter results by porting order status
        PortingOrderActivationStatus filterActivationStatus = PortingOrderActivationStatus.fromValue("New"); // PortingOrderActivationStatus | Filter results by activation status
        PortabilityStatus filterPortabilityStatus = PortabilityStatus.fromValue("pending"); // PortabilityStatus | Filter results by portability status
        try {
            ListPortingPhoneNumbers200Response result = apiInstance.listPortingPhoneNumbers(pageNumber, pageSize, filterPortingOrderId, filterPortingOrderIdIn, filterSupportKeyEq, filterSupportKeyIn, filterPhoneNumber, filterPhoneNumberIn, filterPortingOrderStatus, filterActivationStatus, filterPortabilityStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#listPortingPhoneNumbers");
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
 **filterPortingOrderId** | **UUID**| Filter results by porting order id | [optional]
 **filterPortingOrderIdIn** | **List&lt;UUID&gt;**| Filter results by a list of porting order ids | [optional]
 **filterSupportKeyEq** | **String**| Filter results by support key | [optional]
 **filterSupportKeyIn** | **List&lt;String&gt;**| Filter results by a list of support keys | [optional]
 **filterPhoneNumber** | **String**| Filter results by phone number | [optional]
 **filterPhoneNumberIn** | **List&lt;String&gt;**| Filter results by a list of phone numbers | [optional]
 **filterPortingOrderStatus** | **String**| Filter results by porting order status | [optional] [enum: draft, in-process, submitted, exception, foc-date-confirmed, cancel-pending, ported, cancelled]
 **filterActivationStatus** | **PortingOrderActivationStatus**| Filter results by activation status | [optional] [enum: New, Pending, Conflict, Cancel Pending, Failed, Concurred, Activate RDY, Disconnect Pending, Concurrence Sent, Old, Sending, Active, Canceled]
 **filterPortabilityStatus** | **PortabilityStatus**| Filter results by portability status | [optional] [enum: pending, confirmed, provisional]

### Return type

[**ListPortingPhoneNumbers200Response**](ListPortingPhoneNumbers200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## updatePortingOrder

> UpdatePortingOrder200Response updatePortingOrder(id, updatePortingOrder)

Edit a porting order

Edits the details of an existing porting order.

Any or all of a porting order’s attributes may be included in the resource object included in a PATCH request.

If a request does not include all of the attributes for a resource, the system will interpret the missing attributes as if they were included with their current values. To explicitly set something to null, it must be included in the request with a null value.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        UpdatePortingOrder updatePortingOrder = new UpdatePortingOrder(); // UpdatePortingOrder | 
        try {
            UpdatePortingOrder200Response result = apiInstance.updatePortingOrder(id, updatePortingOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#updatePortingOrder");
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
 **id** | **UUID**| Porting Order id |
 **updatePortingOrder** | [**UpdatePortingOrder**](UpdatePortingOrder.md)|  |

### Return type

[**UpdatePortingOrder200Response**](UpdatePortingOrder200Response.md)

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
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## uploadPortingOrderDocuments

> UploadPortingOrderDocuments201Response uploadPortingOrderDocuments(id, uploadPortingOrderDocumentsRequest)

Associate a list of documents with a porting order

Associate a list of documents with a porting order.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.PortingOrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PortingOrderApi apiInstance = new PortingOrderApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Porting Order id
        UploadPortingOrderDocumentsRequest uploadPortingOrderDocumentsRequest = new UploadPortingOrderDocumentsRequest(); // UploadPortingOrderDocumentsRequest | 
        try {
            UploadPortingOrderDocuments201Response result = apiInstance.uploadPortingOrderDocuments(id, uploadPortingOrderDocumentsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PortingOrderApi#uploadPortingOrderDocuments");
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
 **id** | **UUID**| Porting Order id |
 **uploadPortingOrderDocumentsRequest** | [**UploadPortingOrderDocumentsRequest**](UploadPortingOrderDocumentsRequest.md)|  |

### Return type

[**UploadPortingOrderDocuments201Response**](UploadPortingOrderDocuments201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **401** | Unauthorized |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |

