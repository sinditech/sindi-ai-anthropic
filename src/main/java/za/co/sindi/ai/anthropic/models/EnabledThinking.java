package za.co.sindi.ai.anthropic.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 21 June 2024
 */
public class EnabledThinking extends Thinking {
	
	@JsonbProperty("budget_tokens")
	public int budgetTokens;

	/**
	 * @return the budgetTokens
	 */
	public int getBudgetTokens() {
		return budgetTokens;
	}

	/**
	 * @param budgetTokens the budgetTokens to set
	 */
	public void setBudgetTokens(int budgetTokens) {
		this.budgetTokens = budgetTokens;
	}
}
