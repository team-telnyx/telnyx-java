// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messsages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class RcsContentInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fileUrl: JsonField<String>,
    private val forceRefresh: JsonField<Boolean>,
    private val thumbnailUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("file_url") @ExcludeMissing fileUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("force_refresh")
        @ExcludeMissing
        forceRefresh: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("thumbnail_url")
        @ExcludeMissing
        thumbnailUrl: JsonField<String> = JsonMissing.of(),
    ) : this(fileUrl, forceRefresh, thumbnailUrl, mutableMapOf())

    /**
     * Publicly reachable URL of the file.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileUrl(): String = fileUrl.getRequired("file_url")

    /**
     * If set the URL content will not be cached.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun forceRefresh(): Optional<Boolean> = forceRefresh.getOptional("force_refresh")

    /**
     * Publicly reachable URL of the thumbnail. Maximum size of 100 kB.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thumbnailUrl(): Optional<String> = thumbnailUrl.getOptional("thumbnail_url")

    /**
     * Returns the raw JSON value of [fileUrl].
     *
     * Unlike [fileUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_url") @ExcludeMissing fun _fileUrl(): JsonField<String> = fileUrl

    /**
     * Returns the raw JSON value of [forceRefresh].
     *
     * Unlike [forceRefresh], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("force_refresh")
    @ExcludeMissing
    fun _forceRefresh(): JsonField<Boolean> = forceRefresh

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
         * Returns a mutable builder for constructing an instance of [RcsContentInfo].
         *
         * The following fields are required:
         * ```java
         * .fileUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RcsContentInfo]. */
    class Builder internal constructor() {

        private var fileUrl: JsonField<String>? = null
        private var forceRefresh: JsonField<Boolean> = JsonMissing.of()
        private var thumbnailUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rcsContentInfo: RcsContentInfo) = apply {
            fileUrl = rcsContentInfo.fileUrl
            forceRefresh = rcsContentInfo.forceRefresh
            thumbnailUrl = rcsContentInfo.thumbnailUrl
            additionalProperties = rcsContentInfo.additionalProperties.toMutableMap()
        }

        /** Publicly reachable URL of the file. */
        fun fileUrl(fileUrl: String) = fileUrl(JsonField.of(fileUrl))

        /**
         * Sets [Builder.fileUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileUrl(fileUrl: JsonField<String>) = apply { this.fileUrl = fileUrl }

        /** If set the URL content will not be cached. */
        fun forceRefresh(forceRefresh: Boolean) = forceRefresh(JsonField.of(forceRefresh))

        /**
         * Sets [Builder.forceRefresh] to an arbitrary JSON value.
         *
         * You should usually call [Builder.forceRefresh] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun forceRefresh(forceRefresh: JsonField<Boolean>) = apply {
            this.forceRefresh = forceRefresh
        }

        /** Publicly reachable URL of the thumbnail. Maximum size of 100 kB. */
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
         * Returns an immutable instance of [RcsContentInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fileUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RcsContentInfo =
            RcsContentInfo(
                checkRequired("fileUrl", fileUrl),
                forceRefresh,
                thumbnailUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RcsContentInfo = apply {
        if (validated) {
            return@apply
        }

        fileUrl()
        forceRefresh()
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
        (if (fileUrl.asKnown().isPresent) 1 else 0) +
            (if (forceRefresh.asKnown().isPresent) 1 else 0) +
            (if (thumbnailUrl.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RcsContentInfo &&
            fileUrl == other.fileUrl &&
            forceRefresh == other.forceRefresh &&
            thumbnailUrl == other.thumbnailUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fileUrl, forceRefresh, thumbnailUrl, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RcsContentInfo{fileUrl=$fileUrl, forceRefresh=$forceRefresh, thumbnailUrl=$thumbnailUrl, additionalProperties=$additionalProperties}"
}
