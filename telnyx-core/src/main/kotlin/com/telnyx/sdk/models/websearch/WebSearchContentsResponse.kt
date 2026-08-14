// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.websearch

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class WebSearchContentsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * Returns a mutable builder for constructing an instance of [WebSearchContentsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebSearchContentsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webSearchContentsResponse: WebSearchContentsResponse) = apply {
            data = webSearchContentsResponse.data
            additionalProperties = webSearchContentsResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [WebSearchContentsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WebSearchContentsResponse =
            WebSearchContentsResponse(data, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): WebSearchContentsResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val results: JsonField<List<Result>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("results")
            @ExcludeMissing
            results: JsonField<List<Result>> = JsonMissing.of()
        ) : this(results, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun results(): Optional<List<Result>> = results.getOptional("results")

        /**
         * Returns the raw JSON value of [results].
         *
         * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var results: JsonField<MutableList<Result>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                results = data.results.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun results(results: List<Result>) = results(JsonField.of(results))

            /**
             * Sets [Builder.results] to an arbitrary JSON value.
             *
             * You should usually call [Builder.results] with a well-typed `List<Result>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun results(results: JsonField<List<Result>>) = apply {
                this.results = results.map { it.toMutableList() }
            }

            /**
             * Adds a single [Result] to [results].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResult(result: Result) = apply {
                results =
                    (results ?: JsonField.of(mutableListOf())).also {
                        checkKnown("results", it).add(result)
                    }
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    (results ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            results().ifPresent { it.forEach { it.validate() } }
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
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Result
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val html: JsonField<String>,
            private val markdown: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("html") @ExcludeMissing html: JsonField<String> = JsonMissing.of(),
                @JsonProperty("markdown")
                @ExcludeMissing
                markdown: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(url, html, markdown, metadata, title, mutableMapOf())

            /**
             * The source URL.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Cleaned HTML content (if `html` format requested; may also be present on freshly
             * crawled pages).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun html(): Optional<String> = html.getOptional("html")

            /**
             * Markdown content (if `markdown` format requested).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun markdown(): Optional<String> = markdown.getOptional("markdown")

            /**
             * Page metadata (if `metadata` format requested).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * Page title (if available).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun title(): Optional<String> = title.getOptional("title")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [html].
             *
             * Unlike [html], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("html") @ExcludeMissing fun _html(): JsonField<String> = html

            /**
             * Returns the raw JSON value of [markdown].
             *
             * Unlike [markdown], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("markdown") @ExcludeMissing fun _markdown(): JsonField<String> = markdown

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
                 * Returns a mutable builder for constructing an instance of [Result].
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Result]. */
            class Builder internal constructor() {

                private var url: JsonField<String>? = null
                private var html: JsonField<String> = JsonMissing.of()
                private var markdown: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(result: Result) = apply {
                    url = result.url
                    html = result.html
                    markdown = result.markdown
                    metadata = result.metadata
                    title = result.title
                    additionalProperties = result.additionalProperties.toMutableMap()
                }

                /** The source URL. */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                /**
                 * Cleaned HTML content (if `html` format requested; may also be present on freshly
                 * crawled pages).
                 */
                fun html(html: String) = html(JsonField.of(html))

                /**
                 * Sets [Builder.html] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.html] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun html(html: JsonField<String>) = apply { this.html = html }

                /** Markdown content (if `markdown` format requested). */
                fun markdown(markdown: String) = markdown(JsonField.of(markdown))

                /**
                 * Sets [Builder.markdown] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.markdown] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun markdown(markdown: JsonField<String>) = apply { this.markdown = markdown }

                /** Page metadata (if `metadata` format requested). */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** Page title (if available). */
                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Result].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Result =
                    Result(
                        checkRequired("url", url),
                        html,
                        markdown,
                        metadata,
                        title,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Result = apply {
                if (validated) {
                    return@apply
                }

                url()
                html()
                markdown()
                metadata().ifPresent { it.validate() }
                title()
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
                (if (url.asKnown().isPresent) 1 else 0) +
                    (if (html.asKnown().isPresent) 1 else 0) +
                    (if (markdown.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (title.asKnown().isPresent) 1 else 0)

            /** Page metadata (if `metadata` format requested). */
            class Metadata
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val faviconUrl: JsonField<String>,
                private val siteName: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("favicon_url")
                    @ExcludeMissing
                    faviconUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("site_name")
                    @ExcludeMissing
                    siteName: JsonField<String> = JsonMissing.of(),
                ) : this(faviconUrl, siteName, mutableMapOf())

                /**
                 * Favicon URL (if available).
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun faviconUrl(): Optional<String> = faviconUrl.getOptional("favicon_url")

                /**
                 * Site name. Often empty.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun siteName(): Optional<String> = siteName.getOptional("site_name")

                /**
                 * Returns the raw JSON value of [faviconUrl].
                 *
                 * Unlike [faviconUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("favicon_url")
                @ExcludeMissing
                fun _faviconUrl(): JsonField<String> = faviconUrl

                /**
                 * Returns the raw JSON value of [siteName].
                 *
                 * Unlike [siteName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("site_name")
                @ExcludeMissing
                fun _siteName(): JsonField<String> = siteName

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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var faviconUrl: JsonField<String> = JsonMissing.of()
                    private var siteName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        faviconUrl = metadata.faviconUrl
                        siteName = metadata.siteName
                        additionalProperties = metadata.additionalProperties.toMutableMap()
                    }

                    /** Favicon URL (if available). */
                    fun faviconUrl(faviconUrl: String) = faviconUrl(JsonField.of(faviconUrl))

                    /**
                     * Sets [Builder.faviconUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.faviconUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun faviconUrl(faviconUrl: JsonField<String>) = apply {
                        this.faviconUrl = faviconUrl
                    }

                    /** Site name. Often empty. */
                    fun siteName(siteName: String) = siteName(JsonField.of(siteName))

                    /**
                     * Sets [Builder.siteName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.siteName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun siteName(siteName: JsonField<String>) = apply { this.siteName = siteName }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata =
                        Metadata(faviconUrl, siteName, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

                    faviconUrl()
                    siteName()
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
                    (if (faviconUrl.asKnown().isPresent) 1 else 0) +
                        (if (siteName.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        faviconUrl == other.faviconUrl &&
                        siteName == other.siteName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(faviconUrl, siteName, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Metadata{faviconUrl=$faviconUrl, siteName=$siteName, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result &&
                    url == other.url &&
                    html == other.html &&
                    markdown == other.markdown &&
                    metadata == other.metadata &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(url, html, markdown, metadata, title, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Result{url=$url, html=$html, markdown=$markdown, metadata=$metadata, title=$title, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                results == other.results &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(results, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{results=$results, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebSearchContentsResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebSearchContentsResponse{data=$data, additionalProperties=$additionalProperties}"
}
