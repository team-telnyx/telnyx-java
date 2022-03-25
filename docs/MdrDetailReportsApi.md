# MdrDetailReportsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMdrRequest**](MdrDetailReportsApi.md#deleteMdrRequest) | **DELETE** /reports/batch_mdr_reports/{id} | 
[**getCdrRequests**](MdrDetailReportsApi.md#getCdrRequests) | **GET** /reports/batch_mdr_reports | 
[**getMdrRequest**](MdrDetailReportsApi.md#getMdrRequest) | **GET** /reports/batch_mdr_reports/{id} | 
[**getPaginatedMdrs**](MdrDetailReportsApi.md#getPaginatedMdrs) | **GET** /reports/mdrs | 
[**submitMdrRequest**](MdrDetailReportsApi.md#submitMdrRequest) | **POST** /reports/batch_mdr_reports | 



## deleteMdrRequest

> MdrDeleteDetailReportResponse deleteMdrRequest(id)



Delete generated messaging detail report by id

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MdrDetailReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MdrDetailReportsApi apiInstance = new MdrDetailReportsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            MdrDeleteDetailReportResponse result = apiInstance.deleteMdrRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdrDetailReportsApi#deleteMdrRequest");
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

[**MdrDeleteDetailReportResponse**](MdrDeleteDetailReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## getCdrRequests

> MdrGetDetailReportResponse getCdrRequests(pageNumber, pageSize)



Fetch all previous requests for messaging detail reports. Messaging detail reports are reports for pulling all messaging records. 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MdrDetailReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MdrDetailReportsApi apiInstance = new MdrDetailReportsApi(defaultClient);
        Integer pageNumber = 1; // Integer | Page number
        Integer pageSize = 20; // Integer | Size of the page
        try {
            MdrGetDetailReportResponse result = apiInstance.getCdrRequests(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdrDetailReportsApi#getCdrRequests");
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
 **pageNumber** | **Integer**| Page number | [optional] [default to 1]
 **pageSize** | **Integer**| Size of the page | [optional] [default to 20]

### Return type

[**MdrGetDetailReportResponse**](MdrGetDetailReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## getMdrRequest

> MdrGetDetailReportByIdResponse getMdrRequest(id)



Fetch single messaging detail report by id.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MdrDetailReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MdrDetailReportsApi apiInstance = new MdrDetailReportsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            MdrGetDetailReportByIdResponse result = apiInstance.getMdrRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdrDetailReportsApi#getMdrRequest");
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

[**MdrGetDetailReportByIdResponse**](MdrGetDetailReportByIdResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## getPaginatedMdrs

> MdrGetDetailResponse getPaginatedMdrs(startDate, endDate, id, direction, profile, cld, cli, status, messageType)



Fetch all Mdr records 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MdrDetailReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MdrDetailReportsApi apiInstance = new MdrDetailReportsApi(defaultClient);
        String startDate = "startDate_example"; // String | Pagination start date
        String endDate = "endDate_example"; // String | Pagination end date
        String id = "e093fbe0-5bde-11eb-ae93-0242ac130002"; // String | 
        String direction = "INBOUND"; // String | 
        String profile = "My profile"; // String | 
        String cld = "+15551237654"; // String | 
        String cli = "+15551237654"; // String | 
        String status = "GW_TIMEOUT"; // String | 
        String messageType = "SMS"; // String | 
        try {
            MdrGetDetailResponse result = apiInstance.getPaginatedMdrs(startDate, endDate, id, direction, profile, cld, cli, status, messageType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdrDetailReportsApi#getPaginatedMdrs");
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
 **startDate** | **String**| Pagination start date | [optional]
 **endDate** | **String**| Pagination end date | [optional]
 **id** | **String**|  | [optional]
 **direction** | **String**|  | [optional] [enum: INBOUND, OUTBOUND]
 **profile** | **String**|  | [optional]
 **cld** | **String**|  | [optional]
 **cli** | **String**|  | [optional]
 **status** | **String**|  | [optional] [enum: GW_TIMEOUT, DELIVERED, DLR_UNCONFIRMED, DLR_TIMEOUT, RECEIVED, GW_REJECT, FAILED]
 **messageType** | **String**|  | [optional] [enum: SMS, MMS]

### Return type

[**MdrGetDetailResponse**](MdrGetDetailResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## submitMdrRequest

> MdrPostDetailReportResponse submitMdrRequest(mdrPostDetailReportRequest)



Submit a request for new messaging detail report. Messaging detail report pulls all raw messaging data according to defined filters.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MdrDetailReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MdrDetailReportsApi apiInstance = new MdrDetailReportsApi(defaultClient);
        MdrPostDetailReportRequest mdrPostDetailReportRequest = new MdrPostDetailReportRequest(); // MdrPostDetailReportRequest | Mdr detail request data
        try {
            MdrPostDetailReportResponse result = apiInstance.submitMdrRequest(mdrPostDetailReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdrDetailReportsApi#submitMdrRequest");
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
 **mdrPostDetailReportRequest** | [**MdrPostDetailReportRequest**](MdrPostDetailReportRequest.md)| Mdr detail request data |

### Return type

[**MdrPostDetailReportResponse**](MdrPostDetailReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

