# NumberPortoutApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPortoutReport**](NumberPortoutApi.md#createPortoutReport) | **POST** /portouts/reports | Create a port-out related report
[**findPortoutComments**](NumberPortoutApi.md#findPortoutComments) | **GET** /portouts/{id}/comments | List all comments for a portout request
[**findPortoutRequest**](NumberPortoutApi.md#findPortoutRequest) | **GET** /portouts/{id} | Get a portout request
[**getPortRequestSupportingDocuments**](NumberPortoutApi.md#getPortRequestSupportingDocuments) | **GET** /portouts/{id}/supporting_documents | List supporting documents on a portout request
[**getPortoutReport**](NumberPortoutApi.md#getPortoutReport) | **GET** /portouts/reports/{id} | Retrieve a report
[**listPortoutEvents**](NumberPortoutApi.md#listPortoutEvents) | **GET** /portouts/events | List all port-out events
[**listPortoutRejections**](NumberPortoutApi.md#listPortoutRejections) | **GET** /portouts/rejections/{portout_id} | List eligible port-out rejection codes for a specific order
[**listPortoutReports**](NumberPortoutApi.md#listPortoutReports) | **GET** /portouts/reports | List port-out related reports
[**listPortoutRequest**](NumberPortoutApi.md#listPortoutRequest) | **GET** /portouts | List portout requests
[**postPortRequestComment**](NumberPortoutApi.md#postPortRequestComment) | **POST** /portouts/{id}/comments | Create a comment on a portout request
[**postPortRequestSupportingDocuments**](NumberPortoutApi.md#postPortRequestSupportingDocuments) | **POST** /portouts/{id}/supporting_documents | Create a list of supporting documents on a portout request
[**republishPortoutEvent**](NumberPortoutApi.md#republishPortoutEvent) | **POST** /portouts/events/{id}/republish | Republish a port-out event
[**showPortoutEvent**](NumberPortoutApi.md#showPortoutEvent) | **GET** /portouts/events/{id} | Show a port-out event
[**updatePortoutStatus**](NumberPortoutApi.md#updatePortoutStatus) | **PATCH** /portouts/{id}/{status} | Update Status



## createPortoutReport

> CreatePortoutReport201Response createPortoutReport(createPortoutReportRequest)

Create a port-out related report

Generate reports about port-out operations.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        CreatePortoutReportRequest createPortoutReportRequest = new CreatePortoutReportRequest(); // CreatePortoutReportRequest | 
        try {
            CreatePortoutReport201Response result = apiInstance.createPortoutReport(createPortoutReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#createPortoutReport");
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
 **createPortoutReportRequest** | [**CreatePortoutReportRequest**](CreatePortoutReportRequest.md)|  |

### Return type

[**CreatePortoutReport201Response**](CreatePortoutReport201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |
| **500** | Internal server error |  -  |


## findPortoutComments

> FindPortoutComments200Response findPortoutComments(id)

List all comments for a portout request

Returns a list of comments for a portout request.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        try {
            FindPortoutComments200Response result = apiInstance.findPortoutComments(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#findPortoutComments");
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
 **id** | **UUID**| Portout id |

### Return type

[**FindPortoutComments200Response**](FindPortoutComments200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portout Comments |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## findPortoutRequest

> FindPortoutRequest200Response findPortoutRequest(id)

Get a portout request

Returns the portout request based on the ID provided

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        try {
            FindPortoutRequest200Response result = apiInstance.findPortoutRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#findPortoutRequest");
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
 **id** | **UUID**| Portout id |

### Return type

[**FindPortoutRequest200Response**](FindPortoutRequest200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portout Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## getPortRequestSupportingDocuments

> GetPortRequestSupportingDocuments201Response getPortRequestSupportingDocuments(id)

List supporting documents on a portout request

List every supporting documents for a portout request.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        try {
            GetPortRequestSupportingDocuments201Response result = apiInstance.getPortRequestSupportingDocuments(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#getPortRequestSupportingDocuments");
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
 **id** | **UUID**| Portout id |

### Return type

[**GetPortRequestSupportingDocuments201Response**](GetPortRequestSupportingDocuments201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Portout Supporting Documents |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |


## getPortoutReport

> CreatePortoutReport201Response getPortoutReport(id)

Retrieve a report

Retrieve a specific report generated.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Identifies a report.
        try {
            CreatePortoutReport201Response result = apiInstance.getPortoutReport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#getPortoutReport");
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
 **id** | **UUID**| Identifies a report. |

### Return type

[**CreatePortoutReport201Response**](CreatePortoutReport201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal server error |  -  |


## listPortoutEvents

> ListPortoutEvents200Response listPortoutEvents(pageNumber, pageSize, filterEventType, filterPortoutId, filterCreatedAtGte, filterCreatedAtLte)

List all port-out events

Returns a list of all port-out events.

### Example

```java
import java.time.OffsetDateTime;
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterEventType = "portout.status_changed"; // String | Filter by event type.
        UUID filterPortoutId = UUID.fromString("34dc46a9-53ed-4e01-9454-26227ea13326"); // UUID | Filter by port-out order ID.
        OffsetDateTime filterCreatedAtGte = OffsetDateTime.parse("2021-01-01T00:00Z"); // OffsetDateTime | Filter by created at greater than or equal to.
        OffsetDateTime filterCreatedAtLte = OffsetDateTime.parse("2021-01-01T00:00Z"); // OffsetDateTime | Filter by created at less than or equal to.
        try {
            ListPortoutEvents200Response result = apiInstance.listPortoutEvents(pageNumber, pageSize, filterEventType, filterPortoutId, filterCreatedAtGte, filterCreatedAtLte);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#listPortoutEvents");
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
 **filterEventType** | **String**| Filter by event type. | [optional] [enum: portout.status_changed, portout.new_comment, portout.foc_date_changed]
 **filterPortoutId** | **UUID**| Filter by port-out order ID. | [optional]
 **filterCreatedAtGte** | **OffsetDateTime**| Filter by created at greater than or equal to. | [optional]
 **filterCreatedAtLte** | **OffsetDateTime**| Filter by created at less than or equal to. | [optional]

### Return type

[**ListPortoutEvents200Response**](ListPortoutEvents200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **500** | Internal server error |  -  |


## listPortoutRejections

> ListPortoutRejections200Response listPortoutRejections(portoutId, filterCode, filterCodeIn)

List eligible port-out rejection codes for a specific order

Given a port-out ID, list rejection codes that are eligible for that port-out

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        String portoutId = "329d6658-8f93-405d-862f-648776e8afd7"; // String | Identifies a port out order.
        Integer filterCode = 1002; // Integer | Filter rejections of a specific code
        List<Integer> filterCodeIn = Arrays.asList(); // List<Integer> | Filter rejections in a list of codes
        try {
            ListPortoutRejections200Response result = apiInstance.listPortoutRejections(portoutId, filterCode, filterCodeIn);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#listPortoutRejections");
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
 **portoutId** | **String**| Identifies a port out order. |
 **filterCode** | **Integer**| Filter rejections of a specific code | [optional]
 **filterCodeIn** | **List&lt;Integer&gt;**| Filter rejections in a list of codes | [optional]

### Return type

[**ListPortoutRejections200Response**](ListPortoutRejections200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |
| **500** | Internal server error |  -  |


## listPortoutReports

> ListPortoutReports200Response listPortoutReports(pageNumber, pageSize, filterReportType, filterStatus)

List port-out related reports

List the reports generated about port-out operations.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        String filterReportType = "export_portouts_csv"; // String | Filter reports of a specific type
        String filterStatus = "pending"; // String | Filter reports of a specific status
        try {
            ListPortoutReports200Response result = apiInstance.listPortoutReports(pageNumber, pageSize, filterReportType, filterStatus);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#listPortoutReports");
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
 **filterReportType** | **String**| Filter reports of a specific type | [optional] [enum: export_portouts_csv]
 **filterStatus** | **String**| Filter reports of a specific status | [optional] [enum: pending, completed]

### Return type

[**ListPortoutReports200Response**](ListPortoutReports200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |
| **500** | Internal server error |  -  |


## listPortoutRequest

> ListPortoutRequest200Response listPortoutRequest(filterCarrierName, filterSpid, filterStatus, filterStatusIn, filterPortedOutAtGte, filterPortedOutAtLte, filterInsertedAtGte, filterInsertedAtLte, filterFocDate, filterPhoneNumber, filterSupportKey, pageNumber, pageSize)

List portout requests

Returns the portout requests according to filters

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        String filterCarrierName = "filterCarrierName_example"; // String | Filter by new carrier name.
        String filterSpid = "filterSpid_example"; // String | Filter by new carrier spid.
        String filterStatus = "pending"; // String | Filter by portout status.
        List<String> filterStatusIn = Arrays.asList(); // List<String> | Filter by a list of portout statuses
        OffsetDateTime filterPortedOutAtGte = OffsetDateTime.parse("2024-09-04T00:00Z"); // OffsetDateTime | Filter by ported_out_at date greater than or equal.
        OffsetDateTime filterPortedOutAtLte = OffsetDateTime.parse("2024-09-04T00:00Z"); // OffsetDateTime | Filter by ported_out_at date less than or equal.
        OffsetDateTime filterInsertedAtGte = OffsetDateTime.parse("2024-09-04T00:00Z"); // OffsetDateTime | Filter by inserted_at date greater than or equal.
        OffsetDateTime filterInsertedAtLte = OffsetDateTime.parse("2024-09-04T00:00Z"); // OffsetDateTime | Filter by inserted_at date less than or equal.
        OffsetDateTime filterFocDate = OffsetDateTime.parse("2024-09-04T00:00Z"); // OffsetDateTime | Filter by foc_date. Matches all portouts with the same date
        String filterPhoneNumber = "+13035551212"; // String | Filter by a phone number on the portout. Matches all portouts with the phone number
        String filterSupportKey = "PO_abc123"; // String | Filter by the portout's support_key
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            ListPortoutRequest200Response result = apiInstance.listPortoutRequest(filterCarrierName, filterSpid, filterStatus, filterStatusIn, filterPortedOutAtGte, filterPortedOutAtLte, filterInsertedAtGte, filterInsertedAtLte, filterFocDate, filterPhoneNumber, filterSupportKey, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#listPortoutRequest");
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
 **filterCarrierName** | **String**| Filter by new carrier name. | [optional]
 **filterSpid** | **String**| Filter by new carrier spid. | [optional]
 **filterStatus** | **String**| Filter by portout status. | [optional] [enum: pending, authorized, ported, rejected, rejected-pending, canceled]
 **filterStatusIn** | **List&lt;String&gt;**| Filter by a list of portout statuses | [optional] [enum: pending, authorized, ported, rejected, rejected-pending, canceled]
 **filterPortedOutAtGte** | **OffsetDateTime**| Filter by ported_out_at date greater than or equal. | [optional]
 **filterPortedOutAtLte** | **OffsetDateTime**| Filter by ported_out_at date less than or equal. | [optional]
 **filterInsertedAtGte** | **OffsetDateTime**| Filter by inserted_at date greater than or equal. | [optional]
 **filterInsertedAtLte** | **OffsetDateTime**| Filter by inserted_at date less than or equal. | [optional]
 **filterFocDate** | **OffsetDateTime**| Filter by foc_date. Matches all portouts with the same date | [optional]
 **filterPhoneNumber** | **String**| Filter by a phone number on the portout. Matches all portouts with the phone number | [optional]
 **filterSupportKey** | **String**| Filter by the portout&#39;s support_key | [optional]
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20]

### Return type

[**ListPortoutRequest200Response**](ListPortoutRequest200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portout Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## postPortRequestComment

> PostPortRequestComment201Response postPortRequestComment(id, postPortRequestCommentRequest)

Create a comment on a portout request

Creates a comment on a portout request.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        PostPortRequestCommentRequest postPortRequestCommentRequest = new PostPortRequestCommentRequest(); // PostPortRequestCommentRequest | 
        try {
            PostPortRequestComment201Response result = apiInstance.postPortRequestComment(id, postPortRequestCommentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#postPortRequestComment");
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
 **id** | **UUID**| Portout id |
 **postPortRequestCommentRequest** | [**PostPortRequestCommentRequest**](PostPortRequestCommentRequest.md)|  |

### Return type

[**PostPortRequestComment201Response**](PostPortRequestComment201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Portout Comment Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## postPortRequestSupportingDocuments

> GetPortRequestSupportingDocuments201Response postPortRequestSupportingDocuments(id, postPortRequestSupportingDocumentsRequest)

Create a list of supporting documents on a portout request

Creates a list of supporting documents on a portout request.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        PostPortRequestSupportingDocumentsRequest postPortRequestSupportingDocumentsRequest = new PostPortRequestSupportingDocumentsRequest(); // PostPortRequestSupportingDocumentsRequest | 
        try {
            GetPortRequestSupportingDocuments201Response result = apiInstance.postPortRequestSupportingDocuments(id, postPortRequestSupportingDocumentsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#postPortRequestSupportingDocuments");
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
 **id** | **UUID**| Portout id |
 **postPortRequestSupportingDocumentsRequest** | [**PostPortRequestSupportingDocumentsRequest**](PostPortRequestSupportingDocumentsRequest.md)|  |

### Return type

[**GetPortRequestSupportingDocuments201Response**](GetPortRequestSupportingDocuments201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Portout Supporting Documents |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |


## republishPortoutEvent

> republishPortoutEvent(id)

Republish a port-out event

Republish a specific port-out event.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Identifies the port-out event.
        try {
            apiInstance.republishPortoutEvent(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#republishPortoutEvent");
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
 **id** | **UUID**| Identifies the port-out event. |

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
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


## showPortoutEvent

> ShowPortoutEvent200Response showPortoutEvent(id)

Show a port-out event

Show a specific port-out event.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Identifies the port-out event.
        try {
            ShowPortoutEvent200Response result = apiInstance.showPortoutEvent(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#showPortoutEvent");
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
 **id** | **UUID**| Identifies the port-out event. |

### Return type

[**ShowPortoutEvent200Response**](ShowPortoutEvent200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **404** | Not found |  -  |
| **500** | Internal server error |  -  |


## updatePortoutStatus

> FindPortoutRequest200Response updatePortoutStatus(id, status, updatePortoutStatusRequest)

Update Status

Authorize or reject portout request

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.NumberPortoutApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        NumberPortoutApi apiInstance = new NumberPortoutApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | Portout id
        String status = "authorized"; // String | Updated portout status
        UpdatePortoutStatusRequest updatePortoutStatusRequest = new UpdatePortoutStatusRequest(); // UpdatePortoutStatusRequest | 
        try {
            FindPortoutRequest200Response result = apiInstance.updatePortoutStatus(id, status, updatePortoutStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NumberPortoutApi#updatePortoutStatus");
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
 **id** | **UUID**| Portout id |
 **status** | **String**| Updated portout status | [enum: authorized, rejected-pending]
 **updatePortoutStatusRequest** | [**UpdatePortoutStatusRequest**](UpdatePortoutStatusRequest.md)|  |

### Return type

[**FindPortoutRequest200Response**](FindPortoutRequest200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portout Response |  -  |
| **401** | Unauthorized |  -  |
| **404** | Resource not found |  -  |
| **422** | Unprocessable entity. Check message field in response for details. |  -  |

