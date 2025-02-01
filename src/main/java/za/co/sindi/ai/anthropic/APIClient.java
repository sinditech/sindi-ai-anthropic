/**
 * 
 */
package za.co.sindi.ai.anthropic;

import java.io.IOException;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

import za.co.sindi.ai.anthropic.models.event.Event;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public interface APIClient {
	
	/**
	 * @param connectionTimeout the connectionTimeout to set
	 */
	public void setConnectionTimeout(Duration connectionTimeout);

	/**
	 * @param proxy the proxy to set
	 */
	public void setProxy(ProxySelector proxy);

	/**
	 * @param executor the executor to set
	 */
	public void setExecutor(Executor executor);
	
	public void setObjectTransformer(final JSONObjectTransformer objectTransformer);

	public <REQ, RES> RES send(final APIRequest<REQ> apiRequest, Class<RES> responseType) throws IOException, InterruptedException;
	public <REQ, RES> CompletableFuture<RES> sendAsync(final APIRequest<REQ> apiRequest, Class<RES> responseType);
	public <REQ> Stream<Event> sendStreaming(final APIRequest<REQ> apiRequest) throws IOException, InterruptedException;
	public <REQ> CompletableFuture<Stream<Event>> sendStreamingAsync(final APIRequest<REQ> apiRequest);
}
