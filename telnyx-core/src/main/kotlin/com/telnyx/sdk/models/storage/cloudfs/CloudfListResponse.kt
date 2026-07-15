// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CloudfListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val meta: JsonField<Meta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("meta") @ExcludeMissing meta: JsonField<Meta> = JsonMissing.of(),
    ) : this(data, meta, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<Data>> = data.getOptional("data")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meta(): Optional<Meta> = meta.getOptional("meta")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [meta].
     *
     * Unlike [meta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta") @ExcludeMissing fun _meta(): JsonField<Meta> = meta

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

        /** Returns a mutable builder for constructing an instance of [CloudfListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudfListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var meta: JsonField<Meta> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cloudfListResponse: CloudfListResponse) = apply {
            data = cloudfListResponse.data.map { it.toMutableList() }
            meta = cloudfListResponse.meta
            additionalProperties = cloudfListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun meta(meta: Meta) = meta(JsonField.of(meta))

        /**
         * Sets [Builder.meta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meta] with a well-typed [Meta] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meta(meta: JsonField<Meta>) = apply { this.meta = meta }

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
         * Returns an immutable instance of [CloudfListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CloudfListResponse =
            CloudfListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                meta,
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
    fun validate(): CloudfListResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        meta().ifPresent { it.validate() }
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meta.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * A CloudFS filesystem as returned in list results. Connection details (`meta_url`,
     * `meta_token`) are omitted — retrieve the filesystem by ID for its redacted `meta_url`.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val recordType: JsonField<String>,
        private val region: JsonField<String>,
        private val s3Bucket: JsonField<String>,
        private val s3Endpoint: JsonField<String>,
        private val status: JsonField<CloudfsFilesystemStatus>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("s3_bucket")
            @ExcludeMissing
            s3Bucket: JsonField<String> = JsonMissing.of(),
            @JsonProperty("s3_endpoint")
            @ExcludeMissing
            s3Endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<CloudfsFilesystemStatus> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            name,
            recordType,
            region,
            s3Bucket,
            s3Endpoint,
            status,
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
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<String> = recordType.getOptional("record_type")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<String> = region.getOptional("region")

        /**
         * Name of the bucket that stores this filesystem's data. Created during provisioning.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun s3Bucket(): Optional<String> = s3Bucket.getOptional("s3_bucket")

        /**
         * URL of the Telnyx Cloud Storage endpoint backing this filesystem.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun s3Endpoint(): Optional<String> = s3Endpoint.getOptional("s3_endpoint")

        /**
         * Lifecycle status of the filesystem. `ready` means it is fully provisioned and usable.
         * `needs_format` means the storage bucket and metadata database were provisioned but the
         * filesystem has not yet been formatted — run `juicefs format` with the filesystem's
         * `meta_url` before mounting. `failed` means the last lifecycle action failed — see the
         * filesystem's `error` message. `deleted` appears only in the delete response: deleted
         * filesystems are excluded from list results and return a `404` on retrieval.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<CloudfsFilesystemStatus> = status.getOptional("status")

        /**
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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<String> = recordType

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [s3Bucket].
         *
         * Unlike [s3Bucket], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("s3_bucket") @ExcludeMissing fun _s3Bucket(): JsonField<String> = s3Bucket

        /**
         * Returns the raw JSON value of [s3Endpoint].
         *
         * Unlike [s3Endpoint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("s3_endpoint")
        @ExcludeMissing
        fun _s3Endpoint(): JsonField<String> = s3Endpoint

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<CloudfsFilesystemStatus> = status

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var recordType: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var s3Bucket: JsonField<String> = JsonMissing.of()
            private var s3Endpoint: JsonField<String> = JsonMissing.of()
            private var status: JsonField<CloudfsFilesystemStatus> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                name = data.name
                recordType = data.recordType
                region = data.region
                s3Bucket = data.s3Bucket
                s3Endpoint = data.s3Endpoint
                status = data.status
                updatedAt = data.updatedAt
                additionalProperties = data.additionalProperties.toMutableMap()
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

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun recordType(recordType: String) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /**
             * Name of the bucket that stores this filesystem's data. Created during provisioning.
             */
            fun s3Bucket(s3Bucket: String) = s3Bucket(JsonField.of(s3Bucket))

            /**
             * Sets [Builder.s3Bucket] to an arbitrary JSON value.
             *
             * You should usually call [Builder.s3Bucket] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun s3Bucket(s3Bucket: JsonField<String>) = apply { this.s3Bucket = s3Bucket }

            /** URL of the Telnyx Cloud Storage endpoint backing this filesystem. */
            fun s3Endpoint(s3Endpoint: String) = s3Endpoint(JsonField.of(s3Endpoint))

            /**
             * Sets [Builder.s3Endpoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.s3Endpoint] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun s3Endpoint(s3Endpoint: JsonField<String>) = apply { this.s3Endpoint = s3Endpoint }

            /**
             * Lifecycle status of the filesystem. `ready` means it is fully provisioned and usable.
             * `needs_format` means the storage bucket and metadata database were provisioned but
             * the filesystem has not yet been formatted — run `juicefs format` with the
             * filesystem's `meta_url` before mounting. `failed` means the last lifecycle action
             * failed — see the filesystem's `error` message. `deleted` appears only in the delete
             * response: deleted filesystems are excluded from list results and return a `404` on
             * retrieval.
             */
            fun status(status: CloudfsFilesystemStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [CloudfsFilesystemStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun status(status: JsonField<CloudfsFilesystemStatus>) = apply { this.status = status }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    id,
                    createdAt,
                    name,
                    recordType,
                    region,
                    s3Bucket,
                    s3Endpoint,
                    status,
                    updatedAt,
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

            id()
            createdAt()
            name()
            recordType()
            region()
            s3Bucket()
            s3Endpoint()
            status().ifPresent { it.validate() }
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (recordType.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (s3Bucket.asKnown().isPresent) 1 else 0) +
                (if (s3Endpoint.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                createdAt == other.createdAt &&
                name == other.name &&
                recordType == other.recordType &&
                region == other.region &&
                s3Bucket == other.s3Bucket &&
                s3Endpoint == other.s3Endpoint &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                name,
                recordType,
                region,
                s3Bucket,
                s3Endpoint,
                status,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, name=$name, recordType=$recordType, region=$region, s3Bucket=$s3Bucket, s3Endpoint=$s3Endpoint, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    class Meta
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cursors: JsonField<Cursors>,
        private val next: JsonField<String>,
        private val previous: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cursors") @ExcludeMissing cursors: JsonField<Cursors> = JsonMissing.of(),
            @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
            @JsonProperty("previous") @ExcludeMissing previous: JsonField<String> = JsonMissing.of(),
        ) : this(cursors, next, previous, mutableMapOf())

        /**
         * Opaque cursors for the adjacent pages. Empty when there are no adjacent pages.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cursors(): Optional<Cursors> = cursors.getOptional("cursors")

        /**
         * Relative URL (path and query) of the next page. Omitted when there are no further
         * results.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun next(): Optional<String> = next.getOptional("next")

        /**
         * Relative URL (path and query) of the previous page. Omitted on the first page.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previous(): Optional<String> = previous.getOptional("previous")

        /**
         * Returns the raw JSON value of [cursors].
         *
         * Unlike [cursors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cursors") @ExcludeMissing fun _cursors(): JsonField<Cursors> = cursors

        /**
         * Returns the raw JSON value of [next].
         *
         * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

        /**
         * Returns the raw JSON value of [previous].
         *
         * Unlike [previous], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("previous") @ExcludeMissing fun _previous(): JsonField<String> = previous

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

            /** Returns a mutable builder for constructing an instance of [Meta]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meta]. */
        class Builder internal constructor() {

            private var cursors: JsonField<Cursors> = JsonMissing.of()
            private var next: JsonField<String> = JsonMissing.of()
            private var previous: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meta: Meta) = apply {
                cursors = meta.cursors
                next = meta.next
                previous = meta.previous
                additionalProperties = meta.additionalProperties.toMutableMap()
            }

            /** Opaque cursors for the adjacent pages. Empty when there are no adjacent pages. */
            fun cursors(cursors: Cursors) = cursors(JsonField.of(cursors))

            /**
             * Sets [Builder.cursors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cursors] with a well-typed [Cursors] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cursors(cursors: JsonField<Cursors>) = apply { this.cursors = cursors }

            /**
             * Relative URL (path and query) of the next page. Omitted when there are no further
             * results.
             */
            fun next(next: String) = next(JsonField.of(next))

            /**
             * Sets [Builder.next] to an arbitrary JSON value.
             *
             * You should usually call [Builder.next] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun next(next: JsonField<String>) = apply { this.next = next }

            /** Relative URL (path and query) of the previous page. Omitted on the first page. */
            fun previous(previous: String) = previous(JsonField.of(previous))

            /**
             * Sets [Builder.previous] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previous] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun previous(previous: JsonField<String>) = apply { this.previous = previous }

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
             * Returns an immutable instance of [Meta].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Meta = Meta(cursors, next, previous, additionalProperties.toMutableMap())
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
        fun validate(): Meta = apply {
            if (validated) {
                return@apply
            }

            cursors().ifPresent { it.validate() }
            next()
            previous()
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
            (cursors.asKnown().getOrNull()?.validity() ?: 0) +
                (if (next.asKnown().isPresent) 1 else 0) +
                (if (previous.asKnown().isPresent) 1 else 0)

        /** Opaque cursors for the adjacent pages. Empty when there are no adjacent pages. */
        class Cursors
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val after: JsonField<String>,
            private val before: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("after") @ExcludeMissing after: JsonField<String> = JsonMissing.of(),
                @JsonProperty("before") @ExcludeMissing before: JsonField<String> = JsonMissing.of(),
            ) : this(after, before, mutableMapOf())

            /**
             * Cursor for the next page; pass it as `page[after]`. Omitted on the last page.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun after(): Optional<String> = after.getOptional("after")

            /**
             * Cursor for the previous page; pass it as `page[before]`. Omitted on the first page.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun before(): Optional<String> = before.getOptional("before")

            /**
             * Returns the raw JSON value of [after].
             *
             * Unlike [after], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<String> = after

            /**
             * Returns the raw JSON value of [before].
             *
             * Unlike [before], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("before") @ExcludeMissing fun _before(): JsonField<String> = before

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

                /** Returns a mutable builder for constructing an instance of [Cursors]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Cursors]. */
            class Builder internal constructor() {

                private var after: JsonField<String> = JsonMissing.of()
                private var before: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cursors: Cursors) = apply {
                    after = cursors.after
                    before = cursors.before
                    additionalProperties = cursors.additionalProperties.toMutableMap()
                }

                /** Cursor for the next page; pass it as `page[after]`. Omitted on the last page. */
                fun after(after: String) = after(JsonField.of(after))

                /**
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun after(after: JsonField<String>) = apply { this.after = after }

                /**
                 * Cursor for the previous page; pass it as `page[before]`. Omitted on the first
                 * page.
                 */
                fun before(before: String) = before(JsonField.of(before))

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<String>) = apply { this.before = before }

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
                 * Returns an immutable instance of [Cursors].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Cursors = Cursors(after, before, additionalProperties.toMutableMap())
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
            fun validate(): Cursors = apply {
                if (validated) {
                    return@apply
                }

                after()
                before()
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
                (if (after.asKnown().isPresent) 1 else 0) +
                    (if (before.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cursors &&
                    after == other.after &&
                    before == other.before &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(after, before, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Cursors{after=$after, before=$before, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meta &&
                cursors == other.cursors &&
                next == other.next &&
                previous == other.previous &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cursors, next, previous, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meta{cursors=$cursors, next=$next, previous=$previous, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudfListResponse &&
            data == other.data &&
            meta == other.meta &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, meta, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudfListResponse{data=$data, meta=$meta, additionalProperties=$additionalProperties}"
}
