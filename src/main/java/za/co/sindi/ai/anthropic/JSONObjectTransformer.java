/**
 * 
 */
package za.co.sindi.ai.anthropic;

import java.io.InputStream;

/**
 * @author Buhake Sindi
 * @since 01 March 2024
 */
public interface JSONObjectTransformer {

	public <E> String transform(final E object);
	public <E> E transform(final String data, final Class<E> type);
	public <E> E transform(final InputStream stream, final Class<E> type);
}
