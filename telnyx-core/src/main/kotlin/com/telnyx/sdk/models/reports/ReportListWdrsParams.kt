// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Fetch all Wdr records */
class ReportListWdrsParams
private constructor(
    private val id: String?,
    private val endDate: String?,
    private val imsi: String?,
    private val mcc: String?,
    private val mnc: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val phoneNumber: String?,
    private val simCardId: String?,
    private val simGroupId: String?,
    private val simGroupName: String?,
    private val sort: List<String>?,
    private val startDate: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** WDR uuid */
    fun id(): Optional<String> = Optional.ofNullable(id)

    /** End date */
    fun endDate(): Optional<String> = Optional.ofNullable(endDate)

    /** International mobile subscriber identity */
    fun imsi(): Optional<String> = Optional.ofNullable(imsi)

    /** Mobile country code */
    fun mcc(): Optional<String> = Optional.ofNullable(mcc)

    /** Mobile network code */
    fun mnc(): Optional<String> = Optional.ofNullable(mnc)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Phone number */
    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    /** Sim card unique identifier */
    fun simCardId(): Optional<String> = Optional.ofNullable(simCardId)

    /** Sim group unique identifier */
    fun simGroupId(): Optional<String> = Optional.ofNullable(simGroupId)

    /** Sim group name */
    fun simGroupName(): Optional<String> = Optional.ofNullable(simGroupName)

    /** Field used to order the data. If no field is specified, default value is 'created_at' */
    fun sort(): Optional<List<String>> = Optional.ofNullable(sort)

    /** Start date */
    fun startDate(): Optional<String> = Optional.ofNullable(startDate)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ReportListWdrsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ReportListWdrsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportListWdrsParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var endDate: String? = null
        private var imsi: String? = null
        private var mcc: String? = null
        private var mnc: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var phoneNumber: String? = null
        private var simCardId: String? = null
        private var simGroupId: String? = null
        private var simGroupName: String? = null
        private var sort: MutableList<String>? = null
        private var startDate: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(reportListWdrsParams: ReportListWdrsParams) = apply {
            id = reportListWdrsParams.id
            endDate = reportListWdrsParams.endDate
            imsi = reportListWdrsParams.imsi
            mcc = reportListWdrsParams.mcc
            mnc = reportListWdrsParams.mnc
            pageNumber = reportListWdrsParams.pageNumber
            pageSize = reportListWdrsParams.pageSize
            phoneNumber = reportListWdrsParams.phoneNumber
            simCardId = reportListWdrsParams.simCardId
            simGroupId = reportListWdrsParams.simGroupId
            simGroupName = reportListWdrsParams.simGroupName
            sort = reportListWdrsParams.sort?.toMutableList()
            startDate = reportListWdrsParams.startDate
            additionalHeaders = reportListWdrsParams.additionalHeaders.toBuilder()
            additionalQueryParams = reportListWdrsParams.additionalQueryParams.toBuilder()
        }

        /** WDR uuid */
        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** End date */
        fun endDate(endDate: String?) = apply { this.endDate = endDate }

        /** Alias for calling [Builder.endDate] with `endDate.orElse(null)`. */
        fun endDate(endDate: Optional<String>) = endDate(endDate.getOrNull())

        /** International mobile subscriber identity */
        fun imsi(imsi: String?) = apply { this.imsi = imsi }

        /** Alias for calling [Builder.imsi] with `imsi.orElse(null)`. */
        fun imsi(imsi: Optional<String>) = imsi(imsi.getOrNull())

        /** Mobile country code */
        fun mcc(mcc: String?) = apply { this.mcc = mcc }

        /** Alias for calling [Builder.mcc] with `mcc.orElse(null)`. */
        fun mcc(mcc: Optional<String>) = mcc(mcc.getOrNull())

        /** Mobile network code */
        fun mnc(mnc: String?) = apply { this.mnc = mnc }

        /** Alias for calling [Builder.mnc] with `mnc.orElse(null)`. */
        fun mnc(mnc: Optional<String>) = mnc(mnc.getOrNull())

        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** Phone number */
        fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /** Sim card unique identifier */
        fun simCardId(simCardId: String?) = apply { this.simCardId = simCardId }

        /** Alias for calling [Builder.simCardId] with `simCardId.orElse(null)`. */
        fun simCardId(simCardId: Optional<String>) = simCardId(simCardId.getOrNull())

        /** Sim group unique identifier */
        fun simGroupId(simGroupId: String?) = apply { this.simGroupId = simGroupId }

        /** Alias for calling [Builder.simGroupId] with `simGroupId.orElse(null)`. */
        fun simGroupId(simGroupId: Optional<String>) = simGroupId(simGroupId.getOrNull())

        /** Sim group name */
        fun simGroupName(simGroupName: String?) = apply { this.simGroupName = simGroupName }

        /** Alias for calling [Builder.simGroupName] with `simGroupName.orElse(null)`. */
        fun simGroupName(simGroupName: Optional<String>) = simGroupName(simGroupName.getOrNull())

        /** Field used to order the data. If no field is specified, default value is 'created_at' */
        fun sort(sort: List<String>?) = apply { this.sort = sort?.toMutableList() }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<List<String>>) = sort(sort.getOrNull())

        /**
         * Adds a single [String] to [Builder.sort].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSort(sort: String) = apply {
            this.sort = (this.sort ?: mutableListOf()).apply { add(sort) }
        }

        /** Start date */
        fun startDate(startDate: String?) = apply { this.startDate = startDate }

        /** Alias for calling [Builder.startDate] with `startDate.orElse(null)`. */
        fun startDate(startDate: Optional<String>) = startDate(startDate.getOrNull())

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
         * Returns an immutable instance of [ReportListWdrsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReportListWdrsParams =
            ReportListWdrsParams(
                id,
                endDate,
                imsi,
                mcc,
                mnc,
                pageNumber,
                pageSize,
                phoneNumber,
                simCardId,
                simGroupId,
                simGroupName,
                sort?.toImmutable(),
                startDate,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.let { put("id", it) }
                endDate?.let { put("end_date", it) }
                imsi?.let { put("imsi", it) }
                mcc?.let { put("mcc", it) }
                mnc?.let { put("mnc", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                phoneNumber?.let { put("phone_number", it) }
                simCardId?.let { put("sim_card_id", it) }
                simGroupId?.let { put("sim_group_id", it) }
                simGroupName?.let { put("sim_group_name", it) }
                sort?.let { put("sort", it.joinToString(",")) }
                startDate?.let { put("start_date", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListWdrsParams &&
            id == other.id &&
            endDate == other.endDate &&
            imsi == other.imsi &&
            mcc == other.mcc &&
            mnc == other.mnc &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            phoneNumber == other.phoneNumber &&
            simCardId == other.simCardId &&
            simGroupId == other.simGroupId &&
            simGroupName == other.simGroupName &&
            sort == other.sort &&
            startDate == other.startDate &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            endDate,
            imsi,
            mcc,
            mnc,
            pageNumber,
            pageSize,
            phoneNumber,
            simCardId,
            simGroupId,
            simGroupName,
            sort,
            startDate,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ReportListWdrsParams{id=$id, endDate=$endDate, imsi=$imsi, mcc=$mcc, mnc=$mnc, pageNumber=$pageNumber, pageSize=$pageSize, phoneNumber=$phoneNumber, simCardId=$simCardId, simGroupId=$simGroupId, simGroupName=$simGroupName, sort=$sort, startDate=$startDate, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
