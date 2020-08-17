# CsvDownloadsApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCsvDownload**](CsvDownloadsApi.md#createCsvDownload) | **POST** /phone_numbers/csv_downloads | create a new CSV download request
[**findCsvDownloads**](CsvDownloadsApi.md#findCsvDownloads) | **GET** /phone_numbers/csv_downloads | List your submitted CSV download requests
[**retrieveCsvDownload**](CsvDownloadsApi.md#retrieveCsvDownload) | **GET** /phone_numbers/csv_downloads/{id} | Get a single submitted CSV download request.

<a name="createCsvDownload"></a>
# **createCsvDownload**
> RetrieveCsvDownloadResponse createCsvDownload()

create a new CSV download request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CsvDownloadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CsvDownloadsApi apiInstance = new CsvDownloadsApi();
try {
    RetrieveCsvDownloadResponse result = apiInstance.createCsvDownload();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CsvDownloadsApi#createCsvDownload");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RetrieveCsvDownloadResponse**](RetrieveCsvDownloadResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findCsvDownloads"></a>
# **findCsvDownloads**
> ListCsvDownloadsResponse findCsvDownloads(pageNumber, pageSize)

List your submitted CSV download requests

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CsvDownloadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CsvDownloadsApi apiInstance = new CsvDownloadsApi();
Integer pageNumber = 1; // Integer | The page number to load
Integer pageSize = 20; // Integer | The size of the page
try {
    ListCsvDownloadsResponse result = apiInstance.findCsvDownloads(pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CsvDownloadsApi#findCsvDownloads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageNumber** | **Integer**| The page number to load | [optional] [default to 1] [enum: ]
 **pageSize** | **Integer**| The size of the page | [optional] [default to 20] [enum: ]

### Return type

[**ListCsvDownloadsResponse**](ListCsvDownloadsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveCsvDownload"></a>
# **retrieveCsvDownload**
> RetrieveCsvDownloadResponse retrieveCsvDownload(id)

Get a single submitted CSV download request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CsvDownloadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CsvDownloadsApi apiInstance = new CsvDownloadsApi();
String id = "id_example"; // String | Identifies the CSV download.
try {
    RetrieveCsvDownloadResponse result = apiInstance.retrieveCsvDownload(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CsvDownloadsApi#retrieveCsvDownload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Identifies the CSV download. |

### Return type

[**RetrieveCsvDownloadResponse**](RetrieveCsvDownloadResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

