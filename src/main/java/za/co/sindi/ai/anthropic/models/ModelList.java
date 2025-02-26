/**
 * 
 */
package za.co.sindi.ai.anthropic.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * 
 * @author Buhake Sindi
 * @since 26 February 2025
 * @see <a href="https://docs.anthropic.com/en/api/models">Models - Anthropic API reference documentation.</a>
 */
public class ModelList implements Serializable {
	
	@JsonbProperty
	private Model[] data;

	@JsonbProperty("first_id")
	private String firstId;
	
	@JsonbProperty("has_more")
	private boolean hasMore;
	
	@JsonbProperty("last_id")
	private String lastId;
	
	@JsonbProperty("created_at")
	private String createdAt;

	/**
	 * @return the data
	 */
	public Model[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Model[] data) {
		this.data = data;
	}

	/**
	 * @return the firstId
	 */
	public String getFirstId() {
		return firstId;
	}

	/**
	 * @param firstId the firstId to set
	 */
	public void setFirstId(String firstId) {
		this.firstId = firstId;
	}

	/**
	 * @return the hasMore
	 */
	public boolean isHasMore() {
		return hasMore;
	}

	/**
	 * @param hasMore the hasMore to set
	 */
	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}

	/**
	 * @return the lastId
	 */
	public String getLastId() {
		return lastId;
	}

	/**
	 * @param lastId the lastId to set
	 */
	public void setLastId(String lastId) {
		this.lastId = lastId;
	}

	/**
	 * @return the createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
}
