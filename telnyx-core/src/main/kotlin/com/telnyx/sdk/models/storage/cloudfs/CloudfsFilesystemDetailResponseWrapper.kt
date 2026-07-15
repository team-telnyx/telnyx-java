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
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CloudfsFilesystemDetailResponseWrapper
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
     * A CloudFS filesystem as returned by get, update, and delete. `meta_url` omits the credential
     * and there is no `meta_token` field — the token is only returned by create and
     * rotate-meta-token.
     *
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
         * Returns a mutable builder for constructing an instance of
         * [CloudfsFilesystemDetailResponseWrapper].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CloudfsFilesystemDetailResponseWrapper]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            cloudfsFilesystemDetailResponseWrapper: CloudfsFilesystemDetailResponseWrapper
        ) = apply {
            data = cloudfsFilesystemDetailResponseWrapper.data
            additionalProperties =
                cloudfsFilesystemDetailResponseWrapper.additionalProperties.toMutableMap()
        }

        /**
         * A CloudFS filesystem as returned by get, update, and delete. `meta_url` omits the
         * credential and there is no `meta_token` field — the token is only returned by create and
         * rotate-meta-token.
         */
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
         * Returns an immutable instance of [CloudfsFilesystemDetailResponseWrapper].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CloudfsFilesystemDetailResponseWrapper =
            CloudfsFilesystemDetailResponseWrapper(data, additionalProperties.toMutableMap())
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
    fun validate(): CloudfsFilesystemDetailResponseWrapper = apply {
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

    /**
     * A CloudFS filesystem as returned by get, update, and delete. `meta_url` omits the credential
     * and there is no `meta_token` field — the token is only returned by create and
     * rotate-meta-token.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val error: JsonField<String>,
        private val metaUrl: JsonField<String>,
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
            @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meta_url") @ExcludeMissing metaUrl: JsonField<String> = JsonMissing.of(),
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
            error,
            metaUrl,
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
         * Explanation of the most recent failed lifecycle action. Present only when the filesystem
         * is in a `failed` state.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun error(): Optional<String> = error.getOptional("error")

        /**
         * PostgreSQL connection URL for the filesystem's metadata database, without the credential.
         * Combine it with your stored metadata token, or issue a new token with rotate-meta-token.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metaUrl(): Optional<String> = metaUrl.getOptional("meta_url")

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
         * Returns the raw JSON value of [error].
         *
         * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

        /**
         * Returns the raw JSON value of [metaUrl].
         *
         * Unlike [metaUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meta_url") @ExcludeMissing fun _metaUrl(): JsonField<String> = metaUrl

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
            private var error: JsonField<String> = JsonMissing.of()
            private var metaUrl: JsonField<String> = JsonMissing.of()
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
                error = data.error
                metaUrl = data.metaUrl
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

            /**
             * Explanation of the most recent failed lifecycle action. Present only when the
             * filesystem is in a `failed` state.
             */
            fun error(error: String) = error(JsonField.of(error))

            /**
             * Sets [Builder.error] to an arbitrary JSON value.
             *
             * You should usually call [Builder.error] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun error(error: JsonField<String>) = apply { this.error = error }

            /**
             * PostgreSQL connection URL for the filesystem's metadata database, without the
             * credential. Combine it with your stored metadata token, or issue a new token with
             * rotate-meta-token.
             */
            fun metaUrl(metaUrl: String) = metaUrl(JsonField.of(metaUrl))

            /**
             * Sets [Builder.metaUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metaUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metaUrl(metaUrl: JsonField<String>) = apply { this.metaUrl = metaUrl }

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
                    error,
                    metaUrl,
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
            error()
            metaUrl()
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
                (if (error.asKnown().isPresent) 1 else 0) +
                (if (metaUrl.asKnown().isPresent) 1 else 0) +
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
                error == other.error &&
                metaUrl == other.metaUrl &&
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
                error,
                metaUrl,
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
            "Data{id=$id, createdAt=$createdAt, error=$error, metaUrl=$metaUrl, name=$name, recordType=$recordType, region=$region, s3Bucket=$s3Bucket, s3Endpoint=$s3Endpoint, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CloudfsFilesystemDetailResponseWrapper &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CloudfsFilesystemDetailResponseWrapper{data=$data, additionalProperties=$additionalProperties}"
}
