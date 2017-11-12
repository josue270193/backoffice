package edu.uade.integracion.interfaces;

import edu.uade.integracion.dto.ServicioDTO;
import edu.uade.integracion.dto.TipoServicioDTO;

import java.util.List;

public interface IServicio {

    List<TipoServicioDTO> obtenerTipoServiciosTodos();
    List<ServicioDTO> obtenerServiciosTodos();
    List<ServicioDTO> obtenerServiciosPorTipoServicioNombre(String nombre);
    List<ServicioDTO> obtenerServiciosPorTipoServicioId(Long id);
    ServicioDTO agregarServicio(String nombre, Long tipoServicio);
}
