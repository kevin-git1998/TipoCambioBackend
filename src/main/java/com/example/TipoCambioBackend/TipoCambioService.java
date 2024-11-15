package com.example.tipocambio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoCambioService {

    @Autowired
    private SolicitudTipoCambioRepository repository;

    public SolicitudTipoCambio obtenerTipoCambio() {
        // Simulación de obtener el tipo de cambio (ejemplo: 7.85)
        Double tipoCambio = 7.85;
        SolicitudTipoCambio solicitud = new SolicitudTipoCambio();
        solicitud.setNumeroSolicitud("123456");
        solicitud.setTipoCambio(tipoCambio);
        solicitud.setFechaConsulta(LocalDateTime.now());
        return repository.save(solicitud);
    }
}
