# WhatsAppDetailReportsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRequest**](WhatsAppDetailReportsApi.md#deleteRequest) | **DELETE** /whatsapp_detail_record_reports/{id} | 
[**getRequest**](WhatsAppDetailReportsApi.md#getRequest) | **GET** /whatsapp_detail_record_reports/{id} | 
[**getRequests**](WhatsAppDetailReportsApi.md#getRequests) | **GET** /whatsapp_detail_record_reports | 
[**submitRequest**](WhatsAppDetailReportsApi.md#submitRequest) | **POST** /whatsapp_detail_record_reports | 



## deleteRequest

> WhatsAppDetailReportResponse deleteRequest(id)



Delete generated WhatsApp detail report by id

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppDetailReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppDetailReportsApi apiInstance = new WhatsAppDetailReportsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            WhatsAppDetailReportResponse result = apiInstance.deleteRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppDetailReportsApi#deleteRequest");
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

[**WhatsAppDetailReportResponse**](WhatsAppDetailReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## getRequest

> WhatsAppDetailReportResponse getRequest(id)



Fetch single whatsapp detail report by id.

### Example

```java
import java.util.UUID;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppDetailReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppDetailReportsApi apiInstance = new WhatsAppDetailReportsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            WhatsAppDetailReportResponse result = apiInstance.getRequest(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppDetailReportsApi#getRequest");
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

[**WhatsAppDetailReportResponse**](WhatsAppDetailReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Resource not found |  -  |
| **200** | Successful |  -  |


## getRequests

> WhatsAppGetAllDetailReportResponse getRequests(pageNumber, pageSize)



Fetch all previous requests for WhatsApp detail reports. WhatsApp detail reports are reports for pulling all WhatsApp records. 

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppDetailReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppDetailReportsApi apiInstance = new WhatsAppDetailReportsApi(defaultClient);
        Integer pageNumber = 1; // Integer | Page number
        Integer pageSize = 20; // Integer | Size of the page
        try {
            WhatsAppGetAllDetailReportResponse result = apiInstance.getRequests(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppDetailReportsApi#getRequests");
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

[**WhatsAppGetAllDetailReportResponse**](WhatsAppGetAllDetailReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## submitRequest

> WhatsAppDetailReportResponse submitRequest(whatsAppReportsReq)



Submit a request for new WhatsApp detail report. WhatsApp detail report pulls all raw WhatsApp data according to defined filters.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.WhatsAppDetailReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        WhatsAppDetailReportsApi apiInstance = new WhatsAppDetailReportsApi(defaultClient);
        WhatsAppReportsReq whatsAppReportsReq = new WhatsAppReportsReq(); // WhatsAppReportsReq | WhatsApp detail request data
        try {
            WhatsAppDetailReportResponse result = apiInstance.submitRequest(whatsAppReportsReq);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhatsAppDetailReportsApi#submitRequest");
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
 **whatsAppReportsReq** | [**WhatsAppReportsReq**](WhatsAppReportsReq.md)| WhatsApp detail request data |

### Return type

[**WhatsAppDetailReportResponse**](WhatsAppDetailReportResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

