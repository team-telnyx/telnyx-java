# ObjectApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteObject**](ObjectApi.md#deleteObject) | **DELETE** /{bucketName}/{objectName} | DeleteObject
[**deleteObjects**](ObjectApi.md#deleteObjects) | **POST** /{bucketName} | DeleteObjects
[**getObject**](ObjectApi.md#getObject) | **GET** /{bucketName}/{objectName} | GetObject
[**headObject**](ObjectApi.md#headObject) | **HEAD** /{bucketName}/{objectName} | HeadObject
[**listObjects**](ObjectApi.md#listObjects) | **GET** /{bucketName} | ListObjectsV2
[**putObject**](ObjectApi.md#putObject) | **PUT** /{bucketName}/{objectName} | PutObject



## deleteObject

> deleteObject(bucketName, objectName)

DeleteObject

Delete an object from a given bucket.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ObjectApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ObjectApi apiInstance = new ObjectApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The bucket name.
        String objectName = "objectName_example"; // String | The object name.
        try {
            apiInstance.deleteObject(bucketName, objectName);
        } catch (ApiException e) {
            System.err.println("Exception when calling ObjectApi#deleteObject");
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
 **bucketName** | **String**| The bucket name. |
 **objectName** | **String**| The object name. |

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
| **204** | Success |  -  |
| **401** | Unauthorized |  -  |


## deleteObjects

> Object deleteObjects(bucketName, delete, deleteObjectsRequestInner)

DeleteObjects

Deletes one or multiple objects from a given bucket.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ObjectApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ObjectApi apiInstance = new ObjectApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The bucket name.
        Boolean delete = true; // Boolean | 
        List<DeleteObjectsRequestInner> deleteObjectsRequestInner = Arrays.asList(); // List<DeleteObjectsRequestInner> | 
        try {
            Object result = apiInstance.deleteObjects(bucketName, delete, deleteObjectsRequestInner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ObjectApi#deleteObjects");
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
 **bucketName** | **String**| The bucket name. |
 **delete** | **Boolean**|  |
 **deleteObjectsRequestInner** | [**List&lt;DeleteObjectsRequestInner&gt;**](DeleteObjectsRequestInner.md)|  |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: text/xml
- **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |


## getObject

> File getObject(bucketName, objectName, uploadId)

GetObject

Retrieves an object from a given bucket.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ObjectApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ObjectApi apiInstance = new ObjectApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The bucket name.
        String objectName = "objectName_example"; // String | The object name.
        String uploadId = "uploadId_example"; // String | 
        try {
            File result = apiInstance.getObject(bucketName, objectName, uploadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ObjectApi#getObject");
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
 **bucketName** | **String**| The bucket name. |
 **objectName** | **String**| The object name. |
 **uploadId** | **String**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | ObjectNotFound |  -  |


## headObject

> headObject(bucketName, objectName)

HeadObject

Retrieves metadata from an object without returning the object itself.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ObjectApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ObjectApi apiInstance = new ObjectApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The bucket name.
        String objectName = "objectName_example"; // String | The object name.
        try {
            apiInstance.headObject(bucketName, objectName);
        } catch (ApiException e) {
            System.err.println("Exception when calling ObjectApi#headObject");
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
 **bucketName** | **String**| The bucket name. |
 **objectName** | **String**| The object name. |

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
| **200** | Success |  * Date -  <br>  * Last-Modified -  <br>  * Content-Length -  <br>  |
| **404** | ObjectNotFound |  -  |


## listObjects

> ListObjectsResponse listObjects(bucketName, listType)

ListObjectsV2

List all objects contained in a given bucket.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ObjectApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ObjectApi apiInstance = new ObjectApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the bucket.
        Integer listType = 2; // Integer | 
        try {
            ListObjectsResponse result = apiInstance.listObjects(bucketName, listType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ObjectApi#listObjects");
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
 **bucketName** | **String**| The name of the bucket. |
 **listType** | **Integer**|  | [optional] [enum: 2]

### Return type

[**ListObjectsResponse**](ListObjectsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Bucket does not exist. |  -  |


## putObject

> putObject(bucketName, objectName, body, contentType, partNumber, uploadId)

PutObject

Add an object to a bucket.

### Example

```java
import java.io.File;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.ObjectApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ObjectApi apiInstance = new ObjectApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The bucket name.
        String objectName = "objectName_example"; // String | The object name.
        File body = new File("/path/to/file"); // File | 
        String contentType = "contentType_example"; // String | 
        String partNumber = "partNumber_example"; // String | 
        String uploadId = "uploadId_example"; // String | 
        try {
            apiInstance.putObject(bucketName, objectName, body, contentType, partNumber, uploadId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ObjectApi#putObject");
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
 **bucketName** | **String**| The bucket name. |
 **objectName** | **String**| The object name. |
 **body** | **File**|  |
 **contentType** | **String**|  | [optional]
 **partNumber** | **String**|  | [optional]
 **uploadId** | **String**|  | [optional]

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
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |

