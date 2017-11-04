package edu.uade.integracion.serializable;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import edu.uade.integracion.dto.enumerado.TipoSolicitudEnum;

import java.io.IOException;

public class TipoSolicitudEnumDeserializer extends JsonDeserializer<TipoSolicitudEnum> {

    @Override
    public TipoSolicitudEnum deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException, JsonProcessingException {

        final String jsonValue = jsonParser.getText();
        for (final TipoSolicitudEnum enumValue : TipoSolicitudEnum.values()) {
            if (enumValue.getClave().compareToIgnoreCase(jsonValue) == 0) {
                return enumValue;
            }
        }
        return null;
    }
}
