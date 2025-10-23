// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles.autorespconfigs

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List Auto-Response Settings */
class AutorespConfigListParams
private constructor(
    private val profileId: String?,
    private val countryCode: String?,
    private val createdAt: CreatedAt?,
    private val updatedAt: UpdatedAt?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun profileId(): Optional<String> = Optional.ofNullable(profileId)

    fun countryCode(): Optional<String> = Optional.ofNullable(countryCode)

    /**
     * Consolidated created_at parameter (deepObject style). Originally: created_at[gte],
     * created_at[lte]
     */
    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

    /**
     * Consolidated updated_at parameter (deepObject style). Originally: updated_at[gte],
     * updated_at[lte]
     */
    fun updatedAt(): Optional<UpdatedAt> = Optional.ofNullable(updatedAt)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AutorespConfigListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AutorespConfigListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AutorespConfigListParams]. */
    class Builder internal constructor() {

        private var profileId: String? = null
        private var countryCode: String? = null
        private var createdAt: CreatedAt? = null
        private var updatedAt: UpdatedAt? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(autorespConfigListParams: AutorespConfigListParams) = apply {
            profileId = autorespConfigListParams.profileId
            countryCode = autorespConfigListParams.countryCode
            createdAt = autorespConfigListParams.createdAt
            updatedAt = autorespConfigListParams.updatedAt
            additionalHeaders = autorespConfigListParams.additionalHeaders.toBuilder()
            additionalQueryParams = autorespConfigListParams.additionalQueryParams.toBuilder()
        }

        fun profileId(profileId: String?) = apply { this.profileId = profileId }

        /** Alias for calling [Builder.profileId] with `profileId.orElse(null)`. */
        fun profileId(profileId: Optional<String>) = profileId(profileId.getOrNull())

        fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

        /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
        fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.getOrNull())

        /**
         * Consolidated created_at parameter (deepObject style). Originally: created_at[gte],
         * created_at[lte]
         */
        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

        /**
         * Consolidated updated_at parameter (deepObject style). Originally: updated_at[gte],
         * updated_at[lte]
         */
        fun updatedAt(updatedAt: UpdatedAt?) = apply { this.updatedAt = updatedAt }

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<UpdatedAt>) = updatedAt(updatedAt.getOrNull())

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
         * Returns an immutable instance of [AutorespConfigListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AutorespConfigListParams =
            AutorespConfigListParams(
                profileId,
                countryCode,
                createdAt,
                updatedAt,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> profileId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                countryCode?.let { put("country_code", it) }
                createdAt?.let {
                    it.gte().ifPresent { put("created_at[gte]", it) }
                    it.lte().ifPresent { put("created_at[lte]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("created_at[$key]", value)
                        }
                    }
                }
                updatedAt?.let {
                    it.gte().ifPresent { put("updated_at[gte]", it) }
                    it.lte().ifPresent { put("updated_at[lte]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("updated_at[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated created_at parameter (deepObject style). Originally: created_at[gte],
     * created_at[lte]
     */
    class CreatedAt
    private constructor(
        private val gte: String?,
        private val lte: String?,
        private val additionalProperties: QueryParams,
    ) {

        fun gte(): Optional<String> = Optional.ofNullable(gte)

        fun lte(): Optional<String> = Optional.ofNullable(lte)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatedAt]. */
        class Builder internal constructor() {

            private var gte: String? = null
            private var lte: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(createdAt: CreatedAt) = apply {
                gte = createdAt.gte
                lte = createdAt.lte
                additionalProperties = createdAt.additionalProperties.toBuilder()
            }

            fun gte(gte: String?) = apply { this.gte = gte }

            /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
            fun gte(gte: Optional<String>) = gte(gte.getOrNull())

            fun lte(lte: String?) = apply { this.lte = lte }

            /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
            fun lte(lte: Optional<String>) = lte(lte.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [CreatedAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CreatedAt = CreatedAt(gte, lte, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedAt &&
                gte == other.gte &&
                lte == other.lte &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(gte, lte, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedAt{gte=$gte, lte=$lte, additionalProperties=$additionalProperties}"
    }

    /**
     * Consolidated updated_at parameter (deepObject style). Originally: updated_at[gte],
     * updated_at[lte]
     */
    class UpdatedAt
    private constructor(
        private val gte: String?,
        private val lte: String?,
        private val additionalProperties: QueryParams,
    ) {

        fun gte(): Optional<String> = Optional.ofNullable(gte)

        fun lte(): Optional<String> = Optional.ofNullable(lte)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [UpdatedAt]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UpdatedAt]. */
        class Builder internal constructor() {

            private var gte: String? = null
            private var lte: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(updatedAt: UpdatedAt) = apply {
                gte = updatedAt.gte
                lte = updatedAt.lte
                additionalProperties = updatedAt.additionalProperties.toBuilder()
            }

            fun gte(gte: String?) = apply { this.gte = gte }

            /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
            fun gte(gte: Optional<String>) = gte(gte.getOrNull())

            fun lte(lte: String?) = apply { this.lte = lte }

            /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
            fun lte(lte: Optional<String>) = lte(lte.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [UpdatedAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UpdatedAt = UpdatedAt(gte, lte, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UpdatedAt &&
                gte == other.gte &&
                lte == other.lte &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(gte, lte, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UpdatedAt{gte=$gte, lte=$lte, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AutorespConfigListParams &&
            profileId == other.profileId &&
            countryCode == other.countryCode &&
            createdAt == other.createdAt &&
            updatedAt == other.updatedAt &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            profileId,
            countryCode,
            createdAt,
            updatedAt,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AutorespConfigListParams{profileId=$profileId, countryCode=$countryCode, createdAt=$createdAt, updatedAt=$updatedAt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
