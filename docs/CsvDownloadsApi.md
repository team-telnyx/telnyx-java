# CsvDownloadsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCsvDownload**](CsvDownloadsApi.md#createCsvDownload) | **POST** /phone_numbers/csv_downloads | Create a CSV download
[**listCsvDownloads**](CsvDownloadsApi.md#listCsvDownloads) | **GET** /phone_numbers/csv_downloads | List CSV downloads
[**retrieveCsvDownload**](CsvDownloadsApi.md#retrieveCsvDownload) | **GET** /phone_numbers/csv_downloads/{id} | Retrieve a CSV download


<a name="createCsvDownload"></a>
# **createCsvDownload**
> CSVDownloadResponse createCsvDownload()

Create a CSV download

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CsvDownloadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CsvDownloadsApi apiInstance = new CsvDownloadsApi(defaultClient);
    try {
      CSVDownloadResponse result = apiInstance.createCsvDownload();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsvDownloadsApi#createCsvDownload");
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

[**CSVDownloadResponse**](CSVDownloadResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a CSV download. |  -  |
**0** | Unexpected error |  -  |

<a name="listCsvDownloads"></a>
# **listCsvDownloads**
> ListCSVDownloadsResponse listCsvDownloads(pageNumber, pageSize)

List CSV downloads

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CsvDownloadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CsvDownloadsApi apiInstance = new CsvDownloadsApi(defaultClient);
    Integer pageNumber = 1; // Integer | The page number to load
    Integer pageSize = 20; // Integer | The size of the page
    try {
      ListCSVDownloadsResponse result = apiInstance.listCsvDownloads(pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsvDownloadsApi#listCsvDownloads");
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

[**ListCSVDownloadsResponse**](ListCSVDownloadsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with a list of CSV downloads. |  -  |
**0** | Unexpected error |  -  |

<a name="retrieveCsvDownload"></a>
# **retrieveCsvDownload**
> CSVDownloadResponse retrieveCsvDownload(id)

Retrieve a CSV download

### Example
```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.models.*;
import com.telnyx.sdk.apis.CsvDownloadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.telnyx.com/v2");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    CsvDownloadsApi apiInstance = new CsvDownloadsApi(defaultClient);
    String id = "id_example"; // String | Identifies the CSV download.
    try {
      CSVDownloadResponse result = apiInstance.retrieveCsvDownload(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsvDownloadsApi#retrieveCsvDownload");
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
 **id** | **String**| Identifies the CSV download. |

### Return type

[**CSVDownloadResponse**](CSVDownloadResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with details about a CSV download. |  -  |
**0** | Unexpected error |  -  |

