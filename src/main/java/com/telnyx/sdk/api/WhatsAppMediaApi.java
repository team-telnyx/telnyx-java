package com.telnyx.sdk.api;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiResponse;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.Pair;

import jakarta.ws.rs.core.GenericType;

import com.telnyx.sdk.model.Errors;
import java.io.File;
import com.telnyx.sdk.model.UploadMedia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsAppMediaApi {
  private ApiClient apiClient;

  public WhatsAppMediaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WhatsAppMediaApi(ApiClient apiClient) {
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
   * Delete Media
   * Delete uploaded media.
   * @param whatsappUserId User&#39;s WhatsApp ID (required)
   * @param mediaId WhatsApp&#39;s Media ID (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Request successful, empty response body. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public void deleteMedia(String whatsappUserId, String mediaId) throws ApiException {
    deleteMediaWithHttpInfo(whatsappUserId, mediaId);
  }

  /**
   * Delete Media
   * Delete uploaded media.
   * @param whatsappUserId User&#39;s WhatsApp ID (required)
   * @param mediaId WhatsApp&#39;s Media ID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Request successful, empty response body. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> deleteMediaWithHttpInfo(String whatsappUserId, String mediaId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'whatsappUserId' is set
    if (whatsappUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'whatsappUserId' when calling deleteMedia");
    }
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling deleteMedia");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_media/{whatsapp_user_id}/{media_id}"
      .replaceAll("\\{" + "whatsapp_user_id" + "\\}", apiClient.escapeString(whatsappUserId.toString()))
      .replaceAll("\\{" + "media_id" + "\\}", apiClient.escapeString(mediaId.toString()));

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

    return apiClient.invokeAPI("WhatsAppMediaApi.deleteMedia", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Download Media
   * Retrieve uploaded media. Media is typically available for 30 days after uploading.
   * @param whatsappUserId User&#39;s WhatsApp ID (required)
   * @param mediaId WhatsApp&#39;s Media ID (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public File downloadMedia(String whatsappUserId, String mediaId) throws ApiException {
    return downloadMediaWithHttpInfo(whatsappUserId, mediaId).getData();
  }

  /**
   * Download Media
   * Retrieve uploaded media. Media is typically available for 30 days after uploading.
   * @param whatsappUserId User&#39;s WhatsApp ID (required)
   * @param mediaId WhatsApp&#39;s Media ID (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> downloadMediaWithHttpInfo(String whatsappUserId, String mediaId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'whatsappUserId' is set
    if (whatsappUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'whatsappUserId' when calling downloadMedia");
    }
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling downloadMedia");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_media/{whatsapp_user_id}/{media_id}"
      .replaceAll("\\{" + "whatsapp_user_id" + "\\}", apiClient.escapeString(whatsappUserId.toString()))
      .replaceAll("\\{" + "media_id" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<File> localVarReturnType = new GenericType<File>() {};

    return apiClient.invokeAPI("WhatsAppMediaApi.downloadMedia", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Upload Media
   * Upload media. Accepted media types include image/jpeg, image/png, video/mp4, video/3gpp, audio/aac, audio/ogg.
   * @param whatsappUserId The user&#39;s WhatsApp ID. (required)
   * @param mediaContentType The content-type of the uplaoded media. (required)
   * @param uploadFile The media to store with WhatsApp. (required)
   * @return UploadMedia
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public UploadMedia uploadMedia(String whatsappUserId, String mediaContentType, File uploadFile) throws ApiException {
    return uploadMediaWithHttpInfo(whatsappUserId, mediaContentType, uploadFile).getData();
  }

  /**
   * Upload Media
   * Upload media. Accepted media types include image/jpeg, image/png, video/mp4, video/3gpp, audio/aac, audio/ogg.
   * @param whatsappUserId The user&#39;s WhatsApp ID. (required)
   * @param mediaContentType The content-type of the uplaoded media. (required)
   * @param uploadFile The media to store with WhatsApp. (required)
   * @return ApiResponse&lt;UploadMedia&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UploadMedia> uploadMediaWithHttpInfo(String whatsappUserId, String mediaContentType, File uploadFile) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'whatsappUserId' is set
    if (whatsappUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'whatsappUserId' when calling uploadMedia");
    }
    
    // verify the required parameter 'mediaContentType' is set
    if (mediaContentType == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaContentType' when calling uploadMedia");
    }
    
    // verify the required parameter 'uploadFile' is set
    if (uploadFile == null) {
      throw new ApiException(400, "Missing the required parameter 'uploadFile' when calling uploadMedia");
    }
    
    // create path and map variables
    String localVarPath = "/whatsapp_media";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (whatsappUserId != null)
      localVarFormParams.put("whatsapp_user_id", whatsappUserId);
if (mediaContentType != null)
      localVarFormParams.put("media_content_type", mediaContentType);
if (uploadFile != null)
      localVarFormParams.put("upload_file", uploadFile);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<UploadMedia> localVarReturnType = new GenericType<UploadMedia>() {};

    return apiClient.invokeAPI("WhatsAppMediaApi.uploadMedia", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
