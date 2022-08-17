# ReportingApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWdrReport**](ReportingApi.md#createWdrReport) | **POST** /wireless/detail_records_reports | Create a Wireless Detail Records (WDRs) Report
[**deleteWdrReport**](ReportingApi.md#deleteWdrReport) | **DELETE** /wireless/detail_records_reports/{id} | Delete a Wireless Detail Record (WDR) Report
[**getWdrReport**](ReportingApi.md#getWdrReport) | **GET** /wireless/detail_records_reports/{id} | Get a Wireless Detail Record (WDR) Report
[**getWdrReports**](ReportingApi.md#getWdrReports) | **GET** /wireless/detail_records_reports | Get all Wireless Detail Records (WDRs) Reports



## createWdrReport

> CreateWdrReport201Response createWdrReport(wdrReportRequest)

Create a Wireless Detail Records (WDRs) Report

Asynchronously create a report containing Wireless Detail Records (WDRs) for the SIM cards that consumed wireless data in the given time period.


### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        WdrReportRequest wdrReportRequest = new WdrReportRequest(); // WdrReportRequest | 
        try {
            CreateWdrReport201Response result = apiInstance.createWdrReport(wdrReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#createWdrReport");
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
 **wdrReportRequest** | [**WdrReportRequest**](WdrReportRequest.md)|  |

### Return type

[**CreateWdrReport201Response**](CreateWdrReport201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **422** | Unprocessable entity. Check the &#39;detail&#39; field in response for details. |  -  |
| **0** | Unexpected error |  -  |


## deleteWdrReport

> CreateWdrReport201Response deleteWdrReport(id)

Delete a Wireless Detail Record (WDR) Report

Deletes one specific WDR report

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateWdrReport201Response result = apiInstance.deleteWdrReport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#deleteWdrReport");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**CreateWdrReport201Response**](CreateWdrReport201Response.md)

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
| **0** | Unexpected error |  -  |


## getWdrReport

> CreateWdrReport201Response getWdrReport(id)

Get a Wireless Detail Record (WDR) Report

Returns one specific WDR report

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        UUID id = UUID.fromString("6a09cdc3-8948-47f0-aa62-74ac943d6c58"); // UUID | Identifies the resource.
        try {
            CreateWdrReport201Response result = apiInstance.getWdrReport(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getWdrReport");
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
 **id** | **UUID**| Identifies the resource. |

### Return type

[**CreateWdrReport201Response**](CreateWdrReport201Response.md)

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
| **0** | Unexpected error |  -  |


## getWdrReports

> GetWdrReports200Response getWdrReports(pageNumber, pageSize)

Get all Wireless Detail Records (WDRs) Reports

Returns the WDR Reports that match the given parameters.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        Integer pageNumber = 1; // Integer | The page number to load
        Integer pageSize = 20; // Integer | The size of the page
        try {
            GetWdrReports200Response result = apiInstance.getWdrReports(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#getWdrReports");
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

### Return type

[**GetWdrReports200Response**](GetWdrReports200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **0** | Unexpected error |  -  |

