package com.example.tipocambio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface SolicitudTipoCambioRepository extends JpaRepository<SolicitudTipoCambio, Long> {
}
public class SolicitudTipoCambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroSolicitud;
    private Double tipoCambio;
    private LocalDateTime fechaConsulta;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(String numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public Double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(Double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public LocalDateTime getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(LocalDateTime fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }
}

