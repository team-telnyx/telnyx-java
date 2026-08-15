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

class WebSearchResult
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val snippets: JsonField<List<String>>,
    private val title: JsonField<String>,
    private val url: JsonField<String>,
    private val faviconUrl: JsonField<String>,
    private val thumbnailUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("snippets")
        @ExcludeMissing
        snippets: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("favicon_url")
        @ExcludeMissing
        faviconUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("thumbnail_url")
        @ExcludeMissing
        thumbnailUrl: JsonField<String> = JsonMissing.of(),
    ) : this(description, snippets, title, url, faviconUrl, thumbnailUrl, mutableMapOf())

    /**
     * Short description or excerpt.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * Relevant text snippets from the page.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun snippets(): List<String> = snippets.getRequired("snippets")

    /**
     * Result title.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * Result URL.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * Favicon URL (if available).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun faviconUrl(): Optional<String> = faviconUrl.getOptional("favicon_url")

    /**
     * Thumbnail image URL (if available).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thumbnailUrl(): Optional<String> = thumbnailUrl.getOptional("thumbnail_url")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [snippets].
     *
     * Unlike [snippets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("snippets") @ExcludeMissing fun _snippets(): JsonField<List<String>> = snippets

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [faviconUrl].
     *
     * Unlike [faviconUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("favicon_url") @ExcludeMissing fun _faviconUrl(): JsonField<String> = faviconUrl

    /**
     * Returns the raw JSON value of [thumbnailUrl].
     *
     * Unlike [thumbnailUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thumbnail_url")
    @ExcludeMissing
    fun _thumbnailUrl(): JsonField<String> = thumbnailUrl

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
         * Returns a mutable builder for constructing an instance of [WebSearchResult].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .snippets()
         * .title()
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebSearchResult]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var snippets: JsonField<MutableList<String>>? = null
        private var title: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var faviconUrl: JsonField<String> = JsonMissing.of()
        private var thumbnailUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webSearchResult: WebSearchResult) = apply {
            description = webSearchResult.description
            snippets = webSearchResult.snippets.map { it.toMutableList() }
            title = webSearchResult.title
            url = webSearchResult.url
            faviconUrl = webSearchResult.faviconUrl
            thumbnailUrl = webSearchResult.thumbnailUrl
            additionalProperties = webSearchResult.additionalProperties.toMutableMap()
        }

        /** Short description or excerpt. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Relevant text snippets from the page. */
        fun snippets(snippets: List<String>) = snippets(JsonField.of(snippets))

        /**
         * Sets [Builder.snippets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snippets] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun snippets(snippets: JsonField<List<String>>) = apply {
            this.snippets = snippets.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [snippets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSnippet(snippet: String) = apply {
            snippets =
                (snippets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("snippets", it).add(snippet)
                }
        }

        /** Result title. */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** Result URL. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        /** Favicon URL (if available). */
        fun faviconUrl(faviconUrl: String) = faviconUrl(JsonField.of(faviconUrl))

        /**
         * Sets [Builder.faviconUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.faviconUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun faviconUrl(faviconUrl: JsonField<String>) = apply { this.faviconUrl = faviconUrl }

        /** Thumbnail image URL (if available). */
        fun thumbnailUrl(thumbnailUrl: String) = thumbnailUrl(JsonField.of(thumbnailUrl))

        /**
         * Sets [Builder.thumbnailUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thumbnailUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun thumbnailUrl(thumbnailUrl: JsonField<String>) = apply {
            this.thumbnailUrl = thumbnailUrl
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
         * Returns an immutable instance of [WebSearchResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .snippets()
         * .title()
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebSearchResult =
            WebSearchResult(
                checkRequired("description", description),
                checkRequired("snippets", snippets).map { it.toImmutable() },
                checkRequired("title", title),
                checkRequired("url", url),
                faviconUrl,
                thumbnailUrl,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): WebSearchResult = apply {
        if (validated) {
            return@apply
        }

        description()
        snippets()
        title()
        url()
        faviconUrl()
        thumbnailUrl()
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
    @JvmSynthetic
    internal fun validity(): Int =
        (if (description.asKnown().isPresent) 1 else 0) +
            (snippets.asKnown().getOrNull()?.size ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (faviconUrl.asKnown().isPresent) 1 else 0) +
            (if (thumbnailUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebSearchResult &&
            description == other.description &&
            snippets == other.snippets &&
            title == other.title &&
            url == other.url &&
            faviconUrl == other.faviconUrl &&
            thumbnailUrl == other.thumbnailUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            description,
            snippets,
            title,
            url,
            faviconUrl,
            thumbnailUrl,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebSearchResult{description=$description, snippets=$snippets, title=$title, url=$url, faviconUrl=$faviconUrl, thumbnailUrl=$thumbnailUrl, additionalProperties=$additionalProperties}"
}
