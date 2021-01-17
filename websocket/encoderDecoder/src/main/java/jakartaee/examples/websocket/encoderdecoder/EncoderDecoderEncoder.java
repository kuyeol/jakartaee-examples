/*
 * Permission to use, copy, modify, and/or distribute this software for any 
 * purpose with or without fee is hereby granted.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR(S) DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR(S) BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION
 * OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN
 * CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package jakartaee.examples.websocket.encoderdecoder;

import jakarta.websocket.EncodeException;
import jakarta.websocket.Encoder;
import jakarta.websocket.EndpointConfig;

/**
 * The Encoder.
 *
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class EncoderDecoderEncoder implements Encoder.Text<EncoderDecoder>{

    /**
     * Encode.
     * 
     * @param encoderDecoder the object.
     * @return the string.
     * @throws EncodeException when an encode error occurs.
     */
    @Override
    public String encode(EncoderDecoder encoderDecoder) throws EncodeException {
        return encoderDecoder.toString();
    }

    /**
     * Initialize the encoder.
     * 
     * @param endpointConfig the endpoint configuration. 
     */
    @Override
    public void init(EndpointConfig endpointConfig) {
    }

    /**
     * Destroy the encoder.
     */
    @Override
    public void destroy() {
    }
}
