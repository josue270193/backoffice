package edu.uade.integracion.serializable;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import edu.uade.integracion.dto.enumerado.TipoSolicitudEnum;

import java.io.IOException;

public class TipoSolicitudEnumSerializer extends JsonSerializer<TipoSolicitudEnum> {

    @Override
    public void serialize(TipoSolicitudEnum tipoSolicitudEnum, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {

        if (tipoSolicitudEnum != null) {
            jsonGenerator.writeString(tipoSolicitudEnum.getClave());
        }
    }
}
