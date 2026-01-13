// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.MultipartField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Send a fax. Files have size limits and page count limit validations. If a file is bigger than
 * 50MB or has more than 350 pages it will fail with `file_size_limit_exceeded` and
 * `page_count_limit_exceeded` respectively.
 *
 * **Expected Webhooks:**
 * - `fax.queued`
 * - `fax.media.processed`
 * - `fax.sending.started`
 * - `fax.delivered`
 * - `fax.failed`
 */
class FaxCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The connection ID to send the fax with.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectionId(): String = body.connectionId()

    /**
     * The phone number, in E.164 format, the fax will be sent from.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): String = body.from()

    /**
     * The phone number, in E.164 format, the fax will be sent to or SIP URI
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = body.to()

    /**
     * The black threshold percentage for monochrome faxes. Only applicable if `monochrome` is set
     * to `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blackThreshold(): Optional<Long> = body.blackThreshold()

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * The `from_display_name` string to be used as the caller id name (SIP From Display Name)
     * presented to the destination (`to` number). The string should have a maximum of 128
     * characters, containing only letters, numbers, spaces, and -_~!.+ special characters. If
     * ommited, the display name will be the same as the number in the `from` field.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fromDisplayName(): Optional<String> = body.fromDisplayName()

    /**
     * The media_name used for the fax's media. Must point to a file previously uploaded to
     * api.telnyx.com/v2/media by the same user/organization. media_name and media_url/contents
     * can't be submitted together.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaName(): Optional<String> = body.mediaName()

    /**
     * The URL (or list of URLs) to the PDF used for the fax's media. media_url and
     * media_name/contents can't be submitted together.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrl(): Optional<String> = body.mediaUrl()

    /**
     * The flag to enable monochrome, true black and white fax results.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun monochrome(): Optional<Boolean> = body.monochrome()

    /**
     * The format for the preview file in case the `store_preview` is `true`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previewFormat(): Optional<PreviewFormat> = body.previewFormat()

    /**
     * The quality of the fax. The `ultra` settings provides the highest quality available, but also
     * present longer fax processing times. `ultra_light` is best suited for images, wihle
     * `ultra_dark` is best suited for text.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quality(): Optional<Quality> = body.quality()

    /**
     * Should fax media be stored on temporary URL. It does not support media_name, they can't be
     * submitted together.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun storeMedia(): Optional<Boolean> = body.storeMedia()

    /**
     * Should fax preview be stored on temporary URL.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun storePreview(): Optional<Boolean> = body.storePreview()

    /**
     * The flag to disable the T.38 protocol.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun t38Enabled(): Optional<Boolean> = body.t38Enabled()

    /**
     * Use this field to override the URL to which Telnyx will send subsequent webhooks for this
     * fax.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw multipart value of [connectionId].
     *
     * Unlike [connectionId], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _connectionId(): MultipartField<String> = body._connectionId()

    /**
     * Returns the raw multipart value of [from].
     *
     * Unlike [from], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _from(): MultipartField<String> = body._from()

    /**
     * Returns the raw multipart value of [to].
     *
     * Unlike [to], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _to(): MultipartField<String> = body._to()

    /**
     * Returns the raw multipart value of [blackThreshold].
     *
     * Unlike [blackThreshold], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _blackThreshold(): MultipartField<Long> = body._blackThreshold()

    /**
     * Returns the raw multipart value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _clientState(): MultipartField<String> = body._clientState()

    /**
     * Returns the raw multipart value of [fromDisplayName].
     *
     * Unlike [fromDisplayName], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _fromDisplayName(): MultipartField<String> = body._fromDisplayName()

    /**
     * Returns the raw multipart value of [mediaName].
     *
     * Unlike [mediaName], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _mediaName(): MultipartField<String> = body._mediaName()

    /**
     * Returns the raw multipart value of [mediaUrl].
     *
     * Unlike [mediaUrl], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _mediaUrl(): MultipartField<String> = body._mediaUrl()

    /**
     * Returns the raw multipart value of [monochrome].
     *
     * Unlike [monochrome], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _monochrome(): MultipartField<Boolean> = body._monochrome()

    /**
     * Returns the raw multipart value of [previewFormat].
     *
     * Unlike [previewFormat], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _previewFormat(): MultipartField<PreviewFormat> = body._previewFormat()

    /**
     * Returns the raw multipart value of [quality].
     *
     * Unlike [quality], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _quality(): MultipartField<Quality> = body._quality()

    /**
     * Returns the raw multipart value of [storeMedia].
     *
     * Unlike [storeMedia], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _storeMedia(): MultipartField<Boolean> = body._storeMedia()

    /**
     * Returns the raw multipart value of [storePreview].
     *
     * Unlike [storePreview], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _storePreview(): MultipartField<Boolean> = body._storePreview()

    /**
     * Returns the raw multipart value of [t38Enabled].
     *
     * Unlike [t38Enabled], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _t38Enabled(): MultipartField<Boolean> = body._t38Enabled()

    /**
     * Returns the raw multipart value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _webhookUrl(): MultipartField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FaxCreateParams].
         *
         * The following fields are required:
         * ```java
         * .connectionId()
         * .from()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FaxCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(faxCreateParams: FaxCreateParams) = apply {
            body = faxCreateParams.body.toBuilder()
            additionalHeaders = faxCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = faxCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [connectionId]
         * - [from]
         * - [to]
         * - [blackThreshold]
         * - [clientState]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The connection ID to send the fax with. */
        fun connectionId(connectionId: String) = apply { body.connectionId(connectionId) }

        /**
         * Sets [Builder.connectionId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.connectionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun connectionId(connectionId: MultipartField<String>) = apply {
            body.connectionId(connectionId)
        }

        /** The phone number, in E.164 format, the fax will be sent from. */
        fun from(from: String) = apply { body.from(from) }

        /**
         * Sets [Builder.from] to an arbitrary multipart value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: MultipartField<String>) = apply { body.from(from) }

        /** The phone number, in E.164 format, the fax will be sent to or SIP URI */
        fun to(to: String) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary multipart value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: MultipartField<String>) = apply { body.to(to) }

        /**
         * The black threshold percentage for monochrome faxes. Only applicable if `monochrome` is
         * set to `true`.
         */
        fun blackThreshold(blackThreshold: Long) = apply { body.blackThreshold(blackThreshold) }

        /**
         * Sets [Builder.blackThreshold] to an arbitrary multipart value.
         *
         * You should usually call [Builder.blackThreshold] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun blackThreshold(blackThreshold: MultipartField<Long>) = apply {
            body.blackThreshold(blackThreshold)
        }

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         */
        fun clientState(clientState: String) = apply { body.clientState(clientState) }

        /**
         * Sets [Builder.clientState] to an arbitrary multipart value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: MultipartField<String>) = apply {
            body.clientState(clientState)
        }

        /**
         * The `from_display_name` string to be used as the caller id name (SIP From Display Name)
         * presented to the destination (`to` number). The string should have a maximum of 128
         * characters, containing only letters, numbers, spaces, and -_~!.+ special characters. If
         * ommited, the display name will be the same as the number in the `from` field.
         */
        fun fromDisplayName(fromDisplayName: String) = apply {
            body.fromDisplayName(fromDisplayName)
        }

        /**
         * Sets [Builder.fromDisplayName] to an arbitrary multipart value.
         *
         * You should usually call [Builder.fromDisplayName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fromDisplayName(fromDisplayName: MultipartField<String>) = apply {
            body.fromDisplayName(fromDisplayName)
        }

        /**
         * The media_name used for the fax's media. Must point to a file previously uploaded to
         * api.telnyx.com/v2/media by the same user/organization. media_name and media_url/contents
         * can't be submitted together.
         */
        fun mediaName(mediaName: String) = apply { body.mediaName(mediaName) }

        /**
         * Sets [Builder.mediaName] to an arbitrary multipart value.
         *
         * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mediaName(mediaName: MultipartField<String>) = apply { body.mediaName(mediaName) }

        /**
         * The URL (or list of URLs) to the PDF used for the fax's media. media_url and
         * media_name/contents can't be submitted together.
         */
        fun mediaUrl(mediaUrl: String) = apply { body.mediaUrl(mediaUrl) }

        /**
         * Sets [Builder.mediaUrl] to an arbitrary multipart value.
         *
         * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mediaUrl(mediaUrl: MultipartField<String>) = apply { body.mediaUrl(mediaUrl) }

        /** The flag to enable monochrome, true black and white fax results. */
        fun monochrome(monochrome: Boolean) = apply { body.monochrome(monochrome) }

        /**
         * Sets [Builder.monochrome] to an arbitrary multipart value.
         *
         * You should usually call [Builder.monochrome] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun monochrome(monochrome: MultipartField<Boolean>) = apply { body.monochrome(monochrome) }

        /** The format for the preview file in case the `store_preview` is `true`. */
        fun previewFormat(previewFormat: PreviewFormat) = apply {
            body.previewFormat(previewFormat)
        }

        /**
         * Sets [Builder.previewFormat] to an arbitrary multipart value.
         *
         * You should usually call [Builder.previewFormat] with a well-typed [PreviewFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun previewFormat(previewFormat: MultipartField<PreviewFormat>) = apply {
            body.previewFormat(previewFormat)
        }

        /**
         * The quality of the fax. The `ultra` settings provides the highest quality available, but
         * also present longer fax processing times. `ultra_light` is best suited for images, wihle
         * `ultra_dark` is best suited for text.
         */
        fun quality(quality: Quality) = apply { body.quality(quality) }

        /**
         * Sets [Builder.quality] to an arbitrary multipart value.
         *
         * You should usually call [Builder.quality] with a well-typed [Quality] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quality(quality: MultipartField<Quality>) = apply { body.quality(quality) }

        /**
         * Should fax media be stored on temporary URL. It does not support media_name, they can't
         * be submitted together.
         */
        fun storeMedia(storeMedia: Boolean) = apply { body.storeMedia(storeMedia) }

        /**
         * Sets [Builder.storeMedia] to an arbitrary multipart value.
         *
         * You should usually call [Builder.storeMedia] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun storeMedia(storeMedia: MultipartField<Boolean>) = apply { body.storeMedia(storeMedia) }

        /** Should fax preview be stored on temporary URL. */
        fun storePreview(storePreview: Boolean) = apply { body.storePreview(storePreview) }

        /**
         * Sets [Builder.storePreview] to an arbitrary multipart value.
         *
         * You should usually call [Builder.storePreview] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun storePreview(storePreview: MultipartField<Boolean>) = apply {
            body.storePreview(storePreview)
        }

        /** The flag to disable the T.38 protocol. */
        fun t38Enabled(t38Enabled: Boolean) = apply { body.t38Enabled(t38Enabled) }

        /**
         * Sets [Builder.t38Enabled] to an arbitrary multipart value.
         *
         * You should usually call [Builder.t38Enabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun t38Enabled(t38Enabled: MultipartField<Boolean>) = apply { body.t38Enabled(t38Enabled) }

        /**
         * Use this field to override the URL to which Telnyx will send subsequent webhooks for this
         * fax.
         */
        fun webhookUrl(webhookUrl: String) = apply { body.webhookUrl(webhookUrl) }

        /**
         * Sets [Builder.webhookUrl] to an arbitrary multipart value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: MultipartField<String>) = apply { body.webhookUrl(webhookUrl) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [FaxCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .connectionId()
         * .from()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FaxCreateParams =
            FaxCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "connection_id" to _connectionId(),
                "from" to _from(),
                "to" to _to(),
                "black_threshold" to _blackThreshold(),
                "client_state" to _clientState(),
                "from_display_name" to _fromDisplayName(),
                "media_name" to _mediaName(),
                "media_url" to _mediaUrl(),
                "monochrome" to _monochrome(),
                "preview_format" to _previewFormat(),
                "quality" to _quality(),
                "store_media" to _storeMedia(),
                "store_preview" to _storePreview(),
                "t38_enabled" to _t38Enabled(),
                "webhook_url" to _webhookUrl(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val connectionId: MultipartField<String>,
        private val from: MultipartField<String>,
        private val to: MultipartField<String>,
        private val blackThreshold: MultipartField<Long>,
        private val clientState: MultipartField<String>,
        private val fromDisplayName: MultipartField<String>,
        private val mediaName: MultipartField<String>,
        private val mediaUrl: MultipartField<String>,
        private val monochrome: MultipartField<Boolean>,
        private val previewFormat: MultipartField<PreviewFormat>,
        private val quality: MultipartField<Quality>,
        private val storeMedia: MultipartField<Boolean>,
        private val storePreview: MultipartField<Boolean>,
        private val t38Enabled: MultipartField<Boolean>,
        private val webhookUrl: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The connection ID to send the fax with.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun connectionId(): String = connectionId.value.getRequired("connection_id")

        /**
         * The phone number, in E.164 format, the fax will be sent from.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): String = from.value.getRequired("from")

        /**
         * The phone number, in E.164 format, the fax will be sent to or SIP URI
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): String = to.value.getRequired("to")

        /**
         * The black threshold percentage for monochrome faxes. Only applicable if `monochrome` is
         * set to `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun blackThreshold(): Optional<Long> = blackThreshold.value.getOptional("black_threshold")

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.value.getOptional("client_state")

        /**
         * The `from_display_name` string to be used as the caller id name (SIP From Display Name)
         * presented to the destination (`to` number). The string should have a maximum of 128
         * characters, containing only letters, numbers, spaces, and -_~!.+ special characters. If
         * ommited, the display name will be the same as the number in the `from` field.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fromDisplayName(): Optional<String> =
            fromDisplayName.value.getOptional("from_display_name")

        /**
         * The media_name used for the fax's media. Must point to a file previously uploaded to
         * api.telnyx.com/v2/media by the same user/organization. media_name and media_url/contents
         * can't be submitted together.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaName(): Optional<String> = mediaName.value.getOptional("media_name")

        /**
         * The URL (or list of URLs) to the PDF used for the fax's media. media_url and
         * media_name/contents can't be submitted together.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaUrl(): Optional<String> = mediaUrl.value.getOptional("media_url")

        /**
         * The flag to enable monochrome, true black and white fax results.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun monochrome(): Optional<Boolean> = monochrome.value.getOptional("monochrome")

        /**
         * The format for the preview file in case the `store_preview` is `true`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previewFormat(): Optional<PreviewFormat> =
            previewFormat.value.getOptional("preview_format")

        /**
         * The quality of the fax. The `ultra` settings provides the highest quality available, but
         * also present longer fax processing times. `ultra_light` is best suited for images, wihle
         * `ultra_dark` is best suited for text.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun quality(): Optional<Quality> = quality.value.getOptional("quality")

        /**
         * Should fax media be stored on temporary URL. It does not support media_name, they can't
         * be submitted together.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun storeMedia(): Optional<Boolean> = storeMedia.value.getOptional("store_media")

        /**
         * Should fax preview be stored on temporary URL.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun storePreview(): Optional<Boolean> = storePreview.value.getOptional("store_preview")

        /**
         * The flag to disable the T.38 protocol.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun t38Enabled(): Optional<Boolean> = t38Enabled.value.getOptional("t38_enabled")

        /**
         * Use this field to override the URL to which Telnyx will send subsequent webhooks for this
         * fax.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.value.getOptional("webhook_url")

        /**
         * Returns the raw multipart value of [connectionId].
         *
         * Unlike [connectionId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("connection_id")
        @ExcludeMissing
        fun _connectionId(): MultipartField<String> = connectionId

        /**
         * Returns the raw multipart value of [from].
         *
         * Unlike [from], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): MultipartField<String> = from

        /**
         * Returns the raw multipart value of [to].
         *
         * Unlike [to], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): MultipartField<String> = to

        /**
         * Returns the raw multipart value of [blackThreshold].
         *
         * Unlike [blackThreshold], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("black_threshold")
        @ExcludeMissing
        fun _blackThreshold(): MultipartField<Long> = blackThreshold

        /**
         * Returns the raw multipart value of [clientState].
         *
         * Unlike [clientState], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("client_state")
        @ExcludeMissing
        fun _clientState(): MultipartField<String> = clientState

        /**
         * Returns the raw multipart value of [fromDisplayName].
         *
         * Unlike [fromDisplayName], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("from_display_name")
        @ExcludeMissing
        fun _fromDisplayName(): MultipartField<String> = fromDisplayName

        /**
         * Returns the raw multipart value of [mediaName].
         *
         * Unlike [mediaName], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("media_name")
        @ExcludeMissing
        fun _mediaName(): MultipartField<String> = mediaName

        /**
         * Returns the raw multipart value of [mediaUrl].
         *
         * Unlike [mediaUrl], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("media_url")
        @ExcludeMissing
        fun _mediaUrl(): MultipartField<String> = mediaUrl

        /**
         * Returns the raw multipart value of [monochrome].
         *
         * Unlike [monochrome], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("monochrome")
        @ExcludeMissing
        fun _monochrome(): MultipartField<Boolean> = monochrome

        /**
         * Returns the raw multipart value of [previewFormat].
         *
         * Unlike [previewFormat], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("preview_format")
        @ExcludeMissing
        fun _previewFormat(): MultipartField<PreviewFormat> = previewFormat

        /**
         * Returns the raw multipart value of [quality].
         *
         * Unlike [quality], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("quality") @ExcludeMissing fun _quality(): MultipartField<Quality> = quality

        /**
         * Returns the raw multipart value of [storeMedia].
         *
         * Unlike [storeMedia], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("store_media")
        @ExcludeMissing
        fun _storeMedia(): MultipartField<Boolean> = storeMedia

        /**
         * Returns the raw multipart value of [storePreview].
         *
         * Unlike [storePreview], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("store_preview")
        @ExcludeMissing
        fun _storePreview(): MultipartField<Boolean> = storePreview

        /**
         * Returns the raw multipart value of [t38Enabled].
         *
         * Unlike [t38Enabled], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("t38_enabled")
        @ExcludeMissing
        fun _t38Enabled(): MultipartField<Boolean> = t38Enabled

        /**
         * Returns the raw multipart value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): MultipartField<String> = webhookUrl

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .connectionId()
             * .from()
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var connectionId: MultipartField<String>? = null
            private var from: MultipartField<String>? = null
            private var to: MultipartField<String>? = null
            private var blackThreshold: MultipartField<Long> = MultipartField.of(null)
            private var clientState: MultipartField<String> = MultipartField.of(null)
            private var fromDisplayName: MultipartField<String> = MultipartField.of(null)
            private var mediaName: MultipartField<String> = MultipartField.of(null)
            private var mediaUrl: MultipartField<String> = MultipartField.of(null)
            private var monochrome: MultipartField<Boolean> = MultipartField.of(null)
            private var previewFormat: MultipartField<PreviewFormat> = MultipartField.of(null)
            private var quality: MultipartField<Quality> = MultipartField.of(null)
            private var storeMedia: MultipartField<Boolean> = MultipartField.of(null)
            private var storePreview: MultipartField<Boolean> = MultipartField.of(null)
            private var t38Enabled: MultipartField<Boolean> = MultipartField.of(null)
            private var webhookUrl: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                connectionId = body.connectionId
                from = body.from
                to = body.to
                blackThreshold = body.blackThreshold
                clientState = body.clientState
                fromDisplayName = body.fromDisplayName
                mediaName = body.mediaName
                mediaUrl = body.mediaUrl
                monochrome = body.monochrome
                previewFormat = body.previewFormat
                quality = body.quality
                storeMedia = body.storeMedia
                storePreview = body.storePreview
                t38Enabled = body.t38Enabled
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The connection ID to send the fax with. */
            fun connectionId(connectionId: String) = connectionId(MultipartField.of(connectionId))

            /**
             * Sets [Builder.connectionId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.connectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun connectionId(connectionId: MultipartField<String>) = apply {
                this.connectionId = connectionId
            }

            /** The phone number, in E.164 format, the fax will be sent from. */
            fun from(from: String) = from(MultipartField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary multipart value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: MultipartField<String>) = apply { this.from = from }

            /** The phone number, in E.164 format, the fax will be sent to or SIP URI */
            fun to(to: String) = to(MultipartField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary multipart value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: MultipartField<String>) = apply { this.to = to }

            /**
             * The black threshold percentage for monochrome faxes. Only applicable if `monochrome`
             * is set to `true`.
             */
            fun blackThreshold(blackThreshold: Long) =
                blackThreshold(MultipartField.of(blackThreshold))

            /**
             * Sets [Builder.blackThreshold] to an arbitrary multipart value.
             *
             * You should usually call [Builder.blackThreshold] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blackThreshold(blackThreshold: MultipartField<Long>) = apply {
                this.blackThreshold = blackThreshold
            }

            /**
             * Use this field to add state to every subsequent webhook. It must be a valid Base-64
             * encoded string.
             */
            fun clientState(clientState: String) = clientState(MultipartField.of(clientState))

            /**
             * Sets [Builder.clientState] to an arbitrary multipart value.
             *
             * You should usually call [Builder.clientState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientState(clientState: MultipartField<String>) = apply {
                this.clientState = clientState
            }

            /**
             * The `from_display_name` string to be used as the caller id name (SIP From Display
             * Name) presented to the destination (`to` number). The string should have a maximum of
             * 128 characters, containing only letters, numbers, spaces, and -_~!.+ special
             * characters. If ommited, the display name will be the same as the number in the `from`
             * field.
             */
            fun fromDisplayName(fromDisplayName: String) =
                fromDisplayName(MultipartField.of(fromDisplayName))

            /**
             * Sets [Builder.fromDisplayName] to an arbitrary multipart value.
             *
             * You should usually call [Builder.fromDisplayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fromDisplayName(fromDisplayName: MultipartField<String>) = apply {
                this.fromDisplayName = fromDisplayName
            }

            /**
             * The media_name used for the fax's media. Must point to a file previously uploaded to
             * api.telnyx.com/v2/media by the same user/organization. media_name and
             * media_url/contents can't be submitted together.
             */
            fun mediaName(mediaName: String) = mediaName(MultipartField.of(mediaName))

            /**
             * Sets [Builder.mediaName] to an arbitrary multipart value.
             *
             * You should usually call [Builder.mediaName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaName(mediaName: MultipartField<String>) = apply { this.mediaName = mediaName }

            /**
             * The URL (or list of URLs) to the PDF used for the fax's media. media_url and
             * media_name/contents can't be submitted together.
             */
            fun mediaUrl(mediaUrl: String) = mediaUrl(MultipartField.of(mediaUrl))

            /**
             * Sets [Builder.mediaUrl] to an arbitrary multipart value.
             *
             * You should usually call [Builder.mediaUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaUrl(mediaUrl: MultipartField<String>) = apply { this.mediaUrl = mediaUrl }

            /** The flag to enable monochrome, true black and white fax results. */
            fun monochrome(monochrome: Boolean) = monochrome(MultipartField.of(monochrome))

            /**
             * Sets [Builder.monochrome] to an arbitrary multipart value.
             *
             * You should usually call [Builder.monochrome] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun monochrome(monochrome: MultipartField<Boolean>) = apply {
                this.monochrome = monochrome
            }

            /** The format for the preview file in case the `store_preview` is `true`. */
            fun previewFormat(previewFormat: PreviewFormat) =
                previewFormat(MultipartField.of(previewFormat))

            /**
             * Sets [Builder.previewFormat] to an arbitrary multipart value.
             *
             * You should usually call [Builder.previewFormat] with a well-typed [PreviewFormat]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun previewFormat(previewFormat: MultipartField<PreviewFormat>) = apply {
                this.previewFormat = previewFormat
            }

            /**
             * The quality of the fax. The `ultra` settings provides the highest quality available,
             * but also present longer fax processing times. `ultra_light` is best suited for
             * images, wihle `ultra_dark` is best suited for text.
             */
            fun quality(quality: Quality) = quality(MultipartField.of(quality))

            /**
             * Sets [Builder.quality] to an arbitrary multipart value.
             *
             * You should usually call [Builder.quality] with a well-typed [Quality] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quality(quality: MultipartField<Quality>) = apply { this.quality = quality }

            /**
             * Should fax media be stored on temporary URL. It does not support media_name, they
             * can't be submitted together.
             */
            fun storeMedia(storeMedia: Boolean) = storeMedia(MultipartField.of(storeMedia))

            /**
             * Sets [Builder.storeMedia] to an arbitrary multipart value.
             *
             * You should usually call [Builder.storeMedia] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun storeMedia(storeMedia: MultipartField<Boolean>) = apply {
                this.storeMedia = storeMedia
            }

            /** Should fax preview be stored on temporary URL. */
            fun storePreview(storePreview: Boolean) = storePreview(MultipartField.of(storePreview))

            /**
             * Sets [Builder.storePreview] to an arbitrary multipart value.
             *
             * You should usually call [Builder.storePreview] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun storePreview(storePreview: MultipartField<Boolean>) = apply {
                this.storePreview = storePreview
            }

            /** The flag to disable the T.38 protocol. */
            fun t38Enabled(t38Enabled: Boolean) = t38Enabled(MultipartField.of(t38Enabled))

            /**
             * Sets [Builder.t38Enabled] to an arbitrary multipart value.
             *
             * You should usually call [Builder.t38Enabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun t38Enabled(t38Enabled: MultipartField<Boolean>) = apply {
                this.t38Enabled = t38Enabled
            }

            /**
             * Use this field to override the URL to which Telnyx will send subsequent webhooks for
             * this fax.
             */
            fun webhookUrl(webhookUrl: String) = webhookUrl(MultipartField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary multipart value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: MultipartField<String>) = apply {
                this.webhookUrl = webhookUrl
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .connectionId()
             * .from()
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("connectionId", connectionId),
                    checkRequired("from", from),
                    checkRequired("to", to),
                    blackThreshold,
                    clientState,
                    fromDisplayName,
                    mediaName,
                    mediaUrl,
                    monochrome,
                    previewFormat,
                    quality,
                    storeMedia,
                    storePreview,
                    t38Enabled,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            connectionId()
            from()
            to()
            blackThreshold()
            clientState()
            fromDisplayName()
            mediaName()
            mediaUrl()
            monochrome()
            previewFormat().ifPresent { it.validate() }
            quality().ifPresent { it.validate() }
            storeMedia()
            storePreview()
            t38Enabled()
            webhookUrl()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                connectionId == other.connectionId &&
                from == other.from &&
                to == other.to &&
                blackThreshold == other.blackThreshold &&
                clientState == other.clientState &&
                fromDisplayName == other.fromDisplayName &&
                mediaName == other.mediaName &&
                mediaUrl == other.mediaUrl &&
                monochrome == other.monochrome &&
                previewFormat == other.previewFormat &&
                quality == other.quality &&
                storeMedia == other.storeMedia &&
                storePreview == other.storePreview &&
                t38Enabled == other.t38Enabled &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                connectionId,
                from,
                to,
                blackThreshold,
                clientState,
                fromDisplayName,
                mediaName,
                mediaUrl,
                monochrome,
                previewFormat,
                quality,
                storeMedia,
                storePreview,
                t38Enabled,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{connectionId=$connectionId, from=$from, to=$to, blackThreshold=$blackThreshold, clientState=$clientState, fromDisplayName=$fromDisplayName, mediaName=$mediaName, mediaUrl=$mediaUrl, monochrome=$monochrome, previewFormat=$previewFormat, quality=$quality, storeMedia=$storeMedia, storePreview=$storePreview, t38Enabled=$t38Enabled, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    /** The format for the preview file in case the `store_preview` is `true`. */
    class PreviewFormat @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PDF = of("pdf")

            @JvmField val TIFF = of("tiff")

            @JvmStatic fun of(value: String) = PreviewFormat(JsonField.of(value))
        }

        /** An enum containing [PreviewFormat]'s known values. */
        enum class Known {
            PDF,
            TIFF,
        }

        /**
         * An enum containing [PreviewFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PreviewFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PDF,
            TIFF,
            /**
             * An enum member indicating that [PreviewFormat] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PDF -> Value.PDF
                TIFF -> Value.TIFF
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PDF -> Known.PDF
                TIFF -> Known.TIFF
                else -> throw TelnyxInvalidDataException("Unknown PreviewFormat: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): PreviewFormat = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PreviewFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The quality of the fax. The `ultra` settings provides the highest quality available, but also
     * present longer fax processing times. `ultra_light` is best suited for images, wihle
     * `ultra_dark` is best suited for text.
     */
    class Quality @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val NORMAL = of("normal")

            @JvmField val HIGH = of("high")

            @JvmField val VERY_HIGH = of("very_high")

            @JvmField val ULTRA_LIGHT = of("ultra_light")

            @JvmField val ULTRA_DARK = of("ultra_dark")

            @JvmStatic fun of(value: String) = Quality(JsonField.of(value))
        }

        /** An enum containing [Quality]'s known values. */
        enum class Known {
            NORMAL,
            HIGH,
            VERY_HIGH,
            ULTRA_LIGHT,
            ULTRA_DARK,
        }

        /**
         * An enum containing [Quality]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Quality] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NORMAL,
            HIGH,
            VERY_HIGH,
            ULTRA_LIGHT,
            ULTRA_DARK,
            /** An enum member indicating that [Quality] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                NORMAL -> Value.NORMAL
                HIGH -> Value.HIGH
                VERY_HIGH -> Value.VERY_HIGH
                ULTRA_LIGHT -> Value.ULTRA_LIGHT
                ULTRA_DARK -> Value.ULTRA_DARK
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NORMAL -> Known.NORMAL
                HIGH -> Known.HIGH
                VERY_HIGH -> Known.VERY_HIGH
                ULTRA_LIGHT -> Known.ULTRA_LIGHT
                ULTRA_DARK -> Known.ULTRA_DARK
                else -> throw TelnyxInvalidDataException("Unknown Quality: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Quality = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Quality && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FaxCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FaxCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
