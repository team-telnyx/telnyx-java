# BucketSslCertificateApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStorageSSLCertificate**](BucketSslCertificateApi.md#addStorageSSLCertificate) | **PUT** /storage/buckets/{bucketName}/ssl_certificate | Add SSL Certificate
[**getStorageSSLCertificates**](BucketSslCertificateApi.md#getStorageSSLCertificates) | **GET** /storage/buckets/{bucketName}/ssl_certificate | Get Bucket SSL Certificate
[**removeStorageSSLCertificate**](BucketSslCertificateApi.md#removeStorageSSLCertificate) | **DELETE** /storage/buckets/{bucketName}/ssl_certificate | Remove SSL Certificate



## addStorageSSLCertificate

> GetStorageSSLCertificates200Response addStorageSSLCertificate(bucketName, certificate, privateKey)

Add SSL Certificate

Uploads an SSL certificate and its matching secret so that you can use Telnyx’s storage as your CDN.

### Example

```java
import java.io.File;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BucketSslCertificateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BucketSslCertificateApi apiInstance = new BucketSslCertificateApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the bucket
        File certificate = new File("/path/to/file"); // File | The SSL certificate file
        File privateKey = new File("/path/to/file"); // File | The private key file
        try {
            GetStorageSSLCertificates200Response result = apiInstance.addStorageSSLCertificate(bucketName, certificate, privateKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketSslCertificateApi#addStorageSSLCertificate");
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
 **bucketName** | **String**| The name of the bucket |
 **certificate** | **File**| The SSL certificate file | [optional]
 **privateKey** | **File**| The private key file | [optional]

### Return type

[**GetStorageSSLCertificates200Response**](GetStorageSSLCertificates200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SSL Certificate Response |  -  |


## getStorageSSLCertificates

> GetStorageSSLCertificates200Response getStorageSSLCertificates(bucketName)

Get Bucket SSL Certificate

Returns the stored certificate detail of a bucket, if applicable.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BucketSslCertificateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BucketSslCertificateApi apiInstance = new BucketSslCertificateApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the bucket
        try {
            GetStorageSSLCertificates200Response result = apiInstance.getStorageSSLCertificates(bucketName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketSslCertificateApi#getStorageSSLCertificates");
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
 **bucketName** | **String**| The name of the bucket |

### Return type

[**GetStorageSSLCertificates200Response**](GetStorageSSLCertificates200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SSL Certificate Response |  -  |


## removeStorageSSLCertificate

> GetStorageSSLCertificates200Response removeStorageSSLCertificate(bucketName)

Remove SSL Certificate

Deletes an SSL certificate and its matching secret.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BucketSslCertificateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BucketSslCertificateApi apiInstance = new BucketSslCertificateApi(defaultClient);
        String bucketName = "bucketName_example"; // String | Bucket Name
        try {
            GetStorageSSLCertificates200Response result = apiInstance.removeStorageSSLCertificate(bucketName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketSslCertificateApi#removeStorageSSLCertificate");
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
 **bucketName** | **String**| Bucket Name |

### Return type

[**GetStorageSSLCertificates200Response**](GetStorageSSLCertificates200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SSL Certificate Response |  -  |

