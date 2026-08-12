// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves clean HTML or Markdown content from a list of URLs. Supports up to 20 URLs per request
 * (public API limit). Specify which formats to return: `html`, `markdown`, `metadata`.
 */
class WebSearchContentsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * List of URLs to retrieve content from (max 20 for public API).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun urls(): List<String> = body.urls()

    /**
     * Timeout for crawling each URL, in seconds (1-60).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun crawlTimeout(): Optional<Long> = body.crawlTimeout()

    /**
     * Content formats to return. If omitted, `html` and `metadata` are returned by default.
     * Retrieval is best-effort per URL: a format field appears only when that content could be
     * produced, and a freshly crawled page may also include `html` even when not requested.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun formats(): Optional<List<Format>> = body.formats()

    /**
     * Maximum age of cached content in seconds. `null` means no limit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxAge(): Optional<Long> = body.maxAge()

    /**
     * Returns the raw JSON value of [urls].
     *
     * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _urls(): JsonField<List<String>> = body._urls()

    /**
     * Returns the raw JSON value of [crawlTimeout].
     *
     * Unlike [crawlTimeout], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _crawlTimeout(): JsonField<Long> = body._crawlTimeout()

    /**
     * Returns the raw JSON value of [formats].
     *
     * Unlike [formats], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _formats(): JsonField<List<Format>> = body._formats()

    /**
     * Returns the raw JSON value of [maxAge].
     *
     * Unlike [maxAge], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxAge(): JsonField<Long> = body._maxAge()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebSearchContentsParams].
         *
         * The following fields are required:
         * ```java
         * .urls()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebSearchContentsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(webSearchContentsParams: WebSearchContentsParams) = apply {
            body = webSearchContentsParams.body.toBuilder()
            additionalHeaders = webSearchContentsParams.additionalHeaders.toBuilder()
            additionalQueryParams = webSearchContentsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [urls]
         * - [crawlTimeout]
         * - [formats]
         * - [maxAge]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** List of URLs to retrieve content from (max 20 for public API). */
        fun urls(urls: List<String>) = apply { body.urls(urls) }

        /**
         * Sets [Builder.urls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urls] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun urls(urls: JsonField<List<String>>) = apply { body.urls(urls) }

        /**
         * Adds a single [String] to [urls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUrl(url: String) = apply { body.addUrl(url) }

        /** Timeout for crawling each URL, in seconds (1-60). */
        fun crawlTimeout(crawlTimeout: Long) = apply { body.crawlTimeout(crawlTimeout) }

        /**
         * Sets [Builder.crawlTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.crawlTimeout] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun crawlTimeout(crawlTimeout: JsonField<Long>) = apply { body.crawlTimeout(crawlTimeout) }

        /**
         * Content formats to return. If omitted, `html` and `metadata` are returned by default.
         * Retrieval is best-effort per URL: a format field appears only when that content could be
         * produced, and a freshly crawled page may also include `html` even when not requested.
         */
        fun formats(formats: List<Format>) = apply { body.formats(formats) }

        /**
         * Sets [Builder.formats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formats] with a well-typed `List<Format>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun formats(formats: JsonField<List<Format>>) = apply { body.formats(formats) }

        /**
         * Adds a single [Format] to [formats].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFormat(format: Format) = apply { body.addFormat(format) }

        /** Maximum age of cached content in seconds. `null` means no limit. */
        fun maxAge(maxAge: Long?) = apply { body.maxAge(maxAge) }

        /**
         * Alias for [Builder.maxAge].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxAge(maxAge: Long) = maxAge(maxAge as Long?)

        /** Alias for calling [Builder.maxAge] with `maxAge.orElse(null)`. */
        fun maxAge(maxAge: Optional<Long>) = maxAge(maxAge.getOrNull())

        /**
         * Sets [Builder.maxAge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxAge] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxAge(maxAge: JsonField<Long>) = apply { body.maxAge(maxAge) }

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
         * Returns an immutable instance of [WebSearchContentsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .urls()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebSearchContentsParams =
            WebSearchContentsParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val urls: JsonField<List<String>>,
        private val crawlTimeout: JsonField<Long>,
        private val formats: JsonField<List<Format>>,
        private val maxAge: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("crawl_timeout")
            @ExcludeMissing
            crawlTimeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("formats")
            @ExcludeMissing
            formats: JsonField<List<Format>> = JsonMissing.of(),
            @JsonProperty("max_age") @ExcludeMissing maxAge: JsonField<Long> = JsonMissing.of(),
        ) : this(urls, crawlTimeout, formats, maxAge, mutableMapOf())

        /**
         * List of URLs to retrieve content from (max 20 for public API).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun urls(): List<String> = urls.getRequired("urls")

        /**
         * Timeout for crawling each URL, in seconds (1-60).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun crawlTimeout(): Optional<Long> = crawlTimeout.getOptional("crawl_timeout")

        /**
         * Content formats to return. If omitted, `html` and `metadata` are returned by default.
         * Retrieval is best-effort per URL: a format field appears only when that content could be
         * produced, and a freshly crawled page may also include `html` even when not requested.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun formats(): Optional<List<Format>> = formats.getOptional("formats")

        /**
         * Maximum age of cached content in seconds. `null` means no limit.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxAge(): Optional<Long> = maxAge.getOptional("max_age")

        /**
         * Returns the raw JSON value of [urls].
         *
         * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<String>> = urls

        /**
         * Returns the raw JSON value of [crawlTimeout].
         *
         * Unlike [crawlTimeout], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("crawl_timeout")
        @ExcludeMissing
        fun _crawlTimeout(): JsonField<Long> = crawlTimeout

        /**
         * Returns the raw JSON value of [formats].
         *
         * Unlike [formats], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("formats") @ExcludeMissing fun _formats(): JsonField<List<Format>> = formats

        /**
         * Returns the raw JSON value of [maxAge].
         *
         * Unlike [maxAge], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_age") @ExcludeMissing fun _maxAge(): JsonField<Long> = maxAge

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
             * .urls()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var urls: JsonField<MutableList<String>>? = null
            private var crawlTimeout: JsonField<Long> = JsonMissing.of()
            private var formats: JsonField<MutableList<Format>>? = null
            private var maxAge: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                urls = body.urls.map { it.toMutableList() }
                crawlTimeout = body.crawlTimeout
                formats = body.formats.map { it.toMutableList() }
                maxAge = body.maxAge
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** List of URLs to retrieve content from (max 20 for public API). */
            fun urls(urls: List<String>) = urls(JsonField.of(urls))

            /**
             * Sets [Builder.urls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urls] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urls(urls: JsonField<List<String>>) = apply {
                this.urls = urls.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [urls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUrl(url: String) = apply {
                urls =
                    (urls ?: JsonField.of(mutableListOf())).also { checkKnown("urls", it).add(url) }
            }

            /** Timeout for crawling each URL, in seconds (1-60). */
            fun crawlTimeout(crawlTimeout: Long) = crawlTimeout(JsonField.of(crawlTimeout))

            /**
             * Sets [Builder.crawlTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crawlTimeout] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crawlTimeout(crawlTimeout: JsonField<Long>) = apply {
                this.crawlTimeout = crawlTimeout
            }

            /**
             * Content formats to return. If omitted, `html` and `metadata` are returned by default.
             * Retrieval is best-effort per URL: a format field appears only when that content could
             * be produced, and a freshly crawled page may also include `html` even when not
             * requested.
             */
            fun formats(formats: List<Format>) = formats(JsonField.of(formats))

            /**
             * Sets [Builder.formats] to an arbitrary JSON value.
             *
             * You should usually call [Builder.formats] with a well-typed `List<Format>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun formats(formats: JsonField<List<Format>>) = apply {
                this.formats = formats.map { it.toMutableList() }
            }

            /**
             * Adds a single [Format] to [formats].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFormat(format: Format) = apply {
                formats =
                    (formats ?: JsonField.of(mutableListOf())).also {
                        checkKnown("formats", it).add(format)
                    }
            }

            /** Maximum age of cached content in seconds. `null` means no limit. */
            fun maxAge(maxAge: Long?) = maxAge(JsonField.ofNullable(maxAge))

            /**
             * Alias for [Builder.maxAge].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxAge(maxAge: Long) = maxAge(maxAge as Long?)

            /** Alias for calling [Builder.maxAge] with `maxAge.orElse(null)`. */
            fun maxAge(maxAge: Optional<Long>) = maxAge(maxAge.getOrNull())

            /**
             * Sets [Builder.maxAge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxAge] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun maxAge(maxAge: JsonField<Long>) = apply { this.maxAge = maxAge }

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
             * .urls()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("urls", urls).map { it.toImmutable() },
                    crawlTimeout,
                    (formats ?: JsonMissing.of()).map { it.toImmutable() },
                    maxAge,
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

            urls()
            crawlTimeout()
            formats().ifPresent { it.forEach { it.validate() } }
            maxAge()
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
            (urls.asKnown().getOrNull()?.size ?: 0) +
                (if (crawlTimeout.asKnown().isPresent) 1 else 0) +
                (formats.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (maxAge.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                urls == other.urls &&
                crawlTimeout == other.crawlTimeout &&
                formats == other.formats &&
                maxAge == other.maxAge &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(urls, crawlTimeout, formats, maxAge, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{urls=$urls, crawlTimeout=$crawlTimeout, formats=$formats, maxAge=$maxAge, additionalProperties=$additionalProperties}"
    }

    class Format @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val HTML = of("html")

            @JvmField val MARKDOWN = of("markdown")

            @JvmField val METADATA = of("metadata")

            @JvmStatic fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            HTML,
            MARKDOWN,
            METADATA,
        }

        /**
         * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Format] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HTML,
            MARKDOWN,
            METADATA,
            /** An enum member indicating that [Format] was instantiated with an unknown value. */
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
                HTML -> Value.HTML
                MARKDOWN -> Value.MARKDOWN
                METADATA -> Value.METADATA
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
                HTML -> Known.HTML
                MARKDOWN -> Known.MARKDOWN
                METADATA -> Known.METADATA
                else -> throw TelnyxInvalidDataException("Unknown Format: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Format = apply {
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

            return other is Format && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebSearchContentsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WebSearchContentsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
