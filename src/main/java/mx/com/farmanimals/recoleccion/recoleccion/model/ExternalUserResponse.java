package mx.com.farmanimals.recoleccion.recoleccion.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class ExternalUserResponse {
    private int numEmpleado;
    private String clvUsuario;
    private String nombreUsuario;
    private String apPaterno;
    private String apMaterno;
    private boolean estaActivo;
    private boolean esEmpleado;
    private ClvPuesto clvPuesto;
    private ClvSucursal clvSucursal;
    private ClvArea clvArea;
    private boolean logged;
    private int intentos;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM d, yyyy")
    private Date fechaexp;

    private boolean huelladig;
    private int clvestatus;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MMM d, yyyy")
    private Date fechareg;

    private int numAdam;

    // Getters and setters

    // El resto de los getters y setters se omiten por brevedad

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getClvUsuario() {
        return clvUsuario;
    }

    public void setClvUsuario(String clvUsuario) {
        this.clvUsuario = clvUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public boolean isEstaActivo() {
        return estaActivo;
    }

    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }

    public boolean isEsEmpleado() {
        return esEmpleado;
    }

    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    public ClvPuesto getClvPuesto() {
        return clvPuesto;
    }

    public void setClvPuesto(ClvPuesto clvPuesto) {
        this.clvPuesto = clvPuesto;
    }

    public ClvSucursal getClvSucursal() {
        return clvSucursal;
    }

    public void setClvSucursal(ClvSucursal clvSucursal) {
        this.clvSucursal = clvSucursal;
    }

    public ClvArea getClvArea() {
        return clvArea;
    }

    public void setClvArea(ClvArea clvArea) {
        this.clvArea = clvArea;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public Date getFechaexp() {
        return fechaexp;
    }

    public void setFechaexp(Date fechaexp) {
        this.fechaexp = fechaexp;
    }

    public boolean isHuelladig() {
        return huelladig;
    }

    public void setHuelladig(boolean huelladig) {
        this.huelladig = huelladig;
    }

    public int getClvestatus() {
        return clvestatus;
    }

    public void setClvestatus(int clvestatus) {
        this.clvestatus = clvestatus;
    }

    public Date getFechareg() {
        return fechareg;
    }

    public void setFechareg(Date fechareg) {
        this.fechareg = fechareg;
    }

    public int getNumAdam() {
        return numAdam;
    }

    public void setNumAdam(int numAdam) {
        this.numAdam = numAdam;
    }

    public static class ClvPuesto {
        private int clvPuesto;
        private String descripcion;
        private boolean estaActivo;

        // Getters and setters

        public int getClvPuesto() {
            return clvPuesto;
        }

        public void setClvPuesto(int clvPuesto) {
            this.clvPuesto = clvPuesto;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public boolean isEstaActivo() {
            return estaActivo;
        }

        public void setEstaActivo(boolean estaActivo) {
            this.estaActivo = estaActivo;
        }
    }

    public static class ClvSucursal {
        private int clvSucursal;
        private String descripcion;
        private String calleyNum;
        private String colonia;
        private int codigoPostal;
        private boolean estaActivo;
        private ClvEstado clvEstado;
        private ClvPoblacion clvPoblacion;
        private int clvPais;
        private SucursalAdo sucursalAdo;
        private int telefono;
        private int fax;
        private int lada;
        private boolean entradaCompra;
        private double fondofijo;
        private boolean ivaDiferenciado;
        private String leyenda;
        private int idformatopublic;
        private double maximofaltante;
        private boolean guardaequipaje;
        private String clvsucursaljde;
        private int tiposucursal;
        private int tiponegocio;

        // Getters and setters

        public int getClvSucursal() {
            return clvSucursal;
        }

        public void setClvSucursal(int clvSucursal) {
            this.clvSucursal = clvSucursal;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getCalleyNum() {
            return calleyNum;
        }

        public void setCalleyNum(String calleyNum) {
            this.calleyNum = calleyNum;
        }

        public String getColonia() {
            return colonia;
        }

        public void setColonia(String colonia) {
            this.colonia = colonia;
        }

        public int getCodigoPostal() {
            return codigoPostal;
        }

        public void setCodigoPostal(int codigoPostal) {
            this.codigoPostal = codigoPostal;
        }

        public boolean isEstaActivo() {
            return estaActivo;
        }

        public void setEstaActivo(boolean estaActivo) {
            this.estaActivo = estaActivo;
        }

        public ClvEstado getClvEstado() {
            return clvEstado;
        }

        public void setClvEstado(ClvEstado clvEstado) {
            this.clvEstado = clvEstado;
        }

        public ClvPoblacion getClvPoblacion() {
            return clvPoblacion;
        }

        public void setClvPoblacion(ClvPoblacion clvPoblacion) {
            this.clvPoblacion = clvPoblacion;
        }

        public int getClvPais() {
            return clvPais;
        }

        public void setClvPais(int clvPais) {
            this.clvPais = clvPais;
        }

        public SucursalAdo getSucursalAdo() {
            return sucursalAdo;
        }

        public void setSucursalAdo(SucursalAdo sucursalAdo) {
            this.sucursalAdo = sucursalAdo;
        }

        public int getTelefono() {
            return telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public int getFax() {
            return fax;
        }

        public void setFax(int fax) {
            this.fax = fax;
        }

        public int getLada() {
            return lada;
        }

        public void setLada(int lada) {
            this.lada = lada;
        }

        public boolean isEntradaCompra() {
            return entradaCompra;
        }

        public void setEntradaCompra(boolean entradaCompra) {
            this.entradaCompra = entradaCompra;
        }

        public double getFondofijo() {
            return fondofijo;
        }

        public void setFondofijo(double fondofijo) {
            this.fondofijo = fondofijo;
        }

        public boolean isIvaDiferenciado() {
            return ivaDiferenciado;
        }

        public void setIvaDiferenciado(boolean ivaDiferenciado) {
            this.ivaDiferenciado = ivaDiferenciado;
        }

        public String getLeyenda() {
            return leyenda;
        }

        public void setLeyenda(String leyenda) {
            this.leyenda = leyenda;
        }

        public int getIdformatopublic() {
            return idformatopublic;
        }

        public void setIdformatopublic(int idformatopublic) {
            this.idformatopublic = idformatopublic;
        }

        public double getMaximofaltante() {
            return maximofaltante;
        }

        public void setMaximofaltante(double maximofaltante) {
            this.maximofaltante = maximofaltante;
        }

        public boolean isGuardaequipaje() {
            return guardaequipaje;
        }

        public void setGuardaequipaje(boolean guardaequipaje) {
            this.guardaequipaje = guardaequipaje;
        }

        public String getClvsucursaljde() {
            return clvsucursaljde;
        }

        public void setClvsucursaljde(String clvsucursaljde) {
            this.clvsucursaljde = clvsucursaljde;
        }

        public int getTiposucursal() {
            return tiposucursal;
        }

        public void setTiposucursal(int tiposucursal) {
            this.tiposucursal = tiposucursal;
        }

        public int getTiponegocio() {
            return tiponegocio;
        }

        public void setTiponegocio(int tiponegocio) {
            this.tiponegocio = tiponegocio;
        }

        public static class ClvEstado {
            private int clvEstado;
            private boolean estaActivo;
            private int clvPais;

            // Getters and setters

            public int getClvEstado() {
                return clvEstado;
            }

            public void setClvEstado(int clvEstado) {
                this.clvEstado = clvEstado;
            }

            public boolean isEstaActivo() {
                return estaActivo;
            }

            public void setEstaActivo(boolean estaActivo) {
                this.estaActivo = estaActivo;
            }

            public int getClvPais() {
                return clvPais;
            }

            public void setClvPais(int clvPais) {
                this.clvPais = clvPais;
            }
        }

        public static class ClvPoblacion {
            private int idPoblacion;
            private int pais;
            private boolean estaActivo;
            private boolean esfrontera;

            // Getters and setters

            public int getIdPoblacion() {
                return idPoblacion;
            }

            public void setIdPoblacion(int idPoblacion) {
                this.idPoblacion = idPoblacion;
            }

            public int getPais() {
                return pais;
            }

            public void setPais(int pais) {
                this.pais = pais;
            }

            public boolean isEstaActivo() {
                return estaActivo;
            }

            public void setEstaActivo(boolean estaActivo) {
                this.estaActivo = estaActivo;
            }

            public boolean isEsfrontera() {
                return esfrontera;
            }

            public void setEsfrontera(boolean esfrontera) {
                this.esfrontera = esfrontera;
            }
        }

        public static class SucursalAdo {
            private int id;
            private String descripcion;
            private String numeroSucursal;
            private boolean estaActivo;
            private Region region;
            private String direccion;
            private TituloTicket tituloticket;
            private boolean publicidad;

            // Getters and setters

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getDescripcion() {
                return descripcion;
            }

            public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
            }

            public String getNumeroSucursal() {
                return numeroSucursal;
            }

            public void setNumeroSucursal(String numeroSucursal) {
                this.numeroSucursal = numeroSucursal;
            }

            public boolean isEstaActivo() {
                return estaActivo;
            }

            public void setEstaActivo(boolean estaActivo) {
                this.estaActivo = estaActivo;
            }

            public Region getRegion() {
                return region;
            }

            public void setRegion(Region region) {
                this.region = region;
            }

            public String getDireccion() {
                return direccion;
            }

            public void setDireccion(String direccion) {
                this.direccion = direccion;
            }

            public TituloTicket getTituloticket() {
                return tituloticket;
            }

            public void setTituloticket(TituloTicket tituloticket) {
                this.tituloticket = tituloticket;
            }

            public boolean isPublicidad() {
                return publicidad;
            }

            public void setPublicidad(boolean publicidad) {
                this.publicidad = publicidad;
            }

            public static class Region {
                private int id;
                private String descripcion;
                private String numeroRegion;
                private boolean estaActivo;
                private Empresa empresa;

                // Getters and setters

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getDescripcion() {
                    return descripcion;
                }

                public void setDescripcion(String descripcion) {
                    this.descripcion = descripcion;
                }

                public String getNumeroRegion() {
                    return numeroRegion;
                }

                public void setNumeroRegion(String numeroRegion) {
                    this.numeroRegion = numeroRegion;
                }

                public boolean isEstaActivo() {
                    return estaActivo;
                }

                public void setEstaActivo(boolean estaActivo) {
                    this.estaActivo = estaActivo;
                }

                public Empresa getEmpresa() {
                    return empresa;
                }

                public void setEmpresa(Empresa empresa) {
                    this.empresa = empresa;
                }

                public static class Empresa {
                    private int id;
                    private String descripcion;
                    private String numeroEmpresa;
                    private boolean estaActivo;

                    // Getters and setters

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getDescripcion() {
                        return descripcion;
                    }

                    public void setDescripcion(String descripcion) {
                        this.descripcion = descripcion;
                    }

                    public String getNumeroEmpresa() {
                        return numeroEmpresa;
                    }

                    public void setNumeroEmpresa(String numeroEmpresa) {
                        this.numeroEmpresa = numeroEmpresa;
                    }

                    public boolean isEstaActivo() {
                        return estaActivo;
                    }

                    public void setEstaActivo(boolean estaActivo) {
                        this.estaActivo = estaActivo;
                    }
                }
            }

            public static class TituloTicket {
                private int id;
                private String descripcion;
                private SucursalAdo sucursalAdo;

                // Getters and setters

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getDescripcion() {
                    return descripcion;
                }

                public void setDescripcion(String descripcion) {
                    this.descripcion = descripcion;
                }

                public SucursalAdo getSucursalAdo() {
                    return sucursalAdo;
                }

                public void setSucursalAdo(SucursalAdo sucursalAdo) {
                    this.sucursalAdo = sucursalAdo;
                }
            }
        }
    }

    public static class ClvArea {
        private int clvArea;
        private String descripcion;
        private boolean estaActivo;

        // Getters and setters

        public int getClvArea() {
            return clvArea;
        }

        public void setClvArea(int clvArea) {
            this.clvArea = clvArea;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public boolean isEstaActivo() {
            return estaActivo;
        }

        public void setEstaActivo(boolean estaActivo) {
            this.estaActivo = estaActivo;
        }
    }
}
