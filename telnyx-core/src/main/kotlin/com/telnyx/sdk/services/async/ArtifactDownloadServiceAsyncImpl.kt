// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.artifactdownloads.ArtifactDownloadRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Download screenshots and other artifacts. */
class ArtifactDownloadServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ArtifactDownloadServiceAsync {

    private val withRawResponse: ArtifactDownloadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ArtifactDownloadServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ArtifactDownloadServiceAsync =
        ArtifactDownloadServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ArtifactDownloadRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /artifact_downloads/{artifactId}
        withRawResponse().retrieve(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ArtifactDownloadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ArtifactDownloadServiceAsync.WithRawResponse =
            ArtifactDownloadServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun retrieve(
            params: ArtifactDownloadRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("artifactId", params.artifactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("artifact_downloads", params._pathParam(0))
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response -> errorHandler.handle(response) }
        }
    }
}
