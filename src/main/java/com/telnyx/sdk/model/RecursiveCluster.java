/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.telnyx.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import com.telnyx.sdk.model.ClusterNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * RecursiveCluster
 */
@JsonPropertyOrder(
    {
        RecursiveCluster.JSON_PROPERTY_CLUSTER_ID,
        RecursiveCluster.JSON_PROPERTY_CLUSTER_HEADER,
        RecursiveCluster.JSON_PROPERTY_CLUSTER_SUMMARY,
        RecursiveCluster.JSON_PROPERTY_NODES,
        RecursiveCluster.JSON_PROPERTY_TOTAL_NUMBER_OF_NODES,
        RecursiveCluster.JSON_PROPERTY_SUBCLUSTERS,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class RecursiveCluster {

    public static final String JSON_PROPERTY_CLUSTER_ID = "cluster_id";
    private String clusterId;

    public static final String JSON_PROPERTY_CLUSTER_HEADER = "cluster_header";
    private String clusterHeader;

    public static final String JSON_PROPERTY_CLUSTER_SUMMARY =
        "cluster_summary";
    private String clusterSummary;

    public static final String JSON_PROPERTY_NODES = "nodes";
    private List<ClusterNode> nodes = null;

    public static final String JSON_PROPERTY_TOTAL_NUMBER_OF_NODES =
        "total_number_of_nodes";
    private Integer totalNumberOfNodes;

    public static final String JSON_PROPERTY_SUBCLUSTERS = "subclusters";
    private List<RecursiveCluster> subclusters = null;

    public RecursiveCluster() {}

    public RecursiveCluster clusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     * @return clusterId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getClusterId() {
        return clusterId;
    }

    @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public RecursiveCluster clusterHeader(String clusterHeader) {
        this.clusterHeader = clusterHeader;
        return this;
    }

    /**
     * Get clusterHeader
     * @return clusterHeader
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CLUSTER_HEADER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getClusterHeader() {
        return clusterHeader;
    }

    @JsonProperty(JSON_PROPERTY_CLUSTER_HEADER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setClusterHeader(String clusterHeader) {
        this.clusterHeader = clusterHeader;
    }

    public RecursiveCluster clusterSummary(String clusterSummary) {
        this.clusterSummary = clusterSummary;
        return this;
    }

    /**
     * Get clusterSummary
     * @return clusterSummary
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_CLUSTER_SUMMARY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getClusterSummary() {
        return clusterSummary;
    }

    @JsonProperty(JSON_PROPERTY_CLUSTER_SUMMARY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setClusterSummary(String clusterSummary) {
        this.clusterSummary = clusterSummary;
    }

    public RecursiveCluster nodes(List<ClusterNode> nodes) {
        this.nodes = nodes;
        return this;
    }

    public RecursiveCluster addnodesItem(ClusterNode nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    /**
     * Get nodes
     * @return nodes
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NODES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<ClusterNode> getNodes() {
        return nodes;
    }

    @JsonProperty(JSON_PROPERTY_NODES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNodes(List<ClusterNode> nodes) {
        this.nodes = nodes;
    }

    public RecursiveCluster totalNumberOfNodes(Integer totalNumberOfNodes) {
        this.totalNumberOfNodes = totalNumberOfNodes;
        return this;
    }

    /**
     * Get totalNumberOfNodes
     * @return totalNumberOfNodes
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_NODES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getTotalNumberOfNodes() {
        return totalNumberOfNodes;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL_NUMBER_OF_NODES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTotalNumberOfNodes(Integer totalNumberOfNodes) {
        this.totalNumberOfNodes = totalNumberOfNodes;
    }

    public RecursiveCluster subclusters(List<RecursiveCluster> subclusters) {
        this.subclusters = subclusters;
        return this;
    }

    public RecursiveCluster addsubclustersItem(
        RecursiveCluster subclustersItem
    ) {
        if (this.subclusters == null) {
            this.subclusters = new ArrayList<>();
        }
        this.subclusters.add(subclustersItem);
        return this;
    }

    /**
     * Get subclusters
     * @return subclusters
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SUBCLUSTERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<RecursiveCluster> getSubclusters() {
        return subclusters;
    }

    @JsonProperty(JSON_PROPERTY_SUBCLUSTERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSubclusters(List<RecursiveCluster> subclusters) {
        this.subclusters = subclusters;
    }

    /**
     * Return true if this RecursiveCluster object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecursiveCluster recursiveCluster = (RecursiveCluster) o;
        return (
            Objects.equals(this.clusterId, recursiveCluster.clusterId) &&
            Objects.equals(
                this.clusterHeader,
                recursiveCluster.clusterHeader
            ) &&
            Objects.equals(
                this.clusterSummary,
                recursiveCluster.clusterSummary
            ) &&
            Objects.equals(this.nodes, recursiveCluster.nodes) &&
            Objects.equals(
                this.totalNumberOfNodes,
                recursiveCluster.totalNumberOfNodes
            ) &&
            Objects.equals(this.subclusters, recursiveCluster.subclusters)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            clusterId,
            clusterHeader,
            clusterSummary,
            nodes,
            totalNumberOfNodes,
            subclusters
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecursiveCluster {\n");
        sb
            .append("    clusterId: ")
            .append(toIndentedString(clusterId))
            .append("\n");
        sb
            .append("    clusterHeader: ")
            .append(toIndentedString(clusterHeader))
            .append("\n");
        sb
            .append("    clusterSummary: ")
            .append(toIndentedString(clusterSummary))
            .append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb
            .append("    totalNumberOfNodes: ")
            .append(toIndentedString(totalNumberOfNodes))
            .append("\n");
        sb
            .append("    subclusters: ")
            .append(toIndentedString(subclusters))
            .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
