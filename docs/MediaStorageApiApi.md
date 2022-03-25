# MediaStorageApiApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMediaStorage**](MediaStorageApiApi.md#createMediaStorage) | **POST** /media | Upload media
[**deleteMediaStorage**](MediaStorageApiApi.md#deleteMediaStorage) | **DELETE** /media/{media_name} | Deletes stored media
[**downloadMediaStorage**](MediaStorageApiApi.md#downloadMediaStorage) | **GET** /media/{media_name}/download | Download stored media
[**getMediaStorage**](MediaStorageApiApi.md#getMediaStorage) | **GET** /media/{media_name} | Retrieve stored media
[**listMediaStorage**](MediaStorageApiApi.md#listMediaStorage) | **GET** /media | List uploaded media
[**updateMediaStorage**](MediaStorageApiApi.md#updateMediaStorage) | **PUT** /media/{media_name} | Update stored media



## createMediaStorage

> MediaResourceResponse createMediaStorage(uploadMediaRequest)

Upload media

Upload media file to Telnyx so it can be used with other Telnyx services

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MediaStorageApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaStorageApiApi apiInstance = new MediaStorageApiApi(defaultClient);
        UploadMediaRequest uploadMediaRequest = new UploadMediaRequest(); // UploadMediaRequest | Upload media request
        try {
            MediaResourceResponse result = apiInstance.createMediaStorage(uploadMediaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaStorageApiApi#createMediaStorage");
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
 **uploadMediaRequest** | [**UploadMediaRequest**](UploadMediaRequest.md)| Upload media request |

### Return type

[**MediaResourceResponse**](MediaResourceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A response describing a media resource |  -  |
| **0** | Unexpected error |  -  |


## deleteMediaStorage

> deleteMediaStorage(mediaName)

Deletes stored media

Deletes a stored media file.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MediaStorageApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaStorageApiApi apiInstance = new MediaStorageApiApi(defaultClient);
        String mediaName = "mediaName_example"; // String | Uniquely identifies a media resource.
        try {
            apiInstance.deleteMediaStorage(mediaName);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaStorageApiApi#deleteMediaStorage");
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
 **mediaName** | **String**| Uniquely identifies a media resource. |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The media was deleted successfully. |  -  |
| **0** | Unexpected error |  -  |


## downloadMediaStorage

> File downloadMediaStorage(mediaName)

Download stored media

Downloads a stored media file.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MediaStorageApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaStorageApiApi apiInstance = new MediaStorageApiApi(defaultClient);
        String mediaName = "mediaName_example"; // String | Uniquely identifies a media resource.
        try {
            File result = apiInstance.downloadMediaStorage(mediaName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaStorageApiApi#downloadMediaStorage");
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
 **mediaName** | **String**| Uniquely identifies a media resource. |

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response describing a media resource |  -  |
| **0** | Unexpected error |  -  |


## getMediaStorage

> MediaResourceResponse getMediaStorage(mediaName)

Retrieve stored media

Returns the information about a stored media file.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MediaStorageApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaStorageApiApi apiInstance = new MediaStorageApiApi(defaultClient);
        String mediaName = "mediaName_example"; // String | Uniquely identifies a media resource.
        try {
            MediaResourceResponse result = apiInstance.getMediaStorage(mediaName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaStorageApiApi#getMediaStorage");
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
 **mediaName** | **String**| Uniquely identifies a media resource. |

### Return type

[**MediaResourceResponse**](MediaResourceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response describing a media resource |  -  |
| **0** | Unexpected error |  -  |


## listMediaStorage

> ListOfMediaResourcesResponse listMediaStorage(filterContentType)

List uploaded media

Returns a list of stored media files.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MediaStorageApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaStorageApiApi apiInstance = new MediaStorageApiApi(defaultClient);
        String filterContentType = "application_xml"; // String | Filters files by given content types
        try {
            ListOfMediaResourcesResponse result = apiInstance.listMediaStorage(filterContentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaStorageApiApi#listMediaStorage");
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
 **filterContentType** | **String**| Filters files by given content types | [optional]

### Return type

[**ListOfMediaResourcesResponse**](ListOfMediaResourcesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response with a list of media resources |  -  |
| **0** | Unexpected error |  -  |


## updateMediaStorage

> MediaResourceResponse updateMediaStorage(mediaName, updateMediaRequest)

Update stored media

Updates a stored media file.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.MediaStorageApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaStorageApiApi apiInstance = new MediaStorageApiApi(defaultClient);
        String mediaName = "mediaName_example"; // String | Uniquely identifies a media resource.
        UpdateMediaRequest updateMediaRequest = new UpdateMediaRequest(); // UpdateMediaRequest | Update media request
        try {
            MediaResourceResponse result = apiInstance.updateMediaStorage(mediaName, updateMediaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaStorageApiApi#updateMediaStorage");
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
 **mediaName** | **String**| Uniquely identifies a media resource. |
 **updateMediaRequest** | [**UpdateMediaRequest**](UpdateMediaRequest.md)| Update media request |

### Return type

[**MediaResourceResponse**](MediaResourceResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json, multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A response describing a media resource |  -  |
| **0** | Unexpected error |  -  |

