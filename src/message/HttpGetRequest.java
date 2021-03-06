package message;

import java.util.Map;

/**
 * Created by airbag on 1/15/15.
 */
public class HttpGetRequest extends HttpMessage {

    private final String _httpRequestURI;

    public HttpGetRequest(String requestURI) {
        this._httpRequestURI = requestURI;
    }

    public String getURI() {
        return _httpRequestURI;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("GET");
        sb.append(" ");
        sb.append(_httpRequestURI);
        sb.append(" ");
        sb.append(HTTP_VERSION);
        sb.append("\n");

        for (Map.Entry<String, String> header: _headers.entrySet()) {
            sb.append(header.getKey());
            sb.append(": ");
            sb.append(header.getValue());
            sb.append("\n");
        }

        sb.append("\n");
        sb.append("\n");

        return sb.toString();
    }
}
