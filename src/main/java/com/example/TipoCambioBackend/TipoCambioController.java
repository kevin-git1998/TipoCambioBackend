package com.example.tipocambio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipo-cambio")
public class TipoCambioController {

    @Autowired
    private TipoCambioService tipoCambioService;

    @GetMapping
    public SolicitudTipoCambio obtenerTipoCambio() {
        return tipoCambioService.obtenerTipoCambio();
    }
}
