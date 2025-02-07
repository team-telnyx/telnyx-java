# BucketUsageApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBucketUsage**](BucketUsageApi.md#getBucketUsage) | **GET** /storage/buckets/{bucketName}/usage/storage | Get Bucket Usage
[**getStorageAPIUsage**](BucketUsageApi.md#getStorageAPIUsage) | **GET** /storage/buckets/{bucketName}/usage/api | Get API Usage



## getBucketUsage

> GetBucketUsage200Response getBucketUsage(bucketName)

Get Bucket Usage

Returns the amount of storage space and number of files a bucket takes up.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BucketUsageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BucketUsageApi apiInstance = new BucketUsageApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the bucket
        try {
            GetBucketUsage200Response result = apiInstance.getBucketUsage(bucketName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketUsageApi#getBucketUsage");
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

[**GetBucketUsage200Response**](GetBucketUsage200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bucket Storage Usage |  -  |


## getStorageAPIUsage

> GetStorageAPIUsage200Response getStorageAPIUsage(bucketName, filterStartTime, filterEndTime)

Get API Usage

Returns the detail on API usage on a bucket of a particular time period, group by method category.

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.BucketUsageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        BucketUsageApi apiInstance = new BucketUsageApi(defaultClient);
        String bucketName = "bucketName_example"; // String | The name of the bucket
        OffsetDateTime filterStartTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z"); // OffsetDateTime | The start time of the period to filter the usage (ISO microsecond format)
        OffsetDateTime filterEndTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z"); // OffsetDateTime | The end time of the period to filter the usage (ISO microsecond format)
        try {
            GetStorageAPIUsage200Response result = apiInstance.getStorageAPIUsage(bucketName, filterStartTime, filterEndTime);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BucketUsageApi#getStorageAPIUsage");
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
 **filterStartTime** | **OffsetDateTime**| The start time of the period to filter the usage (ISO microsecond format) |
 **filterEndTime** | **OffsetDateTime**| The end time of the period to filter the usage (ISO microsecond format) |

### Return type

[**GetStorageAPIUsage200Response**](GetStorageAPIUsage200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Bucket Usage |  -  |

