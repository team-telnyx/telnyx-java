# MdrUsageReportsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUsageReport**](MdrUsageReportsApi.md#deleteUsageReport) | **DELETE** /reports/mdr_usage_reports/{id} | 
[**getUsageReport**](MdrUsageReportsApi.md#getUsageReport) | **GET** /reports/mdr_usage_reports/{id} | 
[**getUsageReportSync**](MdrUsageReportsApi.md#getUsageReportSync) | **GET** /reports/mdr_usage_reports/sync | 
[**getUsageReports**](MdrUsageReportsApi.md#getUsageReports) | **GET** /reports/mdr_usage_reports | 
[**submitUsageReport**](MdrUsageReportsApi.md#submitUsageReport) | **POST** /reports/mdr_usage_reports | 



## deleteUsageReport

> MdrDeleteUsageReportsResponse deleteUsageReport(id)



Delete messaging usage report by id

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MdrUsageReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MdrUsageReportsApi apiInstance = new MdrUsageReportsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            MdrDeleteUsageReportsResponse result = apiInstance.deleteUsageReport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdrUsageReportsApi#deleteUsageReport");
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

[**MdrDeleteUsageReportsResponse**](MdrDeleteUsageReportsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## getUsageReport

> MdrGetUsageReportsByIdResponse getUsageReport(id)



Fetch a single messaging usage report by id

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MdrUsageReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MdrUsageReportsApi apiInstance = new MdrUsageReportsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            MdrGetUsageReportsByIdResponse result = apiInstance.getUsageReport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdrUsageReportsApi#getUsageReport");
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

[**MdrGetUsageReportsByIdResponse**](MdrGetUsageReportsByIdResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## getUsageReportSync

> MdrGetSyncUsageReportResponse getUsageReportSync(aggregationType, startDate, endDate, profiles)



Generate and fetch messaging usage report synchronously. This endpoint will both generate and fetch the messaging report over a specified time period. No polling is necessary but the response may take up to a couple of minutes. 

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MdrUsageReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MdrUsageReportsApi apiInstance = new MdrUsageReportsApi(defaultClient);
        String aggregationType = "NO_AGGREGATION"; // String | 
        OffsetDateTime startDate = OffsetDateTime.parse("2020-07-01T00:00-06:00"); // OffsetDateTime | 
        OffsetDateTime endDate = OffsetDateTime.parse("2020-07-01T00:00-06:00"); // OffsetDateTime | 
        List<String> profiles = Arrays.asList(); // List<String> | 
        try {
            MdrGetSyncUsageReportResponse result = apiInstance.getUsageReportSync(aggregationType, startDate, endDate, profiles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdrUsageReportsApi#getUsageReportSync");
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
 **aggregationType** | **String**|  | [enum: NO_AGGREGATION, PROFILE, TAGS]
 **startDate** | **OffsetDateTime**|  | [optional]
 **endDate** | **OffsetDateTime**|  | [optional]
 **profiles** | **List&lt;String&gt;**|  | [optional]

### Return type

[**MdrGetSyncUsageReportResponse**](MdrGetSyncUsageReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## getUsageReports

> MdrGetUsageReportsResponse getUsageReports(pageNumber, pageSize)



Fetch all messaging usage reports. Usage reports are aggregated messaging data for specified time period and breakdown

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MdrUsageReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MdrUsageReportsApi apiInstance = new MdrUsageReportsApi(defaultClient);
        Integer pageNumber = 1; // Integer | Page number
        Integer pageSize = 20; // Integer | Size of the page
        try {
            MdrGetUsageReportsResponse result = apiInstance.getUsageReports(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdrUsageReportsApi#getUsageReports");
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

[**MdrGetUsageReportsResponse**](MdrGetUsageReportsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## submitUsageReport

> MdrPostUsageReportsResponse submitUsageReport(mdrPostUsageReportRequest)



Submit request for new new messaging usage report. This endpoint will pull and aggregate messaging data in specified time period. 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MdrUsageReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MdrUsageReportsApi apiInstance = new MdrUsageReportsApi(defaultClient);
        MdrPostUsageReportRequest mdrPostUsageReportRequest = new MdrPostUsageReportRequest(); // MdrPostUsageReportRequest | Mdr usage report data
        try {
            MdrPostUsageReportsResponse result = apiInstance.submitUsageReport(mdrPostUsageReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdrUsageReportsApi#submitUsageReport");
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
 **mdrPostUsageReportRequest** | [**MdrPostUsageReportRequest**](MdrPostUsageReportRequest.md)| Mdr usage report data |

### Return type

[**MdrPostUsageReportsResponse**](MdrPostUsageReportsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

