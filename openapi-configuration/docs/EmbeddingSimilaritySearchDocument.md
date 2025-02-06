

# EmbeddingSimilaritySearchDocument

Example document response from embedding service {   \"document_chunk\": \"your status? This is Vanessa Bloome...\",   \"distance\": 0.18607724,   \"metadata\": {     \"source\": \"https://us-central-1.telnyxstorage.com/scripts/bee_movie_script.txt\",     \"checksum\": \"343054dd19bab39bbf6761a3d20f1daa\",     \"embedding\": \"openai/text-embedding-ada-002\",     \"filename\": \"bee_movie_script.txt\",     \"certainty\": 0.9069613814353943,     \"loader_metadata\": {}   } }

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentChunk** | **String** |  |  |
|**distance** | **BigDecimal** |  |  |
|**metadata** | [**EmbeddingMetadata**](EmbeddingMetadata.md) |  |  |



