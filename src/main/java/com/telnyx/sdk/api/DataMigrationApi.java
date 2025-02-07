package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.CreateMigration200Response;
import com.telnyx.sdk.model.CreateMigrationSource200Response;
import com.telnyx.sdk.model.ListMigrationSourceCoverage200Response;
import com.telnyx.sdk.model.ListMigrationSources200Response;
import com.telnyx.sdk.model.ListMigrations200Response;
import com.telnyx.sdk.model.MigrationParams;
import com.telnyx.sdk.model.MigrationSourceParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class DataMigrationApi {
  private ApiClient apiClient;

  public DataMigrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DataMigrationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Migration
   * Initiate a migration of data from an external provider into Telnyx Cloud Storage. Currently, only S3 is supported.
   * @param migrationParams  (optional)
   * @return CreateMigration200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Response </td><td>  -  </td></tr>
     </table>
   */
  public CreateMigration200Response createMigration(MigrationParams migrationParams) throws ApiException {
    return createMigrationWithHttpInfo(migrationParams).getData();
  }

  /**
   * Create a Migration
   * Initiate a migration of data from an external provider into Telnyx Cloud Storage. Currently, only S3 is supported.
   * @param migrationParams  (optional)
   * @return ApiResponse&lt;CreateMigration200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateMigration200Response> createMigrationWithHttpInfo(MigrationParams migrationParams) throws ApiException {
    Object localVarPostBody = migrationParams;
    
    // create path and map variables
    String localVarPath = "/storage/migrations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateMigration200Response> localVarReturnType = new GenericType<CreateMigration200Response>() {};

    return apiClient.invokeAPI("DataMigrationApi.createMigration", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Create a Migration Source
   * Create a source from which data can be migrated from.
   * @param migrationSourceParams  (optional)
   * @return CreateMigrationSource200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Source Response </td><td>  -  </td></tr>
     </table>
   */
  public CreateMigrationSource200Response createMigrationSource(MigrationSourceParams migrationSourceParams) throws ApiException {
    return createMigrationSourceWithHttpInfo(migrationSourceParams).getData();
  }

  /**
   * Create a Migration Source
   * Create a source from which data can be migrated from.
   * @param migrationSourceParams  (optional)
   * @return ApiResponse&lt;CreateMigrationSource200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Source Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateMigrationSource200Response> createMigrationSourceWithHttpInfo(MigrationSourceParams migrationSourceParams) throws ApiException {
    Object localVarPostBody = migrationSourceParams;
    
    // create path and map variables
    String localVarPath = "/storage/migration_sources";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateMigrationSource200Response> localVarReturnType = new GenericType<CreateMigrationSource200Response>() {};

    return apiClient.invokeAPI("DataMigrationApi.createMigrationSource", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Delete a Migration Source
   * 
   * @param id Unique identifier for the data migration source. (required)
   * @return CreateMigrationSource200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Source Response </td><td>  -  </td></tr>
     </table>
   */
  public CreateMigrationSource200Response deleteMigrationSource(String id) throws ApiException {
    return deleteMigrationSourceWithHttpInfo(id).getData();
  }

  /**
   * Delete a Migration Source
   * 
   * @param id Unique identifier for the data migration source. (required)
   * @return ApiResponse&lt;CreateMigrationSource200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Source Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateMigrationSource200Response> deleteMigrationSourceWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteMigrationSource");
    }
    
    // create path and map variables
    String localVarPath = "/storage/migration_sources/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateMigrationSource200Response> localVarReturnType = new GenericType<CreateMigrationSource200Response>() {};

    return apiClient.invokeAPI("DataMigrationApi.deleteMigrationSource", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a Migration
   * 
   * @param id Unique identifier for the data migration. (required)
   * @return CreateMigration200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Response </td><td>  -  </td></tr>
     </table>
   */
  public CreateMigration200Response getMigration(String id) throws ApiException {
    return getMigrationWithHttpInfo(id).getData();
  }

  /**
   * Get a Migration
   * 
   * @param id Unique identifier for the data migration. (required)
   * @return ApiResponse&lt;CreateMigration200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateMigration200Response> getMigrationWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMigration");
    }
    
    // create path and map variables
    String localVarPath = "/storage/migrations/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateMigration200Response> localVarReturnType = new GenericType<CreateMigration200Response>() {};

    return apiClient.invokeAPI("DataMigrationApi.getMigration", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a Migration Source
   * 
   * @param id Unique identifier for the data migration source. (required)
   * @return CreateMigrationSource200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Source Response </td><td>  -  </td></tr>
     </table>
   */
  public CreateMigrationSource200Response getMigrationSource(String id) throws ApiException {
    return getMigrationSourceWithHttpInfo(id).getData();
  }

  /**
   * Get a Migration Source
   * 
   * @param id Unique identifier for the data migration source. (required)
   * @return ApiResponse&lt;CreateMigrationSource200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Source Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateMigrationSource200Response> getMigrationSourceWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMigrationSource");
    }
    
    // create path and map variables
    String localVarPath = "/storage/migration_sources/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateMigrationSource200Response> localVarReturnType = new GenericType<CreateMigrationSource200Response>() {};

    return apiClient.invokeAPI("DataMigrationApi.getMigrationSource", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List Migration Source coverage
   * 
   * @return ListMigrationSourceCoverage200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List Migrations Source Coverage Response </td><td>  -  </td></tr>
     </table>
   */
  public ListMigrationSourceCoverage200Response listMigrationSourceCoverage() throws ApiException {
    return listMigrationSourceCoverageWithHttpInfo().getData();
  }

  /**
   * List Migration Source coverage
   * 
   * @return ApiResponse&lt;ListMigrationSourceCoverage200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List Migrations Source Coverage Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListMigrationSourceCoverage200Response> listMigrationSourceCoverageWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/storage/migration_source_coverage";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListMigrationSourceCoverage200Response> localVarReturnType = new GenericType<ListMigrationSourceCoverage200Response>() {};

    return apiClient.invokeAPI("DataMigrationApi.listMigrationSourceCoverage", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Migration Sources
   * 
   * @return ListMigrationSources200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List Migration Sources Response </td><td>  -  </td></tr>
     </table>
   */
  public ListMigrationSources200Response listMigrationSources() throws ApiException {
    return listMigrationSourcesWithHttpInfo().getData();
  }

  /**
   * List all Migration Sources
   * 
   * @return ApiResponse&lt;ListMigrationSources200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List Migration Sources Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListMigrationSources200Response> listMigrationSourcesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/storage/migration_sources";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListMigrationSources200Response> localVarReturnType = new GenericType<ListMigrationSources200Response>() {};

    return apiClient.invokeAPI("DataMigrationApi.listMigrationSources", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * List all Migrations
   * 
   * @return ListMigrations200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List Migrations Response </td><td>  -  </td></tr>
     </table>
   */
  public ListMigrations200Response listMigrations() throws ApiException {
    return listMigrationsWithHttpInfo().getData();
  }

  /**
   * List all Migrations
   * 
   * @return ApiResponse&lt;ListMigrations200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> List Migrations Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ListMigrations200Response> listMigrationsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/storage/migrations";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ListMigrations200Response> localVarReturnType = new GenericType<ListMigrations200Response>() {};

    return apiClient.invokeAPI("DataMigrationApi.listMigrations", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Stop a Migration
   * 
   * @param id Unique identifier for the data migration. (required)
   * @return CreateMigration200Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Response </td><td>  -  </td></tr>
     </table>
   */
  public CreateMigration200Response stopMigration(String id) throws ApiException {
    return stopMigrationWithHttpInfo(id).getData();
  }

  /**
   * Stop a Migration
   * 
   * @param id Unique identifier for the data migration. (required)
   * @return ApiResponse&lt;CreateMigration200Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Create Migration Response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CreateMigration200Response> stopMigrationWithHttpInfo(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling stopMigration");
    }
    
    // create path and map variables
    String localVarPath = "/storage/migrations/{id}/actions/stop"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<CreateMigration200Response> localVarReturnType = new GenericType<CreateMigration200Response>() {};

    return apiClient.invokeAPI("DataMigrationApi.stopMigration", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
