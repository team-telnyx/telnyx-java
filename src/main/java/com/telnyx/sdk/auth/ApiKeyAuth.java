/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.telnyx.sdk.auth;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Pair;
import java.net.URI;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ApiKeyAuth implements Authentication {

    private final String location;
    private final String paramName;

    private String apiKey;
    private String apiKeyPrefix;

    public ApiKeyAuth(String location, String paramName) {
        this.location = location;
        this.paramName = paramName;
    }

    public String getLocation() {
        return location;
    }

    public String getParamName() {
        return paramName;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKeyPrefix() {
        return apiKeyPrefix;
    }

    public void setApiKeyPrefix(String apiKeyPrefix) {
        this.apiKeyPrefix = apiKeyPrefix;
    }

    @Override
    public void applyToParams(
        List<Pair> queryParams,
        Map<String, String> headerParams,
        Map<String, String> cookieParams,
        String payload,
        String method,
        URI uri
    ) throws ApiException {
        if (apiKey == null) {
            return;
        }
        String value;
        if (apiKeyPrefix != null) {
            value = apiKeyPrefix + " " + apiKey;
        } else {
            value = apiKey;
        }
        if ("query".equals(location)) {
            queryParams.add(new Pair(paramName, value));
        } else if ("header".equals(location)) {
            headerParams.put(paramName, value);
        } else if ("cookie".equals(location)) {
            cookieParams.put(paramName, value);
        }
    }
}
