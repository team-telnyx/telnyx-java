// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.comments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a comment */
class CommentCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun body(): Optional<String> = body.body()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commentRecordId(): Optional<String> = body.commentRecordId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commentRecordType(): Optional<CommentRecordType> = body.commentRecordType()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commenter(): Optional<String> = body.commenter()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commenterType(): Optional<CommenterType> = body.commenterType()

    /**
     * An ISO 8901 datetime string denoting when the comment was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = body.createdAt()

    /**
     * An ISO 8901 datetime string for when the comment was read.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readAt(): Optional<OffsetDateTime> = body.readAt()

    /**
     * An ISO 8901 datetime string for when the comment was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = body.updatedAt()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [body].
     *
     * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _body_(): JsonField<String> = this.body._body_()

    /**
     * Returns the raw JSON value of [commentRecordId].
     *
     * Unlike [commentRecordId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commentRecordId(): JsonField<String> = body._commentRecordId()

    /**
     * Returns the raw JSON value of [commentRecordType].
     *
     * Unlike [commentRecordType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _commentRecordType(): JsonField<CommentRecordType> = body._commentRecordType()

    /**
     * Returns the raw JSON value of [commenter].
     *
     * Unlike [commenter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commenter(): JsonField<String> = body._commenter()

    /**
     * Returns the raw JSON value of [commenterType].
     *
     * Unlike [commenterType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commenterType(): JsonField<CommenterType> = body._commenterType()

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _createdAt(): JsonField<OffsetDateTime> = body._createdAt()

    /**
     * Returns the raw JSON value of [readAt].
     *
     * Unlike [readAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _readAt(): JsonField<OffsetDateTime> = body._readAt()

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _updatedAt(): JsonField<OffsetDateTime> = body._updatedAt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CommentCreateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CommentCreateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommentCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commentCreateParams: CommentCreateParams) = apply {
            body = commentCreateParams.body.toBuilder()
            additionalHeaders = commentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = commentCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [id]
         * - [body]
         * - [commentRecordId]
         * - [commentRecordType]
         * - [commenter]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun id(id: String) = apply { body.id(id) }

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        fun body(body: String) = apply { this.body.body(body) }

        /**
         * Sets [Builder.body] to an arbitrary JSON value.
         *
         * You should usually call [Builder.body] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun body(body: JsonField<String>) = apply { this.body.body(body) }

        fun commentRecordId(commentRecordId: String) = apply {
            body.commentRecordId(commentRecordId)
        }

        /**
         * Sets [Builder.commentRecordId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commentRecordId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commentRecordId(commentRecordId: JsonField<String>) = apply {
            body.commentRecordId(commentRecordId)
        }

        fun commentRecordType(commentRecordType: CommentRecordType) = apply {
            body.commentRecordType(commentRecordType)
        }

        /**
         * Sets [Builder.commentRecordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commentRecordType] with a well-typed [CommentRecordType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun commentRecordType(commentRecordType: JsonField<CommentRecordType>) = apply {
            body.commentRecordType(commentRecordType)
        }

        fun commenter(commenter: String) = apply { body.commenter(commenter) }

        /**
         * Sets [Builder.commenter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commenter] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commenter(commenter: JsonField<String>) = apply { body.commenter(commenter) }

        fun commenterType(commenterType: CommenterType) = apply {
            body.commenterType(commenterType)
        }

        /**
         * Sets [Builder.commenterType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commenterType] with a well-typed [CommenterType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commenterType(commenterType: JsonField<CommenterType>) = apply {
            body.commenterType(commenterType)
        }

        /** An ISO 8901 datetime string denoting when the comment was created. */
        fun createdAt(createdAt: OffsetDateTime) = apply { body.createdAt(createdAt) }

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { body.createdAt(createdAt) }

        /** An ISO 8901 datetime string for when the comment was read. */
        fun readAt(readAt: OffsetDateTime) = apply { body.readAt(readAt) }

        /**
         * Sets [Builder.readAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readAt(readAt: JsonField<OffsetDateTime>) = apply { body.readAt(readAt) }

        /** An ISO 8901 datetime string for when the comment was updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = apply { body.updatedAt(updatedAt) }

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { body.updatedAt(updatedAt) }

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
         * Returns an immutable instance of [CommentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CommentCreateParams =
            CommentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val body: JsonField<String>,
        private val commentRecordId: JsonField<String>,
        private val commentRecordType: JsonField<CommentRecordType>,
        private val commenter: JsonField<String>,
        private val commenterType: JsonField<CommenterType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val readAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("body") @ExcludeMissing body: JsonField<String> = JsonMissing.of(),
            @JsonProperty("comment_record_id")
            @ExcludeMissing
            commentRecordId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("comment_record_type")
            @ExcludeMissing
            commentRecordType: JsonField<CommentRecordType> = JsonMissing.of(),
            @JsonProperty("commenter")
            @ExcludeMissing
            commenter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commenter_type")
            @ExcludeMissing
            commenterType: JsonField<CommenterType> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("read_at")
            @ExcludeMissing
            readAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            body,
            commentRecordId,
            commentRecordType,
            commenter,
            commenterType,
            createdAt,
            readAt,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun body(): Optional<String> = body.getOptional("body")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commentRecordId(): Optional<String> = commentRecordId.getOptional("comment_record_id")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commentRecordType(): Optional<CommentRecordType> =
            commentRecordType.getOptional("comment_record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commenter(): Optional<String> = commenter.getOptional("commenter")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commenterType(): Optional<CommenterType> = commenterType.getOptional("commenter_type")

        /**
         * An ISO 8901 datetime string denoting when the comment was created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * An ISO 8901 datetime string for when the comment was read.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun readAt(): Optional<OffsetDateTime> = readAt.getOptional("read_at")

        /**
         * An ISO 8901 datetime string for when the comment was updated.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [body].
         *
         * Unlike [body], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("body") @ExcludeMissing fun _body_(): JsonField<String> = body

        /**
         * Returns the raw JSON value of [commentRecordId].
         *
         * Unlike [commentRecordId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("comment_record_id")
        @ExcludeMissing
        fun _commentRecordId(): JsonField<String> = commentRecordId

        /**
         * Returns the raw JSON value of [commentRecordType].
         *
         * Unlike [commentRecordType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("comment_record_type")
        @ExcludeMissing
        fun _commentRecordType(): JsonField<CommentRecordType> = commentRecordType

        /**
         * Returns the raw JSON value of [commenter].
         *
         * Unlike [commenter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commenter") @ExcludeMissing fun _commenter(): JsonField<String> = commenter

        /**
         * Returns the raw JSON value of [commenterType].
         *
         * Unlike [commenterType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("commenter_type")
        @ExcludeMissing
        fun _commenterType(): JsonField<CommenterType> = commenterType

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [readAt].
         *
         * Unlike [readAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("read_at") @ExcludeMissing fun _readAt(): JsonField<OffsetDateTime> = readAt

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var body: JsonField<String> = JsonMissing.of()
            private var commentRecordId: JsonField<String> = JsonMissing.of()
            private var commentRecordType: JsonField<CommentRecordType> = JsonMissing.of()
            private var commenter: JsonField<String> = JsonMissing.of()
            private var commenterType: JsonField<CommenterType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var readAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                id = body.id
                this.body = body.body
                commentRecordId = body.commentRecordId
                commentRecordType = body.commentRecordType
                commenter = body.commenter
                commenterType = body.commenterType
                createdAt = body.createdAt
                readAt = body.readAt
                updatedAt = body.updatedAt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun body(body: String) = body(JsonField.of(body))

            /**
             * Sets [Builder.body] to an arbitrary JSON value.
             *
             * You should usually call [Builder.body] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun body(body: JsonField<String>) = apply { this.body = body }

            fun commentRecordId(commentRecordId: String) =
                commentRecordId(JsonField.of(commentRecordId))

            /**
             * Sets [Builder.commentRecordId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commentRecordId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commentRecordId(commentRecordId: JsonField<String>) = apply {
                this.commentRecordId = commentRecordId
            }

            fun commentRecordType(commentRecordType: CommentRecordType) =
                commentRecordType(JsonField.of(commentRecordType))

            /**
             * Sets [Builder.commentRecordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commentRecordType] with a well-typed
             * [CommentRecordType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun commentRecordType(commentRecordType: JsonField<CommentRecordType>) = apply {
                this.commentRecordType = commentRecordType
            }

            fun commenter(commenter: String) = commenter(JsonField.of(commenter))

            /**
             * Sets [Builder.commenter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commenter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commenter(commenter: JsonField<String>) = apply { this.commenter = commenter }

            fun commenterType(commenterType: CommenterType) =
                commenterType(JsonField.of(commenterType))

            /**
             * Sets [Builder.commenterType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commenterType] with a well-typed [CommenterType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun commenterType(commenterType: JsonField<CommenterType>) = apply {
                this.commenterType = commenterType
            }

            /** An ISO 8901 datetime string denoting when the comment was created. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** An ISO 8901 datetime string for when the comment was read. */
            fun readAt(readAt: OffsetDateTime) = readAt(JsonField.of(readAt))

            /**
             * Sets [Builder.readAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.readAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun readAt(readAt: JsonField<OffsetDateTime>) = apply { this.readAt = readAt }

            /** An ISO 8901 datetime string for when the comment was updated. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             */
            fun build(): Body =
                Body(
                    id,
                    body,
                    commentRecordId,
                    commentRecordType,
                    commenter,
                    commenterType,
                    createdAt,
                    readAt,
                    updatedAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            id()
            body()
            commentRecordId()
            commentRecordType().ifPresent { it.validate() }
            commenter()
            commenterType().ifPresent { it.validate() }
            createdAt()
            readAt()
            updatedAt()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (body.asKnown().isPresent) 1 else 0) +
                (if (commentRecordId.asKnown().isPresent) 1 else 0) +
                (commentRecordType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (commenter.asKnown().isPresent) 1 else 0) +
                (commenterType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (readAt.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                id == other.id &&
                body == other.body &&
                commentRecordId == other.commentRecordId &&
                commentRecordType == other.commentRecordType &&
                commenter == other.commenter &&
                commenterType == other.commenterType &&
                createdAt == other.createdAt &&
                readAt == other.readAt &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                body,
                commentRecordId,
                commentRecordType,
                commenter,
                commenterType,
                createdAt,
                readAt,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{id=$id, body=$body, commentRecordId=$commentRecordId, commentRecordType=$commentRecordType, commenter=$commenter, commenterType=$commenterType, createdAt=$createdAt, readAt=$readAt, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    class CommentRecordType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SUB_NUMBER_ORDER = of("sub_number_order")

            @JvmField val REQUIREMENT_GROUP = of("requirement_group")

            @JvmStatic fun of(value: String) = CommentRecordType(JsonField.of(value))
        }

        /** An enum containing [CommentRecordType]'s known values. */
        enum class Known {
            SUB_NUMBER_ORDER,
            REQUIREMENT_GROUP,
        }

        /**
         * An enum containing [CommentRecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CommentRecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUB_NUMBER_ORDER,
            REQUIREMENT_GROUP,
            /**
             * An enum member indicating that [CommentRecordType] was instantiated with an unknown
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
                SUB_NUMBER_ORDER -> Value.SUB_NUMBER_ORDER
                REQUIREMENT_GROUP -> Value.REQUIREMENT_GROUP
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
                SUB_NUMBER_ORDER -> Known.SUB_NUMBER_ORDER
                REQUIREMENT_GROUP -> Known.REQUIREMENT_GROUP
                else -> throw TelnyxInvalidDataException("Unknown CommentRecordType: $value")
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

        fun validate(): CommentRecordType = apply {
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

            return other is CommentRecordType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class CommenterType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ADMIN = of("admin")

            @JvmField val USER = of("user")

            @JvmStatic fun of(value: String) = CommenterType(JsonField.of(value))
        }

        /** An enum containing [CommenterType]'s known values. */
        enum class Known {
            ADMIN,
            USER,
        }

        /**
         * An enum containing [CommenterType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CommenterType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ADMIN,
            USER,
            /**
             * An enum member indicating that [CommenterType] was instantiated with an unknown
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
                ADMIN -> Value.ADMIN
                USER -> Value.USER
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
                ADMIN -> Known.ADMIN
                USER -> Known.USER
                else -> throw TelnyxInvalidDataException("Unknown CommenterType: $value")
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

        fun validate(): CommenterType = apply {
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

            return other is CommenterType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommentCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CommentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
