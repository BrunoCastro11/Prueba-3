package com.gestionveterinaria.veterinaria.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ConsultaDTO {
    private Integer id;
    private String detalle;
    private String nombreClinica;
    private String nombreVeterinario;
    private String nombreMascota;
    private String nombreMetodoPago;

    private List<ProcedimientoDTO> procedimientos;
}
