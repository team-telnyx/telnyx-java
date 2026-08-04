// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailmessages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AttachmentRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val content: JsonField<String>,
    private val contentId: JsonField<String>,
    private val contentType: JsonField<String>,
    private val disposition: JsonField<String>,
    private val filename: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content_id") @ExcludeMissing contentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content_type")
        @ExcludeMissing
        contentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("disposition")
        @ExcludeMissing
        disposition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
    ) : this(content, contentId, contentType, disposition, filename, mutableMapOf())

    /**
     * Attachment content, typically Base64-encoded. Defaults to empty string when omitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun content(): Optional<String> = content.getOptional("content")

    /**
     * MIME Content-ID used to reference an inline attachment.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentId(): Optional<String> = contentId.getOptional("content_id")

    /**
     * MIME content type. Defaults to "application/octet-stream" when omitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentType(): Optional<String> = contentType.getOptional("content_type")

    /**
     * MIME disposition (`attachment` or `inline`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disposition(): Optional<String> = disposition.getOptional("disposition")

    /**
     * Attachment filename. Defaults to "attachment" when omitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filename(): Optional<String> = filename.getOptional("filename")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /**
     * Returns the raw JSON value of [contentId].
     *
     * Unlike [contentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content_id") @ExcludeMissing fun _contentId(): JsonField<String> = contentId

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content_type")
    @ExcludeMissing
    fun _contentType(): JsonField<String> = contentType

    /**
     * Returns the raw JSON value of [disposition].
     *
     * Unlike [disposition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disposition") @ExcludeMissing fun _disposition(): JsonField<String> = disposition

    /**
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

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

        /** Returns a mutable builder for constructing an instance of [AttachmentRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AttachmentRequest]. */
    class Builder internal constructor() {

        private var content: JsonField<String> = JsonMissing.of()
        private var contentId: JsonField<String> = JsonMissing.of()
        private var contentType: JsonField<String> = JsonMissing.of()
        private var disposition: JsonField<String> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(attachmentRequest: AttachmentRequest) = apply {
            content = attachmentRequest.content
            contentId = attachmentRequest.contentId
            contentType = attachmentRequest.contentType
            disposition = attachmentRequest.disposition
            filename = attachmentRequest.filename
            additionalProperties = attachmentRequest.additionalProperties.toMutableMap()
        }

        /** Attachment content, typically Base64-encoded. Defaults to empty string when omitted. */
        fun content(content: String) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        /** MIME Content-ID used to reference an inline attachment. */
        fun contentId(contentId: String?) = contentId(JsonField.ofNullable(contentId))

        /** Alias for calling [Builder.contentId] with `contentId.orElse(null)`. */
        fun contentId(contentId: Optional<String>) = contentId(contentId.getOrNull())

        /**
         * Sets [Builder.contentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentId(contentId: JsonField<String>) = apply { this.contentId = contentId }

        /** MIME content type. Defaults to "application/octet-stream" when omitted. */
        fun contentType(contentType: String) = contentType(JsonField.of(contentType))

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentType(contentType: JsonField<String>) = apply { this.contentType = contentType }

        /** MIME disposition (`attachment` or `inline`). */
        fun disposition(disposition: String) = disposition(JsonField.of(disposition))

        /**
         * Sets [Builder.disposition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disposition] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun disposition(disposition: JsonField<String>) = apply { this.disposition = disposition }

        /** Attachment filename. Defaults to "attachment" when omitted. */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

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
         * Returns an immutable instance of [AttachmentRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AttachmentRequest =
            AttachmentRequest(
                content,
                contentId,
                contentType,
                disposition,
                filename,
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
    fun validate(): AttachmentRequest = apply {
        if (validated) {
            return@apply
        }

        content()
        contentId()
        contentType()
        disposition()
        filename()
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
        (if (content.asKnown().isPresent) 1 else 0) +
            (if (contentId.asKnown().isPresent) 1 else 0) +
            (if (contentType.asKnown().isPresent) 1 else 0) +
            (if (disposition.asKnown().isPresent) 1 else 0) +
            (if (filename.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AttachmentRequest &&
            content == other.content &&
            contentId == other.contentId &&
            contentType == other.contentType &&
            disposition == other.disposition &&
            filename == other.filename &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(content, contentId, contentType, disposition, filename, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttachmentRequest{content=$content, contentId=$contentId, contentType=$contentType, disposition=$disposition, filename=$filename, additionalProperties=$additionalProperties}"
}
