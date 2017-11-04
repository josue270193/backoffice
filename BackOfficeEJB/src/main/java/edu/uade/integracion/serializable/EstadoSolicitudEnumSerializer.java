package edu.uade.integracion.serializable;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import edu.uade.integracion.dto.enumerado.EstadoSolicitudEnum;

import java.io.IOException;

public class EstadoSolicitudEnumSerializer extends JsonSerializer<EstadoSolicitudEnum> {

    @Override
    public void serialize(EstadoSolicitudEnum estadoSolicitudEnum, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {

        if (estadoSolicitudEnum != null) {
            jsonGenerator.writeString(estadoSolicitudEnum.getClave());
        }
    }
}
