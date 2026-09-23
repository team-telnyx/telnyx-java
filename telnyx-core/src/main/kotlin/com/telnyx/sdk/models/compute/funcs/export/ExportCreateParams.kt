// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs.export

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Configures the external OTLP endpoint a function's runtime and/or invocation logs are pushed to
 * as they happen. This operation is a **full replace, not a patch**: `endpoint`, `headers`,
 * `runtime_export_enabled`, and `invocation_export_enabled` are all required on every call —
 * omitting any of them is a 422, not "keep the current value". Headers are encrypted at rest and
 * never returned in any response.
 *
 * The endpoint must be an HTTPS URL. When export is configured, new log records are converted to
 * OTLP log records and delivered continuously; export never bypasses platform log storage, and
 * delivery retries with a bounded policy while the destination is unreachable. Only logs generated
 * after configuration are exported — there is no historical replay.
 */
class ExportCreateParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * HTTPS URL to push logs to
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endpoint(): String = body.endpoint()

    /**
     * Headers attached to every export push, as key-value pairs (e.g. an auth token the collector
     * expects). Required even when empty — {} means "no headers". Encrypted at rest; never
     * returned.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun headers(): Headers = body.headers()

    /**
     * Export invocation records (one per HTTP request) to this destination
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invocationExportEnabled(): Boolean = body.invocationExportEnabled()

    /**
     * Export runtime logs (function stdout/stderr) to this destination
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runtimeExportEnabled(): Boolean = body.runtimeExportEnabled()

    /**
     * Returns the raw JSON value of [endpoint].
     *
     * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endpoint(): JsonField<String> = body._endpoint()

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _headers_(): JsonField<Headers> = body._headers_()

    /**
     * Returns the raw JSON value of [invocationExportEnabled].
     *
     * Unlike [invocationExportEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _invocationExportEnabled(): JsonField<Boolean> = body._invocationExportEnabled()

    /**
     * Returns the raw JSON value of [runtimeExportEnabled].
     *
     * Unlike [runtimeExportEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _runtimeExportEnabled(): JsonField<Boolean> = body._runtimeExportEnabled()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExportCreateParams].
         *
         * The following fields are required:
         * ```java
         * .endpoint()
         * .headers()
         * .invocationExportEnabled()
         * .runtimeExportEnabled()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExportCreateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exportCreateParams: ExportCreateParams) = apply {
            id = exportCreateParams.id
            body = exportCreateParams.body.toBuilder()
            additionalHeaders = exportCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = exportCreateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [endpoint]
         * - [headers]
         * - [invocationExportEnabled]
         * - [runtimeExportEnabled]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** HTTPS URL to push logs to */
        fun endpoint(endpoint: String) = apply { body.endpoint(endpoint) }

        /**
         * Sets [Builder.endpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endpoint] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endpoint(endpoint: JsonField<String>) = apply { body.endpoint(endpoint) }

        /**
         * Headers attached to every export push, as key-value pairs (e.g. an auth token the
         * collector expects). Required even when empty — {} means "no headers". Encrypted at rest;
         * never returned.
         */
        fun headers(headers: Headers) = apply { body.headers(headers) }

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { body.headers(headers) }

        /** Export invocation records (one per HTTP request) to this destination */
        fun invocationExportEnabled(invocationExportEnabled: Boolean) = apply {
            body.invocationExportEnabled(invocationExportEnabled)
        }

        /**
         * Sets [Builder.invocationExportEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invocationExportEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invocationExportEnabled(invocationExportEnabled: JsonField<Boolean>) = apply {
            body.invocationExportEnabled(invocationExportEnabled)
        }

        /** Export runtime logs (function stdout/stderr) to this destination */
        fun runtimeExportEnabled(runtimeExportEnabled: Boolean) = apply {
            body.runtimeExportEnabled(runtimeExportEnabled)
        }

        /**
         * Sets [Builder.runtimeExportEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runtimeExportEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun runtimeExportEnabled(runtimeExportEnabled: JsonField<Boolean>) = apply {
            body.runtimeExportEnabled(runtimeExportEnabled)
        }

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [ExportCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endpoint()
         * .headers()
         * .invocationExportEnabled()
         * .runtimeExportEnabled()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExportCreateParams =
            ExportCreateParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Full-replace configuration body. All fields are required on every call: the API treats PUT as
     * a replace (RFC 7231), so omitting any field is a 422, not "keep the current value".
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endpoint: JsonField<String>,
        private val headers: JsonField<Headers>,
        private val invocationExportEnabled: JsonField<Boolean>,
        private val runtimeExportEnabled: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("endpoint")
            @ExcludeMissing
            endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
            @JsonProperty("invocation_export_enabled")
            @ExcludeMissing
            invocationExportEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("runtime_export_enabled")
            @ExcludeMissing
            runtimeExportEnabled: JsonField<Boolean> = JsonMissing.of(),
        ) : this(endpoint, headers, invocationExportEnabled, runtimeExportEnabled, mutableMapOf())

        /**
         * HTTPS URL to push logs to
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endpoint(): String = endpoint.getRequired("endpoint")

        /**
         * Headers attached to every export push, as key-value pairs (e.g. an auth token the
         * collector expects). Required even when empty — {} means "no headers". Encrypted at rest;
         * never returned.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun headers(): Headers = headers.getRequired("headers")

        /**
         * Export invocation records (one per HTTP request) to this destination
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun invocationExportEnabled(): Boolean =
            invocationExportEnabled.getRequired("invocation_export_enabled")

        /**
         * Export runtime logs (function stdout/stderr) to this destination
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun runtimeExportEnabled(): Boolean =
            runtimeExportEnabled.getRequired("runtime_export_enabled")

        /**
         * Returns the raw JSON value of [endpoint].
         *
         * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

        /**
         * Returns the raw JSON value of [headers].
         *
         * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("headers") @ExcludeMissing fun _headers_(): JsonField<Headers> = headers

        /**
         * Returns the raw JSON value of [invocationExportEnabled].
         *
         * Unlike [invocationExportEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invocation_export_enabled")
        @ExcludeMissing
        fun _invocationExportEnabled(): JsonField<Boolean> = invocationExportEnabled

        /**
         * Returns the raw JSON value of [runtimeExportEnabled].
         *
         * Unlike [runtimeExportEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("runtime_export_enabled")
        @ExcludeMissing
        fun _runtimeExportEnabled(): JsonField<Boolean> = runtimeExportEnabled

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
             * .endpoint()
             * .headers()
             * .invocationExportEnabled()
             * .runtimeExportEnabled()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var endpoint: JsonField<String>? = null
            private var headers: JsonField<Headers>? = null
            private var invocationExportEnabled: JsonField<Boolean>? = null
            private var runtimeExportEnabled: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                endpoint = body.endpoint
                headers = body.headers
                invocationExportEnabled = body.invocationExportEnabled
                runtimeExportEnabled = body.runtimeExportEnabled
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** HTTPS URL to push logs to */
            fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

            /**
             * Sets [Builder.endpoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endpoint] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

            /**
             * Headers attached to every export push, as key-value pairs (e.g. an auth token the
             * collector expects). Required even when empty — {} means "no headers". Encrypted at
             * rest; never returned.
             */
            fun headers(headers: Headers) = headers(JsonField.of(headers))

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed [Headers] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

            /** Export invocation records (one per HTTP request) to this destination */
            fun invocationExportEnabled(invocationExportEnabled: Boolean) =
                invocationExportEnabled(JsonField.of(invocationExportEnabled))

            /**
             * Sets [Builder.invocationExportEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invocationExportEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invocationExportEnabled(invocationExportEnabled: JsonField<Boolean>) = apply {
                this.invocationExportEnabled = invocationExportEnabled
            }

            /** Export runtime logs (function stdout/stderr) to this destination */
            fun runtimeExportEnabled(runtimeExportEnabled: Boolean) =
                runtimeExportEnabled(JsonField.of(runtimeExportEnabled))

            /**
             * Sets [Builder.runtimeExportEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runtimeExportEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun runtimeExportEnabled(runtimeExportEnabled: JsonField<Boolean>) = apply {
                this.runtimeExportEnabled = runtimeExportEnabled
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
             * .endpoint()
             * .headers()
             * .invocationExportEnabled()
             * .runtimeExportEnabled()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("endpoint", endpoint),
                    checkRequired("headers", headers),
                    checkRequired("invocationExportEnabled", invocationExportEnabled),
                    checkRequired("runtimeExportEnabled", runtimeExportEnabled),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            endpoint()
            headers().validate()
            invocationExportEnabled()
            runtimeExportEnabled()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (endpoint.asKnown().isPresent) 1 else 0) +
                (headers.asKnown().getOrNull()?.validity() ?: 0) +
                (if (invocationExportEnabled.asKnown().isPresent) 1 else 0) +
                (if (runtimeExportEnabled.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                endpoint == other.endpoint &&
                headers == other.headers &&
                invocationExportEnabled == other.invocationExportEnabled &&
                runtimeExportEnabled == other.runtimeExportEnabled &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                endpoint,
                headers,
                invocationExportEnabled,
                runtimeExportEnabled,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{endpoint=$endpoint, headers=$headers, invocationExportEnabled=$invocationExportEnabled, runtimeExportEnabled=$runtimeExportEnabled, additionalProperties=$additionalProperties}"
    }

    /**
     * Headers attached to every export push, as key-value pairs (e.g. an auth token the collector
     * expects). Required even when empty — {} means "no headers". Encrypted at rest; never
     * returned.
     */
    class Headers
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Headers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Headers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(headers: Headers) = apply {
                additionalProperties = headers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Headers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Headers = Headers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Headers = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Headers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Headers{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExportCreateParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExportCreateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
