# DataMigrationApi

All URIs are relative to *https://api.telnyx.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMigration**](DataMigrationApi.md#createMigration) | **POST** /storage/migrations | Create a Migration
[**createMigrationSource**](DataMigrationApi.md#createMigrationSource) | **POST** /storage/migration_sources | Create a Migration Source
[**deleteMigrationSource**](DataMigrationApi.md#deleteMigrationSource) | **DELETE** /storage/migration_sources/{id} | Delete a Migration Source
[**getMigration**](DataMigrationApi.md#getMigration) | **GET** /storage/migrations/{id} | Get a Migration
[**getMigrationSource**](DataMigrationApi.md#getMigrationSource) | **GET** /storage/migration_sources/{id} | Get a Migration Source
[**listMigrationSourceCoverage**](DataMigrationApi.md#listMigrationSourceCoverage) | **GET** /storage/migration_source_coverage | List Migration Source coverage
[**listMigrationSources**](DataMigrationApi.md#listMigrationSources) | **GET** /storage/migration_sources | List all Migration Sources
[**listMigrations**](DataMigrationApi.md#listMigrations) | **GET** /storage/migrations | List all Migrations
[**stopMigration**](DataMigrationApi.md#stopMigration) | **POST** /storage/migrations/{id}/actions/stop | Stop a Migration



## createMigration

> CreateMigration200Response createMigration(migrationParams)

Create a Migration

Initiate a migration of data from an external provider into Telnyx Cloud Storage. Currently, only S3 is supported.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DataMigrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataMigrationApi apiInstance = new DataMigrationApi(defaultClient);
        MigrationParams migrationParams = new MigrationParams(); // MigrationParams | 
        try {
            CreateMigration200Response result = apiInstance.createMigration(migrationParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataMigrationApi#createMigration");
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
 **migrationParams** | [**MigrationParams**](MigrationParams.md)|  | [optional]

### Return type

[**CreateMigration200Response**](CreateMigration200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Migration Response |  -  |


## createMigrationSource

> CreateMigrationSource200Response createMigrationSource(migrationSourceParams)

Create a Migration Source

Create a source from which data can be migrated from.

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DataMigrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataMigrationApi apiInstance = new DataMigrationApi(defaultClient);
        MigrationSourceParams migrationSourceParams = new MigrationSourceParams(); // MigrationSourceParams | 
        try {
            CreateMigrationSource200Response result = apiInstance.createMigrationSource(migrationSourceParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataMigrationApi#createMigrationSource");
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
 **migrationSourceParams** | [**MigrationSourceParams**](MigrationSourceParams.md)|  | [optional]

### Return type

[**CreateMigrationSource200Response**](CreateMigrationSource200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Migration Source Response |  -  |


## deleteMigrationSource

> CreateMigrationSource200Response deleteMigrationSource(id)

Delete a Migration Source

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DataMigrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataMigrationApi apiInstance = new DataMigrationApi(defaultClient);
        String id = "id_example"; // String | Unique identifier for the data migration source.
        try {
            CreateMigrationSource200Response result = apiInstance.deleteMigrationSource(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataMigrationApi#deleteMigrationSource");
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
 **id** | **String**| Unique identifier for the data migration source. |

### Return type

[**CreateMigrationSource200Response**](CreateMigrationSource200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Migration Source Response |  -  |


## getMigration

> CreateMigration200Response getMigration(id)

Get a Migration

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DataMigrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataMigrationApi apiInstance = new DataMigrationApi(defaultClient);
        String id = "id_example"; // String | Unique identifier for the data migration.
        try {
            CreateMigration200Response result = apiInstance.getMigration(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataMigrationApi#getMigration");
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
 **id** | **String**| Unique identifier for the data migration. |

### Return type

[**CreateMigration200Response**](CreateMigration200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Migration Response |  -  |


## getMigrationSource

> CreateMigrationSource200Response getMigrationSource(id)

Get a Migration Source

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DataMigrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataMigrationApi apiInstance = new DataMigrationApi(defaultClient);
        String id = "id_example"; // String | Unique identifier for the data migration source.
        try {
            CreateMigrationSource200Response result = apiInstance.getMigrationSource(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataMigrationApi#getMigrationSource");
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
 **id** | **String**| Unique identifier for the data migration source. |

### Return type

[**CreateMigrationSource200Response**](CreateMigrationSource200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Migration Source Response |  -  |


## listMigrationSourceCoverage

> ListMigrationSourceCoverage200Response listMigrationSourceCoverage()

List Migration Source coverage

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DataMigrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataMigrationApi apiInstance = new DataMigrationApi(defaultClient);
        try {
            ListMigrationSourceCoverage200Response result = apiInstance.listMigrationSourceCoverage();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataMigrationApi#listMigrationSourceCoverage");
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

[**ListMigrationSourceCoverage200Response**](ListMigrationSourceCoverage200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Migrations Source Coverage Response |  -  |


## listMigrationSources

> ListMigrationSources200Response listMigrationSources()

List all Migration Sources

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DataMigrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataMigrationApi apiInstance = new DataMigrationApi(defaultClient);
        try {
            ListMigrationSources200Response result = apiInstance.listMigrationSources();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataMigrationApi#listMigrationSources");
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

[**ListMigrationSources200Response**](ListMigrationSources200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Migration Sources Response |  -  |


## listMigrations

> ListMigrations200Response listMigrations()

List all Migrations

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DataMigrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataMigrationApi apiInstance = new DataMigrationApi(defaultClient);
        try {
            ListMigrations200Response result = apiInstance.listMigrations();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataMigrationApi#listMigrations");
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

[**ListMigrations200Response**](ListMigrations200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Migrations Response |  -  |


## stopMigration

> CreateMigration200Response stopMigration(id)

Stop a Migration

### Example

```java
// Import classes:
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.*;
import com.telnyx.sdk.api.DataMigrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.telnyx.com/v2");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DataMigrationApi apiInstance = new DataMigrationApi(defaultClient);
        String id = "id_example"; // String | Unique identifier for the data migration.
        try {
            CreateMigration200Response result = apiInstance.stopMigration(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataMigrationApi#stopMigration");
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
 **id** | **String**| Unique identifier for the data migration. |

### Return type

[**CreateMigration200Response**](CreateMigration200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Migration Response |  -  |

